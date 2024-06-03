package com.Tuan2.HuynhHoangLong.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    //private List<Book> books;
    //private BookService bookService;
    @GetMapping("index")
    public String home() {
        return "home/index";
    }

   /* @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("books", books);
        model.addAttribute("title", "Book List");
        return "home/list";
    }*/
    @GetMapping("/subjects")
    public String subjects() {
        return "home/subjects";
    }
    @GetMapping("/contact")
    public String contact() {
        return "home/contact";
    }
    /*@GetMapping("/add")
    public String addBookForm(@NotNull Model model) {
        model.addAttribute("books", new Book());
        return "home/add";
    }*/
    /*@PostMapping("/add")
    public String addBook(@ModelAttribute("books") Book book) {
        if(bookService.getBookById(book.getId()).isEmpty())
            bookService.addBook(book);
        return "redirect:/home/list";
    }*/
    //    @GetMapping("/add")
//    public String addBookForm(@NotNull Model model) {
//        model.addAttribute("book", new Book());
//        return "home/add";
//    }
//    @PostMapping("/add")
//    public String addBook(@ModelAttribute("book") Book book) {
//        if(bookService.getBookById(book.getId()).isEmpty())
//            bookService.addBook(book);
//        return "redirect:/list";
//    }
    @PostMapping("/submitContact")
    public String submitContact( @RequestParam("name") String name,
                                 @RequestParam("email") String email,
                                 @RequestParam("message") String message,
                                 @RequestParam("date") String date,
                                 Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("message", message);
        model.addAttribute("date", date);

        return "home/sample";
    }
}

