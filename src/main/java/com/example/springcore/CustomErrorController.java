package com.example.springcore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController{
   @Override
  public String getErrorPath(){
       return "/error";
   }
 @RequestMapping("/error")
   public String handleError(){
      return "error";
   }
}
