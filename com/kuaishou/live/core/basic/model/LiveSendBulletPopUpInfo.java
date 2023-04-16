package com.kuaishou.live.core.basic.model.LiveSendBulletPopUpInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveSendBulletPopUpInfo implements Serializable	// class@000883
{
    public final String confirmButton;
    public final String confirmLink;
    public final String popContent;
    public final String popTitle;

    public void LiveSendBulletPopUpInfo(String p0,String p1,String p2,String p3){
       a.p(p0, "popTitle");
       a.p(p1, "popContent");
       a.p(p2, "confirmButton");
       a.p(p3, "confirmLink");
       super();
       this.popTitle = p0;
       this.popContent = p1;
       this.confirmButton = p2;
       this.confirmLink = p3;
    }
    public static LiveSendBulletPopUpInfo copy$default(LiveSendBulletPopUpInfo p0,String p1,String p2,String p3,String p4,int p5,Object p6){
       LiveSendBulletPopUpInfo popTitle;
       LiveSendBulletPopUpInfo popContent;
       LiveSendBulletPopUpInfo confirmButto;
       LiveSendBulletPopUpInfo confirmLink;
       if (p5 & 0x01) {
          popTitle = p0.popTitle;
       }
       if (p5 & 0x02) {
          popContent = p0.popContent;
       }
       if (p5 & 0x04) {
          confirmButto = p0.confirmButton;
       }
       if (p5 & 0x08) {
          confirmLink = p0.confirmLink;
       }
       return p0.copy(popTitle, popContent, confirmButto, confirmLink);
    }
    public final String component1(){
       return this.popTitle;
    }
    public final String component2(){
       return this.popContent;
    }
    public final String component3(){
       return this.confirmButton;
    }
    public final String component4(){
       return this.confirmLink;
    }
    public final LiveSendBulletPopUpInfo copy(String p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveSendBulletPopUpInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "popTitle");
       a.p(p1, "popContent");
       a.p(p2, "confirmButton");
       a.p(p3, "confirmLink");
       return new LiveSendBulletPopUpInfo(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSendBulletPopUpInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveSendBulletPopUpInfo && (a.g(this.popTitle, p0.popTitle) && (a.g(this.popContent, p0.popContent) && (a.g(this.confirmButton, p0.confirmButton) && a.g(this.confirmLink, p0.confirmLink)))))) {
          return true;
       }
       return false;
    }
    public final String getConfirmButton(){
       return this.confirmButton;
    }
    public final String getConfirmLink(){
       return this.confirmLink;
    }
    public final String getPopContent(){
       return this.popContent;
    }
    public final String getPopTitle(){
       return this.popTitle;
    }
    public int hashCode(){
       LiveSendBulletPopUpInfo obj = PatchProxy.apply(null, this, LiveSendBulletPopUpInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.popTitle;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveSendBulletPopUpInfo tpopContent = this.popContent;
       int i2 = (tpopContent != null)? tpopContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpopContent = this.confirmButton;
       i2 = (tpopContent != null)? tpopContent.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpopContent = this.confirmLink;
       if (tpopContent != null) {
          i = tpopContent.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSendBulletPopUpInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveSendBulletPopUpInfo\(popTitle="+this.popTitle+", popContent="+this.popContent+", confirmButton="+this.confirmButton+", confirmLink="+this.confirmLink+"\)";
    }
}
