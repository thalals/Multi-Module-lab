package com.example.infra;

import com.example.domain.member.Member;

public record MemberDto() {

    public static MemberDto ofEntity(Member member) {
        return new MemberDto() ;
    }
}
