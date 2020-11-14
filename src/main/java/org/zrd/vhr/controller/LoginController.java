package org.zrd.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zrd.vhr.bean.RespBean;

/**
 * @Author zrd
 * @Date 2020/10/15
 */
@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean Login() {
        return RespBean.ok("尚未登陆，请登录");
    }
}
