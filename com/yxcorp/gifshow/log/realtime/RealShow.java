package com.yxcorp.gifshow.log.realtime.RealShow;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;

public class RealShow	// class@001b37
{
    public byte[] content;
    public Long id;
    public Boolean is_delayed_log;
    public Long llsid;

    public void RealShow(){
       super();
    }
    public void RealShow(Long p0){
       super();
       this.id = p0;
    }
    public void RealShow(Long p0,Long p1,byte[] p2,Boolean p3){
       super();
       this.id = p0;
       this.llsid = p1;
       this.content = p2;
       this.is_delayed_log = p3;
    }
    public byte[] getContent(){
       return this.content;
    }
    public Long getId(){
       return this.id;
    }
    public Boolean getIs_delayed_log(){
       return this.is_delayed_log;
    }
    public Long getLlsid(){
       return this.llsid;
    }
    public void setContent(byte[] p0){
       this.content = p0;
    }
    public void setId(Long p0){
       this.id = p0;
    }
    public void setIs_delayed_log(Boolean p0){
       this.is_delayed_log = p0;
    }
    public void setLlsid(Long p0){
       this.llsid = p0;
    }
}
