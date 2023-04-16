package com.yxcorp.gifshow.message.init.o;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.message.init.s;
import zb5.i;
import java.lang.Object;
import java.util.Objects;
import android.app.Application;
import o56.a;
import qo6.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zo6.d;
import java.util.HashMap;
import com.kwai.chat.sdk.signal.IMClientAppInfo$a;
import android.content.Context;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import c97.d;
import h97.g;
import zb5.g;
import java.util.Map;
import com.kwai.imsdk.internal.util.j;
import zb5.b;
import com.kwai.chat.sdk.utils.Supplier;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import java.lang.Integer;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import zb5.e;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.a;
import j85.a;

public final class o implements Callable	// class@001d60
{
    public final s b;
    public final i c;

    public void o(s p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       o tb = this.b;
       o tc = this.c;
       Objects.requireNonNull(tb);
       Application uApplication = a.b();
       p op = tb.c();
       Objects.requireNonNull(tc);
       if (PatchProxy.applyVoidTwoRefs(uApplication, op, tc, i.class, "13")) {
       }else {
          d.b(op);
          HashMap hashMap = new HashMap();
          hashMap.put("imsdkVersion", "11.3.10.0");
          IMClientAppInfo$a uoa = new IMClientAppInfo$a();
          uoa.u(op.b);
          uoa.b(op.c);
          uoa.c(uApplication.getPackageName());
          uoa.e(op.d);
          p e = (!TextUtils.x(op.e))? op.e: d.a().b().getAppVersion();
          uoa.f(e);
          uoa.d(op.f);
          uoa.p(p.b());
          uoa.v(p.b());
          uoa.h(p.b());
          uoa.r(op.h);
          g og = d.a().b();
          Objects.requireNonNull(og);
          uoa.s(new g(og));
          uoa.o(hashMap);
          uoa.j(op.l);
          uoa.k(op.m);
          uoa.i(j.c(op.n).e(new b(uApplication)));
          uoa.n(op.k);
          uoa.l(op.r);
          uoa.m(op.w);
          uoa.q(op.x);
          uoa.t(op.s);
          uoa.g(op.t);
          IMClientAppInfo iMClientAppI = uoa.a();
          c.k(new e(uApplication, op));
          f uof = f.e();
          boolean b = true;
          if (op.j != b) {
             b = false;
          }
          uof.i(uApplication, iMClientAppI, b, a.a);
       }
       return Integer.valueOf(0);
    }
}
