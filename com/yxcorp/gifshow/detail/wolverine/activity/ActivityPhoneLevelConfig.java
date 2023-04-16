package com.yxcorp.gifshow.detail.wolverine.activity.ActivityPhoneLevelConfig;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ActivityPhoneLevelConfig implements Serializable	// class@001a8d
{
    public final boolean isArm32LowPhone;
    public final boolean isInLowPhoneList;
    public final long lowPhoneRamTotalSizeLimit;
    public final int phoneLevelQuantile;

    public void ActivityPhoneLevelConfig(){
       super(false, false, 0, 0, 15, null);
    }
    public void ActivityPhoneLevelConfig(boolean p0,boolean p1,int p2,long p3){
       super();
       this.isInLowPhoneList = p0;
       this.isArm32LowPhone = p1;
       this.phoneLevelQuantile = p2;
       this.lowPhoneRamTotalSizeLimit = p3;
    }
    public void ActivityPhoneLevelConfig(boolean p0,boolean p1,int p2,long p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = a.t().d("activity_dynamic_performance_islp_native", false);
       }
       if (p4 & 0x02) {
          p1 = a.t().d("activity_dynamic_performance_lp_arm_32_native", true);
       }
       boolean b = p1;
       if (p4 & 0x04) {
          p2 = a.t().a("activity_dynamic_performance_lp_quantile_native", 88);
       }
       int i = p2;
       if (p4 & 0x08) {
          p3 = a.t().b("activity_dynamic_performance_lp_ram_total_size_native", -1073741824);
       }
       super(p0, b, i, p3);
       return;
    }
    public static ActivityPhoneLevelConfig copy$default(ActivityPhoneLevelConfig p0,boolean p1,boolean p2,int p3,long p4,int p5,Object p6){
       ActivityPhoneLevelConfig isInLowPhone;
       ActivityPhoneLevelConfig isArm32LowPh;
       ActivityPhoneLevelConfig phoneLevelQu;
       ActivityPhoneLevelConfig lowPhoneRamT;
       if (p5 & 0x01) {
          isInLowPhone = p0.isInLowPhoneList;
       }
       if (p5 & 0x02) {
          isArm32LowPh = p0.isArm32LowPhone;
       }
       p6 = isArm32LowPh;
       if (p5 & 0x04) {
          phoneLevelQu = p0.phoneLevelQuantile;
       }
       ActivityPhoneLevelConfig uActivityPho = phoneLevelQu;
       if (p5 & 0x08) {
          lowPhoneRamT = p0.lowPhoneRamTotalSizeLimit;
       }
       return p0.copy(isInLowPhone, p6, uActivityPho, lowPhoneRamT);
    }
    public final boolean component1(){
       return this.isInLowPhoneList;
    }
    public final boolean component2(){
       return this.isArm32LowPhone;
    }
    public final int component3(){
       return this.phoneLevelQuantile;
    }
    public final long component4(){
       return this.lowPhoneRamTotalSizeLimit;
    }
    public final ActivityPhoneLevelConfig copy(boolean p0,boolean p1,int p2,long p3){
       Object obj;
       if (PatchProxy.isSupport(ActivityPhoneLevelConfig.class)) {
          obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), Long.valueOf(p3), this, ActivityPhoneLevelConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ActivityPhoneLevelConfig uActivityPho = new ActivityPhoneLevelConfig(p0, p1, p2, p3);
       return obj;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ActivityPhoneLevelConfig && (this.isInLowPhoneList == p0.isInLowPhoneList && (this.isArm32LowPhone == p0.isArm32LowPhone && (this.phoneLevelQuantile == p0.phoneLevelQuantile && !this.lowPhoneRamTotalSizeLimit - p0.lowPhoneRamTotalSizeLimit))))) {
          return true;
       }
       return false;
    }
    public final long getLowPhoneRamTotalSizeLimit(){
       return this.lowPhoneRamTotalSizeLimit;
    }
    public final int getPhoneLevelQuantile(){
       return this.phoneLevelQuantile;
    }
    public int hashCode(){
       int i1;
       ActivityPhoneLevelConfig tlowPhoneRam;
       ActivityPhoneLevelConfig obj = PatchProxy.apply(null, this, ActivityPhoneLevelConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.isInLowPhoneList;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       ActivityPhoneLevelConfig tisArm32LowP = this.isArm32LowPhone;
       if (tisArm32LowP == null) {
          tlowPhoneRam = tisArm32LowP;
       }
       tlowPhoneRam = this.lowPhoneRamTotalSizeLimit;
       return (((((i1 + i) * 31) + this.phoneLevelQuantile) * 31) + (int)(tlowPhoneRam ^ (tlowPhoneRam >> 32)));
    }
    public final boolean isArm32LowPhone(){
       return this.isArm32LowPhone;
    }
    public final boolean isInLowPhoneList(){
       return this.isInLowPhoneList;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ActivityPhoneLevelConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ActivityPhoneLevelConfig\(isInLowPhoneList="+this.isInLowPhoneList+", isArm32LowPhone="+this.isArm32LowPhone+", phoneLevelQuantile="+this.phoneLevelQuantile+", lowPhoneRamTotalSizeLimit="+this.lowPhoneRamTotalSizeLimit+"\)";
    }
}
