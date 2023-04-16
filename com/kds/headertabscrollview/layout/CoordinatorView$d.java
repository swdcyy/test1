package com.kds.headertabscrollview.layout.CoordinatorView$d;
import sj.j;
import com.kds.headertabscrollview.layout.CoordinatorView;
import java.lang.Object;
import com.kds.headertabscrollview.event.CoordinatorScrollEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import ze.p;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kds.headertabscrollview.layout.FlingViewPager;

public final class CoordinatorView$d implements j	// class@00071b
{
    public final CoordinatorView a;

    public void CoordinatorView$d(CoordinatorView p0){
       this.a = p0;
       super();
    }
    public final void a(int p0,float p1,int p2){
       this.a.E = p2;
       WritableMap writableMap = Arguments.createMap();
       writableMap.putDouble("reboundOffset", (double)p.a((float)p2));
       writableMap.putDouble("progress", (double)p1);
       writableMap.putInt("type", p0);
       a.h(writableMap, "Arguments.createMap\(\).ap¡­Int\(\"type\", type\)\n      }");
       this.a.a0(CoordinatorScrollEvent.ON_REBOUND_OFFSET_CHANGE, writableMap);
       if (p0 == 2 && !p2) {
          CoordinatorView d = this.a.D;
          if (d != null) {
             d.d();
          }
       }
       return;
    }
}
