package com.kuaishou.live.common.core.component.multipk.model.LiveMultiPkStartPkInfo;
import java.io.Serializable;
import java.util.List;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.common.core.component.multipk.model.LiveMultiPkCohesionInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveMultiPkStartPkInfo implements Serializable	// class@00164d
{
    public LiveMultiPkCohesionInfo cohesionInfo;
    public boolean isReopenMultiPk;
    public final Integer pkMode;
    public final int playType;
    public String reopenMultiPkId;
    public final List teams;

    public void LiveMultiPkStartPkInfo(int p0,List p1,Integer p2,boolean p3,String p4,LiveMultiPkCohesionInfo p5){
       a.p(p1, "teams");
       super();
       this.playType = p0;
       this.teams = p1;
       this.pkMode = p2;
       this.isReopenMultiPk = p3;
       this.reopenMultiPkId = p4;
       this.cohesionInfo = p5;
    }
    public void LiveMultiPkStartPkInfo(int p0,List p1,Integer p2,boolean p3,String p4,LiveMultiPkCohesionInfo p5,int p6,u p7){
       int i = 0;
       Integer integer = (p6 & 0x04)? Integer.valueOf(i): p2;
       boolean b = (p6 & 0x08)? false: p3;
       String str = (p6 & 0x10)? null: p4;
       LiveMultiPkCohesionInfo liveMultiPkC = (p6 & 0x20)? null: p5;
       super(p0, p1, integer, b, str, liveMultiPkC);
       return;
    }
    public static LiveMultiPkStartPkInfo copy$default(LiveMultiPkStartPkInfo p0,int p1,List p2,Integer p3,boolean p4,String p5,LiveMultiPkCohesionInfo p6,int p7,Object p8){
       LiveMultiPkStartPkInfo playType;
       LiveMultiPkStartPkInfo teams;
       LiveMultiPkStartPkInfo pkMode;
       LiveMultiPkStartPkInfo isReopenMult;
       LiveMultiPkStartPkInfo reopenMultiP;
       LiveMultiPkStartPkInfo cohesionInfo;
       if (p7 & 0x01) {
          playType = p0.playType;
       }
       if (p7 & 0x02) {
          teams = p0.teams;
       }
       p8 = teams;
       if (p7 & 0x04) {
          pkMode = p0.pkMode;
       }
       LiveMultiPkStartPkInfo liveMultiPkS = pkMode;
       if (p7 & 0x08) {
          isReopenMult = p0.isReopenMultiPk;
       }
       LiveMultiPkStartPkInfo liveMultiPkS1 = isReopenMult;
       if (p7 & 0x10) {
          reopenMultiP = p0.reopenMultiPkId;
       }
       LiveMultiPkStartPkInfo liveMultiPkS2 = reopenMultiP;
       if (p7 & 0x20) {
          cohesionInfo = p0.cohesionInfo;
       }
       return p0.copy(playType, p8, liveMultiPkS, liveMultiPkS1, liveMultiPkS2, cohesionInfo);
    }
    public final int component1(){
       return this.playType;
    }
    public final List component2(){
       return this.teams;
    }
    public final Integer component3(){
       return this.pkMode;
    }
    public final boolean component4(){
       return this.isReopenMultiPk;
    }
    public final String component5(){
       return this.reopenMultiPkId;
    }
    public final LiveMultiPkCohesionInfo component6(){
       return this.cohesionInfo;
    }
    public final LiveMultiPkStartPkInfo copy(int p0,List p1,Integer p2,boolean p3,String p4,LiveMultiPkCohesionInfo p5){
       Object obj;
       if (PatchProxy.isSupport(LiveMultiPkStartPkInfo.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Boolean.valueOf(p3),p4,p5};
          obj = PatchProxy.apply(objArray, this, LiveMultiPkStartPkInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "teams");
       LiveMultiPkStartPkInfo liveMultiPkS = new LiveMultiPkStartPkInfo(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkStartPkInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiPkStartPkInfo && (this.playType == p0.playType && (a.g(this.teams, p0.teams) && (a.g(this.pkMode, p0.pkMode) && (this.isReopenMultiPk == p0.isReopenMultiPk && (a.g(this.reopenMultiPkId, p0.reopenMultiPkId) && a.g(this.cohesionInfo, p0.cohesionInfo)))))))) {
          return true;
       }
       return false;
    }
    public final LiveMultiPkCohesionInfo getCohesionInfo(){
       return this.cohesionInfo;
    }
    public final Integer getPkMode(){
       return this.pkMode;
    }
    public final int getPlayType(){
       return this.playType;
    }
    public final String getReopenMultiPkId(){
       return this.reopenMultiPkId;
    }
    public final List getTeams(){
       return this.teams;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkStartPkInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.playType * 31;
       LiveMultiPkStartPkInfo tteams = this.teams;
       int i1 = 0;
       int i2 = (tteams != null)? tteams.hashCode(): 0;
       i = (i + i2) * 31;
       tteams = this.pkMode;
       i2 = (tteams != null)? tteams.hashCode(): 0;
       i = (i + i2) * 31;
       tteams = this.isReopenMultiPk;
       if (tteams != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       tteams = this.reopenMultiPkId;
       i2 = (tteams != null)? tteams.hashCode(): 0;
       i = (i + i2) * 31;
       tteams = this.cohesionInfo;
       if (tteams != null) {
          i1 = tteams.hashCode();
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
       Object obj = PatchProxy.apply(null, this, LiveMultiPkStartPkInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkStartPkInfo\(playType="+this.playType+", teams="+this.teams+", pkMode="+this.pkMode+", isReopenMultiPk="+this.isReopenMultiPk+", reopenMultiPkId="+this.reopenMultiPkId+", cohesionInfo="+this.cohesionInfo+"\)";
    }
}
