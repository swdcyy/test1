package com.kwai.library.wolverine.entity.WolverinePerformance;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class WolverinePerformance implements Serializable	// class@000ac0
{
    public final int biz;
    public WolverinePerformanceLevelInterface currentLevel;
    public Integer currentScore;
    public WolverinePerformanceLevelInterface lastLevel;
    public Integer lastScore;
    public final String lastSessionId;
    public final String sessionId;
    public final List typePerformance;

    public void WolverinePerformance(int p0,String p1,String p2,List p3){
       a.p(p1, "sessionId");
       a.p(p3, "typePerformance");
       super();
       this.biz = p0;
       this.sessionId = p1;
       this.lastSessionId = p2;
       this.typePerformance = p3;
    }
    public static WolverinePerformance copy$default(WolverinePerformance p0,int p1,String p2,String p3,List p4,int p5,Object p6){
       WolverinePerformance biz;
       WolverinePerformance sessionId;
       WolverinePerformance lastSessionI;
       WolverinePerformance typePerforma;
       if (p5 & 0x01) {
          biz = p0.biz;
       }
       if (p5 & 0x02) {
          sessionId = p0.sessionId;
       }
       if (p5 & 0x04) {
          lastSessionI = p0.lastSessionId;
       }
       if (p5 & 0x08) {
          typePerforma = p0.typePerformance;
       }
       return p0.copy(biz, sessionId, lastSessionI, typePerforma);
    }
    public final int component1(){
       return this.biz;
    }
    public final String component2(){
       return this.sessionId;
    }
    public final String component3(){
       return this.lastSessionId;
    }
    public final List component4(){
       return this.typePerformance;
    }
    public final WolverinePerformance copy(int p0,String p1,String p2,List p3){
       a.p(p1, "sessionId");
       a.p(p3, "typePerformance");
       return new WolverinePerformance(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof WolverinePerformance && (this.biz == p0.biz && (a.g(this.sessionId, p0.sessionId) && (a.g(this.lastSessionId, p0.lastSessionId) && a.g(this.typePerformance, p0.typePerformance)))))) {
          return true;
       }
       return false;
    }
    public final int getBiz(){
       return this.biz;
    }
    public final WolverinePerformanceLevelInterface getCurrentLevel(){
       return this.currentLevel;
    }
    public final Integer getCurrentScore(){
       return this.currentScore;
    }
    public final WolverinePerformanceLevelInterface getLastLevel(){
       return this.lastLevel;
    }
    public final Integer getLastScore(){
       return this.lastScore;
    }
    public final String getLastSessionId(){
       return this.lastSessionId;
    }
    public final String getSessionId(){
       return this.sessionId;
    }
    public final List getTypePerformance(){
       return this.typePerformance;
    }
    public int hashCode(){
       int i = this.biz * 31;
       WolverinePerformance tsessionId = this.sessionId;
       int i1 = 0;
       int i2 = (tsessionId != null)? tsessionId.hashCode(): 0;
       i = (i + i2) * 31;
       tsessionId = this.lastSessionId;
       i2 = (tsessionId != null)? tsessionId.hashCode(): 0;
       i = (i + i2) * 31;
       tsessionId = this.typePerformance;
       if (tsessionId != null) {
          i1 = tsessionId.hashCode();
       }
       return (i + i1);
    }
    public final void setCurrentLevel(WolverinePerformanceLevelInterface p0){
       this.currentLevel = p0;
    }
    public final void setCurrentScore(Integer p0){
       this.currentScore = p0;
    }
    public final void setLastLevel(WolverinePerformanceLevelInterface p0){
       this.lastLevel = p0;
    }
    public final void setLastScore(Integer p0){
       this.lastScore = p0;
    }
    public String toString(){
       return "WolverinePerformance\(biz="+this.biz+", sessionId="+this.sessionId+", lastSessionId="+this.lastSessionId+", typePerformance="+this.typePerformance+"\)";
    }
}
