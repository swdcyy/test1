package com.kwai.link.PushTokenInfo;
import java.lang.String;
import java.lang.Object;

public class PushTokenInfo	// class@000add
{
    public boolean isPassThrough;
    public String token;
    public int type;

    public void PushTokenInfo(int p0,String p1,boolean p2){
       super();
       this.isPassThrough = true;
       this.type = p0;
       this.token = p1;
       this.isPassThrough = p2;
    }
    public String getToken(){
       return this.token;
    }
    public int getType(){
       return this.type;
    }
    public boolean isPassThrough(){
       return this.isPassThrough;
    }
    public void setPassThrough(boolean p0){
       this.isPassThrough = p0;
    }
    public void setToken(String p0){
       this.token = p0;
    }
    public void setType(int p0){
       this.type = p0;
    }
}
