package com.jslee.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jslee.userinfo.Info;

public class Select {
	// DB Select 페이지
	static Select mo = new Select();

	public static Select instance() {
		return mo;
	}

	SqlSessionFactory f = SqlCon.getSqlSession();

	public List<Info> dbSelect() {
		// xml파일과 연결된 java파일에 있는 sqlSession을 open
		SqlSession s = f.openSession();
		// 매개변수 안에 statement가 있기 때문에 statement안에 들어가는 select 문장을 넣으면 된다.
		List<Info> list = s.selectList("student_select"); // select을 하나만 하는게 아니라 여러개 하는 것이기 때문에 selectList를 사용한다.
		s.close();
		return list;
	}
}
