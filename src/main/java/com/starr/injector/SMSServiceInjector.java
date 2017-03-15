package com.starr.injector;

import com.starr.app.Application;
import com.starr.app.MyApplication;
import com.starr.service.EmailServiceImpl;
import com.starr.service.SMSServiceImpl;

public class SMSServiceInjector implements ServiceInjector {

    public Application getApplication() {
        return new MyApplication(new SMSServiceImpl());
    }
}
