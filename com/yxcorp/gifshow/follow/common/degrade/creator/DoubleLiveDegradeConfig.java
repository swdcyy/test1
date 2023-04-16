package com.yxcorp.gifshow.follow.common.degrade.creator.DoubleLiveDegradeConfig;
import java.io.Serializable;
import java.util.Map;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DoubleLiveDegradeConfig implements Serializable	// class@001040
{
    public final int degradeMaxScore;
    public final Map degradeScores;

    public void DoubleLiveDegradeConfig(){
       super(0, null, 3, null);
    }
    public void DoubleLiveDegradeConfig(int p0,Map p1){
       super();
       this.degradeMaxScore = p0;
       this.degradeScores = p1;
    }
    public void DoubleLiveDegradeConfig(int p0,Map p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = Integer.MAX_VALUE;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static DoubleLiveDegradeConfig copy$default(DoubleLiveDegradeConfig p0,int p1,Map p2,int p3,Object p4){
       DoubleLiveDegradeConfig degradeMaxSc;
       DoubleLiveDegradeConfig degradeScore;
       if (p3 & 0x01) {
          degradeMaxSc = p0.degradeMaxScore;
       }
       if (p3 & 0x02) {
          degradeScore = p0.degradeScores;
       }
       return p0.copy(degradeMaxSc, degradeScore);
    }
    public final int component1(){
       return this.degradeMaxScore;
    }
    public final Map component2(){
       return this.degradeScores;
    }
    public final DoubleLiveDegradeConfig copy(int p0,Map p1){
       if (PatchProxy.isSupport(DoubleLiveDegradeConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, DoubleLiveDegradeConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new DoubleLiveDegradeConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DoubleLiveDegradeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DoubleLiveDegradeConfig && (this.degradeMaxScore == p0.degradeMaxScore && a.g(this.degradeScores, p0.degradeScores)))) {
          return true;
       }
       return false;
    }
    public final int getDegradeMaxScore(){
       return this.degradeMaxScore;
    }
    public final Map getDegradeScores(){
       return this.degradeScores;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, DoubleLiveDegradeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.degradeMaxScore * 31;
       DoubleLiveDegradeConfig tdegradeScor = this.degradeScores;
       int i1 = (tdegradeScor != null)? tdegradeScor.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DoubleLiveDegradeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DoubleLiveDegradeConfig\(degradeMaxScore="+this.degradeMaxScore+", degradeScores="+this.degradeScores+"\)";
    }
}
