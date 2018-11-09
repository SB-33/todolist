<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.sexybeast.util.Mappings" %>

<html>
<head>
    <title>Viewing item</title>
</head>
<body>
    <div align="center">
                <table border="1" cellpadding="5">
                    <tr>
                        <td><label><th>ID</th></label></td>
                        <td>
                            <c:out value="${todoItem.id}" />
                        </td>
                    </tr>
                    <tr>
                        <td><label><th>Title</th></label></td>
                        <td>
                          <c:out value="${todoItem.title}" />
                          </td>
                    </tr>
                    <tr>
                       <td><label><th>Details</th></label></td>
                       <td>
                        <c:out value="${todoItem.details}" />
                        </td>
                    </tr>
                    <tr>
                        <td><label><th>Deadline</th></label></td>
                        <td>
                          <c:out value="${todoItem.deadline}" />
                          </td>
                    </tr>
                </table>

        <c:url var="tableUrl" value="${Mappings.ITEMS}"/>
              <a href="${tableUrl}">Item table</a>


    </div>

</body>
</html>