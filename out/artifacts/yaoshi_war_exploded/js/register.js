/**
 * Created by Administrator on 2017/6/3 0003.
 */
function focusObj(id){
	id.style.backgroundColor="#FFCC80"
}
function blurName(){
	var username = document.getElementById("username").value;
	var nameDiv = document.getElementById("nameDiv")
	if(username==""){
		nameDiv.innerHTML = "用户名不能为空！"
		//错误时下一框不能获得焦点
		return false;
	}
	nameDiv.style.backgroundColor="#FFF"
	nameDiv.innerHTML=""
	return true
}

function blurPwd(id){
	var password = document.getElementById("password").value
	var pwdDiv = document.getElementById("pwdDiv")
	if(password==""){
		pwdDiv.innerHTML = "密码不能为空！"
		//错误时下一框不能获得焦点
		return false;
	}
	pwdDiv.style.backgroundColor="#FFF"
	pwdDiv.innerHTML=""
	return true
}

function blurRePwd(id){
	var rePwd = document.getElementById("rePwd").value
	var rePwdDiv = document.getElementById("rePwdDiv")
	if(rePwd !=document.getElementById("pwd").value){
		rePwdDiv.innerHTML = "两次密码不一致!"
		//错误时下一框不能获得焦点
		return false;
	}
	rePwdDiv.style.backgroundColor="#FFF"
	rePwdDiv.innerHTML=""
	return true
}

function blurTel(id){
	var tel = document.getElementById("tel").value
	var telDiv = document.getElementById("telDiv")
	if(tel.length !=11){
		telDiv.innerHTML = "电话号码为11位!"
		//错误时下一框不能获得焦点
		return false;
	}
	telDiv.style.backgroundColor="#FFF"
	telDiv.innerHTML=""
	return true
}

function check(){
	return blurName()&&blurPwd()&&blurRePwd()&&blurTel();
	alert("内容填写有误！请修改！")
}
	

 
  




