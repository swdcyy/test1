package com.yxcorp.gifshow.sprite.SprintItemInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.sprite.SprintItemInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SprintItemInfo implements Serializable	// class@001d7e
{
    public final long endTime;
    public final int height;
    public final long startTime;
    public final String url;
    public final int width;
    public final int xPos;
    public final int yPos;
    public static final SprintItemInfo$a Companion;
    public static final long serialVersionUID;

    static {
       SprintItemInfo.Companion = new SprintItemInfo$a(null);
    }
    public void SprintItemInfo(long p0,long p1,String p2,int p3,int p4,int p5,int p6){
       a.p(p2, "url");
       super();
       this.startTime = p0;
       this.endTime = p1;
       this.url = p2;
       this.xPos = p3;
       this.yPos = p4;
       this.width = p5;
       this.height = p6;
    }
    public static SprintItemInfo copy$default(SprintItemInfo p0,long p1,long p2,String p3,int p4,int p5,int p6,int p7,int p8,Object p9){
       SprintItemInfo sprintItemIn = p0;
       SprintItemInfo startTime = (p8 & 0x01)? sprintItemIn.startTime: p1;
       SprintItemInfo endTime = (p8 & 0x02)? sprintItemIn.endTime: p2;
       SprintItemInfo url = (p8 & 0x04)? sprintItemIn.url: p3;
       SprintItemInfo xPos = (p8 & 0x08)? sprintItemIn.xPos: p4;
       SprintItemInfo yPos = (p8 & 0x10)? sprintItemIn.yPos: p5;
       SprintItemInfo width = (p8 & 0x20)? sprintItemIn.width: p6;
       SprintItemInfo height = (p8 & 0x40)? sprintItemIn.height: p7;
       return p0.copy(startTime, endTime, url, xPos, yPos, width, height);
    }
    public final long component1(){
       return this.startTime;
    }
    public final long component2(){
       return this.endTime;
    }
    public final String component3(){
       return this.url;
    }
    public final int component4(){
       return this.xPos;
    }
    public final int component5(){
       return this.yPos;
    }
    public final int component6(){
       return this.width;
    }
    public final int component7(){
       return this.height;
    }
    public final SprintItemInfo copy(long p0,long p1,String p2,int p3,int p4,int p5,int p6){
       SprintItemInfo obj;
       object oobject = p2;
       if (PatchProxy.isSupport(SprintItemInfo.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(p1),oobject,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, SprintItemInfo.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "url");
       obj = new SprintItemInfo(p0, p1, p2, p3, p4, p5, p6);
       return v11;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SprintItemInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SprintItemInfo && (!this.startTime - p0.startTime && (!this.endTime - p0.endTime && (a.g(this.url, p0.url) && (this.xPos == p0.xPos && (this.yPos == p0.yPos && (this.width == p0.width && this.height == p0.height)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SprintItemInfo obj = PatchProxy.apply(null, this, SprintItemInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.startTime;
       SprintItemInfo tendTime = this.endTime;
       int i = (((int)(obj ^ (obj >> 32)) * 31) + (int)(tendTime ^ (tendTime >> 32))) * 31;
       obj = this.url;
       int i1 = (obj != null)? obj.hashCode(): 0;
       return (((((((((i + i1) * 31) + this.xPos) * 31) + this.yPos) * 31) + this.width) * 31) + this.height);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SprintItemInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "startTime "+this.startTime+"\n endTime "+this.endTime+" \nurl "+this.url+" \nx "+this.xPos+" \ny  "+this.yPos+" \nw "+this.width+" \nh "+this.height;
    }
}
