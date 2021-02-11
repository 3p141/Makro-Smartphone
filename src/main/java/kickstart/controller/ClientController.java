package kickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ClientController {
    @GetMapping("/client/M1")
    public String eceM1(){
        System.out.println("Web1");
        return "redirect:/client";
    }

    @GetMapping("/client/M2")
    public String eceM2(){
        System.out.println("Web2");
        return "redirect:/client";
    }

    @GetMapping("/client/M3")
    public String eceM3(){
        System.out.println("Web3");
        return "redirect:/client";
    }

    @GetMapping("/client/M4")
    public String eceM4(){
        System.out.println("Web4");
        return "redirect:/client";
    }

    @GetMapping("/client/M5")
    public String eceM5(){
        System.out.println("Web5");
        return "redirect:/client";
    }

    @GetMapping("/client/M6")
    public String eceM6(){
        System.out.println("Web6");
        return "redirect:/client";
    }

    @GetMapping("/client/M7")
    public String eceM7(){
        System.out.println("Web7");
        return "redirect:/client";
    }

    @GetMapping("/client/M8")
    public String eceM8(){
        System.out.println("Web8");
        return "redirect:/client";
    }

    @GetMapping("/client/M9")
    public String eceM9(){
        System.out.println("Web9");
        return "redirect:/client";
    }

}
