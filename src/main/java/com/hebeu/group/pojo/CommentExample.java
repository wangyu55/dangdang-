package com.hebeu.group.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCoIdIsNull() {
            addCriterion("co_id is null");
            return (Criteria) this;
        }

        public Criteria andCoIdIsNotNull() {
            addCriterion("co_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoIdEqualTo(String value) {
            addCriterion("co_id =", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotEqualTo(String value) {
            addCriterion("co_id <>", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThan(String value) {
            addCriterion("co_id >", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThanOrEqualTo(String value) {
            addCriterion("co_id >=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThan(String value) {
            addCriterion("co_id <", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThanOrEqualTo(String value) {
            addCriterion("co_id <=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLike(String value) {
            addCriterion("co_id like", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotLike(String value) {
            addCriterion("co_id not like", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdIn(List<String> values) {
            addCriterion("co_id in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotIn(List<String> values) {
            addCriterion("co_id not in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdBetween(String value1, String value2) {
            addCriterion("co_id between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotBetween(String value1, String value2) {
            addCriterion("co_id not between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(String value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(String value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(String value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(String value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(String value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(String value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLike(String value) {
            addCriterion("b_id like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotLike(String value) {
            addCriterion("b_id not like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<String> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<String> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(String value1, String value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(String value1, String value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCoMessageIsNull() {
            addCriterion("co_message is null");
            return (Criteria) this;
        }

        public Criteria andCoMessageIsNotNull() {
            addCriterion("co_message is not null");
            return (Criteria) this;
        }

        public Criteria andCoMessageEqualTo(String value) {
            addCriterion("co_message =", value, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageNotEqualTo(String value) {
            addCriterion("co_message <>", value, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageGreaterThan(String value) {
            addCriterion("co_message >", value, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageGreaterThanOrEqualTo(String value) {
            addCriterion("co_message >=", value, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageLessThan(String value) {
            addCriterion("co_message <", value, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageLessThanOrEqualTo(String value) {
            addCriterion("co_message <=", value, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageLike(String value) {
            addCriterion("co_message like", value, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageNotLike(String value) {
            addCriterion("co_message not like", value, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageIn(List<String> values) {
            addCriterion("co_message in", values, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageNotIn(List<String> values) {
            addCriterion("co_message not in", values, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageBetween(String value1, String value2) {
            addCriterion("co_message between", value1, value2, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoMessageNotBetween(String value1, String value2) {
            addCriterion("co_message not between", value1, value2, "coMessage");
            return (Criteria) this;
        }

        public Criteria andCoTimeIsNull() {
            addCriterion("co_time is null");
            return (Criteria) this;
        }

        public Criteria andCoTimeIsNotNull() {
            addCriterion("co_time is not null");
            return (Criteria) this;
        }

        public Criteria andCoTimeEqualTo(String value) {
            addCriterion("co_time =", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeNotEqualTo(String value) {
            addCriterion("co_time <>", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeGreaterThan(String value) {
            addCriterion("co_time >", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("co_time >=", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeLessThan(String value) {
            addCriterion("co_time <", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeLessThanOrEqualTo(String value) {
            addCriterion("co_time <=", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeLike(String value) {
            addCriterion("co_time like", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeNotLike(String value) {
            addCriterion("co_time not like", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeIn(List<String> values) {
            addCriterion("co_time in", values, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeNotIn(List<String> values) {
            addCriterion("co_time not in", values, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeBetween(String value1, String value2) {
            addCriterion("co_time between", value1, value2, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeNotBetween(String value1, String value2) {
            addCriterion("co_time not between", value1, value2, "coTime");
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