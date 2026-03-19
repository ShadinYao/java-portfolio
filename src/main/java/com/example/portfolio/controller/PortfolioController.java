package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PortfolioController {

    private final List<Project> projects = List.of(
        new Project("AI 照片清理工具", "智能识别并清理重复照片的桌面应用", "Java, Python, OpenCV", "https://github.com/ShadinYao"),
        new Project("个人博客系统", "基于 Spring Boot 的博客平台", "Java, Spring Boot, Thymeleaf", "https://github.com/ShadinYao"),
        new Project("天气小助手", "实时天气查询与预警应用", "Java, REST API", "https://github.com/ShadinYao")
    );

    private final List<String> skills = List.of(
        "Java", "Spring Boot", "Python", "JavaScript", 
        "React", "Node.js", "Git", "Docker", "MySQL", "Redis"
    );

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Shadin Yao");
        model.addAttribute("title", "全栈开发者");
        model.addAttribute("bio", "热爱编程，专注 AI 与 Web 开发。喜欢探索新技术，追求代码质量与用户体验的完美平衡。");
        model.addAttribute("email", "yao609475298@gmail.com");
        model.addAttribute("github", "https://github.com/ShadinYao");
        return "index";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("projects", projects);
        return "projects";
    }

    @GetMapping("/skills")
    public String skills(Model model) {
        model.addAttribute("skills", skills);
        return "skills";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @PostMapping("/contact")
    public String contactSubmit(@RequestParam String name, 
                                @RequestParam String email, 
                                @RequestParam String message,
                                Model model) {
        model.addAttribute("success", true);
        model.addAttribute("name", name);
        return "contact";
    }

    public static class Project {
        private String name;
        private String description;
        private String tech;
        private String link;

        public Project(String name, String description, String tech, String link) {
            this.name = name;
            this.description = description;
            this.tech = tech;
            this.link = link;
        }

        public String getName() { return name; }
        public String getDescription() { return description; }
        public String getTech() { return tech; }
        public String getLink() { return link; }
    }
}
