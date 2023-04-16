package com.yxcorp.gifshow.featured.detail.featured.c;
import erd.g;
import com.yxcorp.gifshow.featured.detail.featured.t;
import lfa.a;
import n50.a$a;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import tkd.b;
import tkd.d;
import nl9.c0;
import java.util.List;
import wkd.b;
import nda.a;
import com.yxcorp.gifshow.featured.detail.featured.a;
import ok.h;
import com.google.common.collect.Lists;
import com.kwai.component.feedsmonitor.f;
import mda.c;
import java.lang.Boolean;
import com.kwai.component.feedsmonitor.report.FeedReportLifecycle$Event;
import io.reactivex.subjects.PublishSubject;
import lda.r;
import java.lang.Runnable;
import yb7.p;
import h50.h;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import h50.f;
import e50.i;
import qvb.n0;
import wj5.c;
import gb5.a;
import com.yxcorp.gifshow.action.i;
import yv8.c;
import yv8.a;
import um9.d;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.commoninsertcard.CommonCardPhotoAdaptUtil$doOnNasaHomeSlidePageList$invitePageList$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.feature.api.feed.growth.model.invite.InviteSlidePageFeedModel;
import tl8.d;
import com.kwai.feature.api.feed.growth.model.invite.InviteCardMeta;
import com.yxcorp.gifshow.commoninsertcard.entity.d;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta$TkConfigInfo;
import java.util.Set;
import java.util.Objects;
import um9.c;
import tx4.f;
import com.kuaishou.tk.api.a;
import um9.h;
import java.lang.StringBuilder;
import q87.c;

public final class c implements g	// class@000f0a
{
    public final t b;
    public final a c;
    public final a$a d;

    public void c(t p0,a p1,a$a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       String tkBundleId;
       d a;
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       int i = tb.v.get();
       t ot = t.class;
       if (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i), tb, ot, "38")) {
          d.a(-500494672).t60(p0.getItems(), 11, i);
       }
       tb.B2(p0);
       b.a(0x8ca227e).b(p0, tc);
       t i1 = tb.I;
       String str = "1";
       if (i1 != null) {
          i1.a(Lists.h(p0.getItems(), a.b), p0.mLlsid, p0.mDegradeType);
          i1 = tb.J;
          if (i1 != null) {
             c uoc = c.class;
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, i1, uoc, str)) {
                i1.a.onNext(FeedReportLifecycle$Event.REPORT_ONLY_DUL);
             }
          }
       }
       p.d(new r(tb, p0, td));
       if (p0.mEnableItemFeature != null) {
          h.b.a(tb.t.b()).a(p0.mLlsid, tb.t.v2(), p0.mQPhotos, tb.K());
       }
       if (!tb.K()) {
          c.o.e(5);
       }
       b.a(0x8708467).k("featured", true);
       a uoa = null;
       b.a(-129117978).d(tb.N, uoa);
       p0 = p0.mQPhotos;
       d uod = d.class;
       if (!PatchProxy.applyVoidOneRefs(p0, uoa, uod, str)) {
          a.p(p0, "list");
          p0 = SequencesKt___SequencesKt.V2(SequencesKt___SequencesKt.i0(CollectionsKt___CollectionsKt.l1(p0), CommonCardPhotoAdaptUtil$doOnNasaHomeSlidePageList$invitePageList$1.INSTANCE));
          int i2 = 0;
          ArrayList uArrayList = (p0 == null || p0.isEmpty())? 1: null;
          if (!uArrayList) {
             uArrayList = new ArrayList();
             p0 = p0.iterator();
             while (p0.hasNext()) {
                QPhoto qPhoto = p0.next();
                if (r1.K2(qPhoto.mEntity)) {
                   InviteSlidePageFeedModel obj = qPhoto.mEntity.a(InviteSlidePageFeedModel.class);
                   a.o(obj, "it.mEntity.get\(\n        ¡­lass.java\n              \)");
                   obj = obj.mInviteCardMeta;
                   if (obj != null) {
                      tkBundleId = obj.getTkBundleId();
                   }else {
                   label_014b :
                      tkBundleId = uoa;
                   }
                }else if(d.b(qPhoto.mEntity)){
                   CommonInsertCardFeedMeta$TkConfigInfo obj1 = qPhoto.mEntity.a(CommonInsertCardFeed.class);
                   a.o(obj1, "it.mEntity.get\(\n        ¡­lass.java\n              \)");
                   obj1 = obj1.mCommonInsertCardFeedMeta.mTkConfigInfo.mBundleId;
                }else {
                   goto label_014b ;
                }
                if (tkBundleId != null) {
                   uArrayList.add(tkBundleId);
                }
             }
             p0 = CollectionsKt___CollectionsKt.G5(CollectionsKt___CollectionsKt.L5(uArrayList));
             a = d.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(p0, a, uod, "4")) {
                a.b(p0, true, new c());
             }
             Object[] objArray = new Object[i2];
             h.C().w("CommonCardPhotoAdaptUtil", "Ô¤äÖÈ¾ÉÏÏÂ»¬tk¿¨Æ¬ -> "+p0, objArray);
          }
       }
       return;
    }
}
