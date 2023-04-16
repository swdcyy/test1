package com.yxcorp.gifshow.upload.r;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.k2;
import k2b.u1;
import lnc.i3;
import brd.t;
import com.yxcorp.gifshow.upload.p;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.upload.o;
import erd.r;
import com.yxcorp.gifshow.upload.i;
import erd.o;
import com.yxcorp.gifshow.bean.ContactInfo;
import wkd.b;
import sca.e;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.gifshow.upload.j;
import com.yxcorp.gifshow.upload.l;
import com.yxcorp.gifshow.upload.n;

public class r	// class@001ea7
{

    public void r(){
       super();
    }
    public static String a(){
       k2 obj = PatchProxy.apply(null, null, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u1.j();
       String str = "";
       if (obj == null) {
          return str;
       }
       i3 oi3 = i3.f();
       oi3.d("cur_page", obj.d);
       obj = obj.t;
       if (obj != null) {
          str = obj.d;
       }
       oi3.d("refer_page", str);
       return oi3.e();
    }
    public static t b(){
       Object obj = PatchProxy.apply(null, null, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(p.b).subscribeOn(d.c).observeOn(d.a).filter(o.b).flatMap(i.b);
    }
    public static t c(ContactInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x5419c6da).c(RequestTiming.DEFAULT, p0).flatMap(j.b);
    }
    public static t d(ContactInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x5419c6da).c(RequestTiming.DEFAULT, p0).flatMap(l.b).map(n.b);
    }
}
