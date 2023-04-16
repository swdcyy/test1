package com.tachikoma.core.event.base.TKBaseEvent;
import tp8.b;
import java.lang.Object;
import java.util.HashMap;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class TKBaseEvent implements b	// class@000dc0
{
    public int eventState;
    public HashMap mData;
    public int state;
    public long timestamp;
    public String type;

    public void TKBaseEvent(){
       super();
       this.mData = new HashMap();
       this.timestamp = System.currentTimeMillis();
    }
    public void configWithData(HashMap p0){
       this.mData = p0;
    }
    public void setState(int p0){
       TKBaseEvent tKBaseEvent = TKBaseEvent.class;
       if (PatchProxy.isSupport(tKBaseEvent) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKBaseEvent, "1")) {
          return;
       }
       this.state = p0;
       this.eventState = p0;
       return;
    }
    public void setType(String p0){
       this.type = p0;
    }
}
