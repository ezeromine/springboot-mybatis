package com.ezeromine.board.api.user.service;

import com.ezeromine.board.api.user.domain.UserDto;

import java.util.Optional;

public interface UserService {
    Optional<UserDto> login(UserDto userVo);
}
