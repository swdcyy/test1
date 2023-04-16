package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$e;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.events.realaction.RealAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cia.w;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import xga.a;
import java.lang.Integer;
import rq4.r;
import rq4.n;
import rq4.o;

public final class FollowSlideAcquaintanceRecordPresenter$e implements g	// class@001111
{
    public final FollowSlideAcquaintanceRecordPresenter b;

    public void FollowSlideAcquaintanceRecordPresenter$e(FollowSlideAcquaintanceRecordPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       FollowSlideAcquaintanceRecordPresenter$e b;
       FollowSlideAcquaintanceRecordPresenter q;
       Object obj = this;
       RealAction obj1 = p0;
       FollowSlideAcquaintanceRecordPresenter uFollowSlide = FollowSlideAcquaintanceRecordPresenter.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, FollowSlideAcquaintanceRecordPresenter$e.class, "1")) {
       }else {
          String str = "FollowSlideAcquaintanceRecordPresenter";
          String str1 = "mFollowSlideInjectAdapter";
          String str2 = "FeedExt.getUser\(photo\) ?: return";
          String str3 = "action";
          if (obj1.mActionType == 7 && (obj1.mExtParams != null && obj1.mFeed != null)) {
             b = obj.b;
             a.o(obj1, str3);
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(obj1, b, uFollowSlide, "7")) {
                RealAction mFeed = obj1.mFeed;
                User user1 = r1.T1(mFeed);
                if (user1 != null) {
                   a.o(user1, str2);
                   FollowSlideAcquaintanceRecordPresenter p1 = b.p;
                   if (p1 == null) {
                      a.S(str1);
                   }
                   SlidePlayViewModel slidePlayVie1 = p1.O();
                   if (slidePlayVie1 != null) {
                      int i1 = slidePlayVie1.q(slidePlayVie1.M(new QPhoto(mFeed)));
                      if (i1 < 0) {
                         c.i(KsLogFollowTag.FOLLOW_ACQUAINTANCE.appendTag(str), "reportPhotoPlayDuration illegal position");
                      }else {
                         c.i(KsLogFollowTag.FOLLOW_ACQUAINTANCE.appendTag(str), "reportPhotoPlayDuration "+r1.t1(mFeed));
                         int i2 = 50;
                         String str4 = null;
                         a.o(mFeed, "photo");
                         String id = mFeed.getId();
                         q = b.p;
                         if (q == null) {
                            a.S(str1);
                         }
                         int i3 = q.P() ^ 0x01;
                         RealAction mExtParams = obj1.mExtParams;
                         RealAction$ExtParams mActualPlayD = (mExtParams != null)? mExtParams.mActualPlayDuration: null;
                         PymkLogSender.reportPhotoPlayDuration(i2, str4, id, user1, i1, i3, mActualPlayD);
                      }
                   }
                }
             }
          }
          if (obj1.mActionType == 9 && obj1.mExtParams != null) {
             b = obj.b;
             a.o(obj1, str3);
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(obj1, b, uFollowSlide, "6")) {
                obj1 = obj1.mFeed;
                User user = r1.T1(obj1);
                if (user != null) {
                   a.o(user, str2);
                   FollowSlideAcquaintanceRecordPresenter p = b.p;
                   if (p == null) {
                      a.S(str1);
                   }
                   SlidePlayViewModel slidePlayVie = p.O();
                   if (slidePlayVie != null) {
                      int i = slidePlayVie.q(slidePlayVie.M(new QPhoto(obj1)));
                      q = b.q;
                      if (q != null) {
                         KsLogFollowTag fOLLOW_ACQUA = KsLogFollowTag.FOLLOW_ACQUAINTANCE;
                         fOLLOW_ACQUA.appendTag(str);
                         KsLogFollowTag ksLogFollowT = fOLLOW_ACQUA;
                         c.i(ksLogFollowT, "reportNegativeClick "+r1.t1(obj1));
                         if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(q, Integer.valueOf(i), user, obj1, null, a.class, "2")) {
                            r or = a.a(50, q);
                            or.d = 3;
                            n on = new n();
                            on.a = user.getId();
                            on.d = i + 1;
                            or.g = on;
                            o oo = new o();
                            oo.a = r1.t1(obj1);
                            oo.b = r1.y1(obj1);
                            or.h = oo;
                            a.b(or);
                         }
                      }
                   }
                }
             }
          }
       }
    label_0160 :
       return;
    }
}
