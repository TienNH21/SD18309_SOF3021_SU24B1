<%@page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<!-- Load 3 phần tử mặc định lên table -->
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Mã</th>
        <th>Tên</th>
        <th>Trạng thái</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ data }" var="sp">
    <tr>
        <td>${ sp.id }</td>
        <td>${ sp.ma }</td>
        <td>${ sp.ten }</td>
        <td>${ sp.trangThai == 1 ? "Dang hoat dong" : "Ngung hoat dong" }</td>
        <td>
            <a href="#">Update</a>
        </td>
        <td>
            <a href="/san-pham/delete/${ sp.id }">
                Delete
            </a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

