# Java Portfolio - AI智能个人网站

一个基于 Spring Boot 的现代个人网站，由 AI 自动生成。

## 技术栈

- Java 17
- Spring Boot 3.2.0
- Thymeleaf 模板引擎
- 响应式 CSS 设计

## 功能特性

- 🏠 个人主页展示
- 📁 项目展示页面
- 💻 技能展示
- 📧 联系表单

## 快速开始

### 前置要求

- JDK 17 或更高版本
- Maven 3.6+

### 运行项目

```bash
# 克隆仓库
git clone https://github.com/ShadinYao/java-portfolio.git
cd java-portfolio

# 编译运行
./mvnw spring-boot:run
```

访问 http://localhost:8080 查看网站。

## 项目结构

```
src/
├── main/
│   ├── java/com/example/portfolio/
│   │   ├── PortfolioApplication.java
│   │   └── controller/
│   │       └── PortfolioController.java
│   └── resources/
│       ├── templates/
│       │   ├── index.html
│       │   ├── projects.html
│       │   ├── skills.html
│       │   └── contact.html
│       └── static/
│           └── css/
│               └── style.css
└── pom.xml
```

## 作者

- **Shadin Yao**
- Email: yao609475298@gmail.com
- GitHub: [@ShadinYao](https://github.com/ShadinYao)

## License

MIT License

---

*此项目由 AI 自动生成* 🤖
