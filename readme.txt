实现步骤：

1、新建 web  maven项目
2、加入依赖
    spring-webmvc 依赖，间接把spring的所有依赖加入项目
    jsp，servlet依赖
3、重点：
    在web.xml 中主测springnmvc的核心对象DispatcherServlet
    DispatcherServlet叫做中央调度器，是一个servlet，父类是Httpservlet
    DispatcherServlet页叫做前端控制器（front controller）
    DispatcherServlet 夬接收用户请求，调用其他的控制器对象，并把请求的结果显示给用户

4、创建发送请求的jsp页面

5、创建控制器
    5.1、在类的上面加入@controller朱姐，创建对象，放入springmvc容器中
    5.2、在类中的方法上面加入@RequestMapping注解

6、创建一个结果jsp，显示请求的处理结果

7、创建springmvc配置文件（与spring的配置文件一样）
    7.1 声明组件扫描器，指定@controller注解所在的包名
    7.2 声明视图解析器，帮助处理视图