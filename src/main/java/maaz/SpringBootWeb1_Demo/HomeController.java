package maaz.SpringBootWeb1_Demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.rmi.MarshalledObject;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home is open!");
        return  "index";
    }
    @RequestMapping("add")
    public String add(@RequestParam("num1") int numTest, int num2, Model model){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = numTest+num2;

        model.addAttribute("result",result);
        System.out.println("add result! "+ result);
        return  "result";
    }
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1+num2;
//
//        session.setAttribute("result",result);
//
//        System.out.println("add result! "+ result);
//        return  "result.jsp";
//    }
}
