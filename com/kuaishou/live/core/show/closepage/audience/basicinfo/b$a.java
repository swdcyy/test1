package com.kuaishou.live.core.show.closepage.audience.basicinfo.b$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import f12.d;
import crd.b;
import lnc.b9;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import f52.i;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b$a implements ViewPager$i	// class@000a32
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       boolean b;
       b uob = b.class;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.b;
       if (uoa.y != null && (!p0 && uoa.x != null)) {
          b w = uoa.w;
          if (w != null) {
             int i = 1;
             if (w.f() > i) {
                b9.a(this.b.v);
                b$a tb = this.b;
                Objects.requireNonNull(tb);
                Object obj = PatchProxy.apply(null, tb, uob, "11");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(tb.w.E() && tb.w.F()){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   tb = this.b;
                   LiveStreamFeed[] liveStreamFe = new LiveStreamFeed[i];
                   liveStreamFe[0] = tb.x;
                   tb.w.v(Lists.e(liveStreamFe), null, "LivePlayClosedAutoJumpPresenter");
                   this.b.P8();
                }else {
                   k1.p(new i(this), uob);
                }
                b.P(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedAutoJumpPresenter"), " feed removed");
             }
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       b$a tb = this.b;
       tb.y = true;
       k1.m(tb.C);
       b.P(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedAutoJumpPresenter"), " onPageSelected");
       return;
    }
}
