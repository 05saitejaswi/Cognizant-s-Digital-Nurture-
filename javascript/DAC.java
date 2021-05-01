
DAC
<!-- This is a partial code. Implement the neccessary codes -->
<html>
    <head>
        <style>
            body
            {
                background-color:#FFAACC;
            }
            h1{
                color:#770080;
                font-family:cursive;
                text-align:center;
            }
            #result
            {
                font-weight:bold;
                color:#770080;
            }
        </style>
    </head>
    <body>
        <h1>DAC BANK - AVAIL LOAN</h1>
        <!--<form onsubmit="validate()">-->
        <form onsubmit="return verify()">
            <table>
                <tr>
                    <td>Customer Name</td>
                    <td><input type="text" name="customerName" id="nam" required></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><textarea rows="5" cols="20" name="customerAddress" id="addr"></textarea></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td><input type="radio" name="gender" value="male">Male
                        <input type="radio" name="gender" value="female">Female</td>
                </tr>
                <tr>
                    <td>Email ID</td>
                    <td><input type="email" name="customerEmail" id="email"></td>
                </tr>
                <tr>
                    <td>Mobile Number</td>
                    <td><input type="text" name="customerMobileNumber" id="mob" pattern="[789][0-9]{9}"></td>
                </tr>
                <tr>
                    <td>Date of Birth</td>
                    <td><input type="date" name="dob" id="dob"></td>
                </tr>
                <tr>
                    <td>Loan Type</td>
                    <td><input name="loanType" list="loan" autocomplete="on">
                    <datalist id="loan">
                        <option value="Vehicle">Vehicle</option>
                        <option value="Home">Home</option>
                        <option value="Education">Education</option>
                    </datalist></td>
                </tr>
                <tr>
                    <td>Loan Amount</td>
                    <td><input type="text" name="loanAmount" placeholder="Enter the Amount" id="amt" required></td>
                </tr>
                <tr>
                    <td>Tenure</td>
                    <td><input type="number" name="loanTenure" id="loan" min="1" max="5"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="Avail Loan"></td>
                    <td><input type="reset" name="reset" value="reset"></td>
                </tr>
            </table>
        </form>
        <div id="result"></div>
        <script>
          function verify(){
              document.getElementById("result").innerHTML="Thank you "+document.getElementById("nam").value + ". Your Loan Amount is " + document.getElementById("amt").value;
              return false;
          }
        </script>
    </body>
</html>