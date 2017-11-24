package com.wabao.entity;

import org.apache.ibatis.type.Alias;

import com.wabao.autocreate.Column;
import com.wabao.autocreate.MySqlTypeConstant;
import com.wabao.autocreate.Table;

/**
 * 游戏实体
 * 
 * @since 2015年11月24日 下午6:24:02
 * @author yaowenhao
 */
@Alias("Game")
@Table(name = "game")
public class Game {

	@Column(isNull = false, length = 11, name = "id", type = MySqlTypeConstant.INT)
	private int id; // 游戏ID
	@Column(isNull = true, length = 250, name = "name", type = MySqlTypeConstant.VARCHAR)
	private String name; // 游戏名
	@Column(isNull = true, length = 250, name = "url", type = MySqlTypeConstant.VARCHAR)
	private String url; // 游戏的账户服务器地址

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", url=" + url + "]";
	}

}