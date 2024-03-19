// Name Validation 
let validateName=(str)=>{
	var reg=/^[a-z+A-Z ' ']+$/;
	var result=str.match(reg);
	if(result==null)
	{
		var span=document.getElementById("s");
		span.innerHTML="Enter Character only";
		span.style.color="red";
		//document.getElementById("name").readOnly=true;
		document.getElementById("name").value="";
	}
	else
	{
		var span=document.getElementById("s");
		span.innerHTML="";
		span.style.color="white";	
	}
}

//Email Validation
let emailValidate=(str)=>{
	var index=str.indexOf("@");
	var s=str.substring(index,str.length);
	var index1=s.indexOf(".");
	var reg=/[^A-Z ? > # '' = ]+$/
	var result=str.match(reg);
	//alert(result);
	if(result==null)
	{
		var span=document.getElementById("e");
		span.innerHTML="Invalid email !";
		span.style.color="red";
	}
	
	else if(index==0 &&(index1!=(s.length-4) ||(index1!=(s.length-4))))
	{
		var span=document.getElementById("e");
		span.innerHTML="invalid email";
		span.style.color="red";
		
	}
	
	else{
		var span=document.getElementById("e");
		span.innerHTML="";
		span.style.color="white";
	}	
}


//Contact Validation
let validateContact=(str)=>{
	
	var len=str.length;
	var reg=/^[0-9]+$/;
	var result=str.match(reg);
	if(len==10 &&result!=null)
	{
		var span=document.getElementById("c");
		span.innerHTML="";
		span.style.color="white";
	}
	else
	{
		var span=document.getElementById("c");
		span.innerHTML="Invalid Contact !";
		span.style.color="red";
	}
}

//Contact Validation
let validateCompanyId=(str)=>{
	
	var len=str.length;
	var reg=/^[0-9]+$/;
	var result=str.match(reg);
	if(len==1 && result!=null)
	{
		var span=document.getElementById("Id");
		span.innerHTML="";
		span.style.color="white";
	}
	else
	{
		var span=document.getElementById("Id");
		span.innerHTML="Enter Integer Only !";
		span.style.color="red";
	}
}