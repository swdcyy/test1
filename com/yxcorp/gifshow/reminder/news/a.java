package com.yxcorp.gifshow.reminder.news.a;
import zw5.c;
import java.lang.Object;
import bfc.i;
import xec.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import ncc.g;
import com.kwai.social.startup.reminder.model.NewsSlidePlayConfig;
import java.lang.ref.WeakReference;
import java.util.Objects;
import crd.b;
import lnc.b9;
import java.lang.Boolean;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import bfc.h;
import erd.r;
import bfc.b;
import erd.g;
import bfc.e;
import io.reactivex.internal.functions.Functions;

public class a implements c	// class@001aef
{
    public final i a;
    public final b b;

    public void a(){
       super();
       this.a = new i();
       this.b = new b();
    }
    public void a(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, a.class, str)) {
          return;
       }
       b.a(-83154551).f().a = new WeakReference(this.b);
       a ta = this.a;
       a tb = this.b;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(tb, ta, i.class, str) && i.a()) {
          b9.a(ta.a);
          ta.a = t.just(Boolean.TRUE).delay(0x2710, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).filter(h.b).doOnNext(new b(tb)).subscribe(new e(ta), Functions.d());
       }
       return;
    }
    public void onHostDestroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, i.class, "5")) {
          b9.a(ta.a);
          ta.a = null;
          ta.c();
       }
       b.a(-83154551).f().a = null;
       return;
    }
}
