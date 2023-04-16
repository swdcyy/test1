package g1b.b;
import y0b.s;
import java.util.List;
import java.lang.Object;
import y0b.h;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.listcomponent.event.a;
import java.util.HashMap;
import y0b.n;
import java.util.ArrayList;
import y0b.t;
import y0b.i;
import y0b.j;
import y0b.u;

public class b	// class@002a68
{
    public final s a;
    public final List b;

    public void b(s p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(h p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0.e().f("kscc.event.component.arch.request.triggerMorePageRequest", p1, false);
       return p1.get("can_consume_loadmore").booleanValue();
    }
    public final boolean b(h p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0.e().f("kscc.event.section.arch.request.triggerMorePageRequest", p1, false);
       return p1.get("can_consume_loadmore").booleanValue();
    }
    public boolean c(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       HashMap obj = PatchProxy.apply(null, this, uob, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = new HashMap();
       obj.put("can_consume_loadmore", Boolean.FALSE);
       int i = this.a.f().M().size();
       if (i > 0) {
          int i1 = i - 1;
          while (i1 >= 0) {
             t ot = this.a.f().K(i1);
             int i2 = ot.B().size();
             if (i2 > 0) {
                int i3 = i2 - 1;
                while (true) {
                   if (i3 >= 0) {
                      i oi = ot.A(i3);
                      if (oi.H().t() > 0) {
                         if (this.a(oi.H(), obj)) {
                            return true;
                         }else {
                            i3 = i3 + true;
                            while (true) {
                               if (i3 < i2) {
                                  if (this.a(ot.A(i3).H(), obj)) {
                                  }else {
                                     i3 = i3 + 1;
                                  }
                               }else if(this.b(ot.F(), obj)){
                                  return true;
                               }else {
                                  i1 = i1 + true;
                                  while (true) {
                                     if (i1 < i) {
                                        ot = this.a.f().K(i1);
                                        i2 = ot.B().size();
                                        if (i2 > 0) {
                                           i3 = 0;
                                           while (true) {
                                              if (i3 < i2) {
                                                 if (this.a(ot.A(i3).H(), obj)) {
                                                 }else {
                                                    i3 = i3 + 1;
                                                 }
                                              }else if(this.b(ot.F(), obj)){
                                                 return true;
                                              }
                                           }
                                           return true;
                                        }
                                        i1 = i1 + 1;
                                     }else {
                                        b ta = this.a;
                                        Object obj1 = PatchProxy.applyTwoRefs(ta, obj, this, uob, "1");
                                        if (obj1 != patchProxyRe) {
                                           b = obj1.booleanValue();
                                        }else {
                                           ta.e().f("kscc.event.page.arch.request.triggerMorePageRequest", obj, false);
                                           b = obj.get("can_consume_loadmore").booleanValue();
                                        }
                                        if (b) {
                                           return true;
                                        }else {
                                           return false;
                                        }
                                     }
                                  }
                               }
                            }
                            return true;
                         }
                      }else {
                         i3 = i3 - 1;
                      }
                   }
                }
             }
             i1 = i1 - 1;
          }
       }
       return false;
    }
}
