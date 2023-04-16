package com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$c;
import erd.o;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter;
import java.lang.Object;
import ja6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import java.util.Objects;
import brd.t;
import k74.c;
import erd.r;
import k74.d;
import erd.g;
import k74.e;
import java.util.concurrent.TimeUnit;
import k74.f;
import k74.g;
import erd.a;
import cjd.e;
import t45.d;
import brd.z;

public final class LiveSubscribePresenter$c implements o	// class@001ad6
{
    public final LiveSubscribePresenter b;

    public void LiveSubscribePresenter$c(LiveSubscribePresenter p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveSubscribePresenter$c obj = PatchProxy.applyOneRefs(p0, this, LiveSubscribePresenter$c.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.b;
          p0 = p0.a;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveSubscribePresenter.class, "3");
          obj = (obj1 != patchProxyRe)? obj1: t.just(p0).filter(new c(obj)).doOnNext(new d(obj)).flatMap(new e(p0)).timeout(10, TimeUnit.SECONDS).onErrorResumeNext(f.b).doFinally(new g(obj)).map(new e()).observeOn(d.a);
       }
       return obj;
    }
}
