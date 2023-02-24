package book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import book.entity.BookModelEntity;
import book.service.BookModelService;

@RestController
@RequestMapping("/book")
@CrossOrigin("*")
public class BookModelController {

	@Autowired
	BookModelService bookModelService;

	@PostMapping("/save")
	public BookModelEntity save(@RequestBody BookModelEntity bookModelEntity) throws Exception {
		return bookModelService.save(bookModelEntity);
	}
}
