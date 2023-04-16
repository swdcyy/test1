package dxa.h;
import java.lang.Object;
import sq6.b;
import dxa.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sq6.d;
import dxa.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import sq6.e;
import dxa.e;
import sq6.c;
import dxa.c;

public class h	// class@0025a8
{

    public void h(){
       super();
    }
    public static b a(b p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, null, h.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new b();
       obj.a = p0.a;
       obj.b = p0.b;
       obj.c = p0.c;
       obj.d = p0.d;
       d uod = p0.b();
       if (uod != null) {
          d uod1 = PatchProxy.applyOneRefs(uod, null, h.class, "2");
          if (uod1 != patchProxyRe) {
          }else {
             uod1 = new d();
             uod1.b = uod.a();
             uod1.a = uod.b();
          }
          obj.e = uod1;
       }
       ArrayList uArrayList = new ArrayList();
       List list = p0.c();
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             if (uoe != null) {
                e uoe1 = PatchProxy.applyOneRefs(uoe, null, h.class, "3");
                if (uoe1 != patchProxyRe) {
                }else {
                   uoe1 = new e();
                   uoe1.b = uoe.b;
                   uoe1.a = uoe.a();
                   uoe1.c = uoe.c;
                   c uoc = uoe.b();
                   if (uoc != null) {
                      c uoc1 = PatchProxy.applyOneRefs(uoc, null, h.class, "4");
                      if (uoc1 != patchProxyRe) {
                      }else {
                         uoc1 = new c();
                         uoc1.b(uoc.b());
                         uoc1.c(uoc.c());
                         uoc1.d(uoc.d());
                         uoc1.d = uoc.a();
                      }
                      uoe1.d = uoc1;
                   }
                }
                uArrayList.add(uoe1);
             }
          }
       }
       obj.f = uArrayList;
       obj.g = p0.g;
       obj.h = p0.h;
       obj.i = p0.a();
       obj.j = p0.j;
       obj.k = p0.k;
       obj.l = p0.l;
       obj.m = p0.m;
       obj.n = p0.n;
       obj.o = p0.o;
       return obj;
    }
}
