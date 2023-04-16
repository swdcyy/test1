package com.kuaishou.live.widget.view.LiveAutoScrollBanner$a;
import lnc.cb;
import com.kuaishou.live.widget.view.LiveAutoScrollBanner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.widget.page2.ViewPager2;

public class LiveAutoScrollBanner$a extends cb	// class@00103f
{

    public void LiveAutoScrollBanner$a(LiveAutoScrollBanner p0){
       super(p0);
    }
    public void a(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAutoScrollBanner$a.class, "1")) {
          return;
       }
       LiveAutoScrollBanner liveAutoScro = this.b();
       if (liveAutoScro != null) {
          Object obj = PatchProxy.apply(objArray, liveAutoScro, LiveAutoScrollBanner.class, "12");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(liveAutoScro.c != null && (liveAutoScro.d != null && (!liveAutoScro.getVisibility() && (liveAutoScro.g.getAdapter() != null && liveAutoScro.g.getAdapter().getItemCount() > 1)))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             if (!PatchProxy.applyVoid(objArray, liveAutoScro, LiveAutoScrollBanner.class, "11") && (liveAutoScro.g.getAdapter() != null && liveAutoScro.g.getAdapter().getItemCount() > 0)) {
                liveAutoScro.g.setCurrentItem(((liveAutoScro.getCurrentItem() + 1) % liveAutoScro.g.getAdapter().getItemCount()));
             }
          label_0083 :
             liveAutoScro.a();
          }
       }
       return;
    }
}
