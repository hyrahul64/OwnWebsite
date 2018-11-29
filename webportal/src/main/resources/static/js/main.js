/**
 * 
 */


	function changePage(e) {
		
		console.log("function changePage() with event:"+e.type);
		console.log("event target:"+e.target.id);
		
		setNewPage(e);
		changeActiveTab(e);
	}
	
	function setNewPage(e) {
		
		var protocol = "http";
		var ip_address = "localhost";
		var port = "80";
		
		var target;
		switch(e.target.id) {
		case "id_home":
			target="";
			break;
		case "id_blog":
			target = "blog.html";
			break;
		case "id_ideas":
			target = "ideas.html";
			break;
		case "id_photo":
			target = "photo.html";
			break;
		case "id_personal":
			target = "personal.html";
			break;			
		case "id_about":
			target = "about.html";
			break;
		case "id_login":
			target = "login.html";
			break;
		}
		
		var url = protocol + "://" + ip_address +":" + port + "/"+ "html"+"/" + target;
		
		console.log("new url:" + url);
		
		document.getElementById("anchor").src = url;
		
		showHideLogin(e);
		
	}
	
	function changeActiveTab(e) {
		
		var eles = document.querySelector(".active");
		if(eles !== null) {
			eles.classList.remove("active");
		}
		document.getElementById(e.target.id).classList.add("active");
	}
	
	function showHideLogin(e) {
		console.log("showhide");
		if(e.target.id === "id_home") {
			var ele = document.querySelector("#anchor");
			ele.classList.remove("show");
			ele.classList.add("hide");
			
			var ele = document.querySelector(".login");
			ele.classList.add("show");	
		}
		else {
			var ele = document.querySelector(".login");
			ele.classList.remove("show");
			ele.classList.add("hide");
			
			
			var ele = document.querySelector("#anchor");
			ele.classList.add("show");
		}		
	}

