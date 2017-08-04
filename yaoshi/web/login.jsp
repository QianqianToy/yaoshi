<%@ page language="java" pageEncoding="utf-8" %>
<html lang="en" class="no-js">

<head>

<meta charset="utf-8"><!--防止乱码-->
<title>会员登陆</title><!--网页名-->
<meta name="viewport" content="width=device-width, initial-scale=1.0"><!--是否可以缩放Web页面，缩放到的最大和最小缩放比例-->
<meta name="description" content=""><!--告诉搜索引擎你的站点的主要内容--> 
<meta name="author" content=""><!--告诉搜索引擎你的站点的制作的作者--> 

<!-- CSS -->

<link rel="stylesheet" href="css/supersized.css"><!--CSS样式表，对网页进行整体布局--> 
<link rel="stylesheet" href="css/login.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>//判断浏览器是否可用
	<script src="js/html5.js"></script>
<![endif]-->
<script src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript" src="js/tooltips.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script>
function find() {
    show_loading();
    var username = $("#username").val();
    var password = $("#password").val();
    if(username == '') {
        show_err_msg('用户还没填呢！');
        $('#username').focus();
    }else if(username != '') {
        if(password == '') {
            show_err_msg('密码还没填呢！');//弹出信息后一秒后消失
            $('#password').focus();
        }else {
            $.getJSON('userLogin', {'username': username, 'password': password}, function (data) {
                if (data == null) {
                    show_err_msg("查无此用户")
                }
            })
        }
        $('#username').focus();
    } else if($('#checkMsg').html() == '') {
        show_msg('登录成功咯！  正在为您跳转...', 'cart.html');
    }


}

function reloadCode() {
    document.getElementById("imagecode").src = "<%=request.getContextPath()%>/selectImage?" + Math.random();
}
</script>

</head>

<body>
<!--<script>document.getElementById(register)</script>-->
<div class="page-container">
	<div class="main_box"><!--登陆格格式-->
		<div class="login_box">
			<div class="login_欢迎光临">
				<center>					
					<h2>欢迎光临</h2>	
				</center>
			</div>
		
			<div class="login_form">
				<form action="reg" id="login_form" method="post">
					<div class="form-group">
						<label for="username" class="t">用户名：</label> 
						<input id="username" value="" name="username" type="text" class="form-control x319 in" 
						autocomplete="off">
					
					</div>
					<div class="form-group">
						<label for="password" class="t">密　码：</label> 
						<input id="password" value="" name="password" type="password" 
						class="password form-control x319 in">
					</div>
					<div class="form-group">
						<!--<label for="j_captcha" class="t">验证码：</label>-->
						 <!--<input id="j_captcha" name="j_captcha" type="text" class="form-control x164 in">-->
						<!--<img id="captcha_img" alt="点击更换" title="点击更换" src="images/captcha.jpeg" class="m">-->
                        <label for="password" class="t">验证码：</label>
                        <input type="text" id="sign" placeholder="请输入验证码"/><br>
						<img style="margin-left: 150px" alt="验证码" id="imagecode" src="<%=request.getContextPath()%>/selectImage"/>
						<a href="javascript:reloadCode();">看不清，换一张</a>
						<span id="checkMsg"></span>
					</div>
					<div class="form-group">
						<label class="t"></label>
						<label for="j_remember" class="m">
						<input id="j_remember" type="checkbox" value="true">&nbsp;记住登陆账号!</label>
						&nbsp;&nbsp;<a href="register.html"><button type="button" id="register.html"
																   class="btn btn-primary btn-re" >&nbsp;注&nbsp;册&nbsp; </button></a>
					</div>
					<!--<div>
						<span>&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="bt_zhuce" name="zhuce" value="注册"</span>
					</div>-->
					<div class="form-group space">
						<label class="t"></label>　　　
						<button type="button"  id="submit_btn" 
						class="btn btn-primary btn-lg" onclick="find()">&nbsp;登&nbsp;录&nbsp; </button>
						<input type="reset" value="&nbsp;重&nbsp;置&nbsp;" class="btn btn-default btn-lg">
					</div>
				</form>
			</div>
		</div>
		<div class="bottom">Copyright &copy; 2017、03 - 2017、07 <a href="#">系统登陆</a></div>
	</div>
</div>
<!-- Javascript -->
<script src="js/supersized.3.2.7.min.js"></script>
<script src="js/supersized-init.js"></script>
<script src="js/scripts.js"></script>
<div style="text-align:center;">
<p>来源:<a href="https://user.qzone.qq.com/390281918/infocenter?ptsig=tAuPNxcdf1ioqV2fEvGX9XX6uUvbpwVXMkSvtT13Uwc_" target="_blank">zqq</a></p>
</div>
</body>
</html>