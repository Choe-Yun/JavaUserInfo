package javauserinfo.javauserinfo.Repository;

import javauserinfo.javauserinfo.Member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
