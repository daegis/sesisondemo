package cn.aegisa.sesisondemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018/12/4 15:18
 */
@Controller
@Slf4j
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(session);
        return "test";
    }

    @RequestMapping("/see")
    @ResponseBody
    public String see() {
        return "see";
    }
}
