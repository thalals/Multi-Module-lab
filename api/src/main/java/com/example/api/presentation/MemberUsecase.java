package com.example.api.presentation;

import com.example.infra.MemberDto;
import com.example.infra.MemberRepository;
import com.example.api.presentation.response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberUsecase {

    private final MemberRepository memberRepository;

    public MemberResponse findMemberById(Long id) {
        MemberDto memberDto = memberRepository.find(id);

        return MemberResponse.ofDto(memberDto);
    }
}
