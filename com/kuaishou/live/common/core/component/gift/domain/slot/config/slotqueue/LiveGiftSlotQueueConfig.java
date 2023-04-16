package com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig$a;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig$SlotMsgTrimStrategy;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveGiftSlotQueueConfig	// class@001261
{
    public final int a;
    public final LiveGiftSlotQueueConfig$SlotMsgTrimStrategy b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public static final LiveGiftSlotQueueConfig$a h;

    static {
       LiveGiftSlotQueueConfig.h = new LiveGiftSlotQueueConfig$a(null);
    }
    public void LiveGiftSlotQueueConfig(){
       super(0, null, 0, 0, 0, 0, 0, 127, null);
    }
    public void LiveGiftSlotQueueConfig(int p0,LiveGiftSlotQueueConfig$SlotMsgTrimStrategy p1,int p2,int p3,int p4,int p5,int p6,int p7,u p8){
       if (p7 & 0x01) {
          p0 = 100;
       }
       if (p7 & 0x02) {
          p1 = LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.DELETE;
       }
       if (p7 & 0x04) {
          p2 = 0x2710;
       }
       if (p7 & 0x08) {
          p3 = 3000;
       }
       if (p7 & 0x10) {
          p4 = 5;
       }
       if (p7 & 0x20) {
          p5 = 100;
       }
       if (p7 & 0x40) {
          p6 = 10;
       }
       a.p(p1, "slotMsgTrimStrategy");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       return;
    }
    public final int a(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftSlotQueueConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveGiftSlotQueueConfig && (this.a == p0.a && (a.g(this.b, p0.b) && (this.c == p0.c && (this.d == p0.d && (this.e == p0.e && (this.f == p0.f && this.g == p0.g)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveGiftSlotQueueConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a * 31;
       LiveGiftSlotQueueConfig tb = this.b;
       int i1 = (tb != null)? tb.hashCode(): 0;
       return (((((((((((i + i1) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftSlotQueueConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftSlotQueueConfig\(maxComboMsgListSize="+this.a+", slotMsgTrimStrategy="+this.b+", slotMsgWarningSize="+this.c+", slotMsgHealthySize="+this.d+", trimDelMinLeftComboListSize="+this.e+", trimSampleGap="+this.f+", trimSampleTargetListSize="+this.g+"\)";
    }
}
