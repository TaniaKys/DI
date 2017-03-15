package com.starr;


import com.starr.app.Application;
import com.starr.injector.EmailServiceInjector;
import com.starr.injector.SMSServiceInjector;
import com.starr.injector.ServiceInjector;

public class Main {
    public static void main(String[] args) {
        ServiceInjector serviceInjector;

        // use constructor di
        serviceInjector = new EmailServiceInjector();
        Application emailApp = serviceInjector.getApplication();
        emailApp.processMessage();

        // use setter di
        serviceInjector = new SMSServiceInjector();
        Application smsApp = serviceInjector.getApplication();
        smsApp.processMessage();

    }
}
