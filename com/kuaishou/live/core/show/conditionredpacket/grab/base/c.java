package com.kuaishou.live.core.show.conditionredpacket.grab.base.c;
import java.lang.Object;
import brd.t;
import ok.x;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.b;
import brd.w;
import erd.c;
import b62.a;
import erd.g;
import io.reactivex.internal.functions.Functions;

public class c	// class@000a82
{

    public void c(){
       super();
    }
    public static b a(t p0,t p1,x p2,x p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.zip(p0, p1.take(1), b.a).subscribe(new a(p2, p3), Functions.d());
    }
}
