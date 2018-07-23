# ssmtemplate
一个SSM框架模板

<h2>按照我个人习惯搭建的ssm框架并简单的实现了登录功能的主要流程</h2>
<h6>Thymeleaf+SpringMVC+Spring+Mybatis+Druid+Interceptor+Log4j+MySQL</h6>

<p>
Spring框架丰富的注释可以很方便的实现对象的声明、注入和参数配置等功能。
但在之前工作的过程中由于业务比较复杂，公司没有使用spring的注释而是使用了xml方式。
慢慢的习惯了使用xml，虽然用起来比较繁琐需要些大量的xml配置文件，但是通过读xml，
每一个类每一个方法的用途和需求便可以一目了然。之后接触到了springboot，不得不承认，
无需任何额外配置就可以快速搭建出完整的mvc框架用于快速开发，这种便捷性让我耳目一新。
在使用的过程中我发现springboot推荐使用的前端模板引擎Thymeleaf的设计也极其新颖，
于是我决定借鉴其精华手动配置一个ssm框架并将Thymeleaf整合留作日后自己开发小型项目时备用。
站在百度和google两大巨人的肩膀上花了一上午的时间完成了一个雏形，并做了一个简单的登陆流程测试。
</p>

<h5>功能描述:</h5><p>
这个项目是我准备作为日后自己开发小型项目时候所用的框架。<br/>
所以完成了框架的具体配置，但并没有实际业务，只做了一个登陆功能用来测试整体流程。<br/>
使用bootstrap制作的一个简单的登陆页面实现表单数据的提交。<br/>
controller接到用户名密码调用service校验密码是否正确。<br/>
service调用mapper在mysql数据库中查询出相应用户的信息返回给service用于校验。<br/>
controller得到service返回的校验结果判断是否登录成功。<br/>
controller将用户名和登录结果信息存到session中返回到前端页面并跳转到用户信息页。<br/>
Thymeleaf解析数据渲染页面。<br/>
实现登录功能的同时添加了自定义的拦截器，拦截器会拦截除首页和静态资源以外所用的用户请求。<br/>
直到当用户登录成功后在controller中将用户信息存入到session中之后方可访问其他资源。</p>

<h5>配置信息:</h5><p>
db.properties文件中数据库信息需要自行配置<br/>
</p>

<h5>声明:</h5><p>
该项目可供任何人下载、修改、使用。如有其它问题欢迎联系我，也欢迎其它做技术的朋友与我交流。
微信：emptycitywithonion
</p>
<div><b><i>作者email:gyqgoo@gmail.com。</i></b><div>
