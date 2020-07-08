package com.college.common.pojo;

import javax.persistence.*;

public class Major {
    /**
     * רҵ���
     */
    @Id
    private Integer mid;

    /**
     * רҵ����
     */
    private String mname;

    /**
     * ѧ��
     */
    private Integer credit;

    /**
     * ѧ��
     */
    @Column(name = "LifeYear")
    private Integer lifeyear;

    /**
     * רҵ����
     */
    private String introduction;

    /**
     * ѧԺ���
     */
    private Integer cid;

    /**
     * ��ȡרҵ���
     *
     * @return mid - רҵ���
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * ����רҵ���
     *
     * @param mid רҵ���
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * ��ȡרҵ����
     *
     * @return mname - רҵ����
     */
    public String getMname() {
        return mname;
    }

    /**
     * ����רҵ����
     *
     * @param mname רҵ����
     */
    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    /**
     * ��ȡѧ��
     *
     * @return credit - ѧ��
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * ����ѧ��
     *
     * @param credit ѧ��
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * ��ȡѧ��
     *
     * @return LifeYear - ѧ��
     */
    public Integer getLifeyear() {
        return lifeyear;
    }

    /**
     * ����ѧ��
     *
     * @param lifeyear ѧ��
     */
    public void setLifeyear(Integer lifeyear) {
        this.lifeyear = lifeyear;
    }

    /**
     * ��ȡרҵ����
     *
     * @return introduction - רҵ����
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * ����רҵ����
     *
     * @param introduction רҵ����
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * ��ȡѧԺ���
     *
     * @return cid - ѧԺ���
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * ����ѧԺ���
     *
     * @param cid ѧԺ���
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }
}