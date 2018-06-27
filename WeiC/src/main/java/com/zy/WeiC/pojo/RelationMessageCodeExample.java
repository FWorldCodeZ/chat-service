package com.zy.WeiC.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RelationMessageCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationMessageCodeExample() {
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

        public Criteria andCodeIdIsNull() {
            addCriterion("code_id is null");
            return (Criteria) this;
        }

        public Criteria andCodeIdIsNotNull() {
            addCriterion("code_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodeIdEqualTo(Integer value) {
            addCriterion("code_id =", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotEqualTo(Integer value) {
            addCriterion("code_id <>", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThan(Integer value) {
            addCriterion("code_id >", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_id >=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThan(Integer value) {
            addCriterion("code_id <", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("code_id <=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdIn(List<Integer> values) {
            addCriterion("code_id in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotIn(List<Integer> values) {
            addCriterion("code_id not in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("code_id between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("code_id not between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNull() {
            addCriterion("parentcode is null");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNotNull() {
            addCriterion("parentcode is not null");
            return (Criteria) this;
        }

        public Criteria andParentcodeEqualTo(Integer value) {
            addCriterion("parentcode =", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotEqualTo(Integer value) {
            addCriterion("parentcode <>", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThan(Integer value) {
            addCriterion("parentcode >", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentcode >=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThan(Integer value) {
            addCriterion("parentcode <", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThanOrEqualTo(Integer value) {
            addCriterion("parentcode <=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeIn(List<Integer> values) {
            addCriterion("parentcode in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotIn(List<Integer> values) {
            addCriterion("parentcode not in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeBetween(Integer value1, Integer value2) {
            addCriterion("parentcode between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("parentcode not between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andChildcodeIsNull() {
            addCriterion("childcode is null");
            return (Criteria) this;
        }

        public Criteria andChildcodeIsNotNull() {
            addCriterion("childcode is not null");
            return (Criteria) this;
        }

        public Criteria andChildcodeEqualTo(Integer value) {
            addCriterion("childcode =", value, "childcode");
            return (Criteria) this;
        }

        public Criteria andChildcodeNotEqualTo(Integer value) {
            addCriterion("childcode <>", value, "childcode");
            return (Criteria) this;
        }

        public Criteria andChildcodeGreaterThan(Integer value) {
            addCriterion("childcode >", value, "childcode");
            return (Criteria) this;
        }

        public Criteria andChildcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("childcode >=", value, "childcode");
            return (Criteria) this;
        }

        public Criteria andChildcodeLessThan(Integer value) {
            addCriterion("childcode <", value, "childcode");
            return (Criteria) this;
        }

        public Criteria andChildcodeLessThanOrEqualTo(Integer value) {
            addCriterion("childcode <=", value, "childcode");
            return (Criteria) this;
        }

        public Criteria andChildcodeIn(List<Integer> values) {
            addCriterion("childcode in", values, "childcode");
            return (Criteria) this;
        }

        public Criteria andChildcodeNotIn(List<Integer> values) {
            addCriterion("childcode not in", values, "childcode");
            return (Criteria) this;
        }

        public Criteria andChildcodeBetween(Integer value1, Integer value2) {
            addCriterion("childcode between", value1, value2, "childcode");
            return (Criteria) this;
        }

        public Criteria andChildcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("childcode not between", value1, value2, "childcode");
            return (Criteria) this;
        }

        public Criteria andMessageinfoIsNull() {
            addCriterion("messageInfo is null");
            return (Criteria) this;
        }

        public Criteria andMessageinfoIsNotNull() {
            addCriterion("messageInfo is not null");
            return (Criteria) this;
        }

        public Criteria andMessageinfoEqualTo(String value) {
            addCriterion("messageInfo =", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoNotEqualTo(String value) {
            addCriterion("messageInfo <>", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoGreaterThan(String value) {
            addCriterion("messageInfo >", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoGreaterThanOrEqualTo(String value) {
            addCriterion("messageInfo >=", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoLessThan(String value) {
            addCriterion("messageInfo <", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoLessThanOrEqualTo(String value) {
            addCriterion("messageInfo <=", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoLike(String value) {
            addCriterion("messageInfo like", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoNotLike(String value) {
            addCriterion("messageInfo not like", value, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoIn(List<String> values) {
            addCriterion("messageInfo in", values, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoNotIn(List<String> values) {
            addCriterion("messageInfo not in", values, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoBetween(String value1, String value2) {
            addCriterion("messageInfo between", value1, value2, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessageinfoNotBetween(String value1, String value2) {
            addCriterion("messageInfo not between", value1, value2, "messageinfo");
            return (Criteria) this;
        }

        public Criteria andMessagestatusIsNull() {
            addCriterion("messageStatus is null");
            return (Criteria) this;
        }

        public Criteria andMessagestatusIsNotNull() {
            addCriterion("messageStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMessagestatusEqualTo(Integer value) {
            addCriterion("messageStatus =", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusNotEqualTo(Integer value) {
            addCriterion("messageStatus <>", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusGreaterThan(Integer value) {
            addCriterion("messageStatus >", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageStatus >=", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusLessThan(Integer value) {
            addCriterion("messageStatus <", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusLessThanOrEqualTo(Integer value) {
            addCriterion("messageStatus <=", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusIn(List<Integer> values) {
            addCriterion("messageStatus in", values, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusNotIn(List<Integer> values) {
            addCriterion("messageStatus not in", values, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusBetween(Integer value1, Integer value2) {
            addCriterion("messageStatus between", value1, value2, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("messageStatus not between", value1, value2, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andCodeDateIsNull() {
            addCriterion("code_date is null");
            return (Criteria) this;
        }

        public Criteria andCodeDateIsNotNull() {
            addCriterion("code_date is not null");
            return (Criteria) this;
        }

        public Criteria andCodeDateEqualTo(Date value) {
            addCriterionForJDBCDate("code_date =", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("code_date <>", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("code_date >", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("code_date >=", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateLessThan(Date value) {
            addCriterionForJDBCDate("code_date <", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("code_date <=", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateIn(List<Date> values) {
            addCriterionForJDBCDate("code_date in", values, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("code_date not in", values, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("code_date between", value1, value2, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("code_date not between", value1, value2, "codeDate");
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