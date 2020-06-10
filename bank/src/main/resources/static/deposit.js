function depositCall(url, parms, callback) {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			response = JSON.parse(this.responseText);
			}
			if(this.responseText!=""){
				document.getElementById("depBalVal").innerHTML=response;
				document.getElementById("withBalVal").innerHTML=response;
			}
	};
	xhttp.open("POST", url, true);
	xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	xhttp.send(parms);
	
}

function deposit(){
	amount = document.getElementById("depAmt").value;
	var currbal=depositCall("/depositAmt","depositAmt="+amount,"");
	document.getElementById("depbalamt").style.display="block";
}

function withdraw(){
	amount = document.getElementById("drawAmt").value;
	depositCall("/withdrawAmt","withdrawAmt="+amount,"");
	document.getElementById("withbalamt").style.display="block";
}

function deleteAcc(){
	depositCall("/delete","","");
	window.location.href = "logout";
}

function enableDepositDiv(){
	
	document.getElementById("chkBalance").style.display="none";
	document.getElementById("depositAmt").style.display="block";
	document.getElementById("withdrawAmt").style.display="none";
	document.getElementById("closeAccount").style.display="none";
	document.getElementById("withbalamt").style.display="none";
}

function enableWithdrawDiv(){
	document.getElementById("chkBalance").style.display="none";
	document.getElementById("depositAmt").style.display="none";
	document.getElementById("withdrawAmt").style.display="block";
	document.getElementById("closeAccount").style.display="none";
	document.getElementById("depbalamt").style.display="none";
}

function enabledeleteDiv(){
	document.getElementById("chkBalance").style.display="none";
	document.getElementById("depositAmt").style.display="none";
	document.getElementById("withdrawAmt").style.display="none";
	document.getElementById("closeAccount").style.display="block";
	document.getElementById("withbalamt").style.display="none";
	document.getElementById("depbalamt").style.display="none";
}

