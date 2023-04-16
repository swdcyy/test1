package com.kwai.feature.api.pendant.activity.model.AdsorptionModel;
import java.io.Serializable;
import com.kwai.feature.api.pendant.activity.model.AdsorptionModel$a;
import nsd.u;
import java.lang.String;
import java.util.List;
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

public final class AdsorptionModel implements Serializable	// class@00102b
{
    public final int animationCirculateTimes;
    public final int animationFramePMs;
    public final int animationIntervalSeconds;
    public final String animationResourceURL;
    public final boolean clickUnfold;
    public final boolean fix;
    public final boolean hasXMark;
    public final List iconCdnUrls;
    public final String iconUrl;
    public static final AdsorptionModel$a Companion;
    public static final long serialVersionUID;

    static {
       AdsorptionModel.Companion = new AdsorptionModel$a(null);
    }
    public void AdsorptionModel(){
       super(false, null, null, null, 0, 0, 0, false, false, 511, null);
    }
    public void AdsorptionModel(boolean p0){
       super(p0, null, null, null, 0, 0, 0, false, false, 510, null);
    }
    public void AdsorptionModel(boolean p0,String p1){
       super(p0, p1, null, null, 0, 0, 0, false, false, 508, null);
    }
    public void AdsorptionModel(boolean p0,String p1,List p2){
       super(p0, p1, p2, null, 0, 0, 0, false, false, 504, null);
    }
    public void AdsorptionModel(boolean p0,String p1,List p2,String p3){
       super(p0, p1, p2, p3, 0, 0, 0, false, false, 496, null);
    }
    public void AdsorptionModel(boolean p0,String p1,List p2,String p3,int p4){
       super(p0, p1, p2, p3, p4, 0, 0, false, false, 480, null);
    }
    public void AdsorptionModel(boolean p0,String p1,List p2,String p3,int p4,int p5){
       super(p0, p1, p2, p3, p4, p5, 0, false, false, 448, null);
    }
    public void AdsorptionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6){
       super(p0, p1, p2, p3, p4, p5, p6, false, false, 384, null);
    }
    public void AdsorptionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7){
       super(p0, p1, p2, p3, p4, p5, p6, p7, false, 256, null);
    }
    public void AdsorptionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7,boolean p8){
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
       this.clickUnfold = p8;
    }
    public void AdsorptionModel(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7,boolean p8,int p9,u p10){
       int i = p9;
       int i1 = 1;
       int i2 = (i & 0x01)? 1: p0;
       int i3 = (i & 0x02)? 0: p1;
       List list = (i & 0x04)? CollectionsKt__CollectionsKt.E(): p2;
       String str = (i & 0x08)? "": p3;
       int i4 = 0;
       int i5 = (i & 0x10)? 0: p4;
       int i6 = (i & 0x20)? 0: p5;
       int i7 = (i & 0x40)? -1: p6;
       if (!(i & 0x0080)) {
          i1 = p7;
       }
       if (!(i & 0x0100)) {
          i4 = p8;
       }
       super(i2, i3, list, str, i5, i6, i7, i1, i4);
       return;
    }
    public static AdsorptionModel copy$default(AdsorptionModel p0,boolean p1,String p2,List p3,String p4,int p5,int p6,int p7,boolean p8,boolean p9,int p10,Object p11){
       AdsorptionModel uAdsorptionM = p0;
       int i = p10;
       AdsorptionModel hasXMark = (i & 0x01)? uAdsorptionM.hasXMark: p1;
       AdsorptionModel iconUrl = (i & 0x02)? uAdsorptionM.iconUrl: p2;
       AdsorptionModel iconCdnUrls = (i & 0x04)? uAdsorptionM.iconCdnUrls: p3;
       AdsorptionModel animationRes = (i & 0x08)? uAdsorptionM.animationResourceURL: p4;
       AdsorptionModel animationFra = (i & 0x10)? uAdsorptionM.animationFramePMs: p5;
       AdsorptionModel animationInt = (i & 0x20)? uAdsorptionM.animationIntervalSeconds: p6;
       AdsorptionModel animationCir = (i & 0x40)? uAdsorptionM.animationCirculateTimes: p7;
       AdsorptionModel fix = (i & 0x0080)? uAdsorptionM.fix: p8;
       AdsorptionModel clickUnfold = (i & 0x0100)? uAdsorptionM.clickUnfold: p9;
       return p0.copy(hasXMark, iconUrl, iconCdnUrls, animationRes, animationFra, animationInt, animationCir, fix, clickUnfold);
    }
    public final boolean component1(){
       return this.hasXMark;
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
       return this.clickUnfold;
    }
    public final AdsorptionModel copy(boolean p0,String p1,List p2,String p3,int p4,int p5,int p6,boolean p7,boolean p8){
       AdsorptionModel obj;
       object oobject = p3;
       if (PatchProxy.isSupport(AdsorptionModel.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = oobject;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          obj = PatchProxy.apply(objArray, this, AdsorptionModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "animationResourceURL");
       obj = new AdsorptionModel(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v11;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdsorptionModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AdsorptionModel && (this.hasXMark == p0.hasXMark && (a.g(this.iconUrl, p0.iconUrl) && (a.g(this.iconCdnUrls, p0.iconCdnUrls) && (a.g(this.animationResourceURL, p0.animationResourceURL) && (this.animationFramePMs == p0.animationFramePMs && (this.animationIntervalSeconds == p0.animationIntervalSeconds && (this.animationCirculateTimes == p0.animationCirculateTimes && (this.fix == p0.fix && this.clickUnfold == p0.clickUnfold)))))))))) {
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
    public final boolean getClickUnfold(){
       return this.clickUnfold;
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
    public int hashCode(){
       int i1;
       AdsorptionModel obj = PatchProxy.apply(null, this, AdsorptionModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.hasXMark;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       AdsorptionModel ticonUrl = this.iconUrl;
       int i2 = 0;
       int i3 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       ticonUrl = this.iconCdnUrls;
       i3 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       ticonUrl = this.animationResourceURL;
       if (ticonUrl != null) {
          i2 = ticonUrl.hashCode();
       }
       i1 = (((((((i1 + i2) * 31) + this.animationFramePMs) * 31) + this.animationIntervalSeconds) * 31) + this.animationCirculateTimes) * 31;
       ticonUrl = this.fix;
       if (ticonUrl != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       ticonUrl = this.clickUnfold;
       if (ticonUrl == null) {
          i = ticonUrl;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AdsorptionModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AdsorptionModel\(hasXMark="+this.hasXMark+", iconUrl="+this.iconUrl+", iconCdnUrls="+this.iconCdnUrls+", animationResourceURL="+this.animationResourceURL+", animationFramePMs="+this.animationFramePMs+", animationIntervalSeconds="+this.animationIntervalSeconds+", animationCirculateTimes="+this.animationCirculateTimes+", fix="+this.fix+", clickUnfold="+this.clickUnfold+"\)";
    }
}
