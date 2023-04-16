package com.kwai.edge.reco.afk.config.AFKDetectorConfig;
import com.kwai.edge.reco.afk.config.AFKDetectorConfig$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.util.Map;
import fj5.a;
import com.kwai.edge.reco.afk.config.AFKDetectorConfig$Companion$config$2;
import msd.a;
import qrd.p;
import qrd.s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import trd.t0;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.edge.reco.afk.config.AFKDetectorConfig$whiteActivityListString$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Long;
import java.lang.StringBuilder;

public final class AFKDetectorConfig	// class@000d2d
{
    public final p a;
    public boolean enable;
    public Map eventConfigs;
    public boolean inferResultReport;
    public long loopInferInternalMs;
    public String name;
    public List startInferInternalMsList;
    public List whiteActivityList;
    public static final AFKDetectorConfig b;
    public static final a c;
    public static final p d;
    public static final AFKDetectorConfig$a e;

    static {
       AFKDetectorConfig.e = new AFKDetectorConfig$a(null);
       AFKDetectorConfig uAFKDetector = new AFKDetectorConfig(null, false, null, null, 0, null, false, 127, null);
       AFKDetectorConfig.b = v0;
       a uoa = new a(false, 0, 0, null, 15, null);
       v0.enable = false;
       AFKDetectorConfig.c = v0;
       AFKDetectorConfig.d = s.c(AFKDetectorConfig$Companion$config$2.INSTANCE);
    }
    public void AFKDetectorConfig(){
       super(null, false, null, null, 0, null, false, 127, null);
    }
    public void AFKDetectorConfig(String p0,boolean p1,List p2,List p3,long p4,Map p5,boolean p6,int p7,u p8){
       Map map1;
       Map map2;
       Map map = null;
       p0 = (p7 & 0x01)? "local": map;
       if (p7 & 0x02) {
          p1 = false;
       }
       p3 = (p7 & 0x04)? CollectionsKt__CollectionsKt.E(): map;
       List list = (p7 & 0x08)? CollectionsKt__CollectionsKt.E(): map;
       if (p7 & 0x10) {
          p4 = 0x2710;
       }
       if (p7 & 0x20) {
          map = t0.z();
       }
       if (p7 & 0x40) {
          p6 = false;
       }
       a.p(p0, "name");
       a.p(p3, "whiteActivityList");
       a.p(list, "startInferInternalMsList");
       a.p(map, "eventConfigs");
       super();
       this.name = p0;
       this.enable = p1;
       this.whiteActivityList = p3;
       this.startInferInternalMsList = list;
       this.loopInferInternalMs = p4;
       this.eventConfigs = map;
       this.inferResultReport = p6;
       this.a = s.c(new AFKDetectorConfig$whiteActivityListString$2(this));
       return;
    }
    public final boolean a(){
       return this.enable;
    }
    public final a b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AFKDetectorConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "eventType");
       a uoa = this.eventConfigs.get(p0);
       if (uoa == null) {
          uoa = AFKDetectorConfig.c;
       }
       return uoa;
    }
    public final Object c(String p0,String p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AFKDetectorConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "eventType");
       a.p(p1, "extraParam");
       p0 = this.b(p0).extras.get(p1);
       if (!p0 instanceof Object) {
          p0 = null;
       }
       if (p0 != null) {
          p2 = p0;
       }
       return p2;
    }
    public final boolean d(){
       return this.inferResultReport;
    }
    public final long e(){
       return this.loopInferInternalMs;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AFKDetectorConfig.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AFKDetectorConfig && (a.g(this.name, p0.name) && (this.enable == p0.enable && (a.g(this.whiteActivityList, p0.whiteActivityList) && (a.g(this.startInferInternalMsList, p0.startInferInternalMsList) && (!this.loopInferInternalMs - p0.loopInferInternalMs && (a.g(this.eventConfigs, p0.eventConfigs) && this.inferResultReport == p0.inferResultReport)))))))) {
          return true;
       }
       return false;
    }
    public final String f(){
       return this.name;
    }
    public final List g(){
       return this.startInferInternalMsList;
    }
    public final List h(){
       return this.whiteActivityList;
    }
    public int hashCode(){
       AFKDetectorConfig obj = PatchProxy.apply(null, this, AFKDetectorConfig.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       AFKDetectorConfig tenable = this.enable;
       int i2 = 1;
       if (tenable != null) {
          tenable = 1;
       }
       i1 = (i1 + tenable) * 31;
       tenable = this.whiteActivityList;
       int i3 = (tenable != null)? tenable.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tenable = this.startInferInternalMsList;
       i3 = (tenable != null)? tenable.hashCode(): 0;
       AFKDetectorConfig tloopInferIn = this.loopInferInternalMs;
       i1 = (((i1 + i3) * 31) + (int)(tloopInferIn ^ (tloopInferIn >> 32))) * 31;
       tenable = this.eventConfigs;
       if (tenable != null) {
          i = tenable.hashCode();
       }
       i1 = (i1 + i) * 31;
       AFKDetectorConfig tinferResult = this.inferResultReport;
       if (tinferResult == null) {
          i2 = tinferResult;
       }
       return (i1 + i2);
    }
    public final String i(){
       Object obj = PatchProxy.apply(null, this, AFKDetectorConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final long j(long p0){
       AFKDetectorConfig uAFKDetector = AFKDetectorConfig.class;
       if (PatchProxy.isSupport(uAFKDetector)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAFKDetector, "5");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       int i = this.startInferInternalMsList.indexOf(Long.valueOf(p0));
       if (i < 0 || i >= (this.startInferInternalMsList.size() - 1)) {
          return this.loopInferInternalMs;
       }else {
          return (this.startInferInternalMsList.get((i + 1)).longValue() - p0);
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AFKDetectorConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AFKDetectorConfig\(name="+this.name+", enable="+this.enable+", whiteActivityList="+this.whiteActivityList+", startInferInternalMsList="+this.startInferInternalMsList+", loopInferInternalMs="+this.loopInferInternalMs+", eventConfigs="+this.eventConfigs+", inferResultReport="+this.inferResultReport+"\)";
    }
}
