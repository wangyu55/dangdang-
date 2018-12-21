<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/aftermain.html.css"/>
</head>

<body>
<div class="maintop">
    <ul class="commonul menuul">
        <li class="commonli m1">首页</li>
        <li class="commonli m1">系统</li>
        <li class="commonli m1">用户</li>
        <li class="commonli m1">任务</li>
    </ul>

</div>
<div class="mainleft">
    <ul class="commonul mainleftul">
        <li class="topmenu">系统菜单</li>
        <li class="li2"><a href="www.baidu.com" target="mainiframe">查询订单</a></li>
        <li class="li2"><a href="" target="mainiframe">增加商品</a></li>
        <li class="li2"><a href="" target="mainiframe">删除商品</a></li>
    </ul>
</div>
<div class="mainright">

    <iframe name="mainiframe" src="" width="100%" height="99%" frameborder="0px" style="background: #FFFFFF;"></iframe>
</div>

</body>

</html>