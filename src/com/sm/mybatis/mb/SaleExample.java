package com.sm.mybatis.mb;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public SaleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSaleIdIsNull() {
            addCriterion("Sale_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("Sale_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(Integer value) {
            addCriterion("Sale_ID =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(Integer value) {
            addCriterion("Sale_ID <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(Integer value) {
            addCriterion("Sale_ID >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sale_ID >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(Integer value) {
            addCriterion("Sale_ID <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Sale_ID <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<Integer> values) {
            addCriterion("Sale_ID in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<Integer> values) {
            addCriterion("Sale_ID not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(Integer value1, Integer value2) {
            addCriterion("Sale_ID between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Sale_ID not between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNull() {
            addCriterion("Sale_Num is null");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNotNull() {
            addCriterion("Sale_Num is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNumEqualTo(Float value) {
            addCriterion("Sale_Num =", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotEqualTo(Float value) {
            addCriterion("Sale_Num <>", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThan(Float value) {
            addCriterion("Sale_Num >", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThanOrEqualTo(Float value) {
            addCriterion("Sale_Num >=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThan(Float value) {
            addCriterion("Sale_Num <", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThanOrEqualTo(Float value) {
            addCriterion("Sale_Num <=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIn(List<Float> values) {
            addCriterion("Sale_Num in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotIn(List<Float> values) {
            addCriterion("Sale_Num not in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumBetween(Float value1, Float value2) {
            addCriterion("Sale_Num between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotBetween(Float value1, Float value2) {
            addCriterion("Sale_Num not between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNull() {
            addCriterion("Sale_Time is null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNotNull() {
            addCriterion("Sale_Time is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Sale_Time =", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Sale_Time <>", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Sale_Time >", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Sale_Time >=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThan(Date value) {
            addCriterionForJDBCDate("Sale_Time <", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Sale_Time <=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Sale_Time in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Sale_Time not in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Sale_Time between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Sale_Time not between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andVipIdIsNull() {
            addCriterion("Vip_Id is null");
            return (Criteria) this;
        }

        public Criteria andVipIdIsNotNull() {
            addCriterion("Vip_Id is not null");
            return (Criteria) this;
        }

        public Criteria andVipIdEqualTo(Integer value) {
            addCriterion("Vip_Id =", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotEqualTo(Integer value) {
            addCriterion("Vip_Id <>", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThan(Integer value) {
            addCriterion("Vip_Id >", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vip_Id >=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThan(Integer value) {
            addCriterion("Vip_Id <", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThanOrEqualTo(Integer value) {
            addCriterion("Vip_Id <=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdIn(List<Integer> values) {
            addCriterion("Vip_Id in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotIn(List<Integer> values) {
            addCriterion("Vip_Id not in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdBetween(Integer value1, Integer value2) {
            addCriterion("Vip_Id between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Vip_Id not between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("Staff_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("Staff_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("Staff_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("Staff_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("Staff_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Staff_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("Staff_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("Staff_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("Staff_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("Staff_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("Staff_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Staff_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sale
     *
     * @mbggenerated do_not_delete_during_merge Tue Jun 30 10:38:24 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sale
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}