package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$g;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import up.a;
import com.kuaishou.android.model.actionreport.PhotoActionReportParams;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Long;
import k2b.e0;
import k2b.u1;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.lang.System;
import wy5.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import xy5.j;
import kz9.a;
import io.reactivex.internal.functions.Functions;
import crd.b;
import qp7.b;
import qp7.x0;
import js7.o;

public final class CollectElement$g implements g	// class@00149a
{
    public final CollectElement b;

    public void CollectElement$g(CollectElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       CollectElement v;
       PhotoDetailParam mPhoto;
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectElement$g.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          CollectElement uCollectElem = CollectElement.class;
          if (!PatchProxy.applyVoid(null, p0, uCollectElem, "11")) {
             if (!PatchProxy.applyVoid(null, p0, uCollectElem, "13")) {
                v = p0.u;
                if (v == null) {
                   a.S("mParam");
                }
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                mPhoto = v.mPhoto;
                a.o(mPhoto, "mPhoto");
                uContentPack.photoPackage = w1.f(mPhoto.getEntity());
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "COLLECTION_BUTTON";
                i3 oi3 = i3.f();
                PhotoDetailParam mPhoto1 = v.mPhoto;
                a.o(mPhoto1, "mPhoto");
                String str = (mPhoto1.isCollected())? "CANCEL_COLLECTION": "TO_COLLECTION";
                oi3.d("collection_type", str);
                oi3.d("source", "RIGHT_BAR");
                PhotoDetailParam mPhoto2 = v.mPhoto;
                if (mPhoto2 != null) {
                   a actionReport = mPhoto2.getActionReportFetcher();
                   if (actionReport != null) {
                      PhotoActionReportParams photoActionR = actionReport.a();
                      if (photoActionR != null) {
                         oi3.c("play_cnt", Integer.valueOf(photoActionR.mPlayCnt));
                         oi3.c("play_time", Long.valueOf(photoActionR.mActionRelativeTime));
                      }
                   }
                }
                uElementPack.params = oi3.e();
                v = p0.x;
                if (v == null) {
                   a.S("mFragment");
                }
                u1.L("", v, true, uElementPack, uContentPack);
             }
             if (!VisitorModeManager.g(11)) {
                v = p0.v;
                if (v == null) {
                   a.S("mPhoto");
                }
                if (!v.isCollected()) {
                   a.k(System.currentTimeMillis());
                }
                v = p0.w;
                if (v == null) {
                   a.S("mCollectHelper");
                }
                t ot = v.a(p0.Q, "RIGHT_ACTION_BAR");
                if (ot != null) {
                   b uob = ot.subscribe(a.b, Functions.e);
                   a.o(uob, "subscribe\({ }, Functions.ERROR_CONSUMER\)");
                   p0.j(uob);
                }
                v = p0.v;
                if (v == null) {
                   a.S("mPhoto");
                }
                if (v.isCollected()) {
                   if (!PatchProxy.applyVoid(null, p0, uCollectElem, "14")) {
                      p0.o0();
                      p0.p0(false);
                   }
                }else if(PatchProxy.applyVoid(null, p0, uCollectElem, "15")){
                   p0.o0();
                   p0.p0(true);
                }
                o oo = p0.E();
                p0 = p0.v;
                if (p0 == null) {
                   a.S("mPhoto");
                }
                oo.l(p0.isCollected());
             }
          }
       }
       return;
    }
}
