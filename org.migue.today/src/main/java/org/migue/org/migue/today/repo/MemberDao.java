package org.migue.org.migue.today.repo;

import java.util.List;

import org.migue.org.migue.today.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
