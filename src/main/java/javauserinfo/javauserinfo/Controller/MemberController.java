package javauserinfo.javauserinfo.Controller;


import javauserinfo.javauserinfo.Member.Member;
import javauserinfo.javauserinfo.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class MemberController {

    private final MemberRepository memberRepository;

//    public MemberController(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

    @PostMapping("/signup")
    public Member create(@RequestBody Member member){
        return memberRepository.save(member);
    }

}
