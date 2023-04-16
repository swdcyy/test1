package com.kuaishou.live.core.show.vote.presenter.b;
import lf3.g;
import com.kuaishou.live.core.show.vote.presenter.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoteChanged;
import t02.a0;
import java.lang.String;
import p91.m;
import java.util.Objects;
import com.kuaishou.live.core.show.vote.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import z12.e;
import com.kuaishou.live.core.show.vote.model.VoteMessageInfo;
import java.lang.System;
import o56.c;
import o56.a;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import crd.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.show.vote.e$b;
import yl2.a;
import o02.e;
import brd.t;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import wl2.m;
import wl2.n;
import erd.g;
import android.os.Message;
import hoc.c;
import lf3.f;

public final class b implements g	// class@00123e
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       LiveStreamMessages$SCVoteChanged voteId;
       boolean b;
       e f;
       b tb = this.b;
       if (tb.U == null) {
          tb.e9();
       }
       c u = tb.U;
       String liveStreamId = tb.M.Z2.getLiveStreamId();
       Objects.requireNonNull(u);
       e uoe = e.class;
       if (!PatchProxy.applyVoidTwoRefs(p0, liveStreamId, u, uoe, "1")) {
          String[] stringArray = new String[0];
          e.c("LiveVoteAudienceManager", "change vote state"+liveStreamId+" "+p0, stringArray);
          u.d.updateFromVoteMessage(p0, 0);
          if (!PatchProxy.applyVoidOneRefs(p0, u, uoe, "14")) {
             long l1 = System.currentTimeMillis();
             if ((l1 - u.k) - 5000 >= 0 || a.a().c()) {
                String[] stringArray2 = new String[0];
                e.c("LiveVoteAudienceManager", "MESSAGE:change:voteId:"+p0.voteId+a.a.q(p0), stringArray2);
                u.k = l1;
             }
          }
          voteId = p0.voteId;
          e obj = PatchProxy.applyOneRefs(voteId, u, uoe, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = u.h;
             b = (obj == null || !TextUtils.n(obj.mVote.mVoteId, voteId))? true: false;
          }
          if (b) {
             LiveStreamMessages$SCVoteChanged voteId1 = p0.voteId;
             long l = u.a(p0.displayMaxDelayMillis);
             if (!PatchProxy.isSupport(uoe) || (PatchProxy.applyVoidThreeRefs(liveStreamId, voteId1, Long.valueOf(l), u, e.class, "4") || (u.g == null && u.j < 3))) {
                f = u.f;
                if (f == null || f.isDisposed()) {
                   if (!QCurrentUser.ME.isLogined()) {
                      String[] stringArray1 = new String[0];
                      e.c("LiveVoteAudienceManager", "loadVoteInfo: not login", stringArray1);
                      u.l = true;
                      u.b.e(voteId1);
                   }else {
                      u.l = false;
                      u.f = e.p().c(voteId1).delaySubscription(l, TimeUnit.MILLISECONDS).map(new e()).subscribe(new m(u), new n(u));
                   }
                }
             }
          }else {
             f = u.a;
             f.l(f.f(true, u.d));
          }
       }
    label_0136 :
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
