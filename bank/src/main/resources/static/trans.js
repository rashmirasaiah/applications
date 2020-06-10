function getDetails(url, parms, callback) {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			response = JSON.parse(this.responseText);
			if(response.amount!=""){
				document.getElementById("balVal").innerText = "$"
					+ response.amount;
			}else{
				document.getElementById("balVal").innerText = "$0.0"
			}
				document.getElementById("chkBalance").style.display="block";
				document.getElementById("depositAmt").style.display="none";
				document.getElementById("withdrawAmt").style.display="none";
				document.getElementById("closeAccount").style.display="none";
		
		}
	};
	xhttp.open("GET", url, true);
	xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	xhttp.send(parms);
}


function checkBalance() {
	getDetails("/getBalance","","");
	
}

