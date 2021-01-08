package com.wcs.checkpoint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcs.checkpoint3.entity.Posts;

public interface PostRepository extends JpaRepository<Posts, Long>{

}
