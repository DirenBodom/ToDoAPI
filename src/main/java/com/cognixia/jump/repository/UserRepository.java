package com.cognixia.jump.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	// select * from address where state = ?
	//User findByPassword(String password);
	User findByUserNameAndPassword(String userName, String password);
	
//	@Modifying
//	@Query("update user u set u.user_name = ?1 where u.id = ?2")
//	int setFixedUserNameFor(String userName, int id);
}
