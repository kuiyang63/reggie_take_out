package com.itheima.reggie.utils;

import org.apache.commons.mail.SimpleEmail;

public class QQEEmailUtils {

    //邮箱验证
    //*.do 的格式是 Spring MVC 拦截的一种配置，请自行修改
    public static int sendEmail(String addTo,String code){
        SimpleEmail email=new SimpleEmail();//创建一个HtmlEmail实例对象
        try {
            //填写邮箱服务器，如是QQ邮箱服务器，直接用：smtp.qq.com
            email.setHostName("smtp.qq.com");
            email.setCharset("utf-8");
            //设置收件人
            email.addTo(addTo);
            //设置发送人邮箱，和用户名
            email.setFrom("2173129084@qq.com","刘山");
            //配置邮箱加授权码，相当于等于自己的邮箱
            email.setAuthentication("2173129084@qq.com","qcnezfrftlfuebga");
            //使用安全链接
            email.setSSLOnConnect(true);
            //设置邮件的主题
            email.setSubject("验证码");
            //设置邮件的内容，自行修改动态验证码
            email.setMsg("葵阳企业\n尊敬的用户:你好!\n 验证码为:"+code+"\n（有效期为两分钟)");
            //发送
            email.send();

        }catch (Exception e){
            e.printStackTrace();
            //返回 0 表示失败
            return 0;
        }
        //返回 1 表示发送成功
        return 1;
    }
    public static int test(){

        return 0;
    }


}
