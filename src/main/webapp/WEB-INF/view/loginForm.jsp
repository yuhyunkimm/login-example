<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인페이지</title>
</head>
<body>
    <h1>로그인페이지</h1>
    <hr>
    <form action="/login" method="post">
        <input type="text" name="username" placeholder="enter username"><br>
        <input type="password" name="password" placeholder="enter password"><br>
        <button>로그인</button>
    </form>
</body>

</html>