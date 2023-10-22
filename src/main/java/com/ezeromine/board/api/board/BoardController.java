package com.ezeromine.board.api.board;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/api/v1/board/")
@RequiredArgsConstructor
@Tag(name = "Board", description = "게시판 API")
public class BoardController {
    private final BoardService boardService;


}