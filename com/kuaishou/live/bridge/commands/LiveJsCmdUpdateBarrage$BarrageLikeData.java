package com.kuaishou.live.bridge.commands.LiveJsCmdUpdateBarrage$BarrageLikeData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdUpdateBarrage$BarrageLikeData	// class@000e03
{
    public final String displayLikeCount;
    public final long likeCount;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdUpdateBarrage$BarrageLikeData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdUpdateBarrage$BarrageLikeData && (!this.likeCount - p0.likeCount && a.g(this.displayLikeCount, p0.displayLikeCount)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdUpdateBarrage$BarrageLikeData obj = PatchProxy.apply(null, this, LiveJsCmdUpdateBarrage$BarrageLikeData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.likeCount;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.displayLikeCount;
       int i1 = (obj != null)? obj.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdUpdateBarrage$BarrageLikeData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BarrageLikeData\(likeCount="+this.likeCount+", displayLikeCount="+this.displayLikeCount+"\)";
    }
}
