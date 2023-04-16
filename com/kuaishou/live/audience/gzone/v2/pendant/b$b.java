package com.kuaishou.live.audience.gzone.v2.pendant.b$b;
import java.lang.Runnable;
import com.kuaishou.live.audience.gzone.v2.pendant.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import java.util.Objects;
import lv1.d;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import lv1.g;
import android.view.ViewGroup;
import java.lang.System;
import android.view.View;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b$b implements Runnable	// class@000c3d
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$b.class, "1")) {
          return;
       }
       b$b tb = this.b;
       long l = 1000;
       tb.i.postDelayed(tb.o, l);
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, b.class, "18")) {
          if (tb.k()) {
             tb.i.removeCallbacks(tb.o);
          }else {
             g og = tb.d.get((tb.c.getCurrentItem() % tb.d.size()));
             if (!tb.c.getVisibility()) {
                og.g = og.g + l;
             }
             if (!og.g()) {
                og.i = System.currentTimeMillis();
                tb.i(og.h());
             }
             Object[] objArray1 = new Object[0];
             a.C().s("ViewPagerController", "updatePendantViewShowedDuration: "+og.i()+":"+og.j(), objArray1);
          }
       }
       b.Z(LiveLogTag.VIEW_PAGER_PENDANT, "onPendantViewShowedTimeUpdateTask");
       return;
    }
}
