package com.kuaishou.live.core.basic.model.LiveCarouselPendantInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveCarouselPendantInfo	// class@000866
{
    public final long interval;
    public final List liveCarousePedantItemList;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCarouselPendantInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveCarouselPendantInfo && (!this.interval - p0.interval && a.g(this.liveCarousePedantItemList, p0.liveCarousePedantItemList)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveCarouselPendantInfo obj = PatchProxy.apply(null, this, LiveCarouselPendantInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.interval;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.liveCarousePedantItemList;
       int i1 = (obj != null)? obj.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCarouselPendantInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCarouselPendantInfo\(interval="+this.interval+", liveCarousePedantItemList="+this.liveCarousePedantItemList+"\)";
    }
}
