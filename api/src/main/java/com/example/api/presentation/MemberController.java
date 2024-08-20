package com.example.api.presentation;

import com.example.api.presentation.response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberUsecase memberUsecase;

    @GetMapping("members/{id}")
    public MemberResponse findMember(@PathVariable Long id) {

        return memberUsecase.findMemberById(id);
    }
}