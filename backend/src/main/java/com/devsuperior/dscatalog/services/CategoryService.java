package com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired 										// dependência válida do CategoryRepository
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		
		return repository.findAll();				// achar todas as categorias no BD
	}
}
