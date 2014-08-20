<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
<title>IndexPage</title>
</head>
<body>
	<f:view>
		<h:dataTable border="1" cellpadding="2" cellspacing="0" value="#{pc_Index.accountList}" var="account">
			<h:column id="column1">
				<f:facet name="header">
					<h:outputText value="Account number"></h:outputText>
				</f:facet>
					<h:outputText value="#{account.number}"/>
			</h:column>
			<h:column id="column2">
				<f:facet name="header">
					<h:outputText value="Owner"></h:outputText>
				</f:facet>
					<h:outputText value="#{account.ownerId}"/>
			</h:column>
			<h:column id="column3">
				<f:facet name="header">
					<h:outputText value="Balance"></h:outputText>
				</f:facet>
					<h:outputText value="#{account.balance}"/>
			</h:column>
		</h:dataTable>
	</f:view>
</body>
</html>