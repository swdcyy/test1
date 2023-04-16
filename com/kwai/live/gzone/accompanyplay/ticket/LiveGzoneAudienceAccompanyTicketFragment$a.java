package com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyTicketTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import o37.a;
import k37.a0;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import k37.p1;
import fq5.b;
import j37.d;
import j37.c;
import brd.t;
import cjd.e;
import erd.o;
import com.kwai.live.gzone.accompanyplay.ticket.LiveGzoneAudienceAccompanyTicketFragment$a$a;
import com.kwai.live.gzone.accompanyplay.ticket.a;
import crd.b;

public class LiveGzoneAudienceAccompanyTicketFragment$a implements g	// class@000c4c
{
    public final LiveGzoneAudienceAccompanyTicketFragment b;

    public void LiveGzoneAudienceAccompanyTicketFragment$a(LiveGzoneAudienceAccompanyTicketFragment p0){
       this.b = p0;
       super();
    }
    public void a(LiveGzoneAccompanyTicketTask p0){
       ClientContent$LiveStreamPackage liveStreamPa;
       i3 oi3;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceAccompanyTicketFragment$a.class, "1")) {
          return;
       }
       LiveGzoneAccompanyTicketTask mTaskStatus = p0.mTaskStatus;
       String str = "task_id";
       LiveGzoneAudienceAccompanyTicketFragment$a uoa = 2;
       if (mTaskStatus != uoa) {
          if (mTaskStatus != 3) {
             this.b.K.o1();
             if (p0.mTaskType == uoa) {
                this.b.K.k1();
             }
             liveStreamPa = this.b.L.a();
             a uoa1 = this.b.L.t();
             p0 = p0.mTaskId;
             if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, uoa1, p0, null, a0.class, "10")) {
                oi3 = a0.a(uoa1);
                oi3.d(str, TextUtils.k(p0));
                a0.e("DOTASK_BUTTON", oi3.e(), liveStreamPa, uoa1);
             }
          }
       }else {
          this.b.J = c.b().e(this.b.L.w().a.getLiveStreamId(), p0.mTaskId).map(new e()).subscribe(new LiveGzoneAudienceAccompanyTicketFragment$a$a(this, p0), a.b);
          liveStreamPa = this.b.L.a();
          a uoa2 = this.b.L.t();
          LiveGzoneAccompanyTicketTask mTaskId = p0.mTaskId;
          p0 = p0.mTaskRewardCount;
          if (!PatchProxy.applyVoidFourRefs(liveStreamPa, uoa2, mTaskId, p0, null, a0.class, "11")) {
             oi3 = a0.a(uoa2);
             oi3.d(str, TextUtils.k(mTaskId));
             oi3.d("task_tickets_num", p0);
             a0.e("GET_TICKET", oi3.e(), liveStreamPa, uoa2);
          }
       }
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
