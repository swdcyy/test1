package com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment$b;
import qvb.f;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k37.p1;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import fq5.b;
import o37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import j37.d;
import j37.c;
import cjd.e;
import erd.o;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyTicketTaskResponse;
import la6.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;

public class LiveGzoneAudienceAccompanyTicketFragment$b extends f	// class@000c4d
{
    public final LiveGzoneAudienceAccompanyTicketFragment p;

    public void LiveGzoneAudienceAccompanyTicketFragment$b(LiveGzoneAudienceAccompanyTicketFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       String obj = PatchProxy.apply(null, this, LiveGzoneAudienceAccompanyTicketFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p.L.w().a.getLiveStreamId();
       LiveGzoneAccompanyGameInfo mGameId = (this.p.L.t() != null)? this.p.L.t().mGameInfo.mGameId: "";
       return c.b().o(obj, mGameId).map(new e());
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(LiveGzoneAccompanyTicketTaskResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAudienceAccompanyTicketFragment$b.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       if (TextUtils.x(p0.mAccompanyTaskRefreshTips)) {
          this.p.F.setVisibility(8);
       }else {
          this.p.F.setVisibility(0);
          this.p.F.setText(p0.mAccompanyTaskRefreshTips);
       }
       this.p.Gh(p0.mAccompanyTicketCount);
       return;
    }
}
