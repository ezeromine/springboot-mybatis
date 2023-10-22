CREATE TABLE `member` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '번호',
    `username` varchar(255) NOT NULL COMMENT '아이디',
    `password` varchar(256) DEFAULT NULL COMMENT '비밀번호',
    `nickname` varchar(255) NOT NULL COMMENT '사용자명',
    `email`    varchar(255) NOT NULL COMMENT '이메일',
    `email_check` boolean DEFAULT 1 NOT NULL COMMENT '이메일 체크',
    `auth` varchar(255) NOT NULL COMMENT '권한',
    `created_at` datetime DEFAULT NULL COMMENT '추가날짜',
    `updated_at` datetime DEFAULT NULL COMMENT '수정날짜',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `basic_board` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '번호',
    `title` VARCHAR(255) NOT NULL COMMENT '게시판 제목',
    `content` TEXT NOT NULL COMMENT '게시판 내용',
    `writer` int(11) NOT NULL COMMENT '작성자(member->id)',
    `created_at` datetime DEFAULT NULL COMMENT '생성날짜',
    `updated_at` datetime DEFAULT  NULL COMMENT '수정날짜',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;