package com.xidian.myWeb;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class PerfStatListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		ServletRequest servletRequest = sre.getServletRequest();
		Long start = (Long) servletRequest.getAttribute("start");
		Long end = System.nanoTime();
		HttpServletRequest httpSR = (HttpServletRequest) servletRequest;
		String url = httpSR.getRequestURI();
		System.out.println("time taken to execute " + url + ":" + ((end - start)/1000) + "microseconds");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		ServletRequest servletRequest = sre.getServletRequest();
		servletRequest.setAttribute("start", System.nanoTime());
	}

}
