package com.college.common.pojo;

import java.util.Date;
import javax.persistence.*;

public class College {
    /**
     * ѧԺ���
     */
    @Id
    private Integer cid;

    /**
     * ѧԺ����
     */
    private String cname;

    /**
     * ѧԺ��ַ
     */
    private String caddress;

    /**
     * ����ʱ��
     */
    private Date createtime;

    /**
     * ѧԺԺ��
     */
    private String cpic;

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

    /**
     * ��ȡѧԺ����
     *
     * @return cname - ѧԺ����
     */
    public String getCname() {
        return cname;
    }

    /**
     * ����ѧԺ����
     *
     * @param cname ѧԺ����
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * ��ȡѧԺ��ַ
     *
     * @return caddress - ѧԺ��ַ
     */
    public String getCaddress() {
        return caddress;
    }

    /**
     * ����ѧԺ��ַ
     *
     * @param caddress ѧԺ��ַ
     */
    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return createtime - ����ʱ��
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createtime ����ʱ��
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * ��ȡѧԺԺ��
     *
     * @return cpic - ѧԺԺ��
     */
    public String getCpic() {
        return cpic;
    }

    /**
     * ����ѧԺԺ��
     *
     * @param cpic ѧԺԺ��
     */
    public void setCpic(String cpic) {
        this.cpic = cpic == null ? null : cpic.trim();
    }
}