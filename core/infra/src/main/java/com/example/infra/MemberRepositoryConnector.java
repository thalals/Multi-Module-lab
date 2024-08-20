package com.example.infra;

import com.example.domain.member.Member;
import com.example.domain.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryConnector implements MemberRepository {

    private final MemberService memberService;

    @Override
    public MemberDto find(Long memberId) {
        Member member = memberService.findMemberById(memberId);
        return MemberDto.ofEntity(member);
    }
}
