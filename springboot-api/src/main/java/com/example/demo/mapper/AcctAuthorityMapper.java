package com.example.demo.mapper;

import com.example.demo.pojo.AcctAuthority;
import com.example.demo.pojo.AcctAuthorityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AcctAuthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    long countByExample(AcctAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    int deleteByExample(AcctAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    int insert(AcctAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    int insertSelective(AcctAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    List<AcctAuthority> selectByExample(AcctAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    AcctAuthority selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    int updateByExampleSelective(@Param("record") AcctAuthority record, @Param("example") AcctAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    int updateByExample(@Param("record") AcctAuthority record, @Param("example") AcctAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    int updateByPrimaryKeySelective(AcctAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acct_authority
     *
     * @mbg.generated Sun Sep 29 14:26:27 CST 2019
     */
    int updateByPrimaryKey(AcctAuthority record);
}