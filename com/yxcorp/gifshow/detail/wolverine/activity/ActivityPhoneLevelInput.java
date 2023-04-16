package com.yxcorp.gifshow.detail.wolverine.activity.ActivityPhoneLevelInput;
import java.io.Serializable;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ActivityPhoneLevelInput implements Serializable	// class@001a8e
{
    public final long deviceRamTotalSize;
    public final boolean isActivityLowPhone;
    public final boolean isArm32Apk;
    public final boolean isArm32LowPhone;
    public final boolean isLowPhone;
    public final long lowPhoneRamTotalSizeLimit;
    public final int phoneLevelQuantile;

    public void ActivityPhoneLevelInput(boolean p0,boolean p1,boolean p2,boolean p3,int p4,long p5,long p6){
       super();
       this.isLowPhone = p0;
       this.isActivityLowPhone = p1;
       this.isArm32LowPhone = p2;
       this.isArm32Apk = p3;
       this.phoneLevelQuantile = p4;
       this.lowPhoneRamTotalSizeLimit = p5;
       this.deviceRamTotalSize = p6;
    }
    public static ActivityPhoneLevelInput copy$default(ActivityPhoneLevelInput p0,boolean p1,boolean p2,boolean p3,boolean p4,int p5,long p6,long p7,int p8,Object p9){
       ActivityPhoneLevelInput uActivityPho = p0;
       ActivityPhoneLevelInput isLowPhone = (p8 & 0x01)? uActivityPho.isLowPhone: p1;
       ActivityPhoneLevelInput isActivityLo = (p8 & 0x02)? uActivityPho.isActivityLowPhone: p2;
       ActivityPhoneLevelInput isArm32LowPh = (p8 & 0x04)? uActivityPho.isArm32LowPhone: p3;
       ActivityPhoneLevelInput isArm32Apk = (p8 & 0x08)? uActivityPho.isArm32Apk: p4;
       ActivityPhoneLevelInput phoneLevelQu = (p8 & 0x10)? uActivityPho.phoneLevelQuantile: p5;
       ActivityPhoneLevelInput lowPhoneRamT = (p8 & 0x20)? uActivityPho.lowPhoneRamTotalSizeLimit: p6;
       ActivityPhoneLevelInput deviceRamTot = (p8 & 0x40)? uActivityPho.deviceRamTotalSize: p7;
       return p0.copy(isLowPhone, isActivityLo, isArm32LowPh, isArm32Apk, phoneLevelQu, lowPhoneRamT, deviceRamTot);
    }
    public final boolean activityLowPhoneResult(){
       boolean b = (this.isActivityLowPhone == null && (this.isLowPhone != null || (this.isArm32LowPhone == null || (this.isArm32Apk != null || this.deviceRamTotalSize - this.lowPhoneRamTotalSizeLimit <= 0))))? true: false;
       return b;
    }
    public final Pair activityLowPhoneResultWrapper(){
       Pair obj = PatchProxy.apply(null, this, ActivityPhoneLevelInput.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isActivityLowPhone != null) {
          obj = new Pair(Boolean.TRUE, "isSwitchLowPhone");
       }else if(this.isLowPhone != null){
          obj = new Pair(Boolean.TRUE, "isLowPhoneBelowQuantile");
       }else if(this.isArm32LowPhone != null && this.isArm32Apk != null){
          obj = new Pair(Boolean.TRUE, "isArm32LowPhone");
       }else if(this.deviceRamTotalSize - this.lowPhoneRamTotalSizeLimit <= 0){
          obj = new Pair(Boolean.TRUE, "deviceRamTotalSize");
       }else {
          obj = new Pair(Boolean.FALSE, "");
       }
       return obj;
    }
    public final boolean component1(){
       return this.isLowPhone;
    }
    public final boolean component2(){
       return this.isActivityLowPhone;
    }
    public final boolean component3(){
       return this.isArm32LowPhone;
    }
    public final boolean component4(){
       return this.isArm32Apk;
    }
    public final int component5(){
       return this.phoneLevelQuantile;
    }
    public final long component6(){
       return this.lowPhoneRamTotalSizeLimit;
    }
    public final long component7(){
       return this.deviceRamTotalSize;
    }
    public final ActivityPhoneLevelInput copy(boolean p0,boolean p1,boolean p2,boolean p3,int p4,long p5,long p6){
       Object obj;
       if (PatchProxy.isSupport(ActivityPhoneLevelInput.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Boolean.valueOf(p1),Boolean.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5),Long.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, ActivityPhoneLevelInput.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       ActivityPhoneLevelInput uActivityPho = new ActivityPhoneLevelInput(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ActivityPhoneLevelInput && (this.isLowPhone == p0.isLowPhone && (this.isActivityLowPhone == p0.isActivityLowPhone && (this.isArm32LowPhone == p0.isArm32LowPhone && (this.isArm32Apk == p0.isArm32Apk && (this.phoneLevelQuantile == p0.phoneLevelQuantile && (!this.lowPhoneRamTotalSizeLimit - p0.lowPhoneRamTotalSizeLimit && !this.deviceRamTotalSize - p0.deviceRamTotalSize)))))))) {
          return true;
       }
       return false;
    }
    public final long getDeviceRamTotalSize(){
       return this.deviceRamTotalSize;
    }
    public final long getLowPhoneRamTotalSizeLimit(){
       return this.lowPhoneRamTotalSizeLimit;
    }
    public final int getPhoneLevelQuantile(){
       return this.phoneLevelQuantile;
    }
    public int hashCode(){
       int i1;
       int i2;
       ActivityPhoneLevelInput tlowPhoneRam;
       ActivityPhoneLevelInput obj = PatchProxy.apply(null, this, ActivityPhoneLevelInput.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.isLowPhone;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       ActivityPhoneLevelInput tisActivityL = this.isActivityLowPhone;
       if (tisActivityL != null) {
          tisActivityL = 1;
       }
       i1 = (i1 + tisActivityL) * 31;
       tisActivityL = this.isArm32LowPhone;
       if (tisActivityL != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tisActivityL = this.isArm32Apk;
       if (tisActivityL == null) {
          tlowPhoneRam = tisActivityL;
       }
       tlowPhoneRam = this.lowPhoneRamTotalSizeLimit;
       tlowPhoneRam = this.deviceRamTotalSize;
       return (((((((i1 + i) * 31) + this.phoneLevelQuantile) * 31) + (int)(tlowPhoneRam ^ (tlowPhoneRam >> 32))) * 31) + (int)(tlowPhoneRam ^ (tlowPhoneRam >> 32)));
    }
    public final boolean isActivityLowPhone(){
       return this.isActivityLowPhone;
    }
    public final boolean isArm32Apk(){
       return this.isArm32Apk;
    }
    public final boolean isArm32LowPhone(){
       return this.isArm32LowPhone;
    }
    public final boolean isLowPhone(){
       return this.isLowPhone;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ActivityPhoneLevelInput.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ActivityPhoneLevelInput\(isLowPhone="+this.isLowPhone+", isActivityLowPhone="+this.isActivityLowPhone+", isArm32LowPhone="+this.isArm32LowPhone+", isArm32Apk="+this.isArm32Apk+", phoneLevelQuantile="+this.phoneLevelQuantile+", lowPhoneRamTotalSizeLimit="+this.lowPhoneRamTotalSizeLimit+", deviceRamTotalSize="+this.deviceRamTotalSize+"\)";
    }
}
