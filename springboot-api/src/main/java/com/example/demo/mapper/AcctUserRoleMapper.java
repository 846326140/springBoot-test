package com.example.demo.mapper;

import com.example.demo.pojo.AcctUserRole;
import com.example.demo.pojo.AcctUserRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AcctUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_user_role
     *
     * @mbg.generated Sun Sep 29 10:58:18 CST 2019
     */
    long countByExample(AcctUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_user_role
     *
     * @mbg.generated Sun Sep 29 10:58:18 CST 2019
     */
    int deleteByExample(AcctUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_user_role
     *
     * @mbg.generated Sun Sep 29 10:58:18 CST 2019
     */
    int insert(AcctUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_user_role
     *
     * @mbg.generated Sun Sep 29 10:58:18 CST 2019
     */
    int insertSelective(AcctUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_user_role
     *
     * @mbg.generated Sun Sep 29 10:58:18 CST 2019
     */
    List<AcctUserRole> selectByExample(AcctUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_user_role
     *
     * @mbg.generated Sun Sep 29 10:58:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") AcctUserRole record, @Param("example") AcctUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_user_role
     *
     * @mbg.generated Sun Sep 29 10:58:18 CST 2019
     */
    int updateByExample(@Param("record") AcctUserRole record, @Param("example") AcctUserRoleExample example);
}