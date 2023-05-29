package durgesh19.durgesh19;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class IBookRepo {

    private  List<Book> list = new ArrayList<>();

    public Book addBook(Book b) {
        list.add(b);
        return b;
    }

    public List<Book> getAllBooks() {
        return list;
    }
    
}
