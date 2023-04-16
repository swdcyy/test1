package com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CPopupModel;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CPopupModel$a;
import nsd.u;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthC2CPopupModel implements Serializable	// class@0013d4
{
    public final String popupType;
    public final String tkBundleId;
    public final JsonObject tkData;
    public final int tkMinVer;
    public static final GrowthC2CPopupModel$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthC2CPopupModel.Companion = new GrowthC2CPopupModel$a(null);
    }
    public void GrowthC2CPopupModel(){
       super(null, 0, null, null, 15, null);
    }
    public void GrowthC2CPopupModel(String p0,int p1,String p2,JsonObject p3){
       a.p(p3, "tkData");
       super();
       this.tkBundleId = p0;
       this.tkMinVer = p1;
       this.popupType = p2;
       this.tkData = p3;
    }
    public void GrowthC2CPopupModel(String p0,int p1,String p2,JsonObject p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = null;
       }
       if (p4 & 0x02) {
          p1 = -1;
       }
       if (p4 & 0x04) {
          p2 = null;
       }
       if (p4 & 0x08) {
          p3 = new JsonObject();
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static GrowthC2CPopupModel copy$default(GrowthC2CPopupModel p0,String p1,int p2,String p3,JsonObject p4,int p5,Object p6){
       GrowthC2CPopupModel tkBundleId;
       GrowthC2CPopupModel tkMinVer;
       GrowthC2CPopupModel popupType;
       GrowthC2CPopupModel tkData;
       if (p5 & 0x01) {
          tkBundleId = p0.tkBundleId;
       }
       if (p5 & 0x02) {
          tkMinVer = p0.tkMinVer;
       }
       if (p5 & 0x04) {
          popupType = p0.popupType;
       }
       if (p5 & 0x08) {
          tkData = p0.tkData;
       }
       return p0.copy(tkBundleId, tkMinVer, popupType, tkData);
    }
    public final String component1(){
       return this.tkBundleId;
    }
    public final int component2(){
       return this.tkMinVer;
    }
    public final String component3(){
       return this.popupType;
    }
    public final JsonObject component4(){
       return this.tkData;
    }
    public final GrowthC2CPopupModel copy(String p0,int p1,String p2,JsonObject p3){
       if (PatchProxy.isSupport(GrowthC2CPopupModel.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, GrowthC2CPopupModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p3, "tkData");
       return new GrowthC2CPopupModel(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthC2CPopupModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthC2CPopupModel && (a.g(this.tkBundleId, p0.tkBundleId) && (this.tkMinVer == p0.tkMinVer && (a.g(this.popupType, p0.popupType) && a.g(this.tkData, p0.tkData)))))) {
          return true;
       }
       return false;
    }
    public final String getPopupType(){
       return this.popupType;
    }
    public final String getTkBundleId(){
       return this.tkBundleId;
    }
    public final JsonObject getTkData(){
       return this.tkData;
    }
    public final int getTkMinVer(){
       return this.tkMinVer;
    }
    public int hashCode(){
       GrowthC2CPopupModel obj = PatchProxy.apply(null, this, GrowthC2CPopupModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.tkBundleId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.tkMinVer) * 31;
       GrowthC2CPopupModel tpopupType = this.popupType;
       int i2 = (tpopupType != null)? tpopupType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpopupType = this.tkData;
       if (tpopupType != null) {
          i = tpopupType.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthC2CPopupModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthC2CPopupModel\(tkBundleId="+this.tkBundleId+", tkMinVer="+this.tkMinVer+", popupType="+this.popupType+", tkData="+this.tkData+"\)";
    }
}
