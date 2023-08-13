package com.tsinghua.mem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class taskTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public taskTableExample() {
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

        public Criteria andTasktypeidIsNull() {
            addCriterion("taskTypeID is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeidIsNotNull() {
            addCriterion("taskTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeidEqualTo(String value) {
            addCriterion("taskTypeID =", value, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidNotEqualTo(String value) {
            addCriterion("taskTypeID <>", value, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidGreaterThan(String value) {
            addCriterion("taskTypeID >", value, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidGreaterThanOrEqualTo(String value) {
            addCriterion("taskTypeID >=", value, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidLessThan(String value) {
            addCriterion("taskTypeID <", value, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidLessThanOrEqualTo(String value) {
            addCriterion("taskTypeID <=", value, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidLike(String value) {
            addCriterion("taskTypeID like", value, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidNotLike(String value) {
            addCriterion("taskTypeID not like", value, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidIn(List<String> values) {
            addCriterion("taskTypeID in", values, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidNotIn(List<String> values) {
            addCriterion("taskTypeID not in", values, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidBetween(String value1, String value2) {
            addCriterion("taskTypeID between", value1, value2, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypeidNotBetween(String value1, String value2) {
            addCriterion("taskTypeID not between", value1, value2, "tasktypeid");
            return (Criteria) this;
        }

        public Criteria andTasktypenameIsNull() {
            addCriterion("taskTypeName is null");
            return (Criteria) this;
        }

        public Criteria andTasktypenameIsNotNull() {
            addCriterion("taskTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypenameEqualTo(String value) {
            addCriterion("taskTypeName =", value, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameNotEqualTo(String value) {
            addCriterion("taskTypeName <>", value, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameGreaterThan(String value) {
            addCriterion("taskTypeName >", value, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameGreaterThanOrEqualTo(String value) {
            addCriterion("taskTypeName >=", value, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameLessThan(String value) {
            addCriterion("taskTypeName <", value, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameLessThanOrEqualTo(String value) {
            addCriterion("taskTypeName <=", value, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameLike(String value) {
            addCriterion("taskTypeName like", value, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameNotLike(String value) {
            addCriterion("taskTypeName not like", value, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameIn(List<String> values) {
            addCriterion("taskTypeName in", values, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameNotIn(List<String> values) {
            addCriterion("taskTypeName not in", values, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameBetween(String value1, String value2) {
            addCriterion("taskTypeName between", value1, value2, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTasktypenameNotBetween(String value1, String value2) {
            addCriterion("taskTypeName not between", value1, value2, "tasktypename");
            return (Criteria) this;
        }

        public Criteria andTaskdateIsNull() {
            addCriterion("taskDate is null");
            return (Criteria) this;
        }

        public Criteria andTaskdateIsNotNull() {
            addCriterion("taskDate is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdateEqualTo(Date value) {
            addCriterion("taskDate =", value, "taskdate");
            return (Criteria) this;
        }

        public Criteria andTaskdateNotEqualTo(Date value) {
            addCriterion("taskDate <>", value, "taskdate");
            return (Criteria) this;
        }

        public Criteria andTaskdateGreaterThan(Date value) {
            addCriterion("taskDate >", value, "taskdate");
            return (Criteria) this;
        }

        public Criteria andTaskdateGreaterThanOrEqualTo(Date value) {
            addCriterion("taskDate >=", value, "taskdate");
            return (Criteria) this;
        }

        public Criteria andTaskdateLessThan(Date value) {
            addCriterion("taskDate <", value, "taskdate");
            return (Criteria) this;
        }

        public Criteria andTaskdateLessThanOrEqualTo(Date value) {
            addCriterion("taskDate <=", value, "taskdate");
            return (Criteria) this;
        }

        public Criteria andTaskdateIn(List<Date> values) {
            addCriterion("taskDate in", values, "taskdate");
            return (Criteria) this;
        }

        public Criteria andTaskdateNotIn(List<Date> values) {
            addCriterion("taskDate not in", values, "taskdate");
            return (Criteria) this;
        }

        public Criteria andTaskdateBetween(Date value1, Date value2) {
            addCriterion("taskDate between", value1, value2, "taskdate");
            return (Criteria) this;
        }

        public Criteria andTaskdateNotBetween(Date value1, Date value2) {
            addCriterion("taskDate not between", value1, value2, "taskdate");
            return (Criteria) this;
        }

        public Criteria andPlatenumberIsNull() {
            addCriterion("plateNumber is null");
            return (Criteria) this;
        }

        public Criteria andPlatenumberIsNotNull() {
            addCriterion("plateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPlatenumberEqualTo(String value) {
            addCriterion("plateNumber =", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberNotEqualTo(String value) {
            addCriterion("plateNumber <>", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberGreaterThan(String value) {
            addCriterion("plateNumber >", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberGreaterThanOrEqualTo(String value) {
            addCriterion("plateNumber >=", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberLessThan(String value) {
            addCriterion("plateNumber <", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberLessThanOrEqualTo(String value) {
            addCriterion("plateNumber <=", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberLike(String value) {
            addCriterion("plateNumber like", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberNotLike(String value) {
            addCriterion("plateNumber not like", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberIn(List<String> values) {
            addCriterion("plateNumber in", values, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberNotIn(List<String> values) {
            addCriterion("plateNumber not in", values, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberBetween(String value1, String value2) {
            addCriterion("plateNumber between", value1, value2, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberNotBetween(String value1, String value2) {
            addCriterion("plateNumber not between", value1, value2, "platenumber");
            return (Criteria) this;
        }

        public Criteria andTaskoperIsNull() {
            addCriterion("taskOper is null");
            return (Criteria) this;
        }

        public Criteria andTaskoperIsNotNull() {
            addCriterion("taskOper is not null");
            return (Criteria) this;
        }

        public Criteria andTaskoperEqualTo(String value) {
            addCriterion("taskOper =", value, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperNotEqualTo(String value) {
            addCriterion("taskOper <>", value, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperGreaterThan(String value) {
            addCriterion("taskOper >", value, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperGreaterThanOrEqualTo(String value) {
            addCriterion("taskOper >=", value, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperLessThan(String value) {
            addCriterion("taskOper <", value, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperLessThanOrEqualTo(String value) {
            addCriterion("taskOper <=", value, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperLike(String value) {
            addCriterion("taskOper like", value, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperNotLike(String value) {
            addCriterion("taskOper not like", value, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperIn(List<String> values) {
            addCriterion("taskOper in", values, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperNotIn(List<String> values) {
            addCriterion("taskOper not in", values, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperBetween(String value1, String value2) {
            addCriterion("taskOper between", value1, value2, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskoperNotBetween(String value1, String value2) {
            addCriterion("taskOper not between", value1, value2, "taskoper");
            return (Criteria) this;
        }

        public Criteria andTaskstateIsNull() {
            addCriterion("taskState is null");
            return (Criteria) this;
        }

        public Criteria andTaskstateIsNotNull() {
            addCriterion("taskState is not null");
            return (Criteria) this;
        }

        public Criteria andTaskstateEqualTo(Integer value) {
            addCriterion("taskState =", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateNotEqualTo(Integer value) {
            addCriterion("taskState <>", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateGreaterThan(Integer value) {
            addCriterion("taskState >", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskState >=", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateLessThan(Integer value) {
            addCriterion("taskState <", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateLessThanOrEqualTo(Integer value) {
            addCriterion("taskState <=", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateIn(List<Integer> values) {
            addCriterion("taskState in", values, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateNotIn(List<Integer> values) {
            addCriterion("taskState not in", values, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateBetween(Integer value1, Integer value2) {
            addCriterion("taskState between", value1, value2, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateNotBetween(Integer value1, Integer value2) {
            addCriterion("taskState not between", value1, value2, "taskstate");
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