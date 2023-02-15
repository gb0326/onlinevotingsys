package com.geunbok.onlinevotingsys.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    @Query("SELECT p FROM Vote p ORDER BY p.id DESC")
    List<Vote> findAllDesc();
}
