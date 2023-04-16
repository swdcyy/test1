package hx9.a$b;
import com.kwai.component.tabs.panel.h$a;
import hx9.a;
import java.lang.Object;
import yg5.r0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rd5.g;

public final class a$b implements h$a	// class@00271d
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(r0 p0){
       g e;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       if (p0 != null) {
          g og = p0.c(g.class);
          a$b uob = 11;
          if (og != null) {
             e = og.e;
             if (e != null && og.c == uob) {
                this.a.l = e;
             }
          }
          if (og != null) {
             e = og.f;
             if (e != null && og.c == uob) {
                this.a.m = e;
             }
          }
          if (og != null) {
             og.e = null;
          }
       }
       return;
    }
    public void b(boolean p0,boolean p1,r0 p2){
    }
}
