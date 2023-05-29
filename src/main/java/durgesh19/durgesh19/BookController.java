package durgesh19.durgesh19;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class BookController {
    
    @Autowired 
    private IBookRepo iBookRepo;

    @PostMapping("/post")
    public Book addBook(@RequestBody Book book){
        Book b= iBookRepo.addBook(book);
        return b;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return iBookRepo.getAllBooks();
    }

}
