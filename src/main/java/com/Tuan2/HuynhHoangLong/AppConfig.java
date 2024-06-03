package com.Tuan2.HuynhHoangLong;
import com.Tuan2.HuynhHoangLong.Entities.Book;
import com.Tuan2.HuynhHoangLong.Entities.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Configuration
public class AppConfig {
    @Bean
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>(); // Specify the type explicitly here
        books.add(new Book(1L, "Lập trình Web Spring Framework", "Ánh Nguyễn", 29.99, "Công nghệ thông tin"));
        books.add(new Book(2L, "Lập trình ứng dụng Java", "Huy Cường", 45.63, "Công nghệ thông tin"));
        books.add(new Book(3L, "Lập trình Web Spring Boot", "Xuân Nhân", 12.0, "Công nghệ thông tin"));
        books.add(new Book(4L, "Lập trình Web Spring MVC", "Ánh Nguyễn", 0.12, "Công nghệ thông tin"));
        return books;
    }
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>(); // Specify the type explicitly here
        categories.add(new Category(1L, "Lập trình Web "));
        categories.add(new Category(2L, "Lập trình Ứng dụng"));
        return categories;
    }

}

