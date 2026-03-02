package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.DiscussionReplies;

@Repository
public interface DiscussionRepliesInterface extends JpaRepository<DiscussionReplies, Long> {

}
