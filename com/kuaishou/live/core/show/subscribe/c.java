package com.kuaishou.live.core.show.subscribe.c;
import erd.g;
import com.kuaishou.live.core.show.subscribe.d$a;
import ok2.i;
import ps5.b;
import java.lang.String;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.kuaishou.live.core.show.subscribe.b;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import android.app.Activity;
import ok2.k;
import ok2.l;
import com.kuaishou.live.core.show.subscribe.b$a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.core.show.subscribe.d;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import y41.i$a;
import y41.i;
import android.content.Context;
import vq5.d;
import rk2.a;
import lp3.c;
import lp3.i;

public final class c implements g	// class@0010c3
{
    public final d$a b;
    public final i c;
    public final b d;
    public final String e;
    public final RxFragmentActivity f;
    public final b g;
    public final boolean h;

    public void c(d$a p0,i p1,b p2,String p3,RxFragmentActivity p4,b p5,boolean p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void accept(Object p0){
       d$a uoa3;
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       c tf = this.f;
       c tg = this.g;
       c th = this.h;
       Objects.requireNonNull(tb);
       d$a uoa = d$a.class;
       if (tc != null) {
          tc.a(p0);
       }
       if (td != null) {
          td.accept(Boolean.TRUE);
       }
       int i = 2;
       j.i(te, i);
       if (p0 != null && p0.mEnableWriteCalendar != null) {
          if (!j.g(tf, te, p0)) {
             j.h(tf, te, p0);
             k1.s(new l(tg, tf, new k(tf, te, p0)), tb.a, 1000);
          }
          if (!PatchProxy.applyVoidTwoRefs(tf, p0, tb, uoa, "4") && (p0.mEnableAutoFollow != null && !TextUtils.x(p0.mAnchorId))) {
             d$a uoa1 = null;
             td = (tf instanceof GifshowActivity)? tf: uoa1;
             d p = tb.a.p;
             if (p != null && !TextUtils.x(p.getLiveStreamId())) {
                uoa1 = tb.a.p.getLiveStreamId();
             }else {
                b.B(LiveLogTag.LIVE_SUBSCRIBE, "[LiveToSubscribePresenter][tryAutoFollow]liveStreamId is null");
             }
             i$a uoa2 = new i$a(td, uoa1).p(p0.mAnchorId);
             uoa2.n(207);
             uoa2.q(true);
             d p1 = tb.a.p;
             if (p1 != null) {
                String expTag = p1.getExpTag();
                Object[] objArray = new Object[]{tb.a.p.getUserId(),tb.a.p.getLiveStreamId(),expTag};
                uoa2.d(tb.a.p.getFullSource());
                uoa2.c(expTag);
                uoa2.m(String.format("ks://live/%s/%s/%s", objArray));
             }
             uoa2.a().c();
          }
       label_00dd :
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(tf, Boolean.valueOf(th), p0, tb, d$a.class, "2")) {
             if (!TextUtils.x(p0.mJumpUrl)) {
                if (th != null && p0.mReservationActivityType == true) {
                   tb.b(R.string.arg_RES_7f102bcd);
                }else {
                   tb.a.q.r4(p0.mJumpUrl, tf);
                }
             }else if(th != null){
                tb.b(R.string.arg_RES_7f102bcc);
             }else {
                tb.a.r.a(a.class).o8();
             }
          }
       }
    label_012c :
       return;
    }
}
