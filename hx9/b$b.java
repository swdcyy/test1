package hx9.b$b;
import com.kwai.component.tabs.panel.h$a;
import hx9.b;
import java.lang.Object;
import yg5.r0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rd5.g;

public final class b$b implements h$a	// class@002721
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(r0 p0){
       g e;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       if (p0 != null) {
          g og = p0.c(g.class);
          if (og != null) {
             e = og.e;
             if (e != null && og.c == 2) {
                this.a.m = e;
             }
          }
          if (og != null) {
             e = og.f;
             if (e != null && og.c == 2) {
                og.o = e;
             }
          }
       }
    label_0032 :
       return;
    }
    public void b(boolean p0,boolean p1,r0 p2){
    }
}
