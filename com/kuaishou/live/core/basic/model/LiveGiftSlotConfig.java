package com.kuaishou.live.core.basic.model.LiveGiftSlotConfig;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveGiftSlotConfig implements Serializable	// class@000872
{
    public final Boolean disableGiftSlot;

    public void LiveGiftSlotConfig(Boolean p0){
       super();
       this.disableGiftSlot = p0;
    }
    public static LiveGiftSlotConfig copy$default(LiveGiftSlotConfig p0,Boolean p1,int p2,Object p3){
       LiveGiftSlotConfig disableGiftS;
       if (p2 & 0x01) {
          disableGiftS = p0.disableGiftSlot;
       }
       return p0.copy(disableGiftS);
    }
    public final Boolean component1(){
       return this.disableGiftSlot;
    }
    public final LiveGiftSlotConfig copy(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftSlotConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftSlotConfig(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftSlotConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveGiftSlotConfig && a.g(this.disableGiftSlot, p0.disableGiftSlot))) {
          return true;
       }
       return false;
    }
    public final Boolean getDisableGiftSlot(){
       return this.disableGiftSlot;
    }
    public int hashCode(){
       LiveGiftSlotConfig obj = PatchProxy.apply(null, this, LiveGiftSlotConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.disableGiftSlot;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftSlotConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftSlotConfig\(disableGiftSlot="+this.disableGiftSlot+"\)";
    }
}
