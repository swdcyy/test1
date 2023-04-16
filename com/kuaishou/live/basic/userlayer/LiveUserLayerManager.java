package com.kuaishou.live.basic.userlayer.LiveUserLayerManager;
import java.util.concurrent.TimeUnit;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import c61.b;
import s81.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.lang.Object;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$UserLayer;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import io.reactivex.subjects.PublishSubject;
import h91.d;
import h91.c;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$a;
import erd.o;
import t45.d;
import brd.z;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$b;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$c;
import erd.g;
import crd.b;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.lang.System;
import java.util.Objects;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class LiveUserLayerManager	// class@000d27
{
    public static final long a;
    public static b b;
    public static PublishSubject c;
    public static final LiveUserLayerManager d;

    static {
       LiveUserLayerManager.d = new LiveUserLayerManager();
       LiveUserLayerManager.a = TimeUnit.HOURS.toMillis(a.t().u("SOURCE_LIVE").b("userLayerQueryInterval", 24));
       b uob = b.class;
       String str = a.a.getString(b.d("user")+"liveUserLayer", "");
       uob = (str == null || str == "")? null: b.a(str, uob);
       if (uob == null) {
          uob = new b(LiveUserLayerManager$UserLayer.UNSET, 0);
       }
       LiveUserLayerManager.b = uob;
    }
    public void LiveUserLayerManager(){
       super();
    }
    public static synchronized final t a(){
       _monitor_enter(LiveUserLayerManager.class);
       PublishSubject obj = PatchProxy.apply(null, null, LiveUserLayerManager.class, "2");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(LiveUserLayerManager.class);
          return obj;
       }else if(LiveUserLayerManager.d.b()){
          if (LiveUserLayerManager.c == null) {
             LiveUserLayerManager.c = PublishSubject.g();
             c.b().i().map(LiveUserLayerManager$a.b).observeOn(d.c).subscribe(LiveUserLayerManager$b.b, LiveUserLayerManager$c.b);
          }
          obj = LiveUserLayerManager.c;
          a.m(obj);
       }else {
          t ot = t.just(LiveUserLayerManager.b.a());
          a.o(ot, "Observable.just\(userLayerPair.userLayer\)");
       }
       _monitor_exit(LiveUserLayerManager.class);
       return obj;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, LiveUserLayerManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((System.currentTimeMillis() - LiveUserLayerManager.b.b) - LiveUserLayerManager.a >= 0)? true: false;
       return b;
    }
    public synchronized final void c(LiveUserLayerManager$UserLayer p0,boolean p1){
       LiveUserLayerManager liveUserLaye = LiveUserLayerManager.class;
       if (PatchProxy.isSupport(liveUserLaye) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveUserLaye, "3")) {
          return;
       }
       b b = LiveUserLayerManager.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, b.class, "1")) {
          a.p(p0, "<set-?>");
          b.a = p0;
       }
       b.b = System.currentTimeMillis();
       PublishSubject c = LiveUserLayerManager.c;
       a.m(c);
       c.onNext(LiveUserLayerManager.b.a());
       c = LiveUserLayerManager.c;
       a.m(c);
       c.onComplete();
       LiveUserLayerManager.c = null;
       if (p1) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString(b.d("user")+"liveUserLayer", b.e(LiveUserLayerManager.b));
          g.a(uEditor);
       }
       return;
    }
}
