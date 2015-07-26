
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yackman
 */
@Named
@RequestScoped
public class ServerSideSample {
    
    private String inputName="hoge";
    
    public String getHoge()
    {
        return inputName;
    }
        
    public void setHoge(String input)
    {
        inputName = input;
    }
    
}
