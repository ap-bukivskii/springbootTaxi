package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private List<User> usersList;// = new ArrayList<>();

    @GetMapping
    public String startPoint(){
        System.out.println("index");
        System.out.println(usersList);

        return "index_template";
    }

    @GetMapping("users")
    public String viewUsers(Model model){
        System.out.println(usersList);
        model.addAttribute("usersList", usersList);
        System.out.println("view users");
        return "users_template";
    }

    @GetMapping("register")
    public String viewRegPage(){
        System.out.println("get register");
        return "reg_template";
    }

    @PostMapping("register")
    public String postOnRegPage(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String email,
            @RequestParam String password
//            ,Model model
    ){
        System.out.println("post register");
        usersList.add(new User(firstName,lastName,email,password));
        System.out.println(usersList);
        //model.addAttribute("usersList", usersList);
        return "reg_template";
    }

}
