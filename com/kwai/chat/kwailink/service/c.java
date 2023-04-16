package com.kwai.chat.kwailink.service.c;
import java.lang.Runnable;
import java.lang.Object;
import android.os.SystemClock;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;
import com.kwai.chat.kwailink.base.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import n75.b;
import com.kwai.chat.kwailink.utils.PreloadResourceClearUtils;
import v75.d;
import com.kwai.chat.kwailink.service.a;
import com.kwai.chat.kwailink.adapter.KlinkAdapter;
import q75.b;
import com.kwai.chat.kwailink.receiver.AlarmReceiver;
import com.kwai.chat.kwailink.net.NetworkChangeReceiver;
import com.kwai.chat.kwailink.net.SignalStrengthsHandler;
import com.kwai.chat.kwailink.adapter.p;
import com.kwai.chat.kwailink.adapter.a;
import com.kwai.chat.kwailink.adapter.p$a;

public final class c implements Runnable	// class@000a6d
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       boolean b;
       long l = SystemClock.elapsedRealtime();
       a.g("KwaiLinkServiceInternal", "KwaiLinkService onCreate start, startTime="+l);
       Object[] objArray = null;
       if (b.i()) {
          b obj = PatchProxy.apply(objArray, objArray, b.class, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = b.b;
             b = (obj == null || obj.h != null)? true: false;
          }
          if (b) {
             PreloadResourceClearUtils.clearResources();
          }
       }
       d.b();
       a.N1().M1();
       if (!b.a()) {
          AlarmReceiver.a();
       }
       NetworkChangeReceiver.b();
       SignalStrengthsHandler.c();
       if (!PatchProxy.applyVoid(objArray, objArray, p.class, "3")) {
          p.b(a.a);
       }
       a.g("KwaiLinkServiceInternal", "KwaiLinkService onCreate end, cost="+(SystemClock.elapsedRealtime() - l)+"ms");
       return;
    }
}
