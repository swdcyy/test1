package com.yxcorp.gifshow.log.realtime.Operation;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

public class Operation	// class@001b34
{
    public String content;
    public Long id;
    public Boolean is_delayed_log;

    public void Operation(){
       super();
    }
    public void Operation(Long p0){
       super();
       this.id = p0;
    }
    public void Operation(Long p0,String p1,Boolean p2){
       super();
       this.id = p0;
       this.content = p1;
       this.is_delayed_log = p2;
    }
    public String getContent(){
       return this.content;
    }
    public Long getId(){
       return this.id;
    }
    public Boolean getIs_delayed_log(){
       return this.is_delayed_log;
    }
    public void setContent(String p0){
       this.content = p0;
    }
    public void setId(Long p0){
       this.id = p0;
    }
    public void setIs_delayed_log(Boolean p0){
       this.is_delayed_log = p0;
    }
}
