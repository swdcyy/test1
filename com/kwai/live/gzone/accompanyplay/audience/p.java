package com.kwai.live.gzone.accompanyplay.audience.p;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment;
import java.lang.Object;
import o37.a;
import java.util.Objects;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAudienceAccompanyFleetInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySettingInfo;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.kwai.library.widget.viewpager.tabstrip.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$e;
import android.content.Context;
import androidx.fragment.app.Fragment;
import lnc.a1;
import android.widget.TextView;
import f37.o0;
import android.view.View;
import k37.e;
import android.view.View$OnClickListener;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$c;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment;
import android.os.Bundle;
import java.util.ArrayList;
import ekd.j;
import java.util.List;

public final class p implements g	// class@000bab
{
    public final LiveGzoneAccompanyTabHostFragment b;

    public void p(LiveGzoneAccompanyTabHostFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mFleetInfo.mSettingInfo.isFree()) {
          int i = 1;
          if (tb.v.j() == i) {
             p0 = new b[i];
             LiveGzoneAccompanyTabHostFragment$c uoc = PatchProxy.apply(null, tb, LiveGzoneAccompanyTabHostFragment.class, "3");
             if (uoc != PatchProxyResult.class) {
             }else {
                GzonePagerSlidingTabStrip$e uoe = new GzonePagerSlidingTabStrip$e("ticketTab", o0.e(tb.getContext(), a1.p(0x7f1023ca)));
                uoe.i(new e(tb, uoe));
                uoc = new LiveGzoneAccompanyTabHostFragment$c(tb, uoe, LiveGzoneAudienceAccompanyTicketFragment.class, null);
             }
             p0[0] = uoc;
             tb.mh(j.a(p0));
          }
       }
       return;
    }
}
