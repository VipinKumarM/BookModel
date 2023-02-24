package book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import book.entity.BookModelEntity;

public interface BookModelRepository  extends JpaRepository<BookModelEntity,Integer>{

}
