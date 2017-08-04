// JavaScript Document
//支持Enter键登录
		document.onkeydown = function(e){
			if($(".bac").length==0)
			{
				if(!e) e = window.event;
				if((e.keyCode || e.which) == 13){
					var obtnLogin=document.getElementById("submit_btn")
					obtnLogin.focus();
				}
			}
		}

//  $(function() {
// 	//提交表单
// 	$('#submit_btn').click(function() {
// 		show_loading();//jQuery插件设计,运行时，在屏幕某一特殊区域覆一张正在加载中的图片
// 		if($('#username').val() == '') {
// 			show_err_msg('用户还没填呢！');
// 			$('#username').focus();
// 		} else if($('#password').val() == '') {
// 			show_err_msg('密码还没填呢！');//弹出信息后一秒后消失
// 			$('#password').focus();
// 		// } else if($('#j_captcha').val() == '') {
// 		// 	show_err_msg("验证码为空");
// 		// 	$('#j_captcha').focus();
// 		// } else if($('#j_captcha').val()!='selse') {
// 		// 	show_err_msg("验证码 错误了喔");
// 		// 	$('#j_captcha').focus();//触发事件
// 		} else if($('#checkMsg').val() == 'OK') {
// 			show_msg('登录成功咯！  正在为您跳转...', 'cart.html');
// 		}
// 	});
// });


$(document).ready(function () {
    $("#sign").blur(function () {
        var signWriter = $("#sign").val().toLowerCase();
        $.ajax({
            url:"Vai?sign="+signWriter,
            type:"post",
            success:function (data) {
                if(data == "0"){
                    $("#checkMsg").html("不能为空");
                    $("#checkMsg").css("color", "red");
                } else if(data == "1"){
                    $("#checkMsg").html("输入有误");
                    $("#checkMsg").css("color", "red");
                }else{
                    $("#checkMsg").html("OK");
                }
            }
        });
    });
})