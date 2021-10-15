package pt.amane.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.amane.movieflix.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

}
