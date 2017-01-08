package com.intelcan.repository;

import com.intelcan.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserAppRepository extends JpaRepository<AppUser, Long> {
}
