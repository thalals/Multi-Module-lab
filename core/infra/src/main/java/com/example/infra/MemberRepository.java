package com.example.infra;


public interface MemberRepository {

    MemberDto find(Long memberId);
}
