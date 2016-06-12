<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<head>

<title>guitar</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/css.css" />
<script type="text/javascript" src="js/jquery1.9.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/sdmenu.js"></script>
<script type="text/javascript" src="js/laydate/laydate.js"></script>

</head>

<body>
<div class="header">
	 <div class="logo"><img  src="img/logo1.png" /></div>
     
				
</div>
<!-- 顶部 -->     
            
<div id="middle">
     <div class="left">
     
     <script type="text/javascript">
var myMenu;
window.onload = function() {
	myMenu = new SDMenu("my_menu");
	myMenu.init();
};
</script>


 
     </div>

    <h2 align=center>所有吉他</h2>

    <table width="600"  border="1" cellpadding="0" cellspacing="0" align="center">

<tr>
    <td>编号</td>
	<td>型号</td>
	<td>材料</td>
	<td>品牌</td>
	<td>价格</td>
	<td>数量</td>
	<td><a href="delete?Number=${p.serialNumber}">删除</a></td>
</tr>

<c:forEach items="${list}" var="p">
	<tr>
	<td>${p.Number}</td>
	<td>${p.getSpec().getType()}</td>
	<td>${p.getSpec().getMaterial()}</td>	
	<td>${p.getSpec().getBrand()}</td>
	<td>${p.getSpec().getPrice()}</td>
	<td>${p.quantity}</td>		
	<td><a href="delete?Number=${p.serialNumber}">删除</a>
	</tr>

</c:forEach>
</table>

</body>
</html>