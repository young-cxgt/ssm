<%@ page language="java" contentType="text/html; charset=UTF-8"
         isErrorPage="true" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*"%>
<%
    response.setStatus(HttpServletResponse.SC_OK);
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>提示</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            list-style: none;
            text-decoration: none
        }

        .error_main {
            width: 100%;
            height: 1080px;
            background: url(/images/body_bg.png) no-repeat center top;
            overflow: hidden;
            padding-top: 200px;
            box-sizing: border-box
        }

        .title {
            text-align: center;
            font-size: 61px;
            color: #fff;
            margin-bottom: 15px;
        }

        .error_msg {
            text-align: center;
            color: #fff;
            font-size: 18px;
            margin-bottom: 40px;
        }

        a.back_index {
            display: inline-block;
            width: 176px;
            height: 57px;
            line-height: 57px;
            background: #fff;
            border-radius: 20px;
            font-size: 24px;
            color: #4b93ef
        }
    </style>
</head>

<body>
    <div class="error_main">

        <div class="title">啊！页面迷路了！</div>
        <div class="error_msg">错误原因：<%=exception.getMessage()%></div>
        <div style="text-align: center">
            <a href="http://${SESSION_ON_SITE.getJsonClomn('domain')}" class="back_index">返回首页</a>
        </div>
        <div style="text-align: center;margin-top: 50px;">
            <img src="/images/404_img.png" alt="">
        </div>
    </div>
</body>

</html>