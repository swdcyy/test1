package com.kuaishou.live.core.show.luckystar.currentinfo.a;
import erd.g;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yb2.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarInfo;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger$StatusValue;
import com.google.common.base.Optional;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import java.util.Set;
import com.kuaishou.live.core.show.luckystar.currentinfo.c$b;
import mkc.b;
import android.view.View;
import mkc.c;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import wb5.g;
import ac2.i;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import android.widget.TextView;

public final class a implements g	// class@000cc1
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i c;
       c v;
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mLuckyStarInfo;
       tb.L = p0;
       Object[] objArray = null;
       if (p0 != null) {
          c uoc = c.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoc, "6")) {
             boolean b = true;
             if (tb.N == null) {
                ClientContent$LiveStreamPackage liveStreamPa = tb.v.a.a();
                c = tb.v.c;
                LiveLuckyStarLogger$StatusValue tRUE = (p0.getUserParticipateInfo().mParticipated != null)? LiveLuckyStarLogger$StatusValue.TRUE: LiveLuckyStarLogger$StatusValue.FALSE;
                LiveLuckyStarLogger.c(liveStreamPa, c, tRUE, tb.v.o, "", tb.x);
                tb.N = b;
             }
             if (p0.getUserParticipateInfo().mParticipated != null) {
                v = tb.v;
                v.h.add(v.c);
             }
             v = tb.K;
             Objects.requireNonNull(v);
             if (!PatchProxy.applyVoid(objArray, v, c$b.class, "1")) {
                b[] uobArray = new b[]{b.d,b.g};
                c.d(v.a.H, uobArray);
                c j = v.a.J;
                int childCount = j.getChildCount();
                int i = 0;
                while (i < childCount) {
                   View childAt = j.getChildAt(i);
                   if (childAt.getVisibility() == 8) {
                      Object obj = PatchProxy.applyOneRefs(childAt, v, c$b.class, "2");
                      boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): k.a(childAt.getTag(R.id.live_lucky_star_loading_tips_tag), c.O);
                      if (b1) {
                         childAt.setVisibility(0);
                      }
                   }
                   i = i + 1;
                }
             }
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uoc, "11") && !q.f(p0.mBackgroundCdnUrls)) {
                tb.y.P(p0.mBackgroundCdnUrls);
             }
             if (!PatchProxy.applyVoid(objArray, tb, uoc, "10")) {
                User user = tb.v.a.I();
                tb.z.setVisibility(0);
                g.b(tb.z, user, HeadImageSize.ADJUST_MIDDLE);
                tb.z.setOnClickListener(new i(tb, user));
             }
             tb.W8();
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uoc, "8")) {
                tb.B.setText(p0.mTitle);
                tb.I.setVisibility(0);
                tb.C.setText(p0.mDescription);
                tb.D.setText(String.valueOf(p0.mLuckyUserCount));
             }
             tb.X8(p0);
          }
       }else {
          tb.S8(objArray);
       }
       return;
    }
}
