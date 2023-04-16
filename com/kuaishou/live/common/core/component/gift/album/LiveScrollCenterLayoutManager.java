package com.kuaishou.live.common.core.component.gift.album.LiveScrollCenterLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.kuaishou.live.common.core.component.gift.album.LiveScrollCenterLayoutManager$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class LiveScrollCenterLayoutManager extends LinearLayoutManager	// class@001139
{
    public final LiveScrollCenterLayoutManager$a r;

    public void LiveScrollCenterLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       this.r = new LiveScrollCenterLayoutManager$a(p0);
    }
    public void scrollToPosition(int p0){
       LiveScrollCenterLayoutManager liveScrollCe = LiveScrollCenterLayoutManager.class;
       if (PatchProxy.isSupport(liveScrollCe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveScrollCe, "1")) {
          return;
       }
       this.r.p(p0);
       this.startSmoothScroll(this.r);
       return;
    }
}
