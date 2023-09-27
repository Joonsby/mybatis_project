package com.jslee.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jslee.userinfo.Info;

public class Insert {
	static Select mo = new Select();
	
	public static Select instance() {
		return mo;
	}
	
	SqlSessionFactory f = SqlCon.getSqlSession();
	
	public void dbInsert(Info user){
		SqlSession s = f.openSession();
		s.insert("student_insert", user);
		s.commit();
		s.close();
	}
}
