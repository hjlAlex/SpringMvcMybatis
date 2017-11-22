/** 广州哇宝信息技术有限公司 */
package com.wabao.dao;

import org.springframework.stereotype.Repository;

import com.wabao.entity.Game;

/**
 * 
 * @since 2017年11月21日 下午4:46:21
 * @author Administrator
 */
@Repository
public interface GameDao {
	public Game getGameById(int id);

	public int addGame(Game game);
}
