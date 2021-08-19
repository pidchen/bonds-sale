package com.ssm.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	protected String orderByClause;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	protected boolean distinct;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	public UserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the
	 * database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
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

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("USERNAME is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("USERNAME is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("USERNAME =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("USERNAME <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("USERNAME >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("USERNAME >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("USERNAME <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("USERNAME <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("USERNAME like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("USERNAME not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("USERNAME in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("USERNAME not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("USERNAME between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("USERNAME not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUserageIsNull() {
			addCriterion("USERAGE is null");
			return (Criteria) this;
		}

		public Criteria andUserageIsNotNull() {
			addCriterion("USERAGE is not null");
			return (Criteria) this;
		}

		public Criteria andUserageEqualTo(Integer value) {
			addCriterion("USERAGE =", value, "userage");
			return (Criteria) this;
		}

		public Criteria andUserageNotEqualTo(Integer value) {
			addCriterion("USERAGE <>", value, "userage");
			return (Criteria) this;
		}

		public Criteria andUserageGreaterThan(Integer value) {
			addCriterion("USERAGE >", value, "userage");
			return (Criteria) this;
		}

		public Criteria andUserageGreaterThanOrEqualTo(Integer value) {
			addCriterion("USERAGE >=", value, "userage");
			return (Criteria) this;
		}

		public Criteria andUserageLessThan(Integer value) {
			addCriterion("USERAGE <", value, "userage");
			return (Criteria) this;
		}

		public Criteria andUserageLessThanOrEqualTo(Integer value) {
			addCriterion("USERAGE <=", value, "userage");
			return (Criteria) this;
		}

		public Criteria andUserageIn(List<Integer> values) {
			addCriterion("USERAGE in", values, "userage");
			return (Criteria) this;
		}

		public Criteria andUserageNotIn(List<Integer> values) {
			addCriterion("USERAGE not in", values, "userage");
			return (Criteria) this;
		}

		public Criteria andUserageBetween(Integer value1, Integer value2) {
			addCriterion("USERAGE between", value1, value2, "userage");
			return (Criteria) this;
		}

		public Criteria andUserageNotBetween(Integer value1, Integer value2) {
			addCriterion("USERAGE not between", value1, value2, "userage");
			return (Criteria) this;
		}

		public Criteria andUseraddressIsNull() {
			addCriterion("USERADDRESS is null");
			return (Criteria) this;
		}

		public Criteria andUseraddressIsNotNull() {
			addCriterion("USERADDRESS is not null");
			return (Criteria) this;
		}

		public Criteria andUseraddressEqualTo(String value) {
			addCriterion("USERADDRESS =", value, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressNotEqualTo(String value) {
			addCriterion("USERADDRESS <>", value, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressGreaterThan(String value) {
			addCriterion("USERADDRESS >", value, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressGreaterThanOrEqualTo(String value) {
			addCriterion("USERADDRESS >=", value, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressLessThan(String value) {
			addCriterion("USERADDRESS <", value, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressLessThanOrEqualTo(String value) {
			addCriterion("USERADDRESS <=", value, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressLike(String value) {
			addCriterion("USERADDRESS like", value, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressNotLike(String value) {
			addCriterion("USERADDRESS not like", value, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressIn(List<String> values) {
			addCriterion("USERADDRESS in", values, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressNotIn(List<String> values) {
			addCriterion("USERADDRESS not in", values, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressBetween(String value1, String value2) {
			addCriterion("USERADDRESS between", value1, value2, "useraddress");
			return (Criteria) this;
		}

		public Criteria andUseraddressNotBetween(String value1, String value2) {
			addCriterion("USERADDRESS not between", value1, value2, "useraddress");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the
	 * database table USER
	 *
	 * @mbg.generated do_not_delete_during_merge Wed Jul 22 12:31:26 CST 2020
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the
	 * database table USER
	 *
	 * @mbg.generated Wed Jul 22 12:31:26 CST 2020
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