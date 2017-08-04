package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * TODO()
 * Created by zqq on 2017/8/3 0003.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userLogin")
    @ResponseBody
    public User userLogin(String username, String password, HttpSession session){
        System.out.println("userLogin"+username);
        System.out.println(password);
        User user = userService.login(username,password);
        session.setAttribute("user",user);
        return user;
    }

    @RequestMapping("/selectImage")
    public void selectImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedImage im = new BufferedImage(68, 22, BufferedImage.TYPE_INT_RGB);
        Graphics g = im.getGraphics();//画图
        Color c = new Color(200, 200, 200);
        g.setColor(c);//获取颜色
        g.fillRect(0, 0, 68, 22);//获取框
        char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWSYZ0123456789".toCharArray();
        Random r = new Random();
        int len = ch.length, index;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 4; i++) {            //给验证码赋值
            index = r.nextInt(len);
            g.setColor(new Color(r.nextInt(88), r.nextInt(188), r.nextInt(255)));//每个验证码颜色不同
            g.drawString(ch[index] + "", (i * 15) + 3, 18); //字符写到图片上
            sb.append(ch[index]);//存起来
        }
        HttpSession session = request.getSession();
        session.setAttribute("code", sb.toString());
        ImageIO.write(im, "JPG", response.getOutputStream());
    }

    @RequestMapping("/Vai")
    @ResponseBody
    public String vai(String sign, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String sign1 = ((String) session.getAttribute("code")).toLowerCase();
        String result = "";
        if (sign == "") {
            result = "0";
        } else if (!sign.equals(sign1)) {
            result = "1";
        }
        return result;
    }




}
