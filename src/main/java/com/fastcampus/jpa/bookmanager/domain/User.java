package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Builder
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createAt; // 생성시간: JPA 도메인 객체에 항상 포함
    private LocalDateTime updateAt; // 수정시간: JPA 도메인 객체에 항상 포함
}
