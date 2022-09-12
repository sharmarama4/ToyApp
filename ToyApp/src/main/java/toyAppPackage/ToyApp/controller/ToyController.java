package toyAppPackage.ToyApp.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import toyAppPackage.ToyApp.data.Toy;
import toyAppPackage.ToyApp.services.interfaces.ToyService;

@Controller

  public class ToyController {

 private ToyService toyService;
    @Autowired
    public ToyController(ToyService toyService) {
        this.toyService = toyService;
    }

    @RequestMapping(value="/test",method= RequestMethod.GET)
    public String test() {
        System.out.println("Inside handeller...");
        return"test";
        }
    @RequestMapping(value="/test2",method=RequestMethod.GET)
    public String test2(Model model) {

        String greeting="Hi";
        model.addAttribute("message",greeting);
        return"test";
    }

    @RequestMapping(value="/toy/{id}",method=RequestMethod.GET)
    public String oneToy(Model model, @PathVariable int id) {

      Toy toy=toyService.getOneById(id);
        model.addAttribute("toy",toy);
        return"toy";
    }
    @RequestMapping(value="/toys",method=RequestMethod.GET)
    public String allToys(Model model ){
        model.addAttribute("toys",toyService.getAllToys());
        return"toys";
    }
       }


