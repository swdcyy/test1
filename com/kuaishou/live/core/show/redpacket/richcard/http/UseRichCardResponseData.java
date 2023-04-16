package com.kuaishou.live.core.show.redpacket.richcard.http.UseRichCardResponseData;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.UseRichCardResponseData$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.richcard.http.SpecialScenePopupParams;
import com.kuaishou.live.core.show.redpacket.richcard.http.BarTitleTextMap;
import com.kuaishou.live.core.show.redpacket.richcard.http.PendantConfig;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UseRichCardResponseData implements Serializable	// class@000f9b
{
    public BarTitleTextMap barTitleTextMap;
    public final BottomBarInfo bottomBarInfo;
    public final int code;
    public final String msg;
    public final PendantConfig pendantInfo;
    public final SpecialScenePopupParams specialScenePopUpParams;
    public final String titleText;
    public final UsingCardInfo usingCardInfo;
    public static final UseRichCardResponseData$a Companion;
    public static final long serialVersionUID;

    static {
       UseRichCardResponseData.Companion = new UseRichCardResponseData$a(null);
    }
    public void UseRichCardResponseData(int p0,String p1,String p2,SpecialScenePopupParams p3,BarTitleTextMap p4,PendantConfig p5,UsingCardInfo p6,BottomBarInfo p7){
       a.p(p4, "barTitleTextMap");
       super();
       this.code = p0;
       this.msg = p1;
       this.titleText = p2;
       this.specialScenePopUpParams = p3;
       this.barTitleTextMap = p4;
       this.pendantInfo = p5;
       this.usingCardInfo = p6;
       this.bottomBarInfo = p7;
    }
    public static UseRichCardResponseData copy$default(UseRichCardResponseData p0,int p1,String p2,String p3,SpecialScenePopupParams p4,BarTitleTextMap p5,PendantConfig p6,UsingCardInfo p7,BottomBarInfo p8,int p9,Object p10){
       UseRichCardResponseData useRichCardR = p0;
       int i = p9;
       UseRichCardResponseData code = (i & 0x01)? useRichCardR.code: p1;
       UseRichCardResponseData msg = (i & 0x02)? useRichCardR.msg: p2;
       UseRichCardResponseData titleText = (i & 0x04)? useRichCardR.titleText: p3;
       UseRichCardResponseData specialScene = (i & 0x08)? useRichCardR.specialScenePopUpParams: p4;
       UseRichCardResponseData barTitleText = (i & 0x10)? useRichCardR.barTitleTextMap: p5;
       UseRichCardResponseData pendantInfo = (i & 0x20)? useRichCardR.pendantInfo: p6;
       UseRichCardResponseData usingCardInf = (i & 0x40)? useRichCardR.usingCardInfo: p7;
       UseRichCardResponseData bottomBarInf = (i & 0x0080)? useRichCardR.bottomBarInfo: p8;
       return p0.copy(code, msg, titleText, specialScene, barTitleText, pendantInfo, usingCardInf, bottomBarInf);
    }
    public final int component1(){
       return this.code;
    }
    public final String component2(){
       return this.msg;
    }
    public final String component3(){
       return this.titleText;
    }
    public final SpecialScenePopupParams component4(){
       return this.specialScenePopUpParams;
    }
    public final BarTitleTextMap component5(){
       return this.barTitleTextMap;
    }
    public final PendantConfig component6(){
       return this.pendantInfo;
    }
    public final UsingCardInfo component7(){
       return this.usingCardInfo;
    }
    public final BottomBarInfo component8(){
       return this.bottomBarInfo;
    }
    public final UseRichCardResponseData copy(int p0,String p1,String p2,SpecialScenePopupParams p3,BarTitleTextMap p4,PendantConfig p5,UsingCardInfo p6,BottomBarInfo p7){
       UseRichCardResponseData obj;
       object oobject = p4;
       if (PatchProxy.isSupport(UseRichCardResponseData.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,oobject,p5,p6,p7};
          obj = PatchProxy.apply(objArray, this, UseRichCardResponseData.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "barTitleTextMap");
       obj = new UseRichCardResponseData(p0, p1, p2, p3, p4, p5, p6, p7);
       return v10;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UseRichCardResponseData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UseRichCardResponseData && (this.code == p0.code && (a.g(this.msg, p0.msg) && (a.g(this.titleText, p0.titleText) && (a.g(this.specialScenePopUpParams, p0.specialScenePopUpParams) && (a.g(this.barTitleTextMap, p0.barTitleTextMap) && (a.g(this.pendantInfo, p0.pendantInfo) && (a.g(this.usingCardInfo, p0.usingCardInfo) && a.g(this.bottomBarInfo, p0.bottomBarInfo)))))))))) {
          return true;
       }
       return false;
    }
    public final BarTitleTextMap getBarTitleTextMap(){
       return this.barTitleTextMap;
    }
    public final BottomBarInfo getBottomBarInfo(){
       return this.bottomBarInfo;
    }
    public final int getCode(){
       return this.code;
    }
    public final String getMsg(){
       return this.msg;
    }
    public final PendantConfig getPendantInfo(){
       return this.pendantInfo;
    }
    public final SpecialScenePopupParams getSpecialScenePopUpParams(){
       return this.specialScenePopUpParams;
    }
    public final String getTitleText(){
       return this.titleText;
    }
    public final UsingCardInfo getUsingCardInfo(){
       return this.usingCardInfo;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, UseRichCardResponseData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.code * 31;
       UseRichCardResponseData tmsg = this.msg;
       int i1 = 0;
       int i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i = (i + i2) * 31;
       tmsg = this.titleText;
       i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i = (i + i2) * 31;
       tmsg = this.specialScenePopUpParams;
       i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i = (i + i2) * 31;
       tmsg = this.barTitleTextMap;
       i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i = (i + i2) * 31;
       tmsg = this.pendantInfo;
       i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i = (i + i2) * 31;
       tmsg = this.usingCardInfo;
       i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i = (i + i2) * 31;
       tmsg = this.bottomBarInfo;
       if (tmsg != null) {
          i1 = tmsg.hashCode();
       }
       return (i + i1);
    }
    public final void setBarTitleTextMap(BarTitleTextMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UseRichCardResponseData.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.barTitleTextMap = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UseRichCardResponseData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UseRichCardResponseData\(code="+this.code+", msg="+this.msg+", titleText="+this.titleText+", specialScenePopUpParams="+this.specialScenePopUpParams+", barTitleTextMap="+this.barTitleTextMap+", pendantInfo="+this.pendantInfo+", usingCardInfo="+this.usingCardInfo+", bottomBarInfo="+this.bottomBarInfo+"\)";
    }
}
