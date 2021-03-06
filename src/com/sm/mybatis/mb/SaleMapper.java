package com.sm.mybatis.mb;

import com.sm.mybatis.mb.Sale;
import com.sm.mybatis.mb.SaleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SaleMapper {
	
	int selectCountBySale(Map <String, Object> map);
	
	//查找全部
	
    List<Sale> selectAll();
    
	//自定义
	List<Sale> selectOnceByMap(Map <String, Object> map);
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    int countByExample(SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    int deleteByExample(SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    int deleteByPrimaryKey(Integer saleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    int insert(Sale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    int insertSelective(Sale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    List<Sale> selectByExample(SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    Sale selectByPrimaryKey(Integer saleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    int updateByExampleSelective(@Param("record") Sale record, @Param("example") SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    int updateByExample(@Param("record") Sale record, @Param("example") SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    int updateByPrimaryKeySelective(Sale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    int updateByPrimaryKey(Sale record);
}