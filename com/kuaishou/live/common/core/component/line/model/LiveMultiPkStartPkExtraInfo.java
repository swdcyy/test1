package com.kuaishou.live.common.core.component.line.model.LiveMultiPkStartPkExtraInfo;
import java.io.Serializable;
import java.lang.String;
import com.kuaishou.live.common.core.component.multipk.model.LiveMultiPkCohesionInfo;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveMultiPkStartPkExtraInfo implements Serializable	// class@001490
{
    public LiveMultiPkCohesionInfo cohesionInfo;
    public boolean isReopenMultiPk;
    public String reopenMultiPkId;

    public void LiveMultiPkStartPkExtraInfo(boolean p0,String p1,LiveMultiPkCohesionInfo p2){
       super();
       this.isReopenMultiPk = p0;
       this.reopenMultiPkId = p1;
       this.cohesionInfo = p2;
    }
    public void LiveMultiPkStartPkExtraInfo(boolean p0,String p1,LiveMultiPkCohesionInfo p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = false;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static LiveMultiPkStartPkExtraInfo copy$default(LiveMultiPkStartPkExtraInfo p0,boolean p1,String p2,LiveMultiPkCohesionInfo p3,int p4,Object p5){
       LiveMultiPkStartPkExtraInfo isReopenMult;
       LiveMultiPkStartPkExtraInfo reopenMultiP;
       LiveMultiPkStartPkExtraInfo cohesionInfo;
       if (p4 & 0x01) {
          isReopenMult = p0.isReopenMultiPk;
       }
       if (p4 & 0x02) {
          reopenMultiP = p0.reopenMultiPkId;
       }
       if (p4 & 0x04) {
          cohesionInfo = p0.cohesionInfo;
       }
       return p0.copy(isReopenMult, reopenMultiP, cohesionInfo);
    }
    public final boolean component1(){
       return this.isReopenMultiPk;
    }
    public final String component2(){
       return this.reopenMultiPkId;
    }
    public final LiveMultiPkCohesionInfo component3(){
       return this.cohesionInfo;
    }
    public final LiveMultiPkStartPkExtraInfo copy(boolean p0,String p1,LiveMultiPkCohesionInfo p2){
       if (PatchProxy.isSupport(LiveMultiPkStartPkExtraInfo.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, LiveMultiPkStartPkExtraInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveMultiPkStartPkExtraInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkStartPkExtraInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiPkStartPkExtraInfo && (this.isReopenMultiPk == p0.isReopenMultiPk && (a.g(this.reopenMultiPkId, p0.reopenMultiPkId) && a.g(this.cohesionInfo, p0.cohesionInfo))))) {
          return true;
       }
       return false;
    }
    public final LiveMultiPkCohesionInfo getCohesionInfo(){
       return this.cohesionInfo;
    }
    public final String getReopenMultiPkId(){
       return this.reopenMultiPkId;
    }
    public int hashCode(){
       int i;
       LiveMultiPkStartPkExtraInfo obj = PatchProxy.apply(null, this, LiveMultiPkStartPkExtraInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.isReopenMultiPk;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       LiveMultiPkStartPkExtraInfo treopenMulti = this.reopenMultiPkId;
       int i1 = 0;
       int i2 = (treopenMulti != null)? treopenMulti.hashCode(): 0;
       i = (i + i2) * 31;
       treopenMulti = this.cohesionInfo;
       if (treopenMulti != null) {
          i1 = treopenMulti.hashCode();
       }
       return (i + i1);
    }
    public final boolean isReopenMultiPk(){
       return this.isReopenMultiPk;
    }
    public final void setCohesionInfo(LiveMultiPkCohesionInfo p0){
       this.cohesionInfo = p0;
    }
    public final void setReopenMultiPk(boolean p0){
       this.isReopenMultiPk = p0;
    }
    public final void setReopenMultiPkId(String p0){
       this.reopenMultiPkId = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkStartPkExtraInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkStartPkExtraInfo\(isReopenMultiPk="+this.isReopenMultiPk+", reopenMultiPkId="+this.reopenMultiPkId+", cohesionInfo="+this.cohesionInfo+"\)";
    }
}
