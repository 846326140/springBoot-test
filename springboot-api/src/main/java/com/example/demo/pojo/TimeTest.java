package com.example.demo.pojo;

import java.util.Date;

public class TimeTest {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_test.id
     *
     * @mbg.generated Mon Oct 21 11:13:31 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_test.operate_time
     *
     * @mbg.generated Mon Oct 21 11:13:31 CST 2019
     */
    private Date operateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_test.id
     *
     * @return the value of time_test.id
     *
     * @mbg.generated Mon Oct 21 11:13:31 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_test.id
     *
     * @param id the value for time_test.id
     *
     * @mbg.generated Mon Oct 21 11:13:31 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_test.operate_time
     *
     * @return the value of time_test.operate_time
     *
     * @mbg.generated Mon Oct 21 11:13:31 CST 2019
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_test.operate_time
     *
     * @param operateTime the value for time_test.operate_time
     *
     * @mbg.generated Mon Oct 21 11:13:31 CST 2019
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_test
     *
     * @mbg.generated Mon Oct 21 11:13:31 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operateTime=").append(operateTime);
        sb.append("]");
        return sb.toString();
    }
}