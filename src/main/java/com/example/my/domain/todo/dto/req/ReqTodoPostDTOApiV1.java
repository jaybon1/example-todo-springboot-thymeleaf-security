package com.example.my.domain.todo.dto.req;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReqTodoPostDTOApiV1 {

    @Valid
    @NotNull(message = "내용을 양식에 맞게 입력해주세요.")
    private Todo todo;

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Todo {

        @NotBlank(message = "할 일을 입력해주세요.")
        private String content;

    }
}
