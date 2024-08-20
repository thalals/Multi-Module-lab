package com.example.api.presentation.response;

import com.example.infra.MemberDto;

public record MemberResponse() {

    public static MemberResponse ofDto(MemberDto memberDto) {
        return new MemberResponse();
    }
}
