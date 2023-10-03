package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String displayHomepage() {
        return  "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<p>Click <a href='/form'>here</a> to select your favorite.</>" +
                "</body" +
                "</html";
    }

    @GetMapping("/form")
    public String skillsTrackerForm() {
        return "<html>" +
                "<body>" +
                "<form action='/results' method='POST'>" +
                "<label>Name:</label>" +
                "<input type='text' name='userName' /> <br />" +
                "<label>My Favorite Language:</label>" +
                "<select name='fave1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<label>My Second Favorite Language:</label>" +
                "<select name='fave2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<label>My Third Favorite Language:</label>" +
                "<select name='fave3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/results")
    public String processSkillsForm(@RequestParam String userName, String fave1, String fave2, String fave3) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                "<h3>Favorite Languages</h3>" +
                "<table>" +
                "<tr>" +
                "<td>1.</td>" +
                "<td>" + fave1 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>2.</td>" +
                "<td>" + fave2 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>3.</td>" +
                "<td>" + fave3 + "</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }


}
