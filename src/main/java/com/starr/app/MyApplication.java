package com.starr.app;

import com.starr.app.Application;
import com.starr.service.MessageService;

public class MyApplication implements Application {

    private MessageService messageService;

    public MyApplication() {
    }

    // for constructor injection
    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    //for setter injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage() {
        System.out.println(messageService.getMessage());
    }
}
