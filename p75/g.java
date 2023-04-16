package p75.g;
import com.kwai.chat.kwailink.g$a;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import android.os.SystemClock;
import java.lang.System;
import java.util.Set;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import o75.c0;
import u75.f;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import u75.c;
import java.lang.Runnable;

public class g extends g$a	// class@002175
{
    public static final Object a;
    public static long b;
    public static long c;
    public static String d;
    public static final Set e;

    static {
       g.a = new Object();
       g.e = new CopyOnWriteArraySet();
    }
    public void g(){
       super();
    }
    public void A0(long p0){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, g.class, "1")) {
          return;
       }
       Object a = g.a;
       _monitor_enter(a);
       a.e("ClientSelfCallback", "onUpdateTimeOffset, offset="+p0);
       g.c = SystemClock.elapsedRealtime();
       g.b = System.currentTimeMillis() + p0;
       _monitor_exit(a);
       return;
    }
    public void R0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       g.d = p0;
       Set e = g.e;
       if (!e.isEmpty() && !TextUtils.isEmpty(p0)) {
          Iterator iterator = e.iterator();
          while (iterator.hasNext()) {
             c0 uoc0 = iterator.next();
             a.e("ClientSelfCallback", "onPushTokenReady, listener="+uoc0+", linkPushToken="+p0);
             uoc0.onLinkPushToken(p0);
          }
       }
       return;
    }
    public void X(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, g.class, "7")) {
          return;
       }
       a.e("ClientSelfCallback", "onKConfUpdated, globalHash="+p0);
       String str = (f.e != null)? 1: null;
       if (str) {
          f uof1 = PatchProxy.apply(null, null, uof, "2");
          if (uof1 != PatchProxyResult.class) {
          }else if(f.e == null){
             _monitor_enter(uof);
             if (f.e == null) {
                f.e = new f();
             }
             _monitor_exit(uof);
          }
          uof1 = f.e;
          Objects.requireNonNull(uof1);
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), uof1, uof, "8")) {
             uof1.a().execute(new c(uof1, p0));
          }
       }
       return;
    }
}
