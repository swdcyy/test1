package com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import java.util.List;
import nsd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CTRPredictConfig	// class@000d4c
{
    public long activePostInferDelayMs;
    public final List allPageWhiteList;
    public boolean allowTriggerByHotLaunch;
    public boolean allowTriggerByWarmLaunch;
    public final boolean disableCancelIfLastInferenceRuning;
    public final List pageWhiteList;
    public List pages;
    public boolean predictByLaunch;
    public boolean recordPagePath;
    public final List reddotWhiteList;
    public long switchTimeMs;

    public void CTRPredictConfig(){
       super(0, null, null, null, null, false, 0, false, false, false, false, 2047, null);
    }
    public void CTRPredictConfig(long p0,List p1,List p2,List p3,List p4,boolean p5,long p6,boolean p7,boolean p8,boolean p9,boolean p10,int p11,u p12){
       int i = this;
       int i1 = p11;
       long l = (i1 & 0x01)? 5000: p0;
       List list = null;
       List list1 = (i1 & 0x02)? CollectionsKt__CollectionsKt.E(): list;
       List list2 = (i1 & 0x04)? CollectionsKt__CollectionsKt.E(): list;
       List list3 = (i1 & 0x08)? CollectionsKt__CollectionsKt.E(): list;
       if (i1 & 0x10) {
          list = CollectionsKt__CollectionsKt.E();
       }
       boolean b = false;
       boolean b1 = (i1 & 0x20)? false: p5;
       long l1 = (i1 & 0x40)? 0: p6;
       boolean b2 = (i1 & 0x0080)? false: p7;
       boolean b3 = (i1 & 0x0100)? false: p8;
       boolean b4 = (i1 & 0x0200)? false: p9;
       if (!(i1 & 0x0400)) {
          b = p10;
       }
       a.p(list1, "pages");
       a.p(list2, "pageWhiteList");
       a.p(list3, "reddotWhiteList");
       a.p(list, "allPageWhiteList");
       super();
       i.switchTimeMs = l;
       i.pages = list1;
       i.pageWhiteList = list2;
       i.reddotWhiteList = list3;
       i.allPageWhiteList = list;
       i.disableCancelIfLastInferenceRuning = b1;
       i.activePostInferDelayMs = l1;
       i.predictByLaunch = b2;
       i.recordPagePath = b3;
       i.allowTriggerByWarmLaunch = b4;
       i.allowTriggerByHotLaunch = b;
       return;
    }
    public final long a(){
       return this.activePostInferDelayMs;
    }
    public final List b(){
       return this.allPageWhiteList;
    }
    public final List c(){
       return this.pages;
    }
    public final boolean d(){
       return this.predictByLaunch;
    }
    public final long e(){
       return this.switchTimeMs;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CTRPredictConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CTRPredictConfig && (!this.switchTimeMs - p0.switchTimeMs && (a.g(this.pages, p0.pages) && (a.g(this.pageWhiteList, p0.pageWhiteList) && (a.g(this.reddotWhiteList, p0.reddotWhiteList) && (a.g(this.allPageWhiteList, p0.allPageWhiteList) && (this.disableCancelIfLastInferenceRuning == p0.disableCancelIfLastInferenceRuning && (!this.activePostInferDelayMs - p0.activePostInferDelayMs && (this.predictByLaunch == p0.predictByLaunch && (this.recordPagePath == p0.recordPagePath && (this.allowTriggerByWarmLaunch == p0.allowTriggerByWarmLaunch && this.allowTriggerByHotLaunch == p0.allowTriggerByHotLaunch)))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CTRPredictConfig obj = PatchProxy.apply(null, this, CTRPredictConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.switchTimeMs;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.pages;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.pageWhiteList;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.reddotWhiteList;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.allPageWhiteList;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       i = (i + i1) * 31;
       obj = this.disableCancelIfLastInferenceRuning;
       i1 = 1;
       if (obj != null) {
          i2 = 1;
       }
       CTRPredictConfig tactivePostI = this.activePostInferDelayMs;
       i = (((i + i2) * 31) + (int)(tactivePostI ^ (tactivePostI >> 32))) * 31;
       obj = this.predictByLaunch;
       if (obj != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       obj = this.recordPagePath;
       if (obj != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       obj = this.allowTriggerByWarmLaunch;
       if (obj != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       obj = this.allowTriggerByHotLaunch;
       if (obj == null) {
          CTRPredictConfig uCTRPredictC = obj;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CTRPredictConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CTRPredictConfig\(switchTimeMs="+this.switchTimeMs+", pages="+this.pages+", pageWhiteList="+this.pageWhiteList+", reddotWhiteList="+this.reddotWhiteList+", allPageWhiteList="+this.allPageWhiteList+", disableCancelIfLastInferenceRuning="+this.disableCancelIfLastInferenceRuning+", activePostInferDelayMs="+this.activePostInferDelayMs+", predictByLaunch="+this.predictByLaunch+", recordPagePath="+this.recordPagePath+", allowTriggerByWarmLaunch="+this.allowTriggerByWarmLaunch+", allowTriggerByHotLaunch="+this.allowTriggerByHotLaunch+"\)";
    }
}
