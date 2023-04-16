package com.kuaishou.live.livestage.a;
import ee3.d;
import java.lang.Object;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class a implements d	// class@000bde
{

    public void a(){
       super();
    }
    public t a(LayoutConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "source");
       t ot = t.just(p0);
       a.o(ot, "Observable.just\(source\)");
       return ot;
    }
    public void detach(){
    }
    public String toString(){
       return "EMPTY_INTERCEPTOR";
    }
}
