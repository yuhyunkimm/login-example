<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메인페이지</title>
</head>
<body>
    <div class="container my-3">
            <div class="my-board-box row">
        <c:forEach items="${dtos}" var="dto">
                <div class="card col-lg-3 pt-2">
                    <img class="card-img-top" style="height: 250px;" src="${dto.thumbnail}" alt="Card image">
                    <hr/>
                    <div class="card-body">
                        <div>작성자 : ${dto.username}</div>
                        <h4 class="card-title my-text-ellipsis">${dto.title}</h4>
                        <a href="/board/${dto.id}" class="btn btn-primary">상세보기</a>
                    </div>
                </div>
        </c:forEach>
            </div>
            <ul class="pagination mt-3 d-flex justify-content-center">
                <li class="page-item"><a class="page-link" href="/board">Prev</a></li>
                <li class="page-item"><a class="page-link" href="#">Next</a></li>
            </ul>
        </div>
</body>
</html>