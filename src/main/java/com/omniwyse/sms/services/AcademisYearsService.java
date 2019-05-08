package com.omniwyse.sms.services;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dieselpoint.norm.Database;
import com.omniwyse.sms.db.DatabaseRetrieval;
import com.omniwyse.sms.models.AcademicYears;
import com.omniwyse.sms.utils.AcademicYearsDTO;
@Service
public class AcademisYearsService {
	@Autowired
	private DatabaseRetrieval retrieve;
	private Database db;

	public int addAcademicYears(long tenantId, AcademicYearsDTO academicyearsDTO) {

		db = retrieve.getDatabase(tenantId);
		AcademicYears academicyears = new AcademicYears();
		long passingyear = academicyearsDTO.getPassingyear();
		academicyears.setPassingyear(passingyear);
		academicyears.setActive(academicyearsDTO.getActive());
		academicyears.setAcademicyearstarting(new Date(academicyearsDTO.getAcademicyearstartdt()));
		academicyears.setAcademicyearending(new Date(academicyearsDTO.getAcademicyearenddt()));
		if (academicyearsDTO.getId() == null) {
			List<AcademicYears> list = db.where("passingyear=?", passingyear).results(AcademicYears.class);
			if (list.isEmpty()) {
				if (academicyearsDTO.getActive() == 1) {
					List<AcademicYears> academicyear = db.where("active=1").results(AcademicYears.class);
					if (academicyear.isEmpty()) {
						academicyears.setCreatedon(new Timestamp(new Date().getTime()));
						academicyears.setModifiedon(new Timestamp(new Date().getTime()));
						return db.insert(academicyears).getRowsAffected();
					} else
						return -5;
				}
				academicyears.setCreatedon(new Timestamp(new Date().getTime()));
				academicyears.setModifiedon(new Timestamp(new Date().getTime()));
				return db.insert(academicyears).getRowsAffected();
			} else {
				return 0;
			}
		} else {
			if (academicyearsDTO.getActive() == 1) {

				List<AcademicYears> years = db
						.sql("select * from academicyears where active=1 and id!=?", academicyearsDTO.getId())
						.results(AcademicYears.class);
				if (!years.isEmpty()) {
					return -5;

				}
			}
			academicyears.setId(academicyearsDTO.getId());
			Timestamp createdon = db.where("id=?",academicyears.getId()).results(AcademicYears.class).get(0).getCreatedon();
			academicyears.setCreatedon(createdon);
			return db.update(academicyears).execute().getRowsAffected();
		}
	}

	public List<AcademicYears> getAcademicYears(long tenantId) {
		db = retrieve.getDatabase(tenantId);

		return db.sql("select * from academicyears").results(AcademicYears.class);

	}
}
