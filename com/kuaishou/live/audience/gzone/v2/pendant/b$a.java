package com.kuaishou.live.audience.gzone.v2.pendant.b$a;
import java.lang.Runnable;
import com.kuaishou.live.audience.gzone.v2.pendant.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lv1.d;
import androidx.viewpager.widget.ViewPager;
import android.os.Handler;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b$a implements Runnable	// class@000c3c
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       d c = this.b.c;
       c.setCurrentItem((c.getCurrentItem() + 1));
       b$a tb = this.b;
       tb.i.postDelayed(tb.n, 3000);
       b.Z(LiveLogTag.VIEW_PAGER_PENDANT, "onPendantViewLoopTask");
       return;
    }
}
