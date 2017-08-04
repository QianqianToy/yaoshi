function Juge(theForm)
{
  if (theForm.loginuser.value == ""){
    alert("请输入用户名！");
	theForm.loginuser.focus();
    return (false);
   }
  if (theForm.loginpwd.value == ""){
    alert("请输入密码！");
	theForm.loginpwd.focus();
    return (false);
  }
  
  if(theForm.loginuser.value !="张倩倩"){
    alert("用户名或密码错误！")
    theForm.loginuser.focus();
    return(false);
  }else if(theForm.loginpwd.value !="123"){
  	alert("用户名或密码错误！")
    theForm.loginuser.focus();
    return(false);
  }
  
}