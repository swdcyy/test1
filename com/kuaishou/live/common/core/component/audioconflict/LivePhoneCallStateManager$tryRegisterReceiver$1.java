package com.kuaishou.live.common.core.component.audioconflict.LivePhoneCallStateManager$tryRegisterReceiver$1;
import android.content.BroadcastReceiver;
import qb1.b;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.telephony.TelephonyManager;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import qb1.b$b;

public final class LivePhoneCallStateManager$tryRegisterReceiver$1 extends BroadcastReceiver	// class@000f5c
{
    public final b a;

    public void LivePhoneCallStateManager$tryRegisterReceiver$1(b p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       LivePhoneCallStateManager$tryRegisterReceiver$1 ta;
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePhoneCallStateManager$tryRegisterReceiver$1.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "intent");
       p0 = p0.getSystemService("phone");
       Objects.requireNonNull(p0, "null cannot be cast to non-null type android.telephony.TelephonyManager");
       LiveLogTag pLAYER = LiveLogTag.PLAYER;
       pLAYER.appendTag("LivePhoneCallStateManager");
       LiveLogTag liveLogTag = pLAYER;
       b.U(liveLogTag, "onReceive state change", "new state", Integer.valueOf(p0.getCallState()), "isCallState", Boolean.valueOf(this.a.b), "phoneCallListeners.size", Integer.valueOf(this.a.c.size()));
       int callState = p0.getCallState();
       Object[] objArray = null;
       if (callState) {
          if (callState == 1 || callState == 2) {
             ta = this.a;
             if (ta.b == null) {
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(objArray, ta, b.class, "5")) {
                   iterator = ta.c.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().a();
                   }
                }
                ta.b = true;
             }
          }
       }else {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, b.class, "6")) {
             iterator = ta.c.iterator();
             while (iterator.hasNext()) {
                iterator.next().b();
             }
          }
          ta.b = false;
       }
       return;
    }
}
