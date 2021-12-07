<%-- 
    Document   : index
    Created on : Nov 24, 2021, 3:24:44 PM
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
    <body style="background-color:grey ">
        <div class="container">
        <h1 style="text-align:center"><font size="7">Quiz Game</font></h1>
        
        <form action="Result.jsp" method="post">
        
       <div class="well">
        <h3>1.The home of Gargi, Maitrey and Kapila was at.</h3>
        <p><input type="radio" required="" name="question1" value="Vidisha">A.Vidisha</p>
        <p><input type="radio" required="" name="question1" value="Ujjain">B.Ujjain</p>
        <p><input type="radio" required="" name="question1" value="Pataliputra">C.Pataliputra</p>
        <p><input type="radio" required="" name="question1" value="Mithila">D.Mithila</p><br> </div>
            
         <div class="well">
        <h3>2.Which of the following Vedas provides information about the civilization of the Early Vedic Age?</h3>
        <p><input type="radio" required="" name="question2" value="Rig-Veda">A.Rig-Veda</p>
        <p><input type="radio" required="" name="question2" value="Yajur-Veda">B.Yajur-Veda</p>
        <p><input type="radio" required="" name="question2" value="Atharva-Veda">C.Atharva-Veda</p>
        <p><input type="radio" required="" name="question2" value="Sama-Veda">D.Sama-Veda</p></div>
            
         <div class="well">
        <h3>3.The most important text of vedic mathematics is:</h3>
        <p><input type="radio" required="" name="question3" value="Satapatha Brahman">A.Satapatha Brahman</p>
        <p><input type="radio" required="" name="question3" value="Atharva Veda">B.Atharva Veda</p>
        <p><input type="radio" required="" name="question3" value="Sulva Sutras">C.Sulva Sutras</p>
        <p><input type="radio" required="" name="question3" value="Chhandogya Upanished">D.Chhandogya Upanished</p><br></div>
            
         <div class="well">
        <h3>4.Which of the following Craftsmanship was not practised by the Aryans?</h3>
        <p><input type="radio" required="" name="question4" value="Pottery">A.Pottery</p>
        <p><input type="radio" required="" name="question4" value="jewellery">B.jewellery</p>
        <p><input type="radio" required="" name="question4" value="Carpentry">C.Carpentry</p>
        <p><input type="radio" required="" name="question4" value="Blacksmith">D.Blacksmith</p><br></div>
            
         <div class="well">
        <h3>5.The words "Satyameva Jayate” in the State Emblem of india were taken from</h3>
        <p><input type="radio" required="" name="question5" value="Upanishads">A.Upanishads</p>
        <p><input type="radio" required="" name="question5" value="Sama veda">B.Sama veda</p>
        <p><input type="radio" required="" name="question5" value="Rig Veda">C.Rig Veda</p>
        <p><input type="radio" required="" name="question5" value="Ramayana">D.Ramayana</p><br></div>
        
        <button type="submit" ><font size="5">Sumbit quiz</font></button>
        
        </form>
        </div>
        
    </body>
</html>
