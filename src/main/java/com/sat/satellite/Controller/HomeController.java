package com.sat.satellite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Đây là một Controller
@Controller
public class HomeController {

    //Nếu đường link là "/" hay "/index" thì thực hiện hàm này, hàm trả về view (GET)
    @RequestMapping(value = { "/", "/index" },method = RequestMethod.GET)
    public String index(Model model) {

        //Thêm một số Dynamic Data vào view, dùng bằng cách sử dụng JSTL hoặc Thymleaft tương tự như bên Strut
        String message = "Hello Spring Boot + JSP";
        model.addAttribute("Bruh", message);

        //Trả về view có tên là home, postfix ko cần thêm vì đã kahi báo trong file application.properties
        return "home";

    }

}
