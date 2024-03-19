package com.devsuperior.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired 										// dependência válida do CategoryRepository
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)					// garantir transação e evitando lock
	public List<CategoryDTO> findAll(){
		List<Category>  list = repository.findAll();				// achar todas as categorias no BD
		
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		
	}
}
