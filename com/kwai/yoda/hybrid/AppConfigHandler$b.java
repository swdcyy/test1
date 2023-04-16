package com.kwai.yoda.hybrid.AppConfigHandler$b;
import io.reactivex.g;
import com.kwai.yoda.hybrid.AppConfigHandler;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import iy7.b;
import java.util.Iterator;
import java.lang.Iterable;
import fz7.a;
import yz7.e;
import java.lang.Throwable;
import yz7.r;
import brd.g;

public final class AppConfigHandler$b implements g	// class@00126a
{
    public final AppConfigHandler b;

    public void AppConfigHandler$b(AppConfigHandler p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppConfigHandler$b.class, "1")) {
          return;
       }
       a.q(p0, "emitter");
       AppConfigHandler$b tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = PatchProxy.apply(null, tb, AppConfigHandler.class, "7");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          Iterator iterator = tb.e.b().iterator();
          while (iterator.hasNext()) {
             String str = e.f(iterator.next());
             a.h(str, "GsonUtil.toJson\(it\)");
             uArrayList.add(str);
          }
       }
       p0.onNext(uArrayList);
       return;
    }
}
