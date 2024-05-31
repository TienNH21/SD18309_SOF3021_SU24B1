<%@page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <title>Document</title>
</head>
<body>
<table class="table table-stripped">
    <thead class="table-dark">
    <tr>
        <th>ID</th>
        <th>Sản phẩm</th>
        <th>Màu sắc</th>
        <th>Kích thước</th>
        <th>Mã SPCT</th>
        <th>Số lượng</th>
        <th>Đơn giá</th>
        <th>Trạng thái</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ data }" var="spct">
    <tr>
        <td>${ spct.id }</td>
        <td>${ spct.sp.ten }</td>
        <td>${ spct.idMS }</td>
        <td>${ spct.idKT }</td>
        <td>${ spct.maSPCT }</td>
        <td>${ spct.soLuong }</td>
        <td>${ spct.donGia }</td>
        <td>${ spct.trangThai == 1 ? "Dang hoat dong" : "Ngung hoat dong" }</td>
        <td>
            <a href="#">Update</a>
        </td>
        <td>
            <a href="#">
                Delete
            </a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>

<%--<nav aria-label="Page navigation example">--%>
<%--    <ul class="pagination">--%>
<%--        <li class="page-item">--%>
<%--            <a class="page-link" href="/san-pham/index?page=${data.number - 1}">Previous</a>--%>
<%--        </li>--%>
<%--        <c:forEach begin="1" end="${ data.totalPages }" var="page">--%>
<%--            <c:if test="${ page == 1 || page == data.totalPages || ( page >= data.number - 1 && page <= data.number + 1 ) }">--%>
<%--                <li class="page-item">--%>
<%--                    <a class="page-link"--%>
<%--                       href="/san-pham/index?page=${page}">--%>
<%--                            ${ page }--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--            </c:if>--%>
<%--        </c:forEach>--%>
<%--        <li class="page-item"><a class="page-link" href="/san-pham/index?page=${data.number + 1}">Next</a></li>--%>
<%--    </ul>--%>
<%--</nav>--%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</body>
</html>

