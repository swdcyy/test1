package com.yxcorp.gifshow.widget.cdn.DesignCDNDataTrack;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.System;
import nsd.u;

public final class DesignCDNDataTrack	// class@00195a
{
    public long duration;
    public final String event;
    public final String payload;
    public final String resType;
    public final boolean success;
    public final long timestamp;

    public void DesignCDNDataTrack(String p0,boolean p1,String p2,String p3){
       a.p(p0, "event");
       a.p(p2, "payload");
       a.p(p3, "resType");
       super();
       this.event = p0;
       this.success = p1;
       this.payload = p2;
       this.resType = p3;
       this.timestamp = System.currentTimeMillis();
    }
    public void DesignCDNDataTrack(String p0,boolean p1,String p2,String p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = false;
       }
       if (p4 & 0x04) {
          p2 = "";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final long getDuration(){
       return this.duration;
    }
    public final String getEvent(){
       return this.event;
    }
    public final String getPayload(){
       return this.payload;
    }
    public final String getResType(){
       return this.resType;
    }
    public final boolean getSuccess(){
       return this.success;
    }
    public final long getTimestamp(){
       return this.timestamp;
    }
    public final void setDuration(long p0){
       this.duration = p0;
    }
}
