package cb3.h;
import vb3.n;
import java.util.Map;
import eq3.d;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import ip3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import android.view.animation.Animation;

public final class h implements n	// class@0004e7
{
    public final String a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final d e;
    public final d f;
    public final Set g;

    public void h(Map p0,d p1,d p2,Set p3){
       a.p(p0, "viewContainers");
       a.p(p1, "vcManager");
       a.p(p2, "extensionVCManager");
       a.p(p3, "extensionViewTypeSet");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.a = "LiveViewProviderServiceImpl";
       this.b = new LinkedHashMap();
       this.c = new LinkedHashMap();
    }
    public void a(p p0,ViewController p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "3")) {
          return;
       }
       a.p(p0, "viewType");
       a.p(p2, "bizShrinkStrategyHolder");
       this.c(p0, p1);
       return;
    }
    public void b(p p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       a.p(p0, "viewType");
       this.e(p0);
       if (p1 != null) {
          this.b.put(p0, p1);
          Object obj = this.d.get(p0);
          a.m(obj);
          obj.addView(p1);
       }
       b.d0(LiveLiteLogTag.LAYOUT_MANAGER, "LiveViewProviderService setView", "type", p0, "view", p1);
       return;
    }
    public void c(p p0,ViewController p1){
       Object obj;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "2")) {
          return;
       }
       a.p(p0, "viewType");
       this.e(p0);
       if (p1 != null) {
          this.c.put(p0, p1);
          if (this.g.contains(p0)) {
             b.Z(LiveLiteLogTag.LAYOUT_MANAGER, this.a+" setExtensionViewController "+p0);
             obj = this.d.get(p0);
             a.m(obj);
             this.f.E2(obj, p1);
          }else {
             obj = this.d.get(p0);
             a.m(obj);
             this.e.E2(obj, p1);
          }
       }
       b.d0(LiveLiteLogTag.LAYOUT_MANAGER, "LiveViewProviderService setViewController", "type", p0, "vc", p1);
       return;
    }
    public void d(p p0,Animation p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "4")) {
          return;
       }
       a.p(p0, "viewType");
       a.p(p1, "animation");
       ViewGroup viewGroup = this.d.get(p0);
       if (viewGroup != null) {
          viewGroup.startAnimation(p1);
       }
       return;
    }
    public final void e(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "5")) {
          return;
       }
       ViewController viewControll = this.c.remove(p0);
       if (viewControll != null) {
          if (this.g.contains(p0)) {
             this.f.o1(viewControll);
          }else {
             this.e.o1(viewControll);
          }
       }
       View view = this.b.remove(p0);
       if (view != null) {
          p0 = this.d.get(p0);
          a.m(p0);
          p0.removeView(view);
       }
       return;
    }
}
