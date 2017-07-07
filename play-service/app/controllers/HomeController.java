package controllers;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.node.ObjectNode;

import play.api.libs.json.Json;
import play.mvc.*;
import scala.util.parsing.json.JSONObject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
    	
        return ok("Welcome to Play Rest Service.");
    }
    
    public Result health(){
    	Map<String, Object> data = new HashMap<String, Object>();
        data.put( "status", "UP" );
    	    
    	return ok(play.libs.Json.toJson(data));
    }

    
}
