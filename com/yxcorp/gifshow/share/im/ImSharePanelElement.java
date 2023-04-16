package com.yxcorp.gifshow.share.im.ImSharePanelElement;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ImSharePanelElement extends ShareInitResponse$SharePanelElement	// class@001bbb
{
    public final boolean isGroup;
    public final boolean isMoreBtn;
    public final boolean isOnLine;
    public final boolean isRtcRunning;
    public final String onlineStatus;

    public void ImSharePanelElement(boolean p0,String p1,boolean p2,boolean p3,boolean p4){
       super();
       this.isOnLine = p0;
       this.onlineStatus = p1;
       this.isGroup = p2;
       this.isMoreBtn = p3;
       this.isRtcRunning = p4;
    }
    public static ImSharePanelElement copy$default(ImSharePanelElement p0,boolean p1,String p2,boolean p3,boolean p4,boolean p5,int p6,Object p7){
       ImSharePanelElement isOnLine;
       ImSharePanelElement onlineStatus;
       ImSharePanelElement isGroup;
       ImSharePanelElement isMoreBtn;
       ImSharePanelElement isRtcRunning;
       if (p6 & 0x01) {
          isOnLine = p0.isOnLine;
       }
       if (p6 & 0x02) {
          onlineStatus = p0.onlineStatus;
       }
       p7 = onlineStatus;
       if (p6 & 0x04) {
          isGroup = p0.isGroup;
       }
       ImSharePanelElement imSharePanel = isGroup;
       if (p6 & 0x08) {
          isMoreBtn = p0.isMoreBtn;
       }
       ImSharePanelElement imSharePanel1 = isMoreBtn;
       if (p6 & 0x10) {
          isRtcRunning = p0.isRtcRunning;
       }
       return p0.copy(isOnLine, p7, imSharePanel, imSharePanel1, isRtcRunning);
    }
    public final boolean component1(){
       return this.isOnLine;
    }
    public final String component2(){
       return this.onlineStatus;
    }
    public final boolean component3(){
       return this.isGroup;
    }
    public final boolean component4(){
       return this.isMoreBtn;
    }
    public final boolean component5(){
       return this.isRtcRunning;
    }
    public final ImSharePanelElement copy(boolean p0,String p1,boolean p2,boolean p3,boolean p4){
       Object obj;
       if (PatchProxy.isSupport(ImSharePanelElement.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, ImSharePanelElement.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ImSharePanelElement imSharePanel = new ImSharePanelElement(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ImSharePanelElement.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ImSharePanelElement && (this.isOnLine == p0.isOnLine && (a.g(this.onlineStatus, p0.onlineStatus) && (this.isGroup == p0.isGroup && (this.isMoreBtn == p0.isMoreBtn && this.isRtcRunning == p0.isRtcRunning)))))) {
          return true;
       }
       return false;
    }
    public final String getOnlineStatus(){
       return this.onlineStatus;
    }
    public int hashCode(){
       int i1;
       ImSharePanelElement obj = PatchProxy.apply(null, this, ImSharePanelElement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.isOnLine;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       ImSharePanelElement tonlineStatu = this.onlineStatus;
       int i2 = (tonlineStatu != null)? tonlineStatu.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tonlineStatu = this.isGroup;
       if (tonlineStatu != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tonlineStatu = this.isMoreBtn;
       if (tonlineStatu != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tonlineStatu = this.isRtcRunning;
       if (tonlineStatu == null) {
          i = tonlineStatu;
       }
       return (i1 + i);
    }
    public final boolean isGroup(){
       return this.isGroup;
    }
    public final boolean isMoreBtn(){
       return this.isMoreBtn;
    }
    public final boolean isOnLine(){
       return this.isOnLine;
    }
    public final boolean isRtcRunning(){
       return this.isRtcRunning;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ImSharePanelElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ImSharePanelElement\(isOnLine="+this.isOnLine+", onlineStatus="+this.onlineStatus+", isGroup="+this.isGroup+", isMoreBtn="+this.isMoreBtn+", isRtcRunning="+this.isRtcRunning+"\)";
    }
}
