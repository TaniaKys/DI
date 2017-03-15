package com.starr.injector;

import com.starr.app.Application;
import com.starr.app.MyApplication;
import com.starr.service.EmailServiceImpl;

public class EmailServiceInjector implements ServiceInjector {

    public Application getApplication() {
        return new MyApplication(new EmailServiceImpl());
    }
}
