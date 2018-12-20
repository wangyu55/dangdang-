package com.hebeu.group.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCPassIsNull() {
            addCriterion("c_pass is null");
            return (Criteria) this;
        }

        public Criteria andCPassIsNotNull() {
            addCriterion("c_pass is not null");
            return (Criteria) this;
        }

        public Criteria andCPassEqualTo(String value) {
            addCriterion("c_pass =", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassNotEqualTo(String value) {
            addCriterion("c_pass <>", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassGreaterThan(String value) {
            addCriterion("c_pass >", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassGreaterThanOrEqualTo(String value) {
            addCriterion("c_pass >=", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassLessThan(String value) {
            addCriterion("c_pass <", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassLessThanOrEqualTo(String value) {
            addCriterion("c_pass <=", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassLike(String value) {
            addCriterion("c_pass like", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassNotLike(String value) {
            addCriterion("c_pass not like", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassIn(List<String> values) {
            addCriterion("c_pass in", values, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassNotIn(List<String> values) {
            addCriterion("c_pass not in", values, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassBetween(String value1, String value2) {
            addCriterion("c_pass between", value1, value2, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassNotBetween(String value1, String value2) {
            addCriterion("c_pass not between", value1, value2, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNull() {
            addCriterion("c_phone is null");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNotNull() {
            addCriterion("c_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCPhoneEqualTo(String value) {
            addCriterion("c_phone =", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotEqualTo(String value) {
            addCriterion("c_phone <>", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThan(String value) {
            addCriterion("c_phone >", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_phone >=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThan(String value) {
            addCriterion("c_phone <", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThanOrEqualTo(String value) {
            addCriterion("c_phone <=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLike(String value) {
            addCriterion("c_phone like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotLike(String value) {
            addCriterion("c_phone not like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneIn(List<String> values) {
            addCriterion("c_phone in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotIn(List<String> values) {
            addCriterion("c_phone not in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneBetween(String value1, String value2) {
            addCriterion("c_phone between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotBetween(String value1, String value2) {
            addCriterion("c_phone not between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNull() {
            addCriterion("c_address is null");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNotNull() {
            addCriterion("c_address is not null");
            return (Criteria) this;
        }

        public Criteria andCAddressEqualTo(String value) {
            addCriterion("c_address =", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotEqualTo(String value) {
            addCriterion("c_address <>", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThan(String value) {
            addCriterion("c_address >", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_address >=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThan(String value) {
            addCriterion("c_address <", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThanOrEqualTo(String value) {
            addCriterion("c_address <=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLike(String value) {
            addCriterion("c_address like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotLike(String value) {
            addCriterion("c_address not like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressIn(List<String> values) {
            addCriterion("c_address in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotIn(List<String> values) {
            addCriterion("c_address not in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressBetween(String value1, String value2) {
            addCriterion("c_address between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotBetween(String value1, String value2) {
            addCriterion("c_address not between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNull() {
            addCriterion("c_email is null");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNotNull() {
            addCriterion("c_email is not null");
            return (Criteria) this;
        }

        public Criteria andCEmailEqualTo(String value) {
            addCriterion("c_email =", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotEqualTo(String value) {
            addCriterion("c_email <>", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThan(String value) {
            addCriterion("c_email >", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThanOrEqualTo(String value) {
            addCriterion("c_email >=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThan(String value) {
            addCriterion("c_email <", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThanOrEqualTo(String value) {
            addCriterion("c_email <=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLike(String value) {
            addCriterion("c_email like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotLike(String value) {
            addCriterion("c_email not like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailIn(List<String> values) {
            addCriterion("c_email in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotIn(List<String> values) {
            addCriterion("c_email not in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailBetween(String value1, String value2) {
            addCriterion("c_email between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotBetween(String value1, String value2) {
            addCriterion("c_email not between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCScoreIsNull() {
            addCriterion("c_score is null");
            return (Criteria) this;
        }

        public Criteria andCScoreIsNotNull() {
            addCriterion("c_score is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreEqualTo(Integer value) {
            addCriterion("c_score =", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreNotEqualTo(Integer value) {
            addCriterion("c_score <>", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreGreaterThan(Integer value) {
            addCriterion("c_score >", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_score >=", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreLessThan(Integer value) {
            addCriterion("c_score <", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreLessThanOrEqualTo(Integer value) {
            addCriterion("c_score <=", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreIn(List<Integer> values) {
            addCriterion("c_score in", values, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreNotIn(List<Integer> values) {
            addCriterion("c_score not in", values, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreBetween(Integer value1, Integer value2) {
            addCriterion("c_score between", value1, value2, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("c_score not between", value1, value2, "cScore");
            return (Criteria) this;
        }

        public Criteria andCBlanceIsNull() {
            addCriterion("c_blance is null");
            return (Criteria) this;
        }

        public Criteria andCBlanceIsNotNull() {
            addCriterion("c_blance is not null");
            return (Criteria) this;
        }

        public Criteria andCBlanceEqualTo(Double value) {
            addCriterion("c_blance =", value, "cBlance");
            return (Criteria) this;
        }

        public Criteria andCBlanceNotEqualTo(Double value) {
            addCriterion("c_blance <>", value, "cBlance");
            return (Criteria) this;
        }

        public Criteria andCBlanceGreaterThan(Double value) {
            addCriterion("c_blance >", value, "cBlance");
            return (Criteria) this;
        }

        public Criteria andCBlanceGreaterThanOrEqualTo(Double value) {
            addCriterion("c_blance >=", value, "cBlance");
            return (Criteria) this;
        }

        public Criteria andCBlanceLessThan(Double value) {
            addCriterion("c_blance <", value, "cBlance");
            return (Criteria) this;
        }

        public Criteria andCBlanceLessThanOrEqualTo(Double value) {
            addCriterion("c_blance <=", value, "cBlance");
            return (Criteria) this;
        }

        public Criteria andCBlanceIn(List<Double> values) {
            addCriterion("c_blance in", values, "cBlance");
            return (Criteria) this;
        }

        public Criteria andCBlanceNotIn(List<Double> values) {
            addCriterion("c_blance not in", values, "cBlance");
            return (Criteria) this;
        }

        public Criteria andCBlanceBetween(Double value1, Double value2) {
            addCriterion("c_blance between", value1, value2, "cBlance");
            return (Criteria) this;
        }

        public Criteria andCBlanceNotBetween(Double value1, Double value2) {
            addCriterion("c_blance not between", value1, value2, "cBlance");
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