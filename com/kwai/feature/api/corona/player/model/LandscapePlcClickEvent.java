package com.kwai.feature.api.corona.player.model.LandscapePlcClickEvent;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class LandscapePlcClickEvent implements Serializable	// class@000e24
{
    public String token;

    public void LandscapePlcClickEvent(){
       super();
    }
    public final String getToken(){
       return this.token;
    }
    public final void setToken(String p0){
       this.token = p0;
    }
}
