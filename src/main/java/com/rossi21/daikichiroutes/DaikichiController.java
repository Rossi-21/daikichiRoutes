package com.rossi21.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
        public String welcome() {
                return "Welcome!";
        }
        @RequestMapping("/today")
        public String today() {
                return "Today you will find luck in all your endeavors!";
        }        
        @RequestMapping("/tomorrow")
        public String tomorrow() {
                return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
        }
        @RequestMapping("/travel/{place}")
        public String showPlace(@PathVariable("place") String place)
        	{return "Congratulations! You will soon travel to " + place + ".";}
        @RequestMapping("/lotto/{num}")
        public String showNum(@PathVariable("num") int num) {
        	if(num % 2 == 0){
        		return "You will take a grand journey in the near future, but be weary of tempting offers.";
        	}
        	else{
        		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        	} 
        }

}
