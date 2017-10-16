<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<!-- Link display for web page. Different links will be displayed depending on end user prviliges --> 

<div id = "nav">
		
			<a href='<c:url value="/"/>'><b> login</b></a> |
			<!-- <a href='<c:url value="/add"/>'><b> Add Opportunity</b></a>  |		 -->
			<!--  <a href='<c:url value="/modify"/>'><b> Modify Enter</b></a>  |	-->

	
</div>