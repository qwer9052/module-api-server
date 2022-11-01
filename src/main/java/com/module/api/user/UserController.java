package com.module.api.user;

import com.module.domain.user.model.TbUserDto;
import com.module.domain.user.rest.UserRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController  {

    @Autowired
    UserRest userRest;


}
