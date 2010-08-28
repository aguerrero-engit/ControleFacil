package it.eng.controlefacil.mvc.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * @description Entity for Employee
 * @author Manuel Guerrero
 */

@Entity
@Table(name = "\"TEMPLOYEES\"")
public class Employee implements Serializable {
    @Id
    @Column(name = "\"EMPL_ID\"")
    private String emplId;

    @Column(name = "\"NAME\"")
    private String name;

    @Column(name = "\"CTPS\"")
    private String ctps;

    @Column(name = "\"CODE\"")
    private String code;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "\"ADMISSION\"")
    private Date admission;

    @Column(name = "\"FUNCTION\"")
    private String function;

    @Column(name = "\"WP_START\"")
    private String wpStart;

    @Column(name = "\"WP_END\"")
    private String wpEnd;

    @Column(name = "\"LT_START\"")
    private String ltStart;

    @Column(name = "\"LT_END\"")
    private String ltEnd;

    @Column(name = "\"BOSS_ID\"")
    private String bossId;

    @Column(name = "\"DEPT\"")
    private String dept;

    @Column(name = "\"COMPANY_ID\"")
    private String companyId;

    @Column(name = "\"FLAG_HOLIDAYS\"")
    private Character flagHolidays;

    @Column(name = "\"ACCESS_LEVEL\"")
    private Integer accessLevel;

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Date getAdmission() {
        return admission;
    }

    public void setAdmission(Date admission) {
        this.admission = admission;
    }

    public String getBossId() {
        return bossId;
    }

    public void setBossId(String bossId) {
        this.bossId = bossId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmplId() {
        return emplId;
    }

    public void setEmplId(String emplId) {
        this.emplId = emplId;
    }

    public Character getFlagHolidays() {
        return flagHolidays;
    }

    public void setFlagHolidays(Character flagHolidays) {
        this.flagHolidays = flagHolidays;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getLtEnd() {
        return ltEnd;
    }

    public void setLtEnd(String ltEnd) {
        this.ltEnd = ltEnd;
    }

    public String getLtStart() {
        return ltStart;
    }

    public void setLtStart(String ltStart) {
        this.ltStart = ltStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWpEnd() {
        return wpEnd;
    }

    public void setWpEnd(String wpEnd) {
        this.wpEnd = wpEnd;
    }

    public String getWpStart() {
        return wpStart;
    }

    public void setWpStart(String wpStart) {
        this.wpStart = wpStart;
    }
}
