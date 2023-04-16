package com.kuaishou.live.core.show.closepage.audience.basicinfo.g$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import f12.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import f52.q;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class g$a implements ViewPager$i	// class@000a3b
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       boolean b;
       g og = g.class;
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       if (uoa.r != null && (!p0 && uoa.q != null)) {
          g p = uoa.p;
          if (p != null) {
             int i = 1;
             if (p.f() > i) {
                g$a tb = this.b;
                Objects.requireNonNull(tb);
                Object obj = PatchProxy.apply(null, tb, og, "4");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(tb.p.E() && tb.p.F()){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   tb = this.b;
                   LiveStreamFeed[] liveStreamFe = new LiveStreamFeed[i];
                   liveStreamFe[0] = tb.q;
                   tb.p.v(Lists.e(liveStreamFe), null, "LivePlayClosedEndFilterPresenter");
                   this.b.P8();
                }else {
                   k1.p(new q(this), og);
                }
                b.P(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedEndFilterPresenter"), " feed removed");
             }
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       p0.r = true;
    }
}
