package be3.a$a;
import vb3.n;
import be3.a;
import java.lang.Object;
import java.util.LinkedHashMap;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import ip3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import java.util.Map;
import android.view.ViewGroup;
import eq3.d;
import android.view.animation.Animation;

public final class a$a implements n	// class@000392
{
    public final Map a;
    public final Map b;
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
       this.a = new LinkedHashMap();
       this.b = new LinkedHashMap();
    }
    public void a(p p0,ViewController p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "3")) {
          return;
       }
       a.p(p0, "viewType");
       a.p(p2, "bizShrinkStrategyHolder");
       this.c(p0, p1);
       return;
    }
    public void b(p p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "viewType");
       this.e(p0);
       if (p1 != null) {
          this.a.put(p0, p1);
          p0 = this.c.d.get(p0);
          a.m(p0);
          p0.addView(p1);
       }
       return;
    }
    public void c(p p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
          return;
       }
       a.p(p0, "viewType");
       this.e(p0);
       if (p1 != null) {
          this.b.put(p0, p1);
          a$a tc = this.c;
          p0 = tc.d.get(p0);
          a.m(p0);
          tc.j.E2(p0, p1);
       }
       return;
    }
    public void d(p p0,Animation p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "4")) {
          return;
       }
       a.p(p0, "viewType");
       a.p(p1, "animation");
       ViewGroup viewGroup = this.c.d.get(p0);
       if (viewGroup != null) {
          viewGroup.startAnimation(p1);
       }
       return;
    }
    public final void e(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "5")) {
          return;
       }
       ViewController viewControll = this.b.remove(p0);
       if (viewControll != null) {
          this.c.j.o1(viewControll);
       }
       View view = this.a.remove(p0);
       if (view != null) {
          p0 = this.c.d.get(p0);
          a.m(p0);
          p0.removeView(view);
       }
       return;
    }
}
