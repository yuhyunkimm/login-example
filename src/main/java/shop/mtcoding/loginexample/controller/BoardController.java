package shop.mtcoding.loginexample.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shop.mtcoding.loginexample.handler.ex.CustomException;
import shop.mtcoding.loginexample.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class BoardController {

    @Autowired
    private HttpSession session;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String main() {
        return "/main";
    }
    // @GetMapping("/")
    // public String main(Model model) {
    // User principal = (User) session.getAttribute("principal");
    // if (principal == null) {
    // throw new CustomException("인증이 되지 않았습니다", HttpStatus.UNAUTHORIZED);
    // }
    // logger.info("/");
    // return "redirect:/loginForm";
    // }
}