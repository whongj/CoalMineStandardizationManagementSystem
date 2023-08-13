package com.tsinghua.mem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class itemTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public itemTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTaskidIsNull() {
            addCriterion("taskID is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("taskID =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("taskID <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("taskID >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("taskID >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("taskID <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("taskID <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("taskID like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("taskID not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("taskID in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("taskID not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("taskID between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("taskID not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("itemID is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("itemID is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(String value) {
            addCriterion("itemID =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(String value) {
            addCriterion("itemID <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(String value) {
            addCriterion("itemID >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(String value) {
            addCriterion("itemID >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(String value) {
            addCriterion("itemID <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(String value) {
            addCriterion("itemID <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLike(String value) {
            addCriterion("itemID like", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotLike(String value) {
            addCriterion("itemID not like", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<String> values) {
            addCriterion("itemID in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<String> values) {
            addCriterion("itemID not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(String value1, String value2) {
            addCriterion("itemID between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(String value1, String value2) {
            addCriterion("itemID not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNull() {
            addCriterion("itemName is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("itemName is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("itemName =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("itemName <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("itemName >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("itemName >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("itemName <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("itemName <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("itemName like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("itemName not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("itemName in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("itemName not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("itemName between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("itemName not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemtypeidIsNull() {
            addCriterion("itemTypeID is null");
            return (Criteria) this;
        }

        public Criteria andItemtypeidIsNotNull() {
            addCriterion("itemTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andItemtypeidEqualTo(String value) {
            addCriterion("itemTypeID =", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidNotEqualTo(String value) {
            addCriterion("itemTypeID <>", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidGreaterThan(String value) {
            addCriterion("itemTypeID >", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("itemTypeID >=", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidLessThan(String value) {
            addCriterion("itemTypeID <", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidLessThanOrEqualTo(String value) {
            addCriterion("itemTypeID <=", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidLike(String value) {
            addCriterion("itemTypeID like", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidNotLike(String value) {
            addCriterion("itemTypeID not like", value, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidIn(List<String> values) {
            addCriterion("itemTypeID in", values, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidNotIn(List<String> values) {
            addCriterion("itemTypeID not in", values, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidBetween(String value1, String value2) {
            addCriterion("itemTypeID between", value1, value2, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypeidNotBetween(String value1, String value2) {
            addCriterion("itemTypeID not between", value1, value2, "itemtypeid");
            return (Criteria) this;
        }

        public Criteria andItemtypenameIsNull() {
            addCriterion("itemTypeName is null");
            return (Criteria) this;
        }

        public Criteria andItemtypenameIsNotNull() {
            addCriterion("itemTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andItemtypenameEqualTo(String value) {
            addCriterion("itemTypeName =", value, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameNotEqualTo(String value) {
            addCriterion("itemTypeName <>", value, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameGreaterThan(String value) {
            addCriterion("itemTypeName >", value, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("itemTypeName >=", value, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameLessThan(String value) {
            addCriterion("itemTypeName <", value, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameLessThanOrEqualTo(String value) {
            addCriterion("itemTypeName <=", value, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameLike(String value) {
            addCriterion("itemTypeName like", value, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameNotLike(String value) {
            addCriterion("itemTypeName not like", value, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameIn(List<String> values) {
            addCriterion("itemTypeName in", values, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameNotIn(List<String> values) {
            addCriterion("itemTypeName not in", values, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameBetween(String value1, String value2) {
            addCriterion("itemTypeName between", value1, value2, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemtypenameNotBetween(String value1, String value2) {
            addCriterion("itemTypeName not between", value1, value2, "itemtypename");
            return (Criteria) this;
        }

        public Criteria andItemstateIsNull() {
            addCriterion("itemState is null");
            return (Criteria) this;
        }

        public Criteria andItemstateIsNotNull() {
            addCriterion("itemState is not null");
            return (Criteria) this;
        }

        public Criteria andItemstateEqualTo(Integer value) {
            addCriterion("itemState =", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateNotEqualTo(Integer value) {
            addCriterion("itemState <>", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateGreaterThan(Integer value) {
            addCriterion("itemState >", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemState >=", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateLessThan(Integer value) {
            addCriterion("itemState <", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateLessThanOrEqualTo(Integer value) {
            addCriterion("itemState <=", value, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateIn(List<Integer> values) {
            addCriterion("itemState in", values, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateNotIn(List<Integer> values) {
            addCriterion("itemState not in", values, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateBetween(Integer value1, Integer value2) {
            addCriterion("itemState between", value1, value2, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemstateNotBetween(Integer value1, Integer value2) {
            addCriterion("itemState not between", value1, value2, "itemstate");
            return (Criteria) this;
        }

        public Criteria andItemoperIsNull() {
            addCriterion("itemOper is null");
            return (Criteria) this;
        }

        public Criteria andItemoperIsNotNull() {
            addCriterion("itemOper is not null");
            return (Criteria) this;
        }

        public Criteria andItemoperEqualTo(String value) {
            addCriterion("itemOper =", value, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperNotEqualTo(String value) {
            addCriterion("itemOper <>", value, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperGreaterThan(String value) {
            addCriterion("itemOper >", value, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperGreaterThanOrEqualTo(String value) {
            addCriterion("itemOper >=", value, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperLessThan(String value) {
            addCriterion("itemOper <", value, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperLessThanOrEqualTo(String value) {
            addCriterion("itemOper <=", value, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperLike(String value) {
            addCriterion("itemOper like", value, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperNotLike(String value) {
            addCriterion("itemOper not like", value, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperIn(List<String> values) {
            addCriterion("itemOper in", values, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperNotIn(List<String> values) {
            addCriterion("itemOper not in", values, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperBetween(String value1, String value2) {
            addCriterion("itemOper between", value1, value2, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemoperNotBetween(String value1, String value2) {
            addCriterion("itemOper not between", value1, value2, "itemoper");
            return (Criteria) this;
        }

        public Criteria andItemdateIsNull() {
            addCriterion("itemDate is null");
            return (Criteria) this;
        }

        public Criteria andItemdateIsNotNull() {
            addCriterion("itemDate is not null");
            return (Criteria) this;
        }

        public Criteria andItemdateEqualTo(Date value) {
            addCriterion("itemDate =", value, "itemdate");
            return (Criteria) this;
        }

        public Criteria andItemdateNotEqualTo(Date value) {
            addCriterion("itemDate <>", value, "itemdate");
            return (Criteria) this;
        }

        public Criteria andItemdateGreaterThan(Date value) {
            addCriterion("itemDate >", value, "itemdate");
            return (Criteria) this;
        }

        public Criteria andItemdateGreaterThanOrEqualTo(Date value) {
            addCriterion("itemDate >=", value, "itemdate");
            return (Criteria) this;
        }

        public Criteria andItemdateLessThan(Date value) {
            addCriterion("itemDate <", value, "itemdate");
            return (Criteria) this;
        }

        public Criteria andItemdateLessThanOrEqualTo(Date value) {
            addCriterion("itemDate <=", value, "itemdate");
            return (Criteria) this;
        }

        public Criteria andItemdateIn(List<Date> values) {
            addCriterion("itemDate in", values, "itemdate");
            return (Criteria) this;
        }

        public Criteria andItemdateNotIn(List<Date> values) {
            addCriterion("itemDate not in", values, "itemdate");
            return (Criteria) this;
        }

        public Criteria andItemdateBetween(Date value1, Date value2) {
            addCriterion("itemDate between", value1, value2, "itemdate");
            return (Criteria) this;
        }

        public Criteria andItemdateNotBetween(Date value1, Date value2) {
            addCriterion("itemDate not between", value1, value2, "itemdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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