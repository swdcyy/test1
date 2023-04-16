package com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.b;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.a;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import java.util.Map;
import ekd.q;
import g5b.a;
import java.lang.Runnable;
import t45.c;

public final class b	// class@001c07
{

    public void b(){
       super();
    }
    public static t a(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(a.b).subscribeOn(d.c);
    }
    public static void b(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       if (q.h(p0)) {
          return;
       }
       c.a(new a(p0));
       return;
    }
}
