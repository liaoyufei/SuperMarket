<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../js/jquery.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css"
	href="../templet/Css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="../templet/Css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css" href="../templet/Css/style.css" />
<script src="../js/jquery-1.10.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="../js/jquery.validate.js"></script>
<script type="text/javascript" src="../js/messages_zh.js"></script>
<script type="text/javascript" src="../js/validate.expand.js"></script>
<script type="text/javascript" src="../js/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="../templet/Js/jquery.sorted.js"></script>
<script type="text/javascript" src="../templet/Js/bootstrap.js"></script>
<script type="text/javascript" src="../templet/Js/common.js"></script>
<title></title>
</head>
<script type="text/javascript">
	$().ready(function() {
		$("#goodsFrom").validate({
			rules : {
				name: {
					required : true,
					minlength : 2,
					chcharacter : true
				},
				price : {
					required : true,
					number: true,
					min:0
				}
			},
			messages : {
				name : {
					required : "请输入商品名",
					minlength : "商品不能少于2个汉字",
					chcharacter : "只能输入汉字"
				},
				price:{
					required : "请输入商品价格",
					number:"请输入数字",
					min:"商品价格不能小于0"
				}
			}
		});
	});
</script>
<style type="text/css">
body {
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) {
	/* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
<body>
	<form class="definewidth m20" name="myfrom" action="makeGood/add" id="goodsFrom"
		method="post">
		<table class="table table-bordered table-hover definewidth m10">
			<tr>
				<td>货物名称</td>
				<td><input name="name" type="text"/></td>
			</tr>
			<tr>
				<td>货物价格(FLOAT)</td>
				<td><input name="price" type="text" id="goodsPrice"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交" /></td>
			</tr>
		</table>

	</form>
</body>
</html>
<c:if test="${null!=msg }">
	<script type="text/javascript">
		alert('<c:out value="${msg}" />');
	</script>
</c:if>