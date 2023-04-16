package com.yxcorp.gifshow.message.init.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.message.init.IMInitModule;
import eda.l;
import java.lang.Object;
import wkd.b;
import com.yxcorp.gifshow.message.init.s;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hdb.o;
import brd.t;
import hdb.q;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.message.init.dva.IMInitTaskManager;

public final class b implements Runnable	// class@001d4d
{
    public final IMInitModule b;
    public final l c;

    public void b(IMInitModule p0,l p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       int i = 0xb6e40b8;
       if (tb.q != null) {
          b.a(i).e(RequestTiming.LOGIN, true);
       }
       tb.r0(tb.u);
       if (tc != null && (tc.b != null || tc.d != null)) {
          s os = b.a(i);
          Objects.requireNonNull(os);
          if (!PatchProxy.applyVoid(null, os, s.class, "23")) {
             o.e("IM switchAccount");
             os.n().subscribe(new q(os), Functions.d());
          }
       }else {
          b.a(i).i();
       }
       IMInitTaskManager.c("onLogin", "onLogout");
       return;
    }
}
