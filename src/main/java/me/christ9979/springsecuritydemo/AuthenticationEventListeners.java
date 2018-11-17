package me.christ9979.springsecuritydemo;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationEventListeners {

    @EventListener
    public void badCredentialListner(AuthenticationFailureBadCredentialsEvent event) {

        System.out.println(event.getAuthentication().getPrincipal() + " 인증 정보가 맞지 않습니다.");
    }
}
