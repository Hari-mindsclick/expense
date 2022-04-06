package lhk.hari.demo.service;

import org.springframework.security.core.userdetails.UserDetails;

import lhk.hari.demo.entity.User;
import lhk.hari.demo.entity.UserModel;

public interface UserService {

User createUser(UserModel user);
	
User readUser(Long id);

User updateUser(UserModel user, Long id);
void deleteUser(Long id);

User getLoggedInUser();





}
