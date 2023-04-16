package com.kuaishou.live.core.show.redpacket.richcard.http.SpecialScenePopupParams;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.SpecialScenePopupParams$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SpecialScenePopupParams implements Serializable	// class@000f97
{
    public final String closeLivePopUpButtonText;
    public final String closeLivePopUpDesc;
    public final String closeLivePopUpIcon;
    public final String closeLivePopUpTitle;
    public final String noRecoRoomPopUpButtonText;
    public final String noRecoRoomPopUpDesc;
    public final String noRecoRoomPopUpIcon;
    public final String noRecoRoomPopUpTitle;
    public static final SpecialScenePopupParams$a Companion;
    public static final long serialVersionUID;

    static {
       SpecialScenePopupParams.Companion = new SpecialScenePopupParams$a(null);
    }
    public void SpecialScenePopupParams(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7){
       super();
       this.noRecoRoomPopUpIcon = p0;
       this.noRecoRoomPopUpTitle = p1;
       this.noRecoRoomPopUpDesc = p2;
       this.noRecoRoomPopUpButtonText = p3;
       this.closeLivePopUpIcon = p4;
       this.closeLivePopUpTitle = p5;
       this.closeLivePopUpDesc = p6;
       this.closeLivePopUpButtonText = p7;
    }
    public static SpecialScenePopupParams copy$default(SpecialScenePopupParams p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,int p9,Object p10){
       SpecialScenePopupParams specialScene = p0;
       int i = p9;
       SpecialScenePopupParams noRecoRoomPo = (i & 0x01)? specialScene.noRecoRoomPopUpIcon: p1;
       SpecialScenePopupParams noRecoRoomPo1 = (i & 0x02)? specialScene.noRecoRoomPopUpTitle: p2;
       SpecialScenePopupParams noRecoRoomPo2 = (i & 0x04)? specialScene.noRecoRoomPopUpDesc: p3;
       SpecialScenePopupParams noRecoRoomPo3 = (i & 0x08)? specialScene.noRecoRoomPopUpButtonText: p4;
       SpecialScenePopupParams closeLivePop = (i & 0x10)? specialScene.closeLivePopUpIcon: p5;
       SpecialScenePopupParams closeLivePop1 = (i & 0x20)? specialScene.closeLivePopUpTitle: p6;
       SpecialScenePopupParams closeLivePop2 = (i & 0x40)? specialScene.closeLivePopUpDesc: p7;
       SpecialScenePopupParams closeLivePop3 = (i & 0x0080)? specialScene.closeLivePopUpButtonText: p8;
       return p0.copy(noRecoRoomPo, noRecoRoomPo1, noRecoRoomPo2, noRecoRoomPo3, closeLivePop, closeLivePop1, closeLivePop2, closeLivePop3);
    }
    public final String component1(){
       return this.noRecoRoomPopUpIcon;
    }
    public final String component2(){
       return this.noRecoRoomPopUpTitle;
    }
    public final String component3(){
       return this.noRecoRoomPopUpDesc;
    }
    public final String component4(){
       return this.noRecoRoomPopUpButtonText;
    }
    public final String component5(){
       return this.closeLivePopUpIcon;
    }
    public final String component6(){
       return this.closeLivePopUpTitle;
    }
    public final String component7(){
       return this.closeLivePopUpDesc;
    }
    public final String component8(){
       return this.closeLivePopUpButtonText;
    }
    public final SpecialScenePopupParams copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7){
       Object obj;
       if (PatchProxy.isSupport(SpecialScenePopupParams.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          obj = PatchProxy.apply(objArray, this, SpecialScenePopupParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       SpecialScenePopupParams specialScene = new SpecialScenePopupParams(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SpecialScenePopupParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SpecialScenePopupParams && (a.g(this.noRecoRoomPopUpIcon, p0.noRecoRoomPopUpIcon) && (a.g(this.noRecoRoomPopUpTitle, p0.noRecoRoomPopUpTitle) && (a.g(this.noRecoRoomPopUpDesc, p0.noRecoRoomPopUpDesc) && (a.g(this.noRecoRoomPopUpButtonText, p0.noRecoRoomPopUpButtonText) && (a.g(this.closeLivePopUpIcon, p0.closeLivePopUpIcon) && (a.g(this.closeLivePopUpTitle, p0.closeLivePopUpTitle) && (a.g(this.closeLivePopUpDesc, p0.closeLivePopUpDesc) && a.g(this.closeLivePopUpButtonText, p0.closeLivePopUpButtonText)))))))))) {
          return true;
       }
       return false;
    }
    public final String getCloseLivePopUpButtonText(){
       return this.closeLivePopUpButtonText;
    }
    public final String getCloseLivePopUpDesc(){
       return this.closeLivePopUpDesc;
    }
    public final String getCloseLivePopUpIcon(){
       return this.closeLivePopUpIcon;
    }
    public final String getCloseLivePopUpTitle(){
       return this.closeLivePopUpTitle;
    }
    public final String getNoRecoRoomPopUpButtonText(){
       return this.noRecoRoomPopUpButtonText;
    }
    public final String getNoRecoRoomPopUpDesc(){
       return this.noRecoRoomPopUpDesc;
    }
    public final String getNoRecoRoomPopUpIcon(){
       return this.noRecoRoomPopUpIcon;
    }
    public final String getNoRecoRoomPopUpTitle(){
       return this.noRecoRoomPopUpTitle;
    }
    public int hashCode(){
       SpecialScenePopupParams obj = PatchProxy.apply(null, this, SpecialScenePopupParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.noRecoRoomPopUpIcon;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SpecialScenePopupParams tnoRecoRoomP = this.noRecoRoomPopUpTitle;
       int i2 = (tnoRecoRoomP != null)? tnoRecoRoomP.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tnoRecoRoomP = this.noRecoRoomPopUpDesc;
       i2 = (tnoRecoRoomP != null)? tnoRecoRoomP.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tnoRecoRoomP = this.noRecoRoomPopUpButtonText;
       i2 = (tnoRecoRoomP != null)? tnoRecoRoomP.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tnoRecoRoomP = this.closeLivePopUpIcon;
       i2 = (tnoRecoRoomP != null)? tnoRecoRoomP.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tnoRecoRoomP = this.closeLivePopUpTitle;
       i2 = (tnoRecoRoomP != null)? tnoRecoRoomP.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tnoRecoRoomP = this.closeLivePopUpDesc;
       i2 = (tnoRecoRoomP != null)? tnoRecoRoomP.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tnoRecoRoomP = this.closeLivePopUpButtonText;
       if (tnoRecoRoomP != null) {
          i = tnoRecoRoomP.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SpecialScenePopupParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SpecialScenePopupParams\(noRecoRoomPopUpIcon="+this.noRecoRoomPopUpIcon+", noRecoRoomPopUpTitle="+this.noRecoRoomPopUpTitle+", noRecoRoomPopUpDesc="+this.noRecoRoomPopUpDesc+", noRecoRoomPopUpButtonText="+this.noRecoRoomPopUpButtonText+", closeLivePopUpIcon="+this.closeLivePopUpIcon+", closeLivePopUpTitle="+this.closeLivePopUpTitle+", closeLivePopUpDesc="+this.closeLivePopUpDesc+", closeLivePopUpButtonText="+this.closeLivePopUpButtonText+"\)";
    }
}
