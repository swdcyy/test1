package com.kuaishou.live.basic.ability.LiveHttpAbility$Params;
import com.kuaishou.live.basic.ability.LiveHttpAbility$Params$Companion;
import nsd.u;
import java.lang.String;
import java.lang.Long;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;
import kotlin.Pair;
import qrd.r0;
import trd.t0;

public final class LiveHttpAbility$Params	// class@000c64
{
    public final Long delayMs;
    public Map param;
    public final String path;
    public final Long timeoutMs;
    public static final LiveHttpAbility$Params$Companion Companion;

    static {
       LiveHttpAbility$Params.Companion = new LiveHttpAbility$Params$Companion(null);
    }
    public void LiveHttpAbility$Params(String p0,Long p1,Long p2,Map p3){
       super();
       this.path = p0;
       this.delayMs = p1;
       this.timeoutMs = p2;
       this.param = p3;
    }
    public static LiveHttpAbility$Params copy$default(LiveHttpAbility$Params p0,String p1,Long p2,Long p3,Map p4,int p5,Object p6){
       LiveHttpAbility$Params path;
       LiveHttpAbility$Params delayMs;
       LiveHttpAbility$Params timeoutMs;
       LiveHttpAbility$Params param;
       if (p5 & 0x01) {
          path = p0.path;
       }
       if (p5 & 0x02) {
          delayMs = p0.delayMs;
       }
       if (p5 & 0x04) {
          timeoutMs = p0.timeoutMs;
       }
       if (p5 & 0x08) {
          param = p0.param;
       }
       return p0.copy(path, delayMs, timeoutMs, param);
    }
    public final String component1(){
       return this.path;
    }
    public final Long component2(){
       return this.delayMs;
    }
    public final Long component3(){
       return this.timeoutMs;
    }
    public final Map component4(){
       return this.param;
    }
    public final LiveHttpAbility$Params copy(String p0,Long p1,Long p2,Map p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveHttpAbility$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveHttpAbility$Params(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveHttpAbility$Params.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveHttpAbility$Params && (a.g(this.path, p0.path) && (a.g(this.delayMs, p0.delayMs) && (a.g(this.timeoutMs, p0.timeoutMs) && a.g(this.param, p0.param)))))) {
          return true;
       }
       return false;
    }
    public final Long getDelayMs(){
       return this.delayMs;
    }
    public final Map getParam(){
       return this.param;
    }
    public final String getPath(){
       return this.path;
    }
    public final Long getTimeoutMs(){
       return this.timeoutMs;
    }
    public int hashCode(){
       LiveHttpAbility$Params obj = PatchProxy.apply(null, this, LiveHttpAbility$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.path;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveHttpAbility$Params tdelayMs = this.delayMs;
       int i2 = (tdelayMs != null)? tdelayMs.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdelayMs = this.timeoutMs;
       i2 = (tdelayMs != null)? tdelayMs.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdelayMs = this.param;
       if (tdelayMs != null) {
          i = tdelayMs.hashCode();
       }
       return (i1 + i);
    }
    public final void setParam(Map p0){
       this.param = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveHttpAbility$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(path="+this.path+", delayMs="+this.delayMs+", timeoutMs="+this.timeoutMs+", param="+this.param+"\)";
    }
    public final void tryFillLiveStreamId(String p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHttpAbility$Params.class, "1")) {
          return;
       }
       a.p(p0, "liveStreamId");
       LiveHttpAbility$Params tparam = this.param;
       if (tparam == null) {
          Pair[] pairArray = new Pair[]{r0.a("liveStreamId", p0)};
          this.param = t0.j0(pairArray);
       }else if(tparam != null){
          obj = tparam.get("liveStreamId");
       }else {
          obj = null;
       }
       if (obj == null) {
          tparam = this.param;
          if (tparam != null) {
             tparam.put("liveStreamId", p0);
          }
       }
       return;
    }
}
