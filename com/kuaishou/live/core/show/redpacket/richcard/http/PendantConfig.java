package com.kuaishou.live.core.show.redpacket.richcard.http.PendantConfig;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.PendantConfig$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority;
import java.lang.Enum;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PendantConfig implements Serializable	// class@000f89
{
    public final String activityId;
    public final int arrangeMode;
    public final String bizId;
    public final int bizPriority;
    public final String bundle;
    public String clikurl;
    public final int layoutArea;
    public final int layoutOrder;
    public String logParams;
    public String pendantMainPartImageUrl;
    public final String viewKey;
    public String willTransitionNextRoomImageUrl;
    public static final PendantConfig$a Companion;
    public static final long serialVersionUID;

    static {
       PendantConfig.Companion = new PendantConfig$a(null);
    }
    public void PendantConfig(String p0,String p1,String p2,String p3,int p4,int p5,int p6,int p7,String p8,String p9,String p10,String p11){
       super();
       this.bundle = p0;
       this.viewKey = p1;
       this.bizId = p2;
       this.activityId = p3;
       this.bizPriority = p4;
       this.layoutOrder = p5;
       this.arrangeMode = p6;
       this.layoutArea = p7;
       this.pendantMainPartImageUrl = p8;
       this.willTransitionNextRoomImageUrl = p9;
       this.logParams = p10;
       this.clikurl = p11;
    }
    public void PendantConfig(String p0,String p1,String p2,String p3,int p4,int p5,int p6,int p7,String p8,String p9,String p10,String p11,int p12,u p13){
       int i = p12;
       int i1 = (i & 0x10)? LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.RICH_CARD.ordinal(): p4;
       int i2 = (i & 0x20)? LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.RICH_CARD.ordinal(): p5;
       int i3 = (i & 0x40)? 2: p6;
       int i4 = (i & 0x0080)? 2: p7;
       super(p0, p1, p2, p3, i1, i2, i3, i4, p8, p9, p10, p11);
       return;
    }
    public static PendantConfig copy$default(PendantConfig p0,String p1,String p2,String p3,String p4,int p5,int p6,int p7,int p8,String p9,String p10,String p11,String p12,int p13,Object p14){
       PendantConfig pendantConfi = p0;
       int i = p13;
       PendantConfig bundle = (i & 0x01)? pendantConfi.bundle: p1;
       PendantConfig viewKey = (i & 0x02)? pendantConfi.viewKey: p2;
       PendantConfig bizId = (i & 0x04)? pendantConfi.bizId: p3;
       PendantConfig activityId = (i & 0x08)? pendantConfi.activityId: p4;
       PendantConfig bizPriority = (i & 0x10)? pendantConfi.bizPriority: p5;
       PendantConfig layoutOrder = (i & 0x20)? pendantConfi.layoutOrder: p6;
       PendantConfig arrangeMode = (i & 0x40)? pendantConfi.arrangeMode: p7;
       PendantConfig layoutArea = (i & 0x0080)? pendantConfi.layoutArea: p8;
       PendantConfig pendantMainP = (i & 0x0100)? pendantConfi.pendantMainPartImageUrl: p9;
       PendantConfig willTransiti = (i & 0x0200)? pendantConfi.willTransitionNextRoomImageUrl: p10;
       PendantConfig logParams = (i & 0x0400)? pendantConfi.logParams: p11;
       PendantConfig clikurl = (i & 0x0800)? pendantConfi.clikurl: p12;
       return p0.copy(bundle, viewKey, bizId, activityId, bizPriority, layoutOrder, arrangeMode, layoutArea, pendantMainP, willTransiti, logParams, clikurl);
    }
    public final String component1(){
       return this.bundle;
    }
    public final String component10(){
       return this.willTransitionNextRoomImageUrl;
    }
    public final String component11(){
       return this.logParams;
    }
    public final String component12(){
       return this.clikurl;
    }
    public final String component2(){
       return this.viewKey;
    }
    public final String component3(){
       return this.bizId;
    }
    public final String component4(){
       return this.activityId;
    }
    public final int component5(){
       return this.bizPriority;
    }
    public final int component6(){
       return this.layoutOrder;
    }
    public final int component7(){
       return this.arrangeMode;
    }
    public final int component8(){
       return this.layoutArea;
    }
    public final String component9(){
       return this.pendantMainPartImageUrl;
    }
    public final PendantConfig copy(String p0,String p1,String p2,String p3,int p4,int p5,int p6,int p7,String p8,String p9,String p10,String p11){
       Object obj;
       if (PatchProxy.isSupport(PendantConfig.class)) {
          Object[] objArray = new Object[12];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          obj = PatchProxy.apply(objArray, this, PendantConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       PendantConfig pendantConfi = new PendantConfig(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PendantConfig && (a.g(this.bundle, p0.bundle) && (a.g(this.viewKey, p0.viewKey) && (a.g(this.bizId, p0.bizId) && (a.g(this.activityId, p0.activityId) && (this.bizPriority == p0.bizPriority && (this.layoutOrder == p0.layoutOrder && (this.arrangeMode == p0.arrangeMode && (this.layoutArea == p0.layoutArea && (a.g(this.pendantMainPartImageUrl, p0.pendantMainPartImageUrl) && (a.g(this.willTransitionNextRoomImageUrl, p0.willTransitionNextRoomImageUrl) && (a.g(this.logParams, p0.logParams) && a.g(this.clikurl, p0.clikurl)))))))))))))) {
          return true;
       }
       return false;
    }
    public final String getActivityId(){
       return this.activityId;
    }
    public final int getArrangeMode(){
       return this.arrangeMode;
    }
    public final String getBizId(){
       return this.bizId;
    }
    public final int getBizPriority(){
       return this.bizPriority;
    }
    public final String getBundle(){
       return this.bundle;
    }
    public final String getClikurl(){
       return this.clikurl;
    }
    public final int getLayoutArea(){
       return this.layoutArea;
    }
    public final int getLayoutOrder(){
       return this.layoutOrder;
    }
    public final String getLogParams(){
       return this.logParams;
    }
    public final String getPendantMainPartImageUrl(){
       return this.pendantMainPartImageUrl;
    }
    public final String getViewKey(){
       return this.viewKey;
    }
    public final String getWillTransitionNextRoomImageUrl(){
       return this.willTransitionNextRoomImageUrl;
    }
    public int hashCode(){
       PendantConfig obj = PatchProxy.apply(null, this, PendantConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bundle;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PendantConfig tviewKey = this.viewKey;
       int i2 = (tviewKey != null)? tviewKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tviewKey = this.bizId;
       i2 = (tviewKey != null)? tviewKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tviewKey = this.activityId;
       i2 = (tviewKey != null)? tviewKey.hashCode(): 0;
       i1 = (((((((((i1 + i2) * 31) + this.bizPriority) * 31) + this.layoutOrder) * 31) + this.arrangeMode) * 31) + this.layoutArea) * 31;
       tviewKey = this.pendantMainPartImageUrl;
       i2 = (tviewKey != null)? tviewKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tviewKey = this.willTransitionNextRoomImageUrl;
       i2 = (tviewKey != null)? tviewKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tviewKey = this.logParams;
       i2 = (tviewKey != null)? tviewKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tviewKey = this.clikurl;
       if (tviewKey != null) {
          i = tviewKey.hashCode();
       }
       return (i1 + i);
    }
    public final void setClikurl(String p0){
       this.clikurl = p0;
    }
    public final void setLogParams(String p0){
       this.logParams = p0;
    }
    public final void setPendantMainPartImageUrl(String p0){
       this.pendantMainPartImageUrl = p0;
    }
    public final void setWillTransitionNextRoomImageUrl(String p0){
       this.willTransitionNextRoomImageUrl = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PendantConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendantConfig\(bundle="+this.bundle+", viewKey="+this.viewKey+", bizId="+this.bizId+", activityId="+this.activityId+", bizPriority="+this.bizPriority+", layoutOrder="+this.layoutOrder+", arrangeMode="+this.arrangeMode+", layoutArea="+this.layoutArea+", pendantMainPartImageUrl="+this.pendantMainPartImageUrl+", willTransitionNextRoomImageUrl="+this.willTransitionNextRoomImageUrl+", logParams="+this.logParams+", clikurl="+this.clikurl+"\)";
    }
}
