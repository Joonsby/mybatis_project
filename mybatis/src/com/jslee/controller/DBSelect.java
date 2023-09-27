package com.jslee.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslee.mybatis.Select;
import com.jslee.userinfo.Info;
// �����ͺ��̽��� �����ϴ� ������
public class DBSelect implements Interface{

	static DBSelect dbs = new DBSelect();
	public static DBSelect instance() {
		return dbs;
	}
	
	@Override
	public String shData(HttpServletRequest re, HttpServletResponse rs) throws Exception {
		Select select = Select.instance();		
		// Select.java�ȿ� �ִ� openSession �޼ҵ� ȣ�� 
		// Return type�� List�� �����ش�.
		List<Info> list = select.dbSelect();
		// servlet �������� ������ ���ؼ�list�� setAttribute ���ش�.
		// servlet ������������ getAttribute�� �ϸ� �ȴ�.
		re.setAttribute("list", list);
		return null;
	}
}