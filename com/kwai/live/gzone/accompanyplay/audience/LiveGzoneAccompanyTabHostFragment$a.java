package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$l;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import o37.a;
import k37.a0;
import lnc.i3;

public class LiveGzoneAccompanyTabHostFragment$a extends ViewPager$l	// class@000b5c
{
    public final LiveGzoneAccompanyTabHostFragment b;

    public void LiveGzoneAccompanyTabHostFragment$a(LiveGzoneAccompanyTabHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       LiveGzoneAccompanyTabHostFragment$a tb;
       LiveGzoneAccompanyTabHostFragment$a uoa = LiveGzoneAccompanyTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       PagerSlidingTabStrip$d uod = this.b.vh(p0);
       if (uod != null) {
          String str = "ticketTab";
          if (TextUtils.n(uod.c(), str)) {
             if (TextUtils.n(this.b.G, str)) {
                uod.H = "click";
             }else {
                tb = this.b;
                if (tb.H == null) {
                   tb.H = "slide";
                }
             }
             ClientContent$LiveStreamPackage liveStreamPa = this.b.B.a();
             a uoa1 = this.b.B.t();
             LiveGzoneAccompanyTabHostFragment h = this.b.H;
             if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, uoa1, h, null, a0.class, "3")) {
                i3 oi3 = a0.a(uoa1);
                oi3.d("click_pattern", h);
                a0.e("ACCOMPANY_PLAY_TICKETS_BUTTON", oi3.e(), liveStreamPa, uoa1);
             }
          }
       }
       tb = this.b;
       tb.G = null;
       tb.H = null;
       return;
    }
}
