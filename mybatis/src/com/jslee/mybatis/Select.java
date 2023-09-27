package com.jslee.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jslee.userinfo.Info;

public class Select {
	// DB Select ������
	static Select mo = new Select();

	public static Select instance() {
		return mo;
	}

	SqlSessionFactory f = SqlCon.getSqlSession();

	public List<Info> dbSelect() {
		// xml���ϰ� ����� java���Ͽ� �ִ� sqlSession�� open
		SqlSession s = f.openSession();
		// �Ű����� �ȿ� statement�� �ֱ� ������ statement�ȿ� ���� select ������ ������ �ȴ�.
		List<Info> list = s.selectList("student_select"); // select�� �ϳ��� �ϴ°� �ƴ϶� ������ �ϴ� ���̱� ������ selectList�� ����Ѵ�.
		s.close();
		return list;
	}
}
