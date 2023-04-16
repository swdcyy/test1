package com.kwai.middleware.azeroth.Azeroth2$d;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.middleware.azeroth.Azeroth2;
import java.lang.String;
import brd.t;
import com.kwai.middleware.azeroth.Azeroth2$d$a;
import com.kwai.middleware.azeroth.Azeroth2$d$b;
import erd.g;
import crd.b;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.Azeroth2$initBroadcastObserver$1;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Throwable;
import q97.c;
import tb7.b;
import com.kwai.middleware.azeroth.Azeroth2$initBroadcastObserver$2;

public final class Azeroth2$d implements Runnable	// class@000d43
{
    public static final Azeroth2$d b;

    static {
       Azeroth2$d.b = new Azeroth2$d();
    }
    public void Azeroth2$d(){
       super();
    }
    public final void run(){
       Azeroth2 b = Azeroth2.B;
       b.y("azeroth").subscribe(Azeroth2$d$a.b, Azeroth2$d$b.b);
       Objects.requireNonNull(b);
       String str = "appContext";
       Context c = Azeroth2.c;
       if (c == null) {
          a.S(str);
       }
       UniversalReceiver.e(c, new Azeroth2$initBroadcastObserver$1(), new IntentFilter("com.kwai.middleware.azeroth.ACCOUNT_CHANGED"));
       c = Azeroth2.c;
       if (c == null) {
          a.S(str);
       }
       if (!b.i(c)) {
          c = Azeroth2.c;
          if (c == null) {
             a.S(str);
          }
          UniversalReceiver.e(c, new Azeroth2$initBroadcastObserver$2(), new IntentFilter("com.kwai.middleware.azeroth.APP_LIFE"));
       }
       return;
    }
}
