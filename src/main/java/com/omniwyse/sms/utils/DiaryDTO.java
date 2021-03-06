package com.omniwyse.sms.utils;

public class DiaryDTO {

    private Long id;
    private String tag;
    private Long entryDate;
    private String description;

    private Long classroomid;
    private Long subjectid;
    private String lessonname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Long getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Long entryDate) {
        this.entryDate = entryDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Long classroomid) {
        this.classroomid = classroomid;
    }

    public Long getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Long subjectid) {
        this.subjectid = subjectid;
    }

    public String getLessonname() {
        return lessonname;
    }

    public void setLessonname(String lessonname) {
        this.lessonname = lessonname;
    }

    @Override
    public String toString() {
        return "DiaryDTO [id=" + id + ", tag=" + tag + ", entryDate=" + entryDate + ", description=" + description
                + ", classroomid=" + classroomid + ", subjectid=" + subjectid + ", lessonname=" + lessonname + "]";
    }

}
