package com.frommingu.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FromEx
 */
@WebServlet("/FormEx")
public class FromEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FromEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet �޼��尡 �����");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("doPost �޼��尡 �����");
		//�Է°����� ��ü�� request�� ���۵�
		request.setCharacterEncoding("EUC-KR"); //�ѱ� ����
		//�Ķ���Ͱ��� �Ѿ�� ctrl+t�� setCharacterEncoding �巡���ؼ� Ȯ��
		String name = request.getParameter("name"); //�̸� �Ķ���Ͱ� ��������
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//string �����ϸ� �ϳ��ۿ� ������ �迭�� �����ؾ� ���̹��� 
		//��̴� �������� ���� �����;���getParameterValues �޼��� ���
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("�ȳ��ϼ���."+ name + "�� �ݰ����ϴ�.<br/>");
		writer.println("�Է��Ͻ� ���������� Ȯ���Ͻñ� �ٶ��ϴ�.<br/>");
		writer.println("�̸�:" +name+"<br/>");
		writer.println("���̵�:" +name+"<br/>");
		writer.println("��й�ȣ:"+pw+"<br/>");
		writer.println("���:"+ Arrays.toString(hobbys)+"<br/>");
		writer.println("����:"+major+"<br/>");
		writer.println("��������:"+protocol+"<br/>");
		writer.println("</body></html>");
		
		writer.close();
				
	
	
	
	}

}
