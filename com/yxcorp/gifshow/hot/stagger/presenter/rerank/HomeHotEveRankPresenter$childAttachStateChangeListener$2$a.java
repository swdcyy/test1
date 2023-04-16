package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$childAttachStateChangeListener$2$a;
import androidx.recyclerview.widget.RecyclerView$o;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$childAttachStateChangeListener$2;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenterKt;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.System;
import java.lang.Long;
import lnc.z9;
import vsd.n;
import lnc.y9;
import com.kwai.sdk.eve.proto.ShowEvent$Builder;
import com.kwai.sdk.eve.proto.ShowEvent;
import com.kwai.sdk.eve.proto.ContentType;
import k2b.k2;
import k2b.u1;
import java.lang.Number;
import com.kwai.sdk.eve.proto.ShowEvent$ShowType;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$childAttachStateChangeListener$2$a$a;
import java.lang.Runnable;
import t45.c;

public final class HomeHotEveRankPresenter$childAttachStateChangeListener$2$a implements RecyclerView$o	// class@0018b9
{
    public final HomeHotEveRankPresenter$childAttachStateChangeListener$2 b;

    public void HomeHotEveRankPresenter$childAttachStateChangeListener$2$a(HomeHotEveRankPresenter$childAttachStateChangeListener$2 p0){
       this.b = p0;
       super();
    }
    public void m3(View p0){
       k2 ok21;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeHotEveRankPresenterKt homeHotEveRa = HomeHotEveRankPresenterKt.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotEveRankPresenter$childAttachStateChangeListener$2$a.class, "2")) {
          return;
       }
       a.p(p0, "view");
       p0 = p0.getTag(R.id.item_view_bind_data);
       if (p0 != null && (p0 instanceof QPhoto && !r1.G2(p0.mEntity))) {
          long l = System.currentTimeMillis();
          if (!PatchProxy.isSupport(homeHotEveRa) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(l), null, homeHotEveRa, "4")) {
             HomeHotEveRankPresenterKt.c.f(p0, HomeHotEveRankPresenterKt.a[1], Long.valueOf(l));
          }
          ShowEvent$Builder uBuilder = ShowEvent.newBuilder();
          uBuilder.setContentId(p0.getPhotoId());
          uBuilder.setContentType(HomeHotEveRankPresenterKt.c(p0));
          String userId = p0.getUserId();
          String str = "";
          if (userId == null) {
             userId = str;
          }
          uBuilder.setAuthorId(userId);
          userId = p0.getExpTag();
          if (userId == null) {
             userId = str;
          }
          uBuilder.setExpTag(userId);
          userId = p0.getListLoadSequenceID();
          if (userId != null) {
             str = userId;
          }
          uBuilder.setLlsid(str);
          k2 ok2 = u1.j();
          str = "UNKNOWN2";
          if (ok2 != null) {
             ok2 = ok2.d;
             if (ok2 != null) {
             label_0095 :
                uBuilder.setPage(ok2);
                ok2 = u1.n();
                if (ok2 != null) {
                   ok2 = ok2.d;
                   if (ok2 != null) {
                      ok21 = ok2;
                   }
                }
                uBuilder.setReferPage(ok21);
                Number number = PatchProxy.applyOneRefs(p0, null, homeHotEveRa, "1");
                if (number == patchProxyRe) {
                   number = HomeHotEveRankPresenterKt.b.e(p0, HomeHotEveRankPresenterKt.a[0]);
                }
                uBuilder.setEnterTimestamp(number.longValue());
                Object obj = PatchProxy.applyOneRefs(p0, null, homeHotEveRa, "3");
                long l1 = (obj != patchProxyRe)? obj.longValue(): HomeHotEveRankPresenterKt.c.e(p0, HomeHotEveRankPresenterKt.a[1]).longValue();
                uBuilder.setLeaveTimestamp(l1);
                uBuilder.setType(ShowEvent$ShowType.COVER_SHOW);
                uBuilder.setPosition(p0.getPosition());
                uBuilder.setShowCount(HomeHotEveRankPresenterKt.b(p0));
                uBuilder.setClickCount(HomeHotEveRankPresenterKt.a(p0));
                ShowEvent showEvent = uBuilder.build();
                a.o(showEvent, "showEvent");
                EveManagerWrapper.e.n(showEvent);
             }
          }
          userId = str;
          goto label_0095 ;
       }
    label_010f :
       return;
    }
    public void w6(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotEveRankPresenter$childAttachStateChangeListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       p0 = p0.getTag(R.id.item_view_bind_data);
       if (p0 != null && (p0 instanceof QPhoto && !r1.G2(p0.mEntity))) {
          c.a(new HomeHotEveRankPresenter$childAttachStateChangeListener$2$a$a(this, p0));
       }
    label_0030 :
       return;
    }
}
