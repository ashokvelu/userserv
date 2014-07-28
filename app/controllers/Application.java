package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
    
    public static Result test() {
        return ok(views.html.index.render("Good, we are now done testing routes.."));
    }
    public static Result index() {
        return ok(views.html.index.render("Hello Play Framework"));
    }
    
}
