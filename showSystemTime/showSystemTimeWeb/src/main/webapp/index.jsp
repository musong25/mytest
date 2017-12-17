<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>showSystemTime</title>

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>

<script type="text/javascript">
	$(function() {
		$("#showSystemTime")
				.click(
						function() {
							var url = "${pageContext.request.contextPath}/ShowSystemTimeServlet";
							var callback = function(databack) {
								$("#systemTime").text(databack);
							};
							var type = "text";
							$.post(url, null, callback, type);
						});
	});
</script>


</head>
<body>
	<input type="button" id="showSystemTime" value="showSystemTime" />
	<span id="systemTime"></span>
</body>
</html>