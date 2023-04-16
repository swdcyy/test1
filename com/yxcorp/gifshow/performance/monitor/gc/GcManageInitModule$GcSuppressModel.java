package com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$GcSuppressModel;
import java.io.Serializable;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$GcSuppressModel$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class GcManageInitModule$GcSuppressModel implements Serializable	// class@000e73
{
    public int freeHeapThresholdMB;
    public long gcBlockMs;
    public int gcManagePlan;
    public double growFactor;
    public boolean isBizSupport;
    public boolean isEnabled;
    public ArrayList tarArr;
    public static final GcManageInitModule$GcSuppressModel$a Companion;
    public static final long serialVersionUID;

    static {
       GcManageInitModule$GcSuppressModel.Companion = new GcManageInitModule$GcSuppressModel$a(null);
    }
    public void GcManageInitModule$GcSuppressModel(){
       super(false, 0, 0, 0, false, 0, 63, null);
    }
    public void GcManageInitModule$GcSuppressModel(boolean p0,double p1,long p2,int p3,boolean p4,int p5){
       super();
       this.isEnabled = p0;
       this.growFactor = p1;
       this.gcBlockMs = p2;
       this.gcManagePlan = p3;
       this.isBizSupport = p4;
       this.freeHeapThresholdMB = p5;
       String[] stringArray = new String[]{"PhotoDetailActivity"};
       this.tarArr = CollectionsKt__CollectionsKt.r(stringArray);
    }
    public void GcManageInitModule$GcSuppressModel(boolean p0,double p1,long p2,int p3,boolean p4,int p5,int p6,u p7){
       int i = 0;
       int i1 = (p6 & 0x01)? 0: p0;
       int i2 = (p6 & 0x02)? 0x3ff0000000000000: p1;
       int i3 = (p6 & 0x04)? 2000: p2;
       int i4 = (p6 & 0x08)? 1: p3;
       if (!(p6 & 0x10)) {
          i = p4;
       }
       int i5 = (p6 & 0x20)? 20: p5;
       super(i1, i2, i3, i4, i, i5);
       return;
    }
    public static GcManageInitModule$GcSuppressModel copy$default(GcManageInitModule$GcSuppressModel p0,boolean p1,double p2,long p3,int p4,boolean p5,int p6,int p7,Object p8){
       GcManageInitModule$GcSuppressModel gcSuppressMo = p0;
       GcManageInitModule$GcSuppressModel isEnabled = (p7 & 0x01)? gcSuppressMo.isEnabled: p1;
       GcManageInitModule$GcSuppressModel growFactor = (p7 & 0x02)? gcSuppressMo.growFactor: p2;
       GcManageInitModule$GcSuppressModel gcBlockMs = (p7 & 0x04)? gcSuppressMo.gcBlockMs: p3;
       GcManageInitModule$GcSuppressModel gcManagePlan = (p7 & 0x08)? gcSuppressMo.gcManagePlan: p4;
       GcManageInitModule$GcSuppressModel isBizSupport = (p7 & 0x10)? gcSuppressMo.isBizSupport: p5;
       GcManageInitModule$GcSuppressModel freeHeapThre = (p7 & 0x20)? gcSuppressMo.freeHeapThresholdMB: p6;
       return p0.copy(isEnabled, growFactor, gcBlockMs, gcManagePlan, isBizSupport, freeHeapThre);
    }
    public final boolean component1(){
       return this.isEnabled;
    }
    public final double component2(){
       return this.growFactor;
    }
    public final long component3(){
       return this.gcBlockMs;
    }
    public final int component4(){
       return this.gcManagePlan;
    }
    public final boolean component5(){
       return this.isBizSupport;
    }
    public final int component6(){
       return this.freeHeapThresholdMB;
    }
    public final GcManageInitModule$GcSuppressModel copy(boolean p0,double p1,long p2,int p3,boolean p4,int p5){
       Object obj;
       if (PatchProxy.isSupport(GcManageInitModule$GcSuppressModel.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Double.valueOf(p1),Long.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4),Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, GcManageInitModule$GcSuppressModel.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       GcManageInitModule$GcSuppressModel gcSuppressMo = new GcManageInitModule$GcSuppressModel(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GcManageInitModule$GcSuppressModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GcManageInitModule$GcSuppressModel && (this.isEnabled == p0.isEnabled && (!Double.compare(this.growFactor, p0.growFactor) && (!this.gcBlockMs - p0.gcBlockMs && (this.gcManagePlan == p0.gcManagePlan && (this.isBizSupport == p0.isBizSupport && this.freeHeapThresholdMB == p0.freeHeapThresholdMB))))))) {
          return true;
       }
       return false;
    }
    public final int getFreeHeapThresholdMB(){
       return this.freeHeapThresholdMB;
    }
    public final long getGcBlockMs(){
       return this.gcBlockMs;
    }
    public final int getGcManagePlan(){
       return this.gcManagePlan;
    }
    public final double getGrowFactor(){
       return this.growFactor;
    }
    public final ArrayList getTarArr(){
       return this.tarArr;
    }
    public int hashCode(){
       int i1;
       GcManageInitModule$GcSuppressModel obj = PatchProxy.apply(null, this, GcManageInitModule$GcSuppressModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.isEnabled;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       long l = Double.doubleToLongBits(this.growFactor);
       GcManageInitModule$GcSuppressModel tgcBlockMs = this.gcBlockMs;
       i1 = ((((((i1 * 31) + (int)(l ^ (l >> 32))) * 31) + (int)(tgcBlockMs ^ (tgcBlockMs >> 32))) * 31) + this.gcManagePlan) * 31;
       tgcBlockMs = this.isBizSupport;
       if (tgcBlockMs == null) {
          i = tgcBlockMs;
       }
       return (((i1 + i) * 31) + this.freeHeapThresholdMB);
    }
    public final boolean isBizSupport(){
       return this.isBizSupport;
    }
    public final boolean isEnabled(){
       return this.isEnabled;
    }
    public final void setBizSupport(boolean p0){
       this.isBizSupport = p0;
    }
    public final void setEnabled(boolean p0){
       this.isEnabled = p0;
    }
    public final void setFreeHeapThresholdMB(int p0){
       this.freeHeapThresholdMB = p0;
    }
    public final void setGcBlockMs(long p0){
       this.gcBlockMs = p0;
    }
    public final void setGcManagePlan(int p0){
       this.gcManagePlan = p0;
    }
    public final void setGrowFactor(double p0){
       this.growFactor = p0;
    }
    public final void setTarArr(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcManageInitModule$GcSuppressModel.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.tarArr = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GcManageInitModule$GcSuppressModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GcSuppressModel\(isEnabled="+this.isEnabled+", growFactor="+this.growFactor+", gcBlockMs="+this.gcBlockMs+", gcManagePlan="+this.gcManagePlan+", isBizSupport="+this.isBizSupport+", freeHeapThresholdMB="+this.freeHeapThresholdMB+"\)";
    }
}
