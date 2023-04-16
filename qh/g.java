package qh.g;
import hf5.h;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import vy6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import androidx.viewpager.widget.ViewPager$i;
import qw6.a;

public final class g implements h	// class@0029e0
{
    public final SlidePlayViewModel a;

    public void g(SlidePlayViewModel p0){
       a.p(p0, "mSlidePlayViewModel");
       super();
       this.a = p0;
    }
    public void a(a p0,boolean p1){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, g.class, "1")) {
          return;
       }
       a.p(p0, "listener");
       this.a.E(p0);
       return;
    }
    public void b(ViewPager$i p0,boolean p1){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, g.class, "5")) {
          return;
       }
       a.p(p0, "listener");
       this.a.i(p0);
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.a.l(p0);
       return;
    }
    public void d(a p0,boolean p1){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, g.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.a.h(p0);
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.a.g0(p0);
       return;
    }
    public void g(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       a.p(p0, "listener");
       this.a.g(p0);
       return;
    }
}
