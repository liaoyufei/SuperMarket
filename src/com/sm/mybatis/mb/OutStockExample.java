package com.sm.mybatis.mb;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OutStockExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public OutStockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_out_stock
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
     * This method corresponds to the database table t_out_stock
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
     * This method corresponds to the database table t_out_stock
     *
     * @mbggenerated Tue Jun 30 10:38:24 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_out_stock
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
     * This class corresponds to the database table t_out_stock
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

        public Criteria andOutStockIdIsNull() {
            addCriterion("Out_Stock_ID is null");
            return (Criteria) this;
        }

        public Criteria andOutStockIdIsNotNull() {
            addCriterion("Out_Stock_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOutStockIdEqualTo(Integer value) {
            addCriterion("Out_Stock_ID =", value, "outStockId");
            return (Criteria) this;
        }

        public Criteria andOutStockIdNotEqualTo(Integer value) {
            addCriterion("Out_Stock_ID <>", value, "outStockId");
            return (Criteria) this;
        }

        public Criteria andOutStockIdGreaterThan(Integer value) {
            addCriterion("Out_Stock_ID >", value, "outStockId");
            return (Criteria) this;
        }

        public Criteria andOutStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Out_Stock_ID >=", value, "outStockId");
            return (Criteria) this;
        }

        public Criteria andOutStockIdLessThan(Integer value) {
            addCriterion("Out_Stock_ID <", value, "outStockId");
            return (Criteria) this;
        }

        public Criteria andOutStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("Out_Stock_ID <=", value, "outStockId");
            return (Criteria) this;
        }

        public Criteria andOutStockIdIn(List<Integer> values) {
            addCriterion("Out_Stock_ID in", values, "outStockId");
            return (Criteria) this;
        }

        public Criteria andOutStockIdNotIn(List<Integer> values) {
            addCriterion("Out_Stock_ID not in", values, "outStockId");
            return (Criteria) this;
        }

        public Criteria andOutStockIdBetween(Integer value1, Integer value2) {
            addCriterion("Out_Stock_ID between", value1, value2, "outStockId");
            return (Criteria) this;
        }

        public Criteria andOutStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Out_Stock_ID not between", value1, value2, "outStockId");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeIsNull() {
            addCriterion("Out_Stock_Time is null");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeIsNotNull() {
            addCriterion("Out_Stock_Time is not null");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Out_Stock_Time =", value, "outStockTime");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Out_Stock_Time <>", value, "outStockTime");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Out_Stock_Time >", value, "outStockTime");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Out_Stock_Time >=", value, "outStockTime");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeLessThan(Date value) {
            addCriterionForJDBCDate("Out_Stock_Time <", value, "outStockTime");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Out_Stock_Time <=", value, "outStockTime");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Out_Stock_Time in", values, "outStockTime");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Out_Stock_Time not in", values, "outStockTime");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Out_Stock_Time between", value1, value2, "outStockTime");
            return (Criteria) this;
        }

        public Criteria andOutStockTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Out_Stock_Time not between", value1, value2, "outStockTime");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNull() {
            addCriterion("Stock_ID is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("Stock_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("Stock_ID =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("Stock_ID <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("Stock_ID >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stock_ID >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("Stock_ID <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("Stock_ID <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("Stock_ID in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("Stock_ID not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("Stock_ID between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Stock_ID not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalIsNull() {
            addCriterion("Out_Stock_Principal is null");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalIsNotNull() {
            addCriterion("Out_Stock_Principal is not null");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalEqualTo(Integer value) {
            addCriterion("Out_Stock_Principal =", value, "outStockPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalNotEqualTo(Integer value) {
            addCriterion("Out_Stock_Principal <>", value, "outStockPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalGreaterThan(Integer value) {
            addCriterion("Out_Stock_Principal >", value, "outStockPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalGreaterThanOrEqualTo(Integer value) {
            addCriterion("Out_Stock_Principal >=", value, "outStockPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalLessThan(Integer value) {
            addCriterion("Out_Stock_Principal <", value, "outStockPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalLessThanOrEqualTo(Integer value) {
            addCriterion("Out_Stock_Principal <=", value, "outStockPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalIn(List<Integer> values) {
            addCriterion("Out_Stock_Principal in", values, "outStockPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalNotIn(List<Integer> values) {
            addCriterion("Out_Stock_Principal not in", values, "outStockPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalBetween(Integer value1, Integer value2) {
            addCriterion("Out_Stock_Principal between", value1, value2, "outStockPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutStockPrincipalNotBetween(Integer value1, Integer value2) {
            addCriterion("Out_Stock_Principal not between", value1, value2, "outStockPrincipal");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("Goods_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("Goods_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("Goods_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("Goods_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("Goods_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("Goods_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("Goods_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("Goods_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("Goods_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumIsNull() {
            addCriterion("Goods_Out_Num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumIsNotNull() {
            addCriterion("Goods_Out_Num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumEqualTo(Integer value) {
            addCriterion("Goods_Out_Num =", value, "goodsOutNum");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumNotEqualTo(Integer value) {
            addCriterion("Goods_Out_Num <>", value, "goodsOutNum");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumGreaterThan(Integer value) {
            addCriterion("Goods_Out_Num >", value, "goodsOutNum");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_Out_Num >=", value, "goodsOutNum");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumLessThan(Integer value) {
            addCriterion("Goods_Out_Num <", value, "goodsOutNum");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_Out_Num <=", value, "goodsOutNum");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumIn(List<Integer> values) {
            addCriterion("Goods_Out_Num in", values, "goodsOutNum");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumNotIn(List<Integer> values) {
            addCriterion("Goods_Out_Num not in", values, "goodsOutNum");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Out_Num between", value1, value2, "goodsOutNum");
            return (Criteria) this;
        }

        public Criteria andGoodsOutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Out_Num not between", value1, value2, "goodsOutNum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_out_stock
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
     * This class corresponds to the database table t_out_stock
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