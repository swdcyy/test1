package com.kuaishou.live.bridge.commands.LiveJsCmdUpdateBarrage$a;
import java.lang.String;
import com.kuaishou.live.bridge.commands.LiveJsCmdUpdateBarrage$BarrageLikeData;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdUpdateBarrage$a	// class@000e04
{
    public final String barrageId;
    public final LiveJsCmdUpdateBarrage$BarrageLikeData barrageLikeData;
    public final int updateBarrageType;

    public final String a(){
       return this.barrageId;
    }
    public final LiveJsCmdUpdateBarrage$BarrageLikeData b(){
       return this.barrageLikeData;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdUpdateBarrage$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdUpdateBarrage$a && (a.g(this.barrageId, p0.barrageId) && (this.updateBarrageType == p0.updateBarrageType && a.g(this.barrageLikeData, p0.barrageLikeData))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdUpdateBarrage$a obj = PatchProxy.apply(null, this, LiveJsCmdUpdateBarrage$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.barrageId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.updateBarrageType) * 31;
       LiveJsCmdUpdateBarrage$a tbarrageLike = this.barrageLikeData;
       if (tbarrageLike != null) {
          i = tbarrageLike.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdUpdateBarrage$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(barrageId="+this.barrageId+", updateBarrageType="+this.updateBarrageType+", barrageLikeData="+this.barrageLikeData+"\)";
    }
}
