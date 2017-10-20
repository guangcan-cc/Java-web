package cc.blog.web.servlet;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by Elvis on 2017/10/20.
 */
public class HelloWorldServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


        ClassLoader classLoader = this.getClass().getClassLoader();
        while(classLoader != null) {
            System.out.println(classLoader.getClass().getCanonicalName());
            classLoader = classLoader.getParent();
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
