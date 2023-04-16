package com.kuaishou.live.rerank.f$b;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.rerank.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.rerank.LiveRerankLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.rerank.d;
import java.lang.Float;
import rf5.u;
import java.util.Objects;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class f$b implements ViewPager$i	// class@000f69
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       LiveRerankLogTag lIVE_RERANK = LiveRerankLogTag.LIVE_RERANK;
       lIVE_RERANK.appendTag("LiveRerankPresenter");
       b.S(lIVE_RERANK, "onPageScrollStateChanged", "state", Integer.valueOf(p0));
       if (!p0 && !this.b.S8()) {
          lIVE_RERANK.appendTag("LiveRerankPresenter");
          b.P(lIVE_RERANK, "scroll state change to IDLE , next feed is NOT unexposed live");
          this.b.s.c();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       QPhoto obj;
       boolean b1;
       f uof = f.class;
       if (PatchProxy.isSupport(f$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, f$b.class, "1")) {
          return;
       }
       if (p1 - false > 0 && !this.b.q.w()) {
          f$b tb = this.b;
          Objects.requireNonNull(tb);
          String str = 1;
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tb, uof, "5")) {
             p2 = tb.r.q(p0);
             if (p2 < tb.r.Y0() && p2 >= 0) {
                tb.P8(tb.r.T0(p2));
                if (p2 < (tb.r.Y0() - 1)) {
                   tb.P8(tb.r.T0((p2 + str)));
                }
             }
          }
          if (!this.b.s.a()) {
             tb = this.b;
             boolean b = false;
             if (tb.s.d != 2) {
                str = null;
             }
             if (!str) {
                Objects.requireNonNull(tb);
                if (PatchProxy.isSupport(uof)) {
                   obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), tb, uof, "8");
                   if (obj != PatchProxyResult.class) {
                      b1 = obj.booleanValue();
                   label_00e8 :
                      if (b1) {
                         this.b.s.d();
                      }
                   }
                }
                p0 = tb.r.q(p0);
                if (p0 < (tb.r.Y0() - 2)) {
                   obj = tb.r.T0((p0 + 2));
                   b = tb.R8(obj);
                   if (b) {
                      LiveRerankLogTag lIVE_RERANK = LiveRerankLogTag.LIVE_RERANK;
                      lIVE_RERANK.appendTag("LiveRerankPresenter");
                      b.T(lIVE_RERANK, "pending to show feed before unexposed live", "currentPosition", Integer.valueOf(p0), "liveStreamId", obj.getLiveStreamId());
                   }
                }
                b1 = b;
                goto label_00e8 ;
             }
          }
       }
    label_00f1 :
       return;
    }
    public void onPageSelected(int p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       f$b tb = this.b;
       tb.P8(tb.r.getCurrentPhoto());
       if (this.b.S8()) {
          this.b.s.d();
       }
       return;
    }
}
