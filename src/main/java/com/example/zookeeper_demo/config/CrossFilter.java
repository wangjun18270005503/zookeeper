package com.example.zookeeper_demo.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月08日 16:21
 */
public class CrossFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        //支持所有的域 --用于前端本地调试跨域

        res.addHeader("Access-Control-Allow-Origin", res.getHeader("Origin"));
        res.addHeader("Access-Control-Allow-Credentials", "true");
        res.addHeader("Access-Control-Allow-Methods", "*");
        //支持所有自定义的头
        res.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, t,serviceType,uuid,affiliationApp,affiliationAppType,loginType");
        res.addHeader("Access-Control-Max-Age", "3600");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
