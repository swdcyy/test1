package qh.j;
import hf5.h;
import ef5.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import vy6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ef5.b;
import ef5.a;
import androidx.viewpager.widget.ViewPager$i;
import ef5.d;
import qw6.a;
import ef5.f;

public final class j implements h	// class@0029e7
{
    public final e a;

    public void j(e p0){
       a.p(p0, "mStickListenerManager");
       super();
       this.a = p0;
    }
    public void a(a p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oj, "1")) {
          return;
       }
       a.p(p0, "listener");
       this.a.a().b(p0, p1);
       return;
    }
    public void b(ViewPager$i p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oj, "5")) {
          return;
       }
       a.p(p0, "listener");
       this.a.b().b(p0, p1);
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.a.c().f(p0);
       return;
    }
    public void d(a p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oj, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.a.c().b(p0, p1);
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.a.a().f(p0);
       return;
    }
    public void g(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "6")) {
          return;
       }
       a.p(p0, "listener");
       this.a.b().f(p0);
       return;
    }
}
