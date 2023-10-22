package com.ezeromine.board.api.user.mapper;

import com.ezeromine.board.api.user.domain.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Mapper
@Repository
public interface UserMapper {
    Optional<UserDto> login(@Param(value = "username") String username, @Param(value = "password") String password);

}
