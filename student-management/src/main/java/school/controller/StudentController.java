
package school.controller;

import school.model.Student;
import school.repo.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("students", repo.findAll());
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        repo.save(student);
        return "redirect:/";
    }
}
