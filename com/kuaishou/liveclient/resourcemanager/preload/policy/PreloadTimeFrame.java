package com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadTimeFrame;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PreloadTimeFrame implements Serializable	// class@001094
{
    public String endTime;
    public String startTime;

    public void PreloadTimeFrame(){
       super(null, null, 3, null);
    }
    public void PreloadTimeFrame(String p0,String p1){
       super();
       this.startTime = p0;
       this.endTime = p1;
    }
    public void PreloadTimeFrame(String p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = "";
       }
       if (p2 & 0x02) {
          p1 = "";
       }
       super(p0, p1);
       return;
    }
    public static PreloadTimeFrame copy$default(PreloadTimeFrame p0,String p1,String p2,int p3,Object p4){
       PreloadTimeFrame startTime;
       PreloadTimeFrame endTime;
       if (p3 & 0x01) {
          startTime = p0.startTime;
       }
       if (p3 & 0x02) {
          endTime = p0.endTime;
       }
       return p0.copy(startTime, endTime);
    }
    public final String component1(){
       return this.startTime;
    }
    public final String component2(){
       return this.endTime;
    }
    public final PreloadTimeFrame copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PreloadTimeFrame.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PreloadTimeFrame(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PreloadTimeFrame.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PreloadTimeFrame && (a.g(this.startTime, p0.startTime) && a.g(this.endTime, p0.endTime)))) {
          return true;
       }
       return false;
    }
    public final String getEndTime(){
       return this.endTime;
    }
    public final String getStartTime(){
       return this.startTime;
    }
    public int hashCode(){
       PreloadTimeFrame obj = PatchProxy.apply(null, this, PreloadTimeFrame.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.startTime;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PreloadTimeFrame tendTime = this.endTime;
       if (tendTime != null) {
          i = tendTime.hashCode();
       }
       return (i1 + i);
    }
    public final void setEndTime(String p0){
       this.endTime = p0;
    }
    public final void setStartTime(String p0){
       this.startTime = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PreloadTimeFrame.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PreloadTimeFrame\(startTime="+this.startTime+", endTime="+this.endTime+"\)";
    }
}
