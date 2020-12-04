package org.zrd.vhr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.zrd.vhr.bean.ChatMessage;

import java.security.Principal;
import java.util.Date;

/**
 * @Author zrd
 * @Date 2020/12/2
 */
@Controller
public class WsController {
    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    //处理前端传来的消息
    @MessageMapping("/ws/chat")
    public void handleMsg(Principal principal, ChatMessage chatMessage) {
        //不能用chatMessage中的from，因为容易伪造
        chatMessage.setFrom(principal.getName());
        chatMessage.setDate(new Date());
        simpMessagingTemplate.convertAndSendToUser(chatMessage.getTo(), "/queue/chat", chatMessage);
    }
}
