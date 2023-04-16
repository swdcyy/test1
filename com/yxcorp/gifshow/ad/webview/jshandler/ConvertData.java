package com.yxcorp.gifshow.ad.webview.jshandler.ConvertData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.webview.jshandler.ConvertData$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ConvertData implements Serializable	// class@0018e5
{
    public final int itemClickType;
    public final int locationType;
    public final String sessionId;
    public static final ConvertData$a Companion;
    public static final int b;

    static {
       ConvertData.Companion = new ConvertData$a(null);
    }
    public void ConvertData(){
       super(null, 0, 0, 7, null);
    }
    public void ConvertData(String p0,int p1,int p2){
       a.p(p0, "sessionId");
       super();
       this.sessionId = p0;
       this.locationType = p1;
       this.itemClickType = p2;
    }
    public void ConvertData(String p0,int p1,int p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = "";
       }
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static ConvertData copy$default(ConvertData p0,String p1,int p2,int p3,int p4,Object p5){
       ConvertData sessionId;
       ConvertData locationType;
       ConvertData itemClickTyp;
       if (p4 & 0x01) {
          sessionId = p0.sessionId;
       }
       if (p4 & 0x02) {
          locationType = p0.locationType;
       }
       if (p4 & 0x04) {
          itemClickTyp = p0.itemClickType;
       }
       return p0.copy(sessionId, locationType, itemClickTyp);
    }
    public final String component1(){
       return this.sessionId;
    }
    public final int component2(){
       return this.locationType;
    }
    public final int component3(){
       return this.itemClickType;
    }
    public final ConvertData copy(String p0,int p1,int p2){
       if (PatchProxy.isSupport(ConvertData.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ConvertData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "sessionId");
       return new ConvertData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ConvertData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ConvertData && (a.g(this.sessionId, p0.sessionId) && (this.locationType == p0.locationType && this.itemClickType == p0.itemClickType)))) {
          return true;
       }
       return false;
    }
    public final int getItemClickType(){
       return this.itemClickType;
    }
    public final int getLocationType(){
       return this.locationType;
    }
    public final String getSessionId(){
       return this.sessionId;
    }
    public int hashCode(){
       ConvertData obj = PatchProxy.apply(null, this, ConvertData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.sessionId;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((i * 31) + this.locationType) * 31) + this.itemClickType);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ConvertData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ConvertData\(sessionId="+this.sessionId+", locationType="+this.locationType+", itemClickType="+this.itemClickType+"\)";
    }
}
