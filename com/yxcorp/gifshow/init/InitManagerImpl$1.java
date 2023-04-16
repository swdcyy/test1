package com.yxcorp.gifshow.init.InitManagerImpl$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.yxcorp.gifshow.init.InitManagerImpl;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pxa.a;
import java.lang.Enum;
import java.util.Objects;
import com.yxcorp.gifshow.init.InitManagerImpl$onBackgroundEventMainThread$1;
import vsd.c;
import msd.l;
import com.yxcorp.gifshow.util.rx.RxBus;
import qh5.b;
import android.app.Application;
import o56.a;
import android.content.Intent;
import ekd.e0;
import com.yxcorp.gifshow.init.InitManagerImpl$onForegroundEventMainThread$1;
import qh5.a;

public final class InitManagerImpl$1 implements LifecycleEventObserver	// class@0011b7
{
    public final InitManagerImpl b;

    public void InitManagerImpl$1(InitManagerImpl p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       InitManagerImpl$1 tb;
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, InitManagerImpl$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       int i = a.a[p1.ordinal()];
       Object[] objArray = null;
       if (i != 1) {
          if (i == 2) {
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidWithListener(objArray, tb, InitManagerImpl.class, "3")) {
                InitManagerImpl$onBackgroundEventMainThread$1 iNSTANCE = InitManagerImpl$onBackgroundEventMainThread$1.INSTANCE;
                InitManagerImpl.b(tb, iNSTANCE, iNSTANCE.getName(), false, 4, null);
                RxBus.f.b(new b());
                a.b().sendBroadcast(new Intent("kwai.intent.action.ON_BACKGROUND"));
                PatchProxy.onMethodExit(InitManagerImpl.class, "3");
             }
          }
       }else {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidWithListener(objArray, tb, InitManagerImpl.class, "4")) {
             InitManagerImpl.b(tb, InitManagerImpl$onForegroundEventMainThread$1.INSTANCE, "onForeground", false, 4, null);
             RxBus.f.b(new a());
             a.b().sendBroadcast(new Intent("kwai.intent.action.ON_FOREGROUND"));
             PatchProxy.onMethodExit(InitManagerImpl.class, "4");
          }
       }
       PatchProxy.onMethodExit(InitManagerImpl$1.class, "1");
       return;
    }
}
