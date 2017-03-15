package com.starr;


import com.starr.app.Application;
import com.starr.injector.EmailServiceInjector;
import com.starr.injector.SMSServiceInjector;
import com.starr.injector.ServiceInjector;

public class Main {
    public static void main(String[] args) {
        ServiceInjector serviceInjector;

        serviceInjector = new EmailServiceInjector();
        Application emailApp = serviceInjector.getApplication();
        emailApp.processMessage();

        serviceInjector = new SMSServiceInjector();
        Application smsApp = serviceInjector.getApplication();
        smsApp.processMessage();

    }
}
