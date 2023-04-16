package com.kds.headertabscrollview.layout.CoordinatorView$b;
import com.google.android.material.appbar.KdsReboundBehavior$b;
import com.kds.headertabscrollview.layout.CoordinatorView;
import java.lang.Object;
import com.kds.headertabscrollview.layout.FlingViewPager;
import com.google.android.material.appbar.KdsReboundBehavior;
import com.kds.headertabscrollview.layout.AppBarView;
import com.google.android.material.appbar.KdsCustomAppBarLayoutBehavior;
import com.kds.headertabscrollview.event.CoordinatorScrollEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import ze.p;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class CoordinatorView$b implements KdsReboundBehavior$b	// class@000719
{
    public final CoordinatorView a;

    public void CoordinatorView$b(CoordinatorView p0){
       this.a = p0;
       super();
    }
    public final void a(int p0,int p1){
       CoordinatorView d;
       KdsReboundBehavior reboundBehav;
       p1 = - p0;
       this.a.F = p0;
       if (!p0) {
          d = this.a.D;
          if (d != null) {
             d.d();
          }
       }
       CoordinatorView$b ta = this.a;
       if (ta.E > null) {
          return;
       }else {
          d = ta.C;
          if (d != null) {
             reboundBehav = d.getReboundBehavior();
             if (reboundBehav != null) {
                reboundBehav = reboundBehav.G();
             label_0027 :
                WritableMap writableMap = Arguments.createMap();
                writableMap.putDouble("scrollY", (double)p.a((float)p1));
                writableMap.putDouble("progress", ((double)p1 / (double)reboundBehav));
                a.h(writableMap, "Arguments.createMap\(\).ap¡­ scrollableSize\)\)\n      }");
                this.a.a0(CoordinatorScrollEvent.ON_HEADER_BOTTOM_OFFSET_CHANGE, writableMap);
                return;
             }
          }
          reboundBehav = 1;
          goto label_0027 ;
       }
    }
}
