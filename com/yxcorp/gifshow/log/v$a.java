package com.yxcorp.gifshow.log.v$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.policy.LogPolicy$Upload;
import com.yxcorp.gifshow.log.policy.LogPolicy;
import crd.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import brd.t;
import k2b.p2;
import erd.o;
import brd.z;
import k2b.o2;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.log.u;

public class v$a implements Runnable	// class@001b57
{
    public b b;
    public final v c;

    public void v$a(v p0){
       this.c = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v$a.class, "1")) {
          return;
       }
       if (this.c.b.getUploadPolicy() == LogPolicy$Upload.NONE) {
          return;
       }
       v$a tb = this.b;
       if (tb != null && !tb.isDisposed()) {
          return;
       }
       v ov = 1;
       boolean b = (this.c.b.getUploadPolicy() == LogPolicy$Upload.ALL)? true: false;
       v$a tc = this.c;
       tc.c = tc.d(b);
       tc = this.c;
       if (tc.c == null) {
          Objects.requireNonNull(tc);
          Object obj = PatchProxy.apply(objArray, tc, v.class, "2");
          boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): p0.C(a.b());
          this.b = t.just(Boolean.valueOf(b1)).flatMap(new p2(this, b)).observeOn(this.c.d).doFinally(new o2(this, b)).subscribe(Functions.d(), u.b);
       }else {
          tc.c = ov;
       }
       return;
    }
}
