package com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a$a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cs5.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import cs5.g;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lv1.d;
import androidx.viewpager.widget.ViewPager;

public class a$a implements Runnable	// class@0016ee
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
          return;
       }
       f uof = this.b.j();
       if (uof != null) {
          Object obj = PatchProxy.apply(objArray, uof, f.class, "14");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): uof.m.i;
          if (b != null) {
             b.c0(LiveLogTag.LIVE_MINI_WIDGET, "isDisableAutoScroll: true", "widgetId", uof.z());
             return;
          }
       }
       a$a tb = this.b;
       if (tb.r == null) {
          return;
       }else if(tb.s != null){
          d c = tb.c;
          c.setCurrentItem((c.getCurrentItem() + 1));
       }else {
          tb.q();
       }
       return;
    }
}
