package com.kwai.feature.api.pendant.activity.model.SuspensionModel;
import java.io.Serializable;
import com.kwai.feature.api.pendant.activity.model.SuspensionModel$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import com.kwai.feature.api.pendant.activity.model.InitialPosition;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SuspensionModel implements Serializable	// class@00102f
{
    public final int animationCirculateTimes;
    public final int animationFramePMs;
    public final int animationIntervalSeconds;
    public final String animationResourceURL;
    public final int clickXMarkPolicy;
    public final boolean dragToAdsorption;
    public final boolean fix;
    public final boolean hasXMark;
    public final List iconCdnUrls;
    public final String iconUrl;
    public final int slideXToAds;
    public final InitialPosition widgetInitialPosition;
    public static final SuspensionModel$a Companion;
    public static final long serialVersionUID;

    static {
       SuspensionModel.Companion = new SuspensionModel$a(null);
    }
    public void SuspensionModel(){
       super(false, null, null, null, 0, 0, 0, false, false, 0, null, 0, 4095, null);
    }
    public void SuspensionModel(boolean p0){
       super(p0, null, null, null, 0, 0, 0, false, false, 0, null, 0, 4094, null);
    }
    public void SuspensionModel(boolean p0,String p1){
       super(p0, p1, null, null, 0, 0, 0, false, false, 0, null, 0, 4092, null);
    }
    public void SuspensionModel(boolean p0,String p1,List p2){
       super(p0, p1, p2, null, 0, 0, 0, false, false, 0, null, 0, 4088, null);
    }
    public void SuspensionModel(boolean p0,String p1,List p2,String p3){
       super(p0, p1, p2, p3, 0, 0, 0, false, false, 0, null, 0, 4080, null);
    }
    public void SuspensionModel(boolean p0,String p1,List p2,String p3,int p4){
       super(p0, p1, p2, p3, p4, 0, 0, false, false, 0, null, 0, 4064, null);
    }
    public void SuspensionModel(boolean p0,String p1,List p2,String p3,int p4,int p5){
       super(p0, p1, p2, p3, p4, p5, 0, false, false, 0, null, 0, 4032, null);
    }
    public void SuspensionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6){
       super(p0, p1, p2, p3, p4, p5, p6, false, false, 0, null, 0, 3968, null);
    }
    public void SuspensionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7){
       super(p0, p1, p2, p3, p4, p5, p6, p7, false, 0, null, 0, 3840, null);
    }
    public void SuspensionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7,boolean p8){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, 0, null, 0, 3584, null);
    }
    public void SuspensionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7,boolean p8,int p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, null, 0, 3072, null);
    }
    public void SuspensionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7,boolean p8,int p9,InitialPosition p10){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, 0, 2048, null);
    }
    public void SuspensionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7,boolean p8,int p9,InitialPosition p10,int p11){
       a.p(p3, "animationResourceURL");
       super();
       this.hasXMark = p0;
       this.iconUrl = p1;
       this.iconCdnUrls = p2;
       this.animationResourceURL = p3;
       this.animationFramePMs = p4;
       this.animationIntervalSeconds = p5;
       this.animationCirculateTimes = p6;
       this.fix = p7;
       this.dragToAdsorption = p8;
       this.clickXMarkPolicy = p9;
       this.widgetInitialPosition = p10;
       this.slideXToAds = p11;
    }
    public void SuspensionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7,boolean p8,int p9,InitialPosition p10,int p11,int p12,u p13){
       int i = p12;
       int i1 = 1;
       int i2 = (i & 0x01)? 1: p0;
       int i3 = (i & 0x02)? 0: p1;
       List list = (i & 0x04)? CollectionsKt__CollectionsKt.E(): p2;
       String str = (i & 0x08)? "": p3;
       int i4 = 0;
       int i5 = (i & 0x10)? 0: p4;
       int i6 = (i & 0x20)? 5: p5;
       int i7 = (i & 0x40)? -1: p6;
       int i8 = (i & 0x0080)? 1: p7;
       if (!(i & 0x0100)) {
          i1 = p8;
       }
       int i9 = (i & 0x0200)? 2: p9;
       InitialPosition initialPosit = (i & 0x0400)? new InitialPosition(i4, i4, 3, null): p10;
       if (!(i & 0x0800)) {
          i4 = p11;
       }
       super(i2, i3, list, str, i5, i6, i7, i8, i1, i9, initialPosit, i4);
       return;
    }
    public static SuspensionModel copy$default(SuspensionModel p0,boolean p1,String p2,List p3,String p4,int p5,int p6,int p7,boolean p8,boolean p9,int p10,InitialPosition p11,int p12,int p13,Object p14){
       SuspensionModel suspensionMo = p0;
       int i = p13;
       SuspensionModel hasXMark = (i & 0x01)? suspensionMo.hasXMark: p1;
       SuspensionModel iconUrl = (i & 0x02)? suspensionMo.iconUrl: p2;
       SuspensionModel iconCdnUrls = (i & 0x04)? suspensionMo.iconCdnUrls: p3;
       SuspensionModel animationRes = (i & 0x08)? suspensionMo.animationResourceURL: p4;
       SuspensionModel animationFra = (i & 0x10)? suspensionMo.animationFramePMs: p5;
       SuspensionModel animationInt = (i & 0x20)? suspensionMo.animationIntervalSeconds: p6;
       SuspensionModel animationCir = (i & 0x40)? suspensionMo.animationCirculateTimes: p7;
       SuspensionModel fix = (i & 0x0080)? suspensionMo.fix: p8;
       SuspensionModel dragToAdsorp = (i & 0x0100)? suspensionMo.dragToAdsorption: p9;
       SuspensionModel clickXMarkPo = (i & 0x0200)? suspensionMo.clickXMarkPolicy: p10;
       SuspensionModel widgetInitia = (i & 0x0400)? suspensionMo.widgetInitialPosition: p11;
       SuspensionModel slideXToAds = (i & 0x0800)? suspensionMo.slideXToAds: p12;
       return p0.copy(hasXMark, iconUrl, iconCdnUrls, animationRes, animationFra, animationInt, animationCir, fix, dragToAdsorp, clickXMarkPo, widgetInitia, slideXToAds);
    }
    public final boolean component1(){
       return this.hasXMark;
    }
    public final int component10(){
       return this.clickXMarkPolicy;
    }
    public final InitialPosition component11(){
       return this.widgetInitialPosition;
    }
    public final int component12(){
       return this.slideXToAds;
    }
    public final String component2(){
       return this.iconUrl;
    }
    public final List component3(){
       return this.iconCdnUrls;
    }
    public final String component4(){
       return this.animationResourceURL;
    }
    public final int component5(){
       return this.animationFramePMs;
    }
    public final int component6(){
       return this.animationIntervalSeconds;
    }
    public final int component7(){
       return this.animationCirculateTimes;
    }
    public final boolean component8(){
       return this.fix;
    }
    public final boolean component9(){
       return this.dragToAdsorption;
    }
    public final SuspensionModel copy(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7,boolean p8,int p9,InitialPosition p10,int p11){
       SuspensionModel obj;
       object oobject = p3;
       if (PatchProxy.isSupport(SuspensionModel.class)) {
          Object[] objArray = new Object[12];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = oobject;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = p10;
          objArray[11] = Integer.valueOf(p11);
          obj = PatchProxy.apply(objArray, this, SuspensionModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "animationResourceURL");
       obj = new SuspensionModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
       return v14;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SuspensionModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SuspensionModel && (this.hasXMark == p0.hasXMark && (a.g(this.iconUrl, p0.iconUrl) && (a.g(this.iconCdnUrls, p0.iconCdnUrls) && (a.g(this.animationResourceURL, p0.animationResourceURL) && (this.animationFramePMs == p0.animationFramePMs && (this.animationIntervalSeconds == p0.animationIntervalSeconds && (this.animationCirculateTimes == p0.animationCirculateTimes && (this.fix == p0.fix && (this.dragToAdsorption == p0.dragToAdsorption && (this.clickXMarkPolicy == p0.clickXMarkPolicy && (a.g(this.widgetInitialPosition, p0.widgetInitialPosition) && this.slideXToAds == p0.slideXToAds))))))))))))) {
          return true;
       }
       return false;
    }
    public final int getAnimationCirculateTimes(){
       return this.animationCirculateTimes;
    }
    public final int getAnimationFramePMs(){
       return this.animationFramePMs;
    }
    public final int getAnimationIntervalSeconds(){
       return this.animationIntervalSeconds;
    }
    public final String getAnimationResourceURL(){
       return this.animationResourceURL;
    }
    public final int getClickXMarkPolicy(){
       return this.clickXMarkPolicy;
    }
    public final boolean getDragToAdsorption(){
       return this.dragToAdsorption;
    }
    public final boolean getFix(){
       return this.fix;
    }
    public final boolean getHasXMark(){
       return this.hasXMark;
    }
    public final List getIconCdnUrls(){
       return this.iconCdnUrls;
    }
    public final String getIconUrl(){
       return this.iconUrl;
    }
    public final int getSlideXToAds(){
       return this.slideXToAds;
    }
    public final InitialPosition getWidgetInitialPosition(){
       return this.widgetInitialPosition;
    }
    public int hashCode(){
       int i1;
       SuspensionModel twidgetIniti;
       SuspensionModel obj = PatchProxy.apply(null, this, SuspensionModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.hasXMark;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       SuspensionModel ticonUrl = this.iconUrl;
       int i2 = 0;
       int i3 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       ticonUrl = this.iconCdnUrls;
       i3 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       ticonUrl = this.animationResourceURL;
       i3 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (((((((i1 + i3) * 31) + this.animationFramePMs) * 31) + this.animationIntervalSeconds) * 31) + this.animationCirculateTimes) * 31;
       ticonUrl = this.fix;
       if (ticonUrl != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       ticonUrl = this.dragToAdsorption;
       if (ticonUrl == null) {
          twidgetIniti = ticonUrl;
       }
       i1 = (((i1 + i) * 31) + this.clickXMarkPolicy) * 31;
       twidgetIniti = this.widgetInitialPosition;
       if (twidgetIniti != null) {
          i2 = twidgetIniti.hashCode();
       }
       return (((i1 + i2) * 31) + this.slideXToAds);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SuspensionModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SuspensionModel\(hasXMark="+this.hasXMark+", iconUrl="+this.iconUrl+", iconCdnUrls="+this.iconCdnUrls+", animationResourceURL="+this.animationResourceURL+", animationFramePMs="+this.animationFramePMs+", animationIntervalSeconds="+this.animationIntervalSeconds+", animationCirculateTimes="+this.animationCirculateTimes+", fix="+this.fix+", dragToAdsorption="+this.dragToAdsorption+", clickXMarkPolicy="+this.clickXMarkPolicy+", widgetInitialPosition="+this.widgetInitialPosition+", slideXToAds="+this.slideXToAds+"\)";
    }
}
