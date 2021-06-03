package com.iqmsoft;


import jakarta.enterprise.context.RequestScoped;
import jakarta.mvc.Controller;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("app")
@Controller
@RequestScoped
public class AppController {

    @GET
    public String sayHello() {
        return "hello.jsp";
    }
}
