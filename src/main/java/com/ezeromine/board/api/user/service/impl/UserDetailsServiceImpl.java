package com.ezeromine.board.api.user.service.impl;

import com.ezeromine.board.api.user.domain.UserDto;
import com.ezeromine.board.api.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UserDetailsServiceImpl implements UserService {

    @Override
    public Optional<UserDto> login(UserDto userVo) {
        return Optional.empty();
    }
}
