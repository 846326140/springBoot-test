package com.example.demo.pojo;

import java.io.Serializable;

public class AcctAuthority implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acct_authority.id
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acct_authority.name
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acct_authority.url
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acct_authority.id
     *
     * @return the value of acct_authority.id
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acct_authority.id
     *
     * @param id the value for acct_authority.id
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acct_authority.name
     *
     * @return the value of acct_authority.name
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acct_authority.name
     *
     * @param name the value for acct_authority.name
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acct_authority.url
     *
     * @return the value of acct_authority.url
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acct_authority.url
     *
     * @param url the value for acct_authority.url
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append("]");
        return sb.toString();
    }
}