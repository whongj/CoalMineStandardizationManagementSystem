package com.tsinghua.mem.pojo;

import java.util.ArrayList;
import java.util.List;

public class achiTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public achiTableExample() {
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

        public Criteria andAchiidIsNull() {
            addCriterion("achiID is null");
            return (Criteria) this;
        }

        public Criteria andAchiidIsNotNull() {
            addCriterion("achiID is not null");
            return (Criteria) this;
        }

        public Criteria andAchiidEqualTo(String value) {
            addCriterion("achiID =", value, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidNotEqualTo(String value) {
            addCriterion("achiID <>", value, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidGreaterThan(String value) {
            addCriterion("achiID >", value, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidGreaterThanOrEqualTo(String value) {
            addCriterion("achiID >=", value, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidLessThan(String value) {
            addCriterion("achiID <", value, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidLessThanOrEqualTo(String value) {
            addCriterion("achiID <=", value, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidLike(String value) {
            addCriterion("achiID like", value, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidNotLike(String value) {
            addCriterion("achiID not like", value, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidIn(List<String> values) {
            addCriterion("achiID in", values, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidNotIn(List<String> values) {
            addCriterion("achiID not in", values, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidBetween(String value1, String value2) {
            addCriterion("achiID between", value1, value2, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchiidNotBetween(String value1, String value2) {
            addCriterion("achiID not between", value1, value2, "achiid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidIsNull() {
            addCriterion("achiTypeID is null");
            return (Criteria) this;
        }

        public Criteria andAchitypeidIsNotNull() {
            addCriterion("achiTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andAchitypeidEqualTo(String value) {
            addCriterion("achiTypeID =", value, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidNotEqualTo(String value) {
            addCriterion("achiTypeID <>", value, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidGreaterThan(String value) {
            addCriterion("achiTypeID >", value, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidGreaterThanOrEqualTo(String value) {
            addCriterion("achiTypeID >=", value, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidLessThan(String value) {
            addCriterion("achiTypeID <", value, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidLessThanOrEqualTo(String value) {
            addCriterion("achiTypeID <=", value, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidLike(String value) {
            addCriterion("achiTypeID like", value, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidNotLike(String value) {
            addCriterion("achiTypeID not like", value, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidIn(List<String> values) {
            addCriterion("achiTypeID in", values, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidNotIn(List<String> values) {
            addCriterion("achiTypeID not in", values, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidBetween(String value1, String value2) {
            addCriterion("achiTypeID between", value1, value2, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypeidNotBetween(String value1, String value2) {
            addCriterion("achiTypeID not between", value1, value2, "achitypeid");
            return (Criteria) this;
        }

        public Criteria andAchitypenameIsNull() {
            addCriterion("achiTypeName is null");
            return (Criteria) this;
        }

        public Criteria andAchitypenameIsNotNull() {
            addCriterion("achiTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andAchitypenameEqualTo(String value) {
            addCriterion("achiTypeName =", value, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameNotEqualTo(String value) {
            addCriterion("achiTypeName <>", value, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameGreaterThan(String value) {
            addCriterion("achiTypeName >", value, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameGreaterThanOrEqualTo(String value) {
            addCriterion("achiTypeName >=", value, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameLessThan(String value) {
            addCriterion("achiTypeName <", value, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameLessThanOrEqualTo(String value) {
            addCriterion("achiTypeName <=", value, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameLike(String value) {
            addCriterion("achiTypeName like", value, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameNotLike(String value) {
            addCriterion("achiTypeName not like", value, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameIn(List<String> values) {
            addCriterion("achiTypeName in", values, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameNotIn(List<String> values) {
            addCriterion("achiTypeName not in", values, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameBetween(String value1, String value2) {
            addCriterion("achiTypeName between", value1, value2, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchitypenameNotBetween(String value1, String value2) {
            addCriterion("achiTypeName not between", value1, value2, "achitypename");
            return (Criteria) this;
        }

        public Criteria andAchikeyIsNull() {
            addCriterion("achiKey is null");
            return (Criteria) this;
        }

        public Criteria andAchikeyIsNotNull() {
            addCriterion("achiKey is not null");
            return (Criteria) this;
        }

        public Criteria andAchikeyEqualTo(String value) {
            addCriterion("achiKey =", value, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyNotEqualTo(String value) {
            addCriterion("achiKey <>", value, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyGreaterThan(String value) {
            addCriterion("achiKey >", value, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyGreaterThanOrEqualTo(String value) {
            addCriterion("achiKey >=", value, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyLessThan(String value) {
            addCriterion("achiKey <", value, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyLessThanOrEqualTo(String value) {
            addCriterion("achiKey <=", value, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyLike(String value) {
            addCriterion("achiKey like", value, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyNotLike(String value) {
            addCriterion("achiKey not like", value, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyIn(List<String> values) {
            addCriterion("achiKey in", values, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyNotIn(List<String> values) {
            addCriterion("achiKey not in", values, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyBetween(String value1, String value2) {
            addCriterion("achiKey between", value1, value2, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchikeyNotBetween(String value1, String value2) {
            addCriterion("achiKey not between", value1, value2, "achikey");
            return (Criteria) this;
        }

        public Criteria andAchivalueIsNull() {
            addCriterion("achiValue is null");
            return (Criteria) this;
        }

        public Criteria andAchivalueIsNotNull() {
            addCriterion("achiValue is not null");
            return (Criteria) this;
        }

        public Criteria andAchivalueEqualTo(String value) {
            addCriterion("achiValue =", value, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueNotEqualTo(String value) {
            addCriterion("achiValue <>", value, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueGreaterThan(String value) {
            addCriterion("achiValue >", value, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueGreaterThanOrEqualTo(String value) {
            addCriterion("achiValue >=", value, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueLessThan(String value) {
            addCriterion("achiValue <", value, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueLessThanOrEqualTo(String value) {
            addCriterion("achiValue <=", value, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueLike(String value) {
            addCriterion("achiValue like", value, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueNotLike(String value) {
            addCriterion("achiValue not like", value, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueIn(List<String> values) {
            addCriterion("achiValue in", values, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueNotIn(List<String> values) {
            addCriterion("achiValue not in", values, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueBetween(String value1, String value2) {
            addCriterion("achiValue between", value1, value2, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchivalueNotBetween(String value1, String value2) {
            addCriterion("achiValue not between", value1, value2, "achivalue");
            return (Criteria) this;
        }

        public Criteria andAchiunitIsNull() {
            addCriterion("achiUnit is null");
            return (Criteria) this;
        }

        public Criteria andAchiunitIsNotNull() {
            addCriterion("achiUnit is not null");
            return (Criteria) this;
        }

        public Criteria andAchiunitEqualTo(String value) {
            addCriterion("achiUnit =", value, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitNotEqualTo(String value) {
            addCriterion("achiUnit <>", value, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitGreaterThan(String value) {
            addCriterion("achiUnit >", value, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitGreaterThanOrEqualTo(String value) {
            addCriterion("achiUnit >=", value, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitLessThan(String value) {
            addCriterion("achiUnit <", value, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitLessThanOrEqualTo(String value) {
            addCriterion("achiUnit <=", value, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitLike(String value) {
            addCriterion("achiUnit like", value, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitNotLike(String value) {
            addCriterion("achiUnit not like", value, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitIn(List<String> values) {
            addCriterion("achiUnit in", values, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitNotIn(List<String> values) {
            addCriterion("achiUnit not in", values, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitBetween(String value1, String value2) {
            addCriterion("achiUnit between", value1, value2, "achiunit");
            return (Criteria) this;
        }

        public Criteria andAchiunitNotBetween(String value1, String value2) {
            addCriterion("achiUnit not between", value1, value2, "achiunit");
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