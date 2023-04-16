package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.r;
import ok.h;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.s$a;
import java.lang.Object;
import java.lang.Void;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.s;
import y6a.e1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import xx9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import kotlin.jvm.internal.a;
import brd.t;

public final class r implements h	// class@001831
{
    public final s$a b;

    public void r(s$a p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       r tb = this.b;
       p0 = tb.c.s;
       e1 uoe1 = new e1(tb);
       Objects.requireNonNull(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       g obj = PatchProxy.applyOneRefs(uoe1, p0, uoa, "8");
       if (obj != patchProxyRe) {
       }else {
          obj = Functions.d();
          a.o(obj, "Functions.emptyConsumer\(\)");
          Object obj1 = PatchProxy.applyTwoRefs(uoe1, obj, p0, uoa, "7");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             a.p(uoe1, "consumer");
             a.p(obj, "errorConsumer");
             obj = p0.c.subscribe(uoe1, obj);
             a.o(obj, "mChangeScreenVisibleEven¡­\(consumer, errorConsumer\)");
          }
       }
       return obj;
    }
}
