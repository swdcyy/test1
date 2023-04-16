package com.yxcorp.gifshow.tti.module.SearchInitModule;
import com.kwai.framework.init.TTIInitModule;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import i06.c;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import b76.a;
import java.lang.System;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import nyb.h;
import brd.z;
import lrd.b;
import com.yxcorp.gifshow.plugin.impl.search.util.b;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import crd.b;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.component.signal.real.SignalLogManager$2;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.List;
import java.util.Collection;
import ekd.q;
import g3b.d;
import g3b.c;
import i06.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.events.realaction.RealAction;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import i06.a;
import com.kwai.feature.component.signal.real.a;
import erd.g;

public class SearchInitModule extends TTIInitModule	// class@001dcd
{

    public void SearchInitModule(){
       super();
    }
    public int f0(){
       return 4;
    }
    public void j0(Activity p0){
       c b;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchInitModule.class, "2")) {
          return;
       }
       c uoc = b.a(0x7c43e031);
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(null, uoc, c.class, "3")) {
          b = uoc.b;
          if (b != null) {
             b.shutdown();
             uoc.b = null;
          }
       }
       return;
    }
    public void k0(a p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchInitModule.class, str)) {
          return;
       }
       c.c = System.currentTimeMillis();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, c.class, "10") && !b.a(0x560d43).d()) {
          b.c().e(b.b, (long)c.d(), TimeUnit.SECONDS);
       }
       c uoc = b.a(0x7c43e031);
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, str)) {
          List value = a.t().getValue("logToUserSignalWhiteList", new SignalLogManager$2(uoc).getType(), objArray);
          if (!q.f(value)) {
             uoc.a.C0("SEARCH", value);
             uoc.a.w("SEARCH", uoc.c);
          }
       }
       b uob = b.a(0xc42bd8c);
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, str)) {
          RxBus.f.g(RealAction.class, RxBus$ThreadMode.MAIN).subscribe(new a(uob), a.b);
       }
       return;
    }
}
