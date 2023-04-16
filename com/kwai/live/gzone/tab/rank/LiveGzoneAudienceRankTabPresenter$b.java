package com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter$b;
import androidx.viewpager.widget.ViewPager$l;
import com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab;
import i63.b;
import com.kwai.live.gzone.tab.page.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import dz1.a;

public class LiveGzoneAudienceRankTabPresenter$b extends ViewPager$l	// class@000e20
{
    public int b;
    public final LiveGzoneAudienceRankTabPresenter c;

    public void LiveGzoneAudienceRankTabPresenter$b(LiveGzoneAudienceRankTabPresenter p0){
       this.c = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       if (this.b != null) {
          return;
       }
       if (p0 == 1) {
          this.b = 2;
       }else if(p0 == 2){
          this.b = 3;
       }
       return;
    }
    public void onPageSelected(int p0){
       LiveGzoneAudienceRankTabPresenter$b uob = LiveGzoneAudienceRankTabPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       PagerSlidingTabStrip$d uod = this.c.w.b(p0);
       if (uod != null) {
          if (this.b == 2) {
             this.c.A = LiveGzoneTabSource.SWITCH;
             a.p(uod.b().getText().toString(), uod.c(), p0, this.c.q.t().d(), this.c.q.t().e(), this.c.q.n(), true, false, this.c.s.a());
          }
          this.c.X8(uod, p0);
          this.c.Y8(p0);
       }
       return;
    }
}
