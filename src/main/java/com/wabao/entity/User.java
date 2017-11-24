/** 广州哇宝信息技术有限公司 */
package com.wabao.entity;

import org.apache.ibatis.type.Alias;

import com.wabao.autocreate.Column;
import com.wabao.autocreate.MySqlTypeConstant;
import com.wabao.autocreate.Table;

/**
 * 
 * 
 * @since 2017年11月21日 下午1:05:21
 * @author Administrator
 */
@Alias("User")
@Table(name = "user")
public class User {
	@Column(isNull = false, length = 12, name = "id", type = MySqlTypeConstant.INT)
	private int id;
	@Column(isNull = false, length = 255, name = "name", type = MySqlTypeConstant.VARCHAR)
	private String name;
	@Column(isNull = false, length = 11, name = "age", type = MySqlTypeConstant.INT)
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}