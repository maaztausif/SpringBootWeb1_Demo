package maaz.SpringBootWeb1_Demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.rmi.MarshalledObject;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home is open!");
        return  "index";
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("alien1") Alien alien){

        return  "result";
    }

    @ModelAttribute("course")
    public String courseName(){
        return "java";
    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int numTest, String aname, ModelAndView mv){
//
//        Alien alien = new Alien();
//
//        alien.setAid(numTest);
//        alien.setAname(aname);
//
//        mv.addObject("alien",alien);
//        mv.setViewName("result");
//        return  mv;
//    }


//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam("num1") int numTest, int num2, ModelAndView mv){
//        int result = numTest+num2;
//        mv.addObject("result",result);
//        mv.setViewName("result");
//        return  mv;
//    }
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
