package com.yxcorp.gifshow.camerasdk.stability.StabilityType$1;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import qi9.q1;
import q87.c;
import java.lang.StringBuilder;
import lnc.s6;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;
import pkd.a;
import java.lang.IllegalStateException;
import java.lang.Boolean;

public final class StabilityType$1 extends StabilityType	// class@001047
{
    public boolean mDisableByBeauty;
    public boolean mDisableByBody;
    public boolean mDisableByFrontCamera;
    public boolean mDisableByLowlightBoost;
    public boolean mDisableByMagic;
    public boolean mDisableByMakeup;
    public boolean mDisableByWide;

    public void StabilityType$1(String p0,int p1){
       super(p0, p1, null);
       this.mDisableByFrontCamera = false;
       this.mDisableByMagic = false;
       this.mDisableByWide = false;
       this.mDisableByBody = false;
       this.mDisableByBeauty = false;
       this.mDisableByMakeup = false;
       this.mDisableByLowlightBoost = false;
    }
    public int getClickToastResId(){
       Object obj = PatchProxy.apply(null, this, StabilityType$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.mDisableByFrontCamera != null) {
          return 0x7f104ed9;
       }
       if (this.mDisableByLowlightBoost != null) {
          return 0x7f104edb;
       }
       if (this.mDisableByMagic != null) {
          int i = (StabilityType.enableMagicFaceRename())? 0x7f104edd: 0x7f104edc;
          return i;
       }else if(this.mDisableByWide != null){
          return 0x7f104ede;
       }else if(this.mDisableByBody != null){
          return 0x7f104ed8;
       }else if(this.mDisableByBeauty != null){
          return 0x7f104ed7;
       }else if(this.mDisableByMakeup != null){
          return 0x7f104eda;
       }else {
          Object[] objArray = new Object[0];
          q1.C().t("StabilityType", "wrong disable type", objArray);
          return -1;
       }
    }
    public String getDisableReason(){
       String str1;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, StabilityType$1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDisableByFrontCamera != null) {
          objArray = "disableByFrontCamera";
       }
       String str = "";
       if (this.mDisableByLowlightBoost != null) {
          obj = "";
          str1 = (objArray == null)? str: "+";
          str1 = obj+str1+"disableByLowlightBoost";
       }
       if (this.mDisableByMagic != null) {
          obj = "";
          str1 = (str1 == null)? str: "+";
          str1 = obj+str1+"disableByMagic";
       }
       if (this.mDisableByWide != null) {
          obj = "";
          str1 = (str1 == null)? str: "+";
          str1 = obj+str1+"disableByWide";
       }
       if (this.mDisableByBody != null) {
          obj = "";
          str1 = (str1 == null)? str: "+";
          str1 = obj+str1+"disableByBodySlimming";
       }
       if (this.mDisableByBeauty != null) {
          obj = "";
          str1 = (str1 == null)? str: "+";
          str1 = obj+str1+"disableByBeauty";
       }
       if (this.mDisableByMakeup != null) {
          obj = "";
          if (str1 != null) {
             str = "+";
          }
          str1 = obj+str+"disableByMakeup";
       }
       return str1;
    }
    public int getLabelImageResId(){
       Object obj = PatchProxy.apply(null, this, StabilityType$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (s6.m())? 0x7f081bea: 0x7f081bdc;
       return i;
    }
    public String getStrForLog(){
       return "forbid";
    }
    public boolean isDisabled(){
       return true;
    }
    public boolean isValidWithConfig(CameraUnitConfig p0){
       return false;
    }
    public StabilityType move(){
       Object obj = PatchProxy.apply(null, this, StabilityType$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a) {
          throw new IllegalStateException("Disabled cannot move");
       }
       Object[] objArray = new Object[0];
       q1.C().t("StabilityType", "Disabled should not move", objArray);
       return StabilityType.OFF;
    }
    public void reset(){
       this.mDisableByMakeup = false;
       this.mDisableByBeauty = false;
       this.mDisableByBody = false;
       this.mDisableByFrontCamera = false;
       this.mDisableByMagic = false;
       this.mDisableByWide = false;
       this.mDisableByLowlightBoost = false;
    }
    public void setDisableByBeauty(boolean p0){
       StabilityType$1 u1 = StabilityType$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, u1, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("StabilityType", "disabled for beauty "+p0, objArray);
       this.mDisableByBeauty = p0;
       return;
    }
    public void setDisableByBody(boolean p0){
       StabilityType$1 u1 = StabilityType$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, u1, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("StabilityType", "disabled for body "+p0, objArray);
       this.mDisableByBody = p0;
       return;
    }
    public void setDisableByFrontCamera(boolean p0){
       StabilityType$1 u1 = StabilityType$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, u1, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("StabilityType", "disabled for camera "+p0, objArray);
       this.mDisableByFrontCamera = p0;
       return;
    }
    public void setDisableByLowlightBoost(boolean p0){
       StabilityType$1 u1 = StabilityType$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, u1, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("StabilityType", "disabled for lowlight boost  "+p0, objArray);
       this.mDisableByLowlightBoost = p0;
       return;
    }
    public void setDisableByMagic(boolean p0){
       StabilityType$1 u1 = StabilityType$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, u1, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("StabilityType", "disabled for magic "+p0, objArray);
       this.mDisableByMagic = p0;
       return;
    }
    public void setDisableByMakeup(boolean p0){
       StabilityType$1 u1 = StabilityType$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, u1, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("StabilityType", "disabled for makeup "+p0, objArray);
       this.mDisableByMakeup = p0;
       return;
    }
    public void setDisableByWide(boolean p0){
       StabilityType$1 u1 = StabilityType$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, u1, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("StabilityType", "disabled for wide "+p0, objArray);
       this.mDisableByWide = p0;
       return;
    }
}
