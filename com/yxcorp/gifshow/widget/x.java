package com.yxcorp.gifshow.widget.x;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tyc.q3;
import io.reactivex.g;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.w;
import brd.w;
import erd.c;
import t45.d;
import brd.z;
import tyc.r3;
import erd.o;

public class x	// class@0019f8
{

    public void x(){
       super();
    }
    public static t a(CDNUrl[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, x.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new q3(p0));
    }
    public static t b(CDNUrl[] p0,CDNUrl[] p1,boolean p2){
       if (PatchProxy.isSupport(x.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, x.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = (p1 != null)? t.zip(x.a(p0), x.a(p1), w.a): x.a(p0);
       return ot.observeOn(d.c).map(new r3(p2));
    }
    public static boolean c(int p0){
       boolean b = (p0 != 6 && (p0 != 5 && (p0 == 7 || p0 == 9)))? true: false;
       return b;
    }
}
