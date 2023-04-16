package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$b;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kp.r1;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import qrd.p;
import e50.g;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import qvb.i;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.sdk.eve.proto.ClickEvent$Builder;
import com.kwai.sdk.eve.proto.ClickEvent;
import com.kwai.sdk.eve.proto.ContentType;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenterKt;
import k2b.k2;
import k2b.u1;
import java.lang.System;
import com.kwai.sdk.eve.proto.ClickEvent$ClickType;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;

public final class HomeFollowEveRankPresenter$b implements g	// class@0011ea
{
    public final HomeFollowEveRankPresenter b;

    public void HomeFollowEveRankPresenter$b(HomeFollowEveRankPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b1;
       Boolean obj1;
       k2 ok21;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowEveRankPresenter$b.class, "1")) {
       }else {
          boolean b = true;
          if (p0 != null) {
             r1.V4(p0, b);
             r1.u5(p0);
          }
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          HomeFollowExperimentUtils homeFollowEx = HomeFollowExperimentUtils.class;
          Object[] objArray = null;
          HomeFollowExperimentUtils obj = PatchProxy.apply(objArray, objArray, homeFollowEx, "7");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = HomeFollowExperimentUtils.g;
             Objects.requireNonNull(obj);
             obj1 = PatchProxy.apply(objArray, obj, homeFollowEx, "5");
             if (obj1 == patchProxyRe) {
                obj1 = HomeFollowExperimentUtils.e.getValue();
             }
             b1 = obj1.booleanValue();
          }
          if (b1) {
             g.l(this.b.v, p0, objArray, 2, objArray);
             List items = HomeFollowEveRankPresenter.P8(this.b).getItems();
             a.o(items, "pageList.items");
             Iterator iterator = items.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                obj = obj1;
                a.o(obj, "p");
                obj = (obj.getEntity() == p0)? 1: null;
                if (obj) {
                   objArray = obj1;
                   break ;
                }
             }
             if (objArray != null) {
                p0 = ClickEvent.newBuilder();
                p0.setContentId(objArray.getPhotoId());
                p0.setContentType(HomeFollowEveRankPresenterKt.a(objArray));
                String userId = objArray.getUserId();
                String str = "";
                if (userId == null) {
                   userId = str;
                }
                p0.setAuthorId(userId);
                userId = objArray.getExpTag();
                if (userId == null) {
                   userId = str;
                }
                p0.setExpTag(userId);
                userId = objArray.getListLoadSequenceID();
                if (userId != null) {
                   str = userId;
                }
                p0.setLlsid(str);
                k2 ok2 = u1.j();
                str = "UNKNOWN2";
                if (ok2 != null) {
                   ok2 = ok2.d;
                   if (ok2 != null) {
                   label_00ca :
                      p0.setPage(ok2);
                      ok2 = u1.n();
                      if (ok2 != null) {
                         ok2 = ok2.d;
                         if (ok2 != null) {
                            ok21 = ok2;
                         }
                      }
                      p0.setReferPage(ok21);
                      p0.setTimestamp(System.currentTimeMillis());
                      p0.setType(ClickEvent$ClickType.CLICK);
                      p0.setAction("OPEN_DETAIL");
                      p0.setPosition(objArray.getPosition());
                      p0 = p0.build();
                      a.o(p0, "clickEvent");
                      EveManagerWrapper.e.n(p0);
                   }
                }
                userId = str;
                goto label_00ca ;
             }
          }
       }
       return;
    }
}
