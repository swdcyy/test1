package com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.b;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a$d;
import lv1.d;
import java.util.List;
import cs5.f;
import java.util.Objects;

public class b extends ViewPager$l	// class@0016f3
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, b.class, "1")) {
          return;
       }
       a k = this.b.k;
       if (k != null) {
          k.onPageScrolled(p0, p1, p2);
       }
       return;
    }
    public void onPageSelected(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (this.b.d.isEmpty()) {
          return;
       }
       b uob1 = 2;
       if (this.b.d.size() >= uob1) {
          this.b.d.get((((p0 - 1) + this.b.d.size()) % this.b.d.size())).f0();
          if (this.b.d.size() != uob1) {
             this.b.d.get(((p0 + 1) % this.b.d.size())).f0();
          }
       }
       d d = this.b.d;
       f uof = d.get((p0 % d.size()));
       this.b.s();
       this.b.e(uof);
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(null, uof, f.class, "21") && uof.h == null) {
          uof.h = true;
          uof.C();
          uof.onShow();
       }
       uof.C();
       return;
    }
}
