package book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import book.entity.BookModelEntity;
import book.repository.BookModelRepository;

@Service
public class BookModelService {
	
	@Autowired
	BookModelRepository bookModelRepo;
	 private static final String NO_DATA_FOUND="No Data Found..";
	public String save(BookModelEntity bookModelEntity) throws Exception {
		BookModelEntity modelEntity=bookModelRepo.findById(bookModelEntity.getId()).orElseThrow(()->new BusinessException(NO_DATA_FOUND));
		if(bookModelEntity.getTitle().isEmpty()) {
		throw new Exception("Title is empty");
		}
        if(bookModelEntity.getAuthor().isEmpty()) {
        	throw new Exception("Author is empty");
		}
        if(bookModelEntity.getPublishedDate()==null) {
        	throw new Exception("PublishedDate is empty");
		}
        bookModelRepo.save(bookModelEntity);
		return "Book has created successfully , Book Id Is"+bookModelEntity.getId();
	}

}
