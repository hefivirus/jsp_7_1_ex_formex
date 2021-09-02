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
		System.out.println("doGet 메서드가 실행됨");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("doPost 메서드가 실행됨");
		//입력값들이 객체로 request에 전송됨
		request.setCharacterEncoding("EUC-KR"); //한글 세팅
		//파라미터값이 넘어옴 ctrl+t로 setCharacterEncoding 드래그해서 확인
		String name = request.getParameter("name"); //이름 파라미터값 가져오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//string 선언하면 하나밖에 못받음 배열로 선언해야 많이받음 
		//취미는 여러개의 값을 가져와야함getParameterValues 메서드 사용
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("안녕하세요."+ name + "님 반갑습니다.<br/>");
		writer.println("입력하신 가입정보를 확인하시기 바랍니다.<br/>");
		writer.println("이름:" +name+"<br/>");
		writer.println("아이디:" +name+"<br/>");
		writer.println("비밀번호:"+pw+"<br/>");
		writer.println("취미:"+ Arrays.toString(hobbys)+"<br/>");
		writer.println("전공:"+major+"<br/>");
		writer.println("프로토콜:"+protocol+"<br/>");
		writer.println("</body></html>");
		
		writer.close();
				
	
	
	
	}

}
