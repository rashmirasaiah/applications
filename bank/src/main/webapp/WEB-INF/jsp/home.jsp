<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/entry.css" rel="stylesheet" type="text/css">

</head>
<body>

<h1 class="header">ACCOUNT NUMBER : <% 
String accNumber=(String)session.getAttribute("accNum"); 
out.print(accNumber); 
%> </h1>

<div style="z-index: -1">
<form method="get" action="/logout">
<button class="logout" id="logout"><b>Logout</b></button><br/>
</form>
</div>

<div class="tab">
<Button class="tablinks" id="chckBalance" name="checkBalance" onClick="checkBalance()"><B><I>Check Balance</I></B></Button>
<Button class="tablinks" id="depositAmount" name="depositAmount" onClick="enableDepositDiv()"><B><I>Deposit Amount</I></B></Button>
<Button class="tablinks" id="withdrawAmount" name="withdrawAmount" onClick="enableWithdrawDiv()"><B><I>Withdraw Amount</I></B></Button>
<Button class="tablinks" id="closeAcct" name="closeAccount" onClick="enabledeleteDiv()"><B><I>Close User Account</I></B></Button>
</div>

<div class="tabcontent" id="chkBalance" style="display:none">
<P style="font-size:30px"> Current Account Balance <span id="balVal"></span> </P>
</div>

<div id="depositAmt" class="tabcontent" style="text-align:center;display:none">
<div>
Deposit amount <input id="depAmt" type="text" name="depositAmt"/><br/><br/> 
<input type="submit" value="Deposit" onclick="deposit()"/><br/><br/>
</div>
<div id="depbalamt" style="display:none">
Current Account Balance : $<span id="depBalVal"></span></div>
</div>

<div id="withdrawAmt" class="tabcontent" style="text-align:center;display:none">
<div>
Withdraw amount <input id="drawAmt" type="text" name="withdrawAmt"/><br/><br/> 
<input type="submit" value="Withdraw" onclick="withdraw()"/><br/><br/>
</div>
<div id="withbalamt" style="display:none">
Current Account Balance : $<span id="withBalVal"></span></div>
</div>


<div class="tabcontent" id="closeAccount" style="text-align:center;display:none">
<b>Close Account</b><br/><br/>
<input type="submit" value="confirm" onclick="deleteAcc()"/>
</div>

</body>

<script type="text/javascript" src="/trans.js"></script>
<script type="text/javascript" src="/deposit.js"></script>
</html>