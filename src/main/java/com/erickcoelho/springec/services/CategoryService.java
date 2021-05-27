package com.erickcoelho.springec.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erickcoelho.springec.domain.Category;
import com.erickcoelho.springec.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Optional<Category> buscar(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj;
	}
}
