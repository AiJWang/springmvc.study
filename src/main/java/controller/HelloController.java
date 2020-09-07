package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/hello.do")
    public String sayHello(){
        System.out.println("Hello SpringMVC!");
        return "/success.jsp";
    }

    //指定为get请求方式
    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView dosome(){
        ModelAndView mv=new ModelAndView();

        mv.addObject("msg","欢迎springmvc???");
        mv.addObject("info","执行的是dosome");

        //mv.setViewName("/WEB-INF/view/success.jsp");
        //当配置了视图解析器，可以使用逻辑名称（文件名） 指定视图
        //框架会使用视图解析器的前缀+后缀组成路径

        mv.setViewName("success");
        return mv;
    }

    @RequestMapping(value = "/test.do",method = RequestMethod.POST)
    @ResponseBody
    public String testCase(String name){
        return name;
    }
}
