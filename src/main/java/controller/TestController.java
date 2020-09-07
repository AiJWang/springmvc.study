package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * @RequestMapping: 请求映射
 * 属性：method，表示请求方式
 * get方式，RequestMethod.get
 * post方式，RequestMethod.Post
 *
 * 不加的话用get/post都可以
 * */
@Controller
@RequestMapping("/test") //这个注解/test相当于模块
public class TestController {
    @RequestMapping(value = "/some.do",method = RequestMethod.POST)
    public ModelAndView dosome(){
        ModelAndView mv=new ModelAndView();

        mv.addObject("msg","欢迎springmvc");
        mv.addObject("info","执行的是dosome");

        //mv.setViewName("/WEB-INF/view/success.jsp");
        //当配置了视图解析器，可以使用逻辑名称（文件名） 指定视图
        //框架会使用视图解析器的前缀+后缀组成路径

        mv.setViewName("zhujieTest");
        return mv;
    }

}
