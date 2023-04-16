package com.kwai.yoda.function.ui.a;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.yoda.function.ui.a$a;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kwai.yoda.function.b;
import erd.g;
import io.reactivex.g;
import brd.z;
import io.reactivex.android.schedulers.a;
import lrd.b;
import crd.b;

public final class a extends c	// class@001236
{

    public void a(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       a.q(p1, "nameSpace");
       a.q(p2, "command");
       a.q(p3, "params");
       a.q(p4, "callbackId");
       a$a uoa1 = new a$a(p0);
       t ot = PatchProxy.applyTwoRefs(p3, uoa1, this, c.class, "7");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new b(this, p3, uoa1)).subscribeOn(a.c()).observeOn(b.c());
       }
       this.r(p0, p1, p2, p4, ot);
       return;
    }
}
