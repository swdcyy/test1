package com.yxcorp.gifshow.ad.webview.jshandler.ReportParams;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.webview.jshandler.ReportParams$a;
import nsd.u;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ReportParams implements Serializable	// class@0018ef
{
    public final int adActionType;
    public final Map clientExtras;
    public final int elementType;
    public final int itemClickAction;
    public final int itemClickType;
    public final long itemDuration;
    public final long playedDuration;
    public final int replayTimes;
    public static final ReportParams$a Companion;
    public static final long serialVersionUID;

    static {
       ReportParams.Companion = new ReportParams$a(null);
    }
    public void ReportParams(int p0,int p1,int p2,int p3,long p4,long p5,int p6,Map p7){
       super();
       this.adActionType = p0;
       this.itemClickType = p1;
       this.itemClickAction = p2;
       this.elementType = p3;
       this.itemDuration = p4;
       this.playedDuration = p5;
       this.replayTimes = p6;
       this.clientExtras = p7;
    }
    public void ReportParams(int p0,int p1,int p2,int p3,long p4,long p5,int p6,Map p7,int p8,u p9){
       int i = 0;
       int i1 = (p8 & 0x01)? 0: p0;
       int i2 = (p8 & 0x02)? 0: p1;
       int i3 = (p8 & 0x04)? 0: p2;
       int i4 = (p8 & 0x08)? 0: p3;
       int i5 = 0;
       int i6 = (p8 & 0x10)? i5: p4;
       int i7 = (p8 & 0x20)? i5: p5;
       if (!(p8 & 0x40)) {
          i = p6;
       }
       super(i1, i2, i3, i4, i6, i7, i, p7);
       return;
    }
    public static ReportParams copy$default(ReportParams p0,int p1,int p2,int p3,int p4,long p5,long p6,int p7,Map p8,int p9,Object p10){
       ReportParams reportParams = p0;
       int i = p9;
       ReportParams adActionType = (i & 0x01)? reportParams.adActionType: p1;
       ReportParams itemClickTyp = (i & 0x02)? reportParams.itemClickType: p2;
       ReportParams itemClickAct = (i & 0x04)? reportParams.itemClickAction: p3;
       ReportParams elementType = (i & 0x08)? reportParams.elementType: p4;
       ReportParams itemDuration = (i & 0x10)? reportParams.itemDuration: p5;
       ReportParams playedDurati = (i & 0x20)? reportParams.playedDuration: p6;
       ReportParams replayTimes = (i & 0x40)? reportParams.replayTimes: p7;
       ReportParams clientExtras = (i & 0x0080)? reportParams.clientExtras: p8;
       return p0.copy(adActionType, itemClickTyp, itemClickAct, elementType, itemDuration, playedDurati, replayTimes, clientExtras);
    }
    public final int component1(){
       return this.adActionType;
    }
    public final int component2(){
       return this.itemClickType;
    }
    public final int component3(){
       return this.itemClickAction;
    }
    public final int component4(){
       return this.elementType;
    }
    public final long component5(){
       return this.itemDuration;
    }
    public final long component6(){
       return this.playedDuration;
    }
    public final int component7(){
       return this.replayTimes;
    }
    public final Map component8(){
       return this.clientExtras;
    }
    public final ReportParams copy(int p0,int p1,int p2,int p3,long p4,long p5,int p6,Map p7){
       Object obj;
       if (PatchProxy.isSupport(ReportParams.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4),Long.valueOf(p5),Integer.valueOf(p6),p7};
          obj = PatchProxy.apply(objArray, this, ReportParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       ReportParams reportParams = new ReportParams(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReportParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ReportParams && (this.adActionType == p0.adActionType && (this.itemClickType == p0.itemClickType && (this.itemClickAction == p0.itemClickAction && (this.elementType == p0.elementType && (!this.itemDuration - p0.itemDuration && (!this.playedDuration - p0.playedDuration && (this.replayTimes == p0.replayTimes && a.g(this.clientExtras, p0.clientExtras)))))))))) {
          return true;
       }
       return false;
    }
    public final int getAdActionType(){
       return this.adActionType;
    }
    public final Map getClientExtras(){
       return this.clientExtras;
    }
    public final int getElementType(){
       return this.elementType;
    }
    public final int getItemClickAction(){
       return this.itemClickAction;
    }
    public final int getItemClickType(){
       return this.itemClickType;
    }
    public final long getItemDuration(){
       return this.itemDuration;
    }
    public final long getPlayedDuration(){
       return this.playedDuration;
    }
    public final int getReplayTimes(){
       return this.replayTimes;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ReportParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       ReportParams titemDuratio = this.itemDuration;
       titemDuratio = this.playedDuration;
       int i = ((((((((((((this.adActionType * 31) + this.itemClickType) * 31) + this.itemClickAction) * 31) + this.elementType) * 31) + (int)(titemDuratio ^ (titemDuratio >> 32))) * 31) + (int)(titemDuratio ^ (titemDuratio >> 32))) * 31) + this.replayTimes) * 31;
       titemDuratio = this.clientExtras;
       int i1 = (titemDuratio != null)? titemDuratio.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReportParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReportParams\(adActionType="+this.adActionType+", itemClickType="+this.itemClickType+", itemClickAction="+this.itemClickAction+", elementType="+this.elementType+", itemDuration="+this.itemDuration+", playedDuration="+this.playedDuration+", replayTimes="+this.replayTimes+", clientExtras="+this.clientExtras+"\)";
    }
}
