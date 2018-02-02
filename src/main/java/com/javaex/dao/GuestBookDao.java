package com.javaex.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestVo;

@Repository
public class GuestBookDao {

	@Autowired
	private SqlSession sqlSession;

	public void insert(GuestVo vo) {
		sqlSession.insert("guestbook.insert", vo);
	}

	public List<GuestVo> getList() {
		List<GuestVo> gList = sqlSession.selectList("guestbook.getList");

		return gList;
	}

	public void delete(int no, String password) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("no", no);
		map.put("password", password);
		sqlSession.delete("guestbook.delete", map);
	}

}
