package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import uw1.f;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$a;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$b;
import erd.g;
import yh2.d;

public final class LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1 extends Lambda implements l	// class@000f58
{
    public final long $autoPopSecBeforeGrabTime;
    public final LiveRichCardCoreManager this$0;

    public void LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1(long p0,LiveRichCardCoreManager p1){
       this.$autoPopSecBeforeGrabTime = p0;
       this.this$0 = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.longValue());
       return l1.a;
    }
    public final void invoke(long p0){
       if (PatchProxy.isSupport2(LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Long.valueOf(p0), this, LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       if (p0 - this.$autoPopSecBeforeGrabTime <= 0) {
          LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1 tthis$0 = this.this$0;
          if (tthis$0.r == null) {
             tthis$0.r = true;
             LiveRichCardStateManager h = LiveRichCardStateManager.h;
             List list = h.f().appendTag(this.this$0.m());
             f uof = this.this$0.h();
             String str = (uof != null)? uof.a(): null;
             b.S(list, "[tryStartAutoGrabCountDown]", " 自动弹红包锚定id", str);
             this.this$0.x(true);
             this.this$0.t();
             this.this$0.A(new LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$a(this), new LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1$b(this), 139);
             b.P(h.f().appendTag(this.this$0.m()), "[tryStartAutoGrabCountDown] 自动弹窗");
          }
       }
       if (!p0 && this.this$0.h() != null) {
          this.this$0.D(true);
          d.a("开始自动抢");
       }
       PatchProxy.onMethodExit(LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1.class, "1");
       return;
    }
}
