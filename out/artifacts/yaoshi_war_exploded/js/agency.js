/*!
 * Start Bootstrap - Agency Bootstrap Theme (http://startbootstrap.com)
 * Code licensed under the Apache License v2.0.
 * For details, see http://www.apache.org/licenses/LICENSE-2.0.
 */

// jQuery for page scrolling feature - requires jQuery Easing plugin
$(function() {
    $('a.page-scroll').bind('click', function(event) {//点击浮动框页面滑动效果，click绑定事件，触发函数
        var $anchor = $(this);
        $('html, body').stop().animate({//animate() 方法执行 CSS 属性集的自定义动画
            scrollTop: $($anchor.attr('href')).offset().top//attr() 方法设置或返回被选元素的属性值。
        }, 1500, 'easeInOutExpo');
        event.preventDefault();//阻止默认行为
    });
});

// Highlight the top nav as scrolling occurs
//$('body').scrollspy({
//  target: '.navbar-fixed-top'
//})

// Closes the Responsive Menu on Menu Item Click
//$('.navbar-collapse ul li a').click(function() {
//  $('.navbar-toggle:visible').click();
//});