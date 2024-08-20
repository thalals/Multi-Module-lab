package com.example.domain.member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberJpaRepository memberRepository;

    public MemberService(MemberJpaRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member findMemberById(Long memberId) {
        return memberRepository.findById(memberId).orElseThrow();
    }

    public void deleteMemberById(Long memberId) {
        memberRepository.deleteById(memberId);
    }
}
