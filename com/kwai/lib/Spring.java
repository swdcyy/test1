package com.kwai.lib.Spring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.kwai.lib.Spring$screenListener$1;
import com.kwai.lib.Spring$callbackReceiver$1;
import java.lang.Object;
import android.content.Context;
import com.kwai.lib.BaseSpringDialogFragment;
import java.lang.String;
import java.lang.Class;
import msd.l;
import kotlin.jvm.internal.a;
import kotlin.Result;
import android.content.IntentFilter;
import qrd.l1;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import q2.a;
import java.util.Objects;
import android.os.PowerManager;
import android.app.KeyguardManager;
import java.util.Map;
import fv6.f;
import fv6.c;
import com.kwai.lib.a;
import fv6.b;
import android.os.Handler;
import android.os.Looper;
import fv6.g;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import com.kwai.lib.Spring$pendingDisplayFragment$1$3$1;
import java.util.List;
import java.lang.Boolean;
import java.lang.Throwable;
import qrd.j0;

public final class Spring	// class@000813
{
    public static final Spring a;
    public static boolean b;
    public static List c;
    public static final Map d;
    public static BaseSpringDialogFragment e;
    public static final BroadcastReceiver f;
    public static final Spring$callbackReceiver$1 g;

    static {
       Spring.a = new Spring();
       Spring.c = new ArrayList();
       Spring.d = new LinkedHashMap();
       Spring.f = new Spring$screenListener$1();
       Spring.g = new Spring$callbackReceiver$1();
    }
    public void Spring(){
       super();
    }
    public static final void c(Context p0,BaseSpringDialogFragment p1,String p2,Class p3,l p4){
       Spring a;
       Intent intent;
       boolean b1;
       List c;
       a.p(p0, "context");
       a.p(p1, "fragment");
       a.p(p2, "tag");
       a.p(p3, "activityClass");
       boolean b = true;
       if (!Spring.b) {
          IntentFilter intentFilter = new IntentFilter();
          intentFilter.addAction("android.intent.action.SCREEN_ON");
          intentFilter.addAction("android.intent.action.SCREEN_OFF");
          intentFilter.addAction("android.intent.action.USER_PRESENT");
          UniversalReceiver.e(p0, Spring.f, intentFilter);
          a.b(p0).c(Spring.g, new IntentFilter("com.android.push.spring.dialog.SHOWN"));
          Spring.b = b;
       }
       a = Spring.a;
       Objects.requireNonNull(a);
       Spring$pendingDisplayFragment$1$3$1 systemServic = p0.getSystemService("power");
       Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.os.PowerManager");
       if (systemServic.isScreenOn()) {
          Objects.requireNonNull(a);
          systemServic = p0.getSystemService("keyguard");
          Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.app.KeyguardManager");
          if (b ^ systemServic.isKeyguardLocked()) {
             Spring.e = p1;
             a.a().put(p2, p4);
             intent = new Intent(p0, p3);
             intent.putExtra("fragment_tag", p2);
             intent.addFlags(0x10000000);
             Objects.requireNonNull(a);
             f.a.a(p0, intent);
             c.a.a(p0, intent);
             a.a.a(p0, intent);
             b.a.a(p0, intent);
             Objects.requireNonNull(Spring.a);
             b1 = new Handler(Looper.getMainLooper()).postDelayed(new g(p2), TimeUnit.SECONDS.toMillis(8));
          label_00dd :
             Result.constructor-impl(Boolean.valueOf(b1));
             return;
          }
       }
       c = Spring.c;
       _monitor_enter(c);
       systemServic = new Spring$pendingDisplayFragment$1$3$1(p0, p1, p2, p3, p4);
       b1 = Spring.c.add(v8);
       _monitor_exit(c);
       goto label_00dd ;
    }
    public final Map a(){
       return Spring.d;
    }
    public final BaseSpringDialogFragment b(){
       BaseSpringDialogFragment e = Spring.e;
       Spring.e = null;
       return e;
    }
}
