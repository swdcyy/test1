package com.kuaishou.live.core.show.closepage.audience.basicinfo.f$b;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import t02.a0;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Set;
import crd.b;
import lnc.b9;

public class f$b implements ViewPager$i	// class@000a39
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(f$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, f$b.class, "1")) {
          return;
       }
       f q = this.b.q;
       q.p.mInterceptAutoJumpFeedSet.add(q.c.mEntity.getGrootId());
       this.b.S8();
       b9.a(this.b.C);
       return;
    }
    public void onPageSelected(int p0){
    }
}
