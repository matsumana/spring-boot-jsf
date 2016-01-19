package de.fred4jupiter.spring.boot.jsf.bean;

import de.fred4jupiter.spring.boot.jsf.ScopeName;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
@Scope(ScopeName.VIEW)
public class HelloWorldBean {

    public String hello() {
        return "Hello world from Server. Time now: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
    }

    public Date now() {
        return new Date();
    }
}
