package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$b;
import erd.g;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e50.g;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.hot.stagger.pagelist.j;
import java.util.List;
import qvb.a;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenterKt;
import java.lang.Integer;
import lnc.z9;
import vsd.n;
import lnc.y9;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Boolean;
import nsd.r0;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import java.util.Arrays;
import v40.b;
import com.kwai.sdk.eve.proto.ClickEvent$Builder;
import com.kwai.sdk.eve.proto.ClickEvent;
import com.kwai.sdk.eve.proto.ContentType;
import k2b.k2;
import k2b.u1;
import java.lang.System;
import com.kwai.sdk.eve.proto.ClickEvent$ClickType;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;

public final class HomeHotEveRankPresenter$b implements g	// class@0018b7
{
    public final HomeHotEveRankPresenter b;

    public void HomeHotEveRankPresenter$b(HomeHotEveRankPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PhotoDetailLogger photoDetailL1;
       boolean b;
       k2 ok21;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotEveRankPresenter$b.class, "1")) {
       }else {
          PhotoDetailLogger photoDetailL = null;
          g.l(this.b.y, p0, photoDetailL, 2, photoDetailL);
          List items = HomeHotEveRankPresenter.P8(this.b).getItems();
          a.o(items, "pageList.items");
          Iterator iterator = items.iterator();
          while (true) {
             if (iterator.hasNext()) {
                photoDetailL1 = iterator.next();
                Object obj = photoDetailL1;
                a.o(obj, "p");
                b = (obj.getEntity() == p0)? true: false;
                if (!b) {
                   continue ;
                }
             }else {
                photoDetailL1 = photoDetailL;
             }
             if (photoDetailL1 != null) {
                int i = HomeHotEveRankPresenterKt.a(photoDetailL1) + 1;
                HomeHotEveRankPresenterKt homeHotEveRa = HomeHotEveRankPresenterKt.class;
                if (!PatchProxy.isSupport(homeHotEveRa) || !PatchProxy.applyVoidTwoRefs(photoDetailL1, Integer.valueOf(i), photoDetailL, homeHotEveRa, "8")) {
                   HomeHotEveRankPresenterKt.e.f(photoDetailL1, HomeHotEveRankPresenterKt.a[3], Integer.valueOf(i));
                }
                i = this.b;
                Objects.requireNonNull(i);
                Boolean uBoolean = PatchProxy.apply(photoDetailL, i, HomeHotEveRankPresenter.class, "4");
                if (uBoolean == PatchProxyResult.class) {
                   uBoolean = i.u.getValue();
                }
                if (uBoolean.booleanValue()) {
                   i = new Object[]{this.b.y.b().getTaskId()};
                   i = String.format("custom_infer_%s", Arrays.copyOf(i, 1));
                   a.o(i, "java.lang.String.format\(format, *args\)");
                   b.b(i, "DEFAULT");
                   break ;
                }else {
                   i = ClickEvent.newBuilder();
                   i.setContentId(photoDetailL1.getPhotoId());
                   i.setContentType(HomeHotEveRankPresenterKt.c(photoDetailL1));
                   String userId = photoDetailL1.getUserId();
                   String str = "";
                   if (userId == null) {
                      userId = str;
                   }
                   i.setAuthorId(userId);
                   userId = photoDetailL1.getExpTag();
                   if (userId == null) {
                      userId = str;
                   }
                   i.setExpTag(userId);
                   userId = photoDetailL1.getListLoadSequenceID();
                   if (userId != null) {
                      str = userId;
                   }
                   i.setLlsid(str);
                   k2 ok2 = u1.j();
                   str = "UNKNOWN2";
                   if (ok2 != null) {
                      ok2 = ok2.d;
                      if (ok2 != null) {
                      label_0101 :
                         i.setPage(ok2);
                         ok2 = u1.n();
                         if (ok2 != null) {
                            ok2 = ok2.d;
                            if (ok2 != null) {
                               ok21 = ok2;
                            }
                         }
                         i.setReferPage(ok21);
                         i.setTimestamp(System.currentTimeMillis());
                         i.setType(ClickEvent$ClickType.CLICK);
                         i.setAction("OPEN_DETAIL");
                         i.setPosition(photoDetailL1.getPosition());
                         i = i.build();
                         a.o(i, "clickEvent");
                         EveManagerWrapper.e.n(i);
                         break ;
                      }
                   }
                   userId = str;
                   goto label_0101 ;
                }
             }
          }
       }
       return;
    }
}
