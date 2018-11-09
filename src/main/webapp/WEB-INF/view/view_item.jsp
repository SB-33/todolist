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
                    <th>Id</th>
                    <th>Title</th>
                    <th>Details</th>
                    <th>Deadline</th>
                </tr>

                                  <tr>
                                  <td><c:out value="${todoItem.id}"/></td>
                                    <td><c:out value="${todoItem.title}"/></td>
                                     <td><c:out value="${todoItem.details}"/></td>
                                    <td><c:out value="${todoItem.deadline}"/></td>
                                </tr>



                </table>

        <c:url var="tableUrl" value="${Mappings.ITEMS}"/>
              <a href="${tableUrl}">Item table</a>


    </div>

</body>
</html>