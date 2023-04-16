package a7a.l$d;
import xtd.e;
import a7a.l;
import java.lang.Object;
import xtd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Math;
import xx9.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import rf5.u;

public final class l$d implements e	// class@000060
{
    public final l a;

    public void l$d(l p0){
       this.a = p0;
       super();
    }
    public final void a(b p0,int p1,float p2){
       if (PatchProxy.isSupport2(l$d.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Float.valueOf(p2), this, l$d.class, "1")) {
          return;
       }
       if (p1 == 2) {
          p0.h1 = false;
       }
       if (this.a.h1 == null && p1 == 3) {
          l$d ta = this.a;
          if (Math.abs(p2) - (float)ta.l1 > 0 && (ta.s9() && !this.a.a9().c())) {
             l$d ta1 = this.a;
             ta1.h1 = true;
             ta1.b9().A();
          }
       }
    label_005b :
       PatchProxy.onMethodExit(l$d.class, "1");
       return;
    }
}
