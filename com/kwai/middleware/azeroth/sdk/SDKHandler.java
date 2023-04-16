package com.kwai.middleware.azeroth.sdk.SDKHandler;
import com.kwai.middleware.azeroth.sdk.SDKHandler$a;
import nsd.u;
import com.kwai.middleware.azeroth.sdk.SDKHandler$Companion$PERMISSION_UPDATE_SDK_CONFIG$2;
import msd.a;
import qrd.p;
import qrd.s;
import y97.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.sdk.SDKHandler$mConfigMap$2;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import tb7.b;
import com.kwai.middleware.azeroth.sdk.SDKHandler$initBroadcastReceiver$1;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.content.Intent;
import y97.b;
import java.lang.Runnable;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.middleware.azeroth.sdk.SDKHandler$b;
import java.util.concurrent.Callable;
import brd.t;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import com.kwai.middleware.azeroth.sdk.SDKHandler$c;
import erd.o;
import com.kwai.middleware.azeroth.sdk.SDKHandler$d;
import brd.y;
import crd.b;
import xa7.a;

public final class SDKHandler	// class@000d6e
{
    public boolean a;
    public boolean b;
    public final long c;
    public f d;
    public String e;
    public long f;
    public final p g;
    public static final p h;
    public static final SDKHandler$a i;

    static {
       SDKHandler.i = new SDKHandler$a(null);
       SDKHandler.h = s.c(SDKHandler$Companion$PERMISSION_UPDATE_SDK_CONFIG$2.INSTANCE);
    }
    public void SDKHandler(a p0){
       try{
          a.q(p0, "config");
          super();
          this.a = p0.a;
          this.c = p0.b;
          this.e = "COLD_START";
          this.f = -1;
          this.g = s.c(SDKHandler$mConfigMap$2.INSTANCE);
          this.d = p0.c;
          Azeroth2 b = Azeroth2.B;
          if (b.i(b.d())) {
          }else {
             b.d().registerReceiver(new SDKHandler$initBroadcastReceiver$1(this), new IntentFilter("com.kwai.middleware.azeroth.UPDATE_SDK_CONFIG"), SDKHandler.i.a(), null);
          }
          if (this.a != null) {
             b.d().post(new b(this));
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final ConcurrentHashMap a(){
       return this.g.getValue();
    }
    public final String b(String p0){
       a.q(p0, "name");
       p0 = this.a().get(p0);
       if (p0 != null) {
       }else {
          p0 = "";
       }
       return p0;
    }
    public final void c(){
       if (!b.i(Azeroth2.B.d())) {
          return;
       }
       t.fromCallable(new SDKHandler$b(this)).subscribeOn(AzerothSchedulers.b.d()).flatMap(new SDKHandler$c(this)).subscribeWith(new SDKHandler$d(this)).b();
       return;
    }
}
