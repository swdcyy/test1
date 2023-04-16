package com.kuaishou.live.core.show.statusbar.LiveBatteryStatusManager$1;
import android.content.BroadcastReceiver;
import dk2.a;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;
import java.lang.ref.WeakReference;
import dk2.a$a;

public class LiveBatteryStatusManager$1 extends BroadcastReceiver	// class@0010a4
{
    public final a a;

    public void LiveBatteryStatusManager$1(a p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBatteryStatusManager$1.class, "1")) {
          return;
       }
       LiveBatteryStatusManager$1 ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p1, ta, a.class, "3")) {
          a = ta.a;
          if (a == null) {
             ta.c();
          }else {
             Iterator iterator = a.iterator();
             float f = ta.a(p1);
             boolean b = ta.b(p1);
             while (iterator.hasNext()) {
                WeakReference weakReferenc = iterator.next();
                if (weakReferenc.get() != null) {
                   weakReferenc.get().a(f, b);
                }else {
                   iterator.remove();
                }
             }
             if (ta.a.isEmpty()) {
                ta.c();
             }
          }
       }
       ta.c = new Intent(p1);
       return;
    }
}
