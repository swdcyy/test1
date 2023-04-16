package hk9.c$d;
import com.kwai.component.tabs.panel.h$a;
import hk9.c;
import java.lang.Object;
import yg5.r0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import nk9.m;
import nk9.c;
import java.util.HashMap;
import java.util.Map;
import ik9.c$a;
import mrd.a;
import pk9.h;
import ek9.t0;
import nk9.h;

public final class c$d implements h$a	// class@00269e
{
    public final c a;

    public void c$d(c p0){
       this.a = p0;
       super();
    }
    public void a(r0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       c c = this.a.c;
       if (c != null) {
          c.a(p0);
       }
       return;
    }
    public void b(boolean p0,boolean p1,r0 p2){
       m om;
       h oh;
       if (PatchProxy.isSupport(c$d.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, c$d.class, "2")) {
          return;
       }
       c c = this.a.c;
       if (c != null) {
          c.b(p0, p1, p2);
       }
       if (!p1) {
          if (p0) {
             if (p2 != null) {
                om = p2.c(m.class);
                if (om != null) {
                label_003c :
                   r0 d = (p2 != null)? p2.d: 0;
                   om.d = d;
                   p1 = (p2 != null && p2.d() == this.a.s)? true: false;
                   om.e = p1;
                   if (!PatchProxy.applyVoidOneRefs(p2, om, c.class, "1")) {
                      if (om.a == null) {
                         om.a = new HashMap(2);
                      }
                      om.a.put(p2.getClass(), p2);
                   }
                   this.a.f.onNext(new c$a(om));
                   if (p2 != null) {
                      oh = p2.c(h.class);
                      if (oh != null) {
                         c e = this.a.e;
                         if (e != null) {
                            e.a(oh);
                         }
                      }
                   }
                }
             }
             om = new m();
             goto label_003c ;
          }else if(p2 != null){
             oh = p2.c(h.class);
             if (oh != null) {
             label_00aa :
                this.a.f.onNext(new c$a(oh));
             }
          }
          oh = new h();
          goto label_00aa ;
       }else if(p0){
          this.a.g.onNext(Boolean.TRUE);
       }else {
          this.a.g.onNext(Boolean.FALSE);
       }
       return;
    }
}
