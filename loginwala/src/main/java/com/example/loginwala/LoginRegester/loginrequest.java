package com.example.loginwala.LoginRegester;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class loginrequest {
    public loginrequest(String userId,String password ) {

        this.userId = userId;
        this.password = password;
    }
    public loginrequest(){}

    private String userId;
    private String password;
}
