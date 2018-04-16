package com.thiagopaiva.sistema;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    private static final String USER   = "login";
    private static final String PASS   = "abc123";
    private static final String MSGPRM = "message";
    
    @RequestMapping("/home")
    public ModelAndView home(@RequestParam(value="name", required=false, defaultValue="Mundo") String name) {
        ModelAndView modelAndView = new ModelAndView("home");		
        modelAndView.addObject(MSGPRM, name);		
		return modelAndView;        
    }
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public ModelAndView login(@RequestParam("user") String login, @RequestParam("pass") String senha) {
        ModelAndView modelAndView; 
        if((USER.equals(login))&&(PASS.equals(senha))){
            modelAndView = new ModelAndView("home");				
        }else{
            modelAndView = new ModelAndView("index");				
            modelAndView.addObject(MSGPRM,"Usuário ou senha inválidos!");
        }
        return modelAndView;        
        
    }

    @RequestMapping("/")
    public ModelAndView root() {
        ModelAndView modelAndView = new ModelAndView("index");		
        modelAndView.addObject(MSGPRM,"");
		return modelAndView;        
    }
}
