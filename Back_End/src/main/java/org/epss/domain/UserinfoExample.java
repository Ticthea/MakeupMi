package org.epss.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUiidIsNull() {
            addCriterion("uiid is null");
            return (Criteria) this;
        }

        public Criteria andUiidIsNotNull() {
            addCriterion("uiid is not null");
            return (Criteria) this;
        }

        public Criteria andUiidEqualTo(Integer value) {
            addCriterion("uiid =", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotEqualTo(Integer value) {
            addCriterion("uiid <>", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidGreaterThan(Integer value) {
            addCriterion("uiid >", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uiid >=", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidLessThan(Integer value) {
            addCriterion("uiid <", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidLessThanOrEqualTo(Integer value) {
            addCriterion("uiid <=", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidIn(List<Integer> values) {
            addCriterion("uiid in", values, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotIn(List<Integer> values) {
            addCriterion("uiid not in", values, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidBetween(Integer value1, Integer value2) {
            addCriterion("uiid between", value1, value2, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotBetween(Integer value1, Integer value2) {
            addCriterion("uiid not between", value1, value2, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiphoneIsNull() {
            addCriterion("uiphone is null");
            return (Criteria) this;
        }

        public Criteria andUiphoneIsNotNull() {
            addCriterion("uiphone is not null");
            return (Criteria) this;
        }

        public Criteria andUiphoneEqualTo(String value) {
            addCriterion("uiphone =", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneNotEqualTo(String value) {
            addCriterion("uiphone <>", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneGreaterThan(String value) {
            addCriterion("uiphone >", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uiphone >=", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneLessThan(String value) {
            addCriterion("uiphone <", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneLessThanOrEqualTo(String value) {
            addCriterion("uiphone <=", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneLike(String value) {
            addCriterion("uiphone like", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneNotLike(String value) {
            addCriterion("uiphone not like", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneIn(List<String> values) {
            addCriterion("uiphone in", values, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneNotIn(List<String> values) {
            addCriterion("uiphone not in", values, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneBetween(String value1, String value2) {
            addCriterion("uiphone between", value1, value2, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneNotBetween(String value1, String value2) {
            addCriterion("uiphone not between", value1, value2, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiaddressIsNull() {
            addCriterion("uiaddress is null");
            return (Criteria) this;
        }

        public Criteria andUiaddressIsNotNull() {
            addCriterion("uiaddress is not null");
            return (Criteria) this;
        }

        public Criteria andUiaddressEqualTo(String value) {
            addCriterion("uiaddress =", value, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressNotEqualTo(String value) {
            addCriterion("uiaddress <>", value, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressGreaterThan(String value) {
            addCriterion("uiaddress >", value, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressGreaterThanOrEqualTo(String value) {
            addCriterion("uiaddress >=", value, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressLessThan(String value) {
            addCriterion("uiaddress <", value, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressLessThanOrEqualTo(String value) {
            addCriterion("uiaddress <=", value, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressLike(String value) {
            addCriterion("uiaddress like", value, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressNotLike(String value) {
            addCriterion("uiaddress not like", value, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressIn(List<String> values) {
            addCriterion("uiaddress in", values, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressNotIn(List<String> values) {
            addCriterion("uiaddress not in", values, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressBetween(String value1, String value2) {
            addCriterion("uiaddress between", value1, value2, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andUiaddressNotBetween(String value1, String value2) {
            addCriterion("uiaddress not between", value1, value2, "uiaddress");
            return (Criteria) this;
        }

        public Criteria andFuidIsNull() {
            addCriterion("fuid is null");
            return (Criteria) this;
        }

        public Criteria andFuidIsNotNull() {
            addCriterion("fuid is not null");
            return (Criteria) this;
        }

        public Criteria andFuidEqualTo(Integer value) {
            addCriterion("fuid =", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidNotEqualTo(Integer value) {
            addCriterion("fuid <>", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidGreaterThan(Integer value) {
            addCriterion("fuid >", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuid >=", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidLessThan(Integer value) {
            addCriterion("fuid <", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidLessThanOrEqualTo(Integer value) {
            addCriterion("fuid <=", value, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidIn(List<Integer> values) {
            addCriterion("fuid in", values, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidNotIn(List<Integer> values) {
            addCriterion("fuid not in", values, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidBetween(Integer value1, Integer value2) {
            addCriterion("fuid between", value1, value2, "fuid");
            return (Criteria) this;
        }

        public Criteria andFuidNotBetween(Integer value1, Integer value2) {
            addCriterion("fuid not between", value1, value2, "fuid");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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