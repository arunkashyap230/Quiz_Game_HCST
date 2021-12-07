<%-- 
    Document   : Result
    Created on : Dec 7, 2021, 8:06:02 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz Game</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
        <h1 style="text-align:center"><font size="7">Your Result</h1>
         <div class="well">
        <%
            int correct=0;
            String one=request.getParameter("question1");
            
            if(one.equals("Mithila"))
            {correct++;
                %>
                
                <h1> Question1: ANS IS CORRECT</h1>
                <%
            }
            else{
                 %>
                <h1>Question1: ANS IS Wrong</h1>
                <%
                }
%>
         
        
        <%
        String two=request.getParameter("question2");
        if(two.equals("Yajur-Veda"))
        {correct++;
            %>
            <h1>Question2: Ans is Correct</h1>
                <%
        }
    else{
            %>
            <h1>question2: Ans is wrong</h1>
            <%
        }
        
        %>
        
        <%
        String three=request.getParameter("question3");
        if(three.equals("Sulva Sutras"))
        {correct++;
            %>
            <h1>Question3: Ans is Correct</h1>
                <%
        }
    else{
            %>
            <h1>question3: Ans is wrong</h1>
            <%
        }
        
        %>
        
         <%
        String four=request.getParameter("question4");
        if(four.equals("jewellery"))
        {correct++;
            %>
            <h1>Question4: Ans is Correct</h1>
                <%
        }
    else{
            %>
            <h1>question4: Ans is wrong</h1>
            <%
        }
        
        %>
        
           <%
        String five=request.getParameter("question5");
        if(five.equals("Upanishads"))
        {correct++;
            %>
            <h1>Question5: Ans is Correct</h1>
                <%
        }
    else{
            %>
            <h1>question5: Ans is wrong</h1>
            <%
        }
        
        %>
                </div>
        
        <div class="well">
            <h1> Your Final Result is <%=correct%>/5</h1></div>
       </div>

    </body>
</html>
