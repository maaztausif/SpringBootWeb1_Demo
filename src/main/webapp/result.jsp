<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <h2>Result Is =  <%= session.getAttribute("result")  %>  </h2>

        <h2>Result Is =  ${result}  </h2>
    </body>
</html>