package com.frog.engine.jsobject.FrogLoggerObject;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public class FrogLoggerObject	// class@00153c
{
    public String event;
    public String eventType;
    public Map values;

    public void FrogLoggerObject(){
       super();
       this.values = new HashMap();
    }
    public String getEvent(){
       return this.event;
    }
    public String getEventType(){
       return this.eventType;
    }
    public Map getValues(){
       return this.values;
    }
    public void put(String p0,long p1){
       FrogLoggerObject uFrogLoggerO = FrogLoggerObject.class;
       if (PatchProxy.isSupport(uFrogLoggerO) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uFrogLoggerO, "1")) {
          return;
       }
       this.values.put(p0, Long.valueOf(p1));
       return;
    }
    public void put(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogLoggerObject.class, "2")) {
          return;
       }
       this.values.put(p0, p1);
       return;
    }
    public void setEvent(String p0){
       this.event = p0;
    }
    public void setEventType(String p0){
       this.eventType = p0;
    }
}
