package guevara.demo;

//import guevara.demo.Repository.RoboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

@Controller
public class MainController {

    //@Autowired
   // RoboRepository roboRepository;


    @RequestMapping("/")
    public String index(Model model)
    {
        String sendToIndex = "WELCOME to RoboResume!!!(from controler)";
        model.addAttribute("message", sendToIndex);
        return "index";
    }

    @GetMapping("/addnew")
    public String addABook(Model model){
        model.addAttribute("newEntry", new RoboResume());
        return "adddnew";


    }


    @PostMapping("/addnew")
    public String addANew(@Valid @ModelAttribute("newRobo") RoboResume newRobo, BindingResult bindingResult)
    {
        System.out.println("**"+bindingResult.toString());
        if(bindingResult.hasErrors()){
            return "adddnew";
        }


        //System.out.println("*adding a new book");
        //System.out.println(newRobo.getRoboEmail());
      //  roboRepository.save(newRobo);

        System.out.println("*no errores*");
            return "result";
        }



}