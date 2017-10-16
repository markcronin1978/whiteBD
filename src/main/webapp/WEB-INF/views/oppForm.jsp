<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



		<div id="content" style="text-align:center">
			
										<!-- Present end user with form to take information about opp -->
			
			<h3>Add Opportunity Information:</h3>
				<c:url value="/saveOpp" var="form_url"/>    
					<form:form action="${form_url}" commandName="opportunity">    <!-- This is the opp form.  -->
						<table id = "t02" align="center">
							<tr>
								<td>Opportunity ID: </td>
								<td><form:input path="oppID" size="10" /></td>
							
								<td>Order ID:</td>
								<td><form:input path="orderID" size="10" /></td>
							
								<td>Account Name:</td>
								<td><form:input path="accName" size="30" /></td>							
							
								<td>Product:</td>
								<td>
									<form:select path= "product" name = "enumProduct" id="enumProduct">
										<option value=""></option>
											<c:forEach items="${enumProduct}" var="value" >
												<option>${value}</option>
										</c:forEach>
									</form:select>
								</td>
							<!-- <td><form:input path="product" size="10" /></td>-->			
							
							<!-- This is new today!!! -->
								<td>TPM Name:</td>
								<td>
									<form:select path="tpmName" name = "enumTpnName" id="enumTpnName">
										<option value=""></option>
											<c:forEach items="${enumTpnName}" var="value">
												<option>${value }</option>
										</c:forEach>
									</form:select>
								</td>							
							
								<td>Comments</td>
								<td><form:textarea path="comments" rows="2" cols="30" /></td>
						
								<td><form:hidden path="id" /></td>
								<td><input type="submit" value="Save" /></td>
							</tr>
						</table>
					</form:form>
			</div>
					