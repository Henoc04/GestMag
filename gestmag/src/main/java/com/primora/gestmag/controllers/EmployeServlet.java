package com.primora.gestmag.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.primora.gestmag.home.EmployeHome;
import com.primora.gestmag.models.Employe;


@WebServlet("/employes")
public class EmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EmployeHome employeBean;
	
    public EmployeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Employe> employes = employeBean.getEmployes();
        request.setAttribute("employes", employes);

        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
