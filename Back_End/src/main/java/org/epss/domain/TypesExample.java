package org.epss.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TypesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTdesIsNull() {
            addCriterion("tdes is null");
            return (Criteria) this;
        }

        public Criteria andTdesIsNotNull() {
            addCriterion("tdes is not null");
            return (Criteria) this;
        }

        public Criteria andTdesEqualTo(String value) {
            addCriterion("tdes =", value, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesNotEqualTo(String value) {
            addCriterion("tdes <>", value, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesGreaterThan(String value) {
            addCriterion("tdes >", value, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesGreaterThanOrEqualTo(String value) {
            addCriterion("tdes >=", value, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesLessThan(String value) {
            addCriterion("tdes <", value, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesLessThanOrEqualTo(String value) {
            addCriterion("tdes <=", value, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesLike(String value) {
            addCriterion("tdes like", value, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesNotLike(String value) {
            addCriterion("tdes not like", value, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesIn(List<String> values) {
            addCriterion("tdes in", values, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesNotIn(List<String> values) {
            addCriterion("tdes not in", values, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesBetween(String value1, String value2) {
            addCriterion("tdes between", value1, value2, "tdes");
            return (Criteria) this;
        }

        public Criteria andTdesNotBetween(String value1, String value2) {
            addCriterion("tdes not between", value1, value2, "tdes");
            return (Criteria) this;
        }

        public Criteria andTavatarIsNull() {
            addCriterion("tavatar is null");
            return (Criteria) this;
        }

        public Criteria andTavatarIsNotNull() {
            addCriterion("tavatar is not null");
            return (Criteria) this;
        }

        public Criteria andTavatarEqualTo(String value) {
            addCriterion("tavatar =", value, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarNotEqualTo(String value) {
            addCriterion("tavatar <>", value, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarGreaterThan(String value) {
            addCriterion("tavatar >", value, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarGreaterThanOrEqualTo(String value) {
            addCriterion("tavatar >=", value, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarLessThan(String value) {
            addCriterion("tavatar <", value, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarLessThanOrEqualTo(String value) {
            addCriterion("tavatar <=", value, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarLike(String value) {
            addCriterion("tavatar like", value, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarNotLike(String value) {
            addCriterion("tavatar not like", value, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarIn(List<String> values) {
            addCriterion("tavatar in", values, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarNotIn(List<String> values) {
            addCriterion("tavatar not in", values, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarBetween(String value1, String value2) {
            addCriterion("tavatar between", value1, value2, "tavatar");
            return (Criteria) this;
        }

        public Criteria andTavatarNotBetween(String value1, String value2) {
            addCriterion("tavatar not between", value1, value2, "tavatar");
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
    }
}