<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="header.jsp" />	 <!-- Include the header.jsp page on build -->
			
			<div id="content" style="text-align:center">
			
			<jsp:include page="linkDisplay.jsp" /> 	<!-- Include the linkDisplay.jsp page on build -->
			
			<jsp:include page="oppForm.jsp" />
	
			<h3>Unassigned Booked Orders:</h3>
				 
				<table id ="t01" class="bottomBorder">
					<tr>
						<td><b>Opportunity Id</b></td><td><b>Order Id</b></td><td><b>Customer Name</b></td><td><b>Product Type</b></td><td><b>No Of Racks</b><td><b>TPM Assigned</b></td><td><b>Comments</b></td>
					</tr>
					<c:forEach var="opportunity1" items="${opportunity1}">
					
							<c:if test="${opportunity1.tpmName.toString() == 'N_A'}">						
								<tr>
									<td><a href = '<c:url value="/${opportunity1.id}/"/>'>${opportunity1.oppID}</a></td><td>${opportunity1.orderID}</td><td>${opportunity1.accName}</td><td>${opportunity1.product}</td><td>${opportunity1.noOfRacks}</td><td>${opportunity1.tpmName}</td><td>${opportunity1.comments}</td>
								</tr>									
							</c:if>
					</c:forEach>
				</table>
				
				<h3>Assigned Booked Orders:</h3>
				
				<table id ="t01" class="bottomBorder"> 
					<tr>
						<td><b>Opportunity Id</b></td><td><b>Order Id</b></td><td><b>Customer Name</b></td><td><b>Product Type</b></td><td><b>No Of Racks</b><td><b>TPM Assigned</b></td><td><b>Comments</b></td>
					</tr>
			
					<c:forEach var="opportunity1" items="${opportunity1}">
							<c:if test="${opportunity1.tpmName.toString() != 'N_A'}">
								<tr>
									<td><a href = '<c:url value="/${opportunity1.id}/"/>'>${opportunity1.oppID}</a></td><td>${opportunity1.orderID}</td><td>${opportunity1.accName}</td><td>${opportunity1.product}</td><td>${opportunity1.noOfRacks}</td><td>${opportunity1.tpmName}</td><td>${opportunity1.comments}</td>
								</tr>
							</c:if>
					</c:forEach>
										   
					
				</table> 
			</div>

 <jsp:include page="footer.jsp" />	<!-- Include the footer.jsp page on build -->