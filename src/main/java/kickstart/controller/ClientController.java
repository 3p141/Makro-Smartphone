package kickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

/**
 * This class recieves key presses and executes the Makro with array from repository.
 */
public class ClientController {
    @RequestMapping(value="/M1")
    public String eceM1(){
        System.out.println("Web1");
        return "client";
    }

    @RequestMapping(value="/M2")
    public String eceM2(){
        System.out.println("Web2");
        return "client";
    }

    @RequestMapping(value="/M3")
    public String eceM3(){
        System.out.println("Web3");
        return "redirect:/client";
    }

    @RequestMapping(value="/M4")
    public String eceM4(){
        System.out.println("Web4");
        return "client";
    }

    @RequestMapping(value="/M5")
    public String eceM5(){
        System.out.println("Web5");
        return "client";
    }

    @RequestMapping(value="/M6")
    public String eceM6(){
        System.out.println("Web6");
        return "client";
    }

    @RequestMapping(value="/M7")
    public String eceM7(){
        System.out.println("Web7");
        return "client";
    }

    @RequestMapping(value="/M8")
    public String eceM8(){
        System.out.println("Web8");
        return "client";
    }

    @RequestMapping(value="/M9")
    public String eceM9(){
        System.out.println("Web9");
        return "client";
    }

}
