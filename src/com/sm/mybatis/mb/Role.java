package com.sm.mybatis.mb;



public class Role {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_role.Role_ID
	 * @mbggenerated  Mon Jun 22 20:33:59 CST 2015
	 */
	private Integer roleId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_role.Role_Name
	 * @mbggenerated  Mon Jun 22 20:33:59 CST 2015
	 */
	private String roleName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_role.Role_ID
	 * @return  the value of t_role.Role_ID
	 * @mbggenerated  Mon Jun 22 20:33:59 CST 2015
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_role.Role_ID
	 * @param roleId  the value for t_role.Role_ID
	 * @mbggenerated  Mon Jun 22 20:33:59 CST 2015
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_role.Role_Name
	 * @return  the value of t_role.Role_Name
	 * @mbggenerated  Mon Jun 22 20:33:59 CST 2015
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_role.Role_Name
	 * @param roleName  the value for t_role.Role_Name
	 * @mbggenerated  Mon Jun 22 20:33:59 CST 2015
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}