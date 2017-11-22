/** 广州哇宝信息技术有限公司 */
package com.wabao.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.wabao.dao.GameDao;
import com.wabao.entity.Game;
import com.xiaoleilu.hutool.json.JSONUtil;

/**
 * 
 * @since 2017年11月21日 下午2:17:41
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-mybatis.xml",
		"classpath:spring-quartz.xml", "classpath:spring-mvc.xml" })
public class SpringJunitTest {
	@Autowired
	private GameDao gameDao;

	@Autowired
	private SqlSession sqlSession;

	@Test
	@Transactional
	@Rollback(false)
	public void gameTest() {
		// System.out.println(JSONUtil.toJsonStr(gameDao.getGameById(3)));
		Game game = new Game();
		game.setName("mybatis还好");
		// game.setUrl("mybatisurl");
		int i = gameDao.addGame(game);
		System.out.println(i);
	}

	@Test
	public void sessionFbTest() {
		System.out.println(
				JSONUtil.toJsonStr(sqlSession.selectOne("getGameById", 3)));
	}
}
