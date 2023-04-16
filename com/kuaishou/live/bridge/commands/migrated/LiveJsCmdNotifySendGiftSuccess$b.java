package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess$b;
import erd.g;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import e17.i;
import pp.a;
import q87.c;
import java.util.Objects;
import wkd.b;
import ad5.a;

public final class LiveJsCmdNotifySendGiftSuccess$b implements g	// class@000e18
{
    public final LiveJsCmdNotifySendGiftSuccess b;

    public void LiveJsCmdNotifySendGiftSuccess$b(LiveJsCmdNotifySendGiftSuccess p0){
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsCmdNotifySendGiftSuccess$b.class, "1")) {
          return;
       }
       p0 = a.a();
       a.o(p0, "AppEnv.get\(\)");
       if (p0.c()) {
          i.d(R.style.arg_RES_7f11066a, "刷新钱包并发消息");
          Object[] objArray = new Object[0];
          a.C().s("LiveJsNotifySendGiftSuccessCommand", "notifySendGiftSuccess#safeRun\(\), Refresh PaymentInfo and Send LiveSentGiftEvent", objArray);
       }
       p0 = this.b;
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, LiveJsCmdNotifySendGiftSuccess.class, "5")) {
          b.a(0x4c90014d).f();
       }
       return;
    }
}
