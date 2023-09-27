package com.jslee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ���� ������
public class Servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {		
		rq.setCharacterEncoding("UTF-8");
		// DBExtract���� ������ static ��ü�� �ִ� instance �޼ҵ� ȣ��
		// �������̽� �ָӴ� �ϳ��� ����
		// ��
		// select, insert, delete �� ����� ���� ���� ������ ���Ӱ� ��ü�� �����ؼ� �������̽��� ������ �ȴ�.
		String comm = rq.getParameter("comm");
		Interface inter = null;
		// override�� �޼ҵ� ȣ��
		try {
			if (comm.equals("sel")) {
				inter = DBSelect.instance();
				inter.shData(rq, rs);
				RequestDispatcher dispatcher = rq.getRequestDispatcher("print.jsp");
				dispatcher.forward(rq, rs);
			} else if (comm.equals("ins")) {
				inter = DBInsert.instance();
				inter.shData(rq, rs);
				rs.sendRedirect("result.jsp");
			}
			// List<Info> list = rq.getAttribute("list");
			// print.jsp�� setAttribute �Ǿ��ִ� ���� �ѱ�� ���ؼ� RequestDispatcher�� ���
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
