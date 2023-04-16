package com.yxcorp.gifshow.growth.kwaibubble.model.KemKwaiBubbleDialogModel;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kwaibubble.model.KemKwaiBubbleDialogModel$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.growth.kwaibubble.model.KemTKDialogModel;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KemKwaiBubbleDialogModel implements Serializable	// class@001420
{
    public final String activityId;
    public final String linkUrl;
    public int showType;
    public final KemTKDialogModel tkDialog;
    public final boolean useWebShow;
    public static final KemKwaiBubbleDialogModel$a Companion;
    public static final long serialVersionUID;

    static {
       KemKwaiBubbleDialogModel.Companion = new KemKwaiBubbleDialogModel$a(null);
    }
    public void KemKwaiBubbleDialogModel(){
       super(null, null, false, 0, null, 31, null);
    }
    public void KemKwaiBubbleDialogModel(String p0){
       super(p0, null, false, 0, null, 30, null);
    }
    public void KemKwaiBubbleDialogModel(String p0,String p1){
       super(p0, p1, false, 0, null, 28, null);
    }
    public void KemKwaiBubbleDialogModel(String p0,String p1,boolean p2){
       super(p0, p1, p2, 0, null, 24, null);
    }
    public void KemKwaiBubbleDialogModel(String p0,String p1,boolean p2,int p3){
       super(p0, p1, p2, p3, null, 16, null);
    }
    public void KemKwaiBubbleDialogModel(String p0,String p1,boolean p2,int p3,KemTKDialogModel p4){
       a.p(p0, "activityId");
       a.p(p1, "linkUrl");
       a.p(p4, "tkDialog");
       super();
       this.activityId = p0;
       this.linkUrl = p1;
       this.useWebShow = p2;
       this.showType = p3;
       this.tkDialog = p4;
    }
    public void KemKwaiBubbleDialogModel(String p0,String p1,boolean p2,int p3,KemTKDialogModel p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = "-1";
       }
       if (p5 & 0x02) {
          p1 = "";
       }
       String str = p1;
       int i = (p5 & 0x04)? 1: p2;
       int i1 = (p5 & 0x08)? 0: p3;
       KemTKDialogModel kemTKDialogM = (p5 & 0x10)? new KemTKDialogModel(null, null, null, 7, null): p4;
       super(p0, str, i, i1, kemTKDialogM);
       return;
    }
    public static KemKwaiBubbleDialogModel copy$default(KemKwaiBubbleDialogModel p0,String p1,String p2,boolean p3,int p4,KemTKDialogModel p5,int p6,Object p7){
       KemKwaiBubbleDialogModel activityId;
       KemKwaiBubbleDialogModel linkUrl;
       KemKwaiBubbleDialogModel useWebShow;
       KemKwaiBubbleDialogModel showType;
       KemKwaiBubbleDialogModel tkDialog;
       if (p6 & 0x01) {
          activityId = p0.activityId;
       }
       if (p6 & 0x02) {
          linkUrl = p0.linkUrl;
       }
       p7 = linkUrl;
       if (p6 & 0x04) {
          useWebShow = p0.useWebShow;
       }
       KemKwaiBubbleDialogModel kemKwaiBubbl = useWebShow;
       if (p6 & 0x08) {
          showType = p0.showType;
       }
       KemKwaiBubbleDialogModel kemKwaiBubbl1 = showType;
       if (p6 & 0x10) {
          tkDialog = p0.tkDialog;
       }
       return p0.copy(activityId, p7, kemKwaiBubbl, kemKwaiBubbl1, tkDialog);
    }
    public final String component1(){
       return this.activityId;
    }
    public final String component2(){
       return this.linkUrl;
    }
    public final boolean component3(){
       return this.useWebShow;
    }
    public final int component4(){
       return this.showType;
    }
    public final KemTKDialogModel component5(){
       return this.tkDialog;
    }
    public final KemKwaiBubbleDialogModel copy(String p0,String p1,boolean p2,int p3,KemTKDialogModel p4){
       Object obj;
       if (PatchProxy.isSupport(KemKwaiBubbleDialogModel.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, KemKwaiBubbleDialogModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activityId");
       a.p(p1, "linkUrl");
       a.p(p4, "tkDialog");
       KemKwaiBubbleDialogModel kemKwaiBubbl = new KemKwaiBubbleDialogModel(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KemKwaiBubbleDialogModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KemKwaiBubbleDialogModel && (a.g(this.activityId, p0.activityId) && (a.g(this.linkUrl, p0.linkUrl) && (this.useWebShow == p0.useWebShow && (this.showType == p0.showType && a.g(this.tkDialog, p0.tkDialog))))))) {
          return true;
       }
       return false;
    }
    public final String getActivityId(){
       return this.activityId;
    }
    public final String getLinkUrl(){
       return this.linkUrl;
    }
    public final int getShowType(){
       return this.showType;
    }
    public final KemTKDialogModel getTkDialog(){
       return this.tkDialog;
    }
    public final boolean getUseWebShow(){
       return this.useWebShow;
    }
    public int hashCode(){
       KemKwaiBubbleDialogModel obj = PatchProxy.apply(null, this, KemKwaiBubbleDialogModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.activityId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KemKwaiBubbleDialogModel tlinkUrl = this.linkUrl;
       int i2 = (tlinkUrl != null)? tlinkUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tlinkUrl = this.useWebShow;
       if (tlinkUrl != null) {
          i2 = 1;
       }
       i1 = (((i1 + i2) * 31) + this.showType) * 31;
       tlinkUrl = this.tkDialog;
       if (tlinkUrl != null) {
          i = tlinkUrl.hashCode();
       }
       return (i1 + i);
    }
    public final void setShowType(int p0){
       this.showType = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KemKwaiBubbleDialogModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KemKwaiBubbleDialogModel\(activityId="+this.activityId+", linkUrl="+this.linkUrl+", useWebShow="+this.useWebShow+", showType="+this.showType+", tkDialog="+this.tkDialog+"\)";
    }
}
