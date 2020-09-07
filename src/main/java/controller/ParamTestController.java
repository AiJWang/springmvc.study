package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 *接收请求参数，一共有4类数据
 * 1、HttpServletRequest
 * 2、HttpServletResponse
 * 3、HttpSession
 * 4、用户提交的数据(逐个接收，对象接收)
 * */
@Controller
@RequestMapping("/param")
public class ParamTestController {
    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(HttpServletRequest httpServletRequest){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎springmvc"+httpServletRequest.getParameter("name"));
        mv.addObject("info","执行的是dosome");
        mv.setViewName("zhujieTest");
        return mv;
    }
    //逐个接收参数
    /**
     * 框架接收请求参数
     * 1、使用request对象接收请求参数
     *  String strName=request.getParamter("name")
     *  String strAge=request.getParamter("Age")
     *
     *  2、springmvc框架通过DispatcherServlet，调用ParamTestController的receiveOne方法
     *  调用方法时，把参数穿进去
     *
     *  post时如果name传中文，会有乱码问题，但是get请求没有乱码
     *  需要使用过滤器处理乱码问题 CharacterEncodingFilter（在web.xml中 配置）
     *  也可以自定义
     * */
    @RequestMapping(value = "/receiveOne.do")
    public ModelAndView receiveOne(String name, int age){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","my name is "+name);
        mv.addObject("info","my age is "+age);
        mv.setViewName("RecParamOne");
        return mv;
    }
/**
 * @RequestParam 注解，解决请求中形参名不一样的问题
 * 前端的形参名是rname和rage
 * 属性：1、value：请求中的参数名称
 *       2、required:是否是必传参数，默认为true
 * */
    @RequestMapping(value = "/receiveOne1.do")
    public ModelAndView receiveOne1(@RequestParam(value = "rname") String name,
                                    @RequestParam(value = "rage",required = false) Integer age){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","my rname is "+name);
        mv.addObject("info","my rage is "+age);
        mv.setViewName("RecParamOne");
        return mv;
    }
}
