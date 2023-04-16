package com.yxcorp.gifshow.ad.detail.presenter.log.d$a;
import p1a.a;
import com.yxcorp.gifshow.ad.detail.presenter.log.d;
import java.lang.Object;
import p1a.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import java.lang.CharSequence;
import java.lang.Long;
import tl8.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.log.model.CommonParams;
import k2b.u1;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y09.m;
import java.lang.Runnable;
import y09.l;

public class d$a implements a	// class@001662
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public GifshowActivity a(a$a p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       int i = 1;
       obj.type = i;
       obj.action = p0.b;
       obj.status = p0.g;
       obj.name = TextUtils.k(p0.c);
       obj.action2 = TextUtils.k(p0.e);
       obj.params = TextUtils.k(p0.p);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = w1.f(this.a.t.mEntity);
       uContentPack.photoPackage = photoPackage;
       a$a b = p0.b;
       if (b != 306) {
          if (b != 810) {
             if (b == 0x75d7 && !TextUtils.x(p0.m)) {
                uContentPack.photoPackage.authorId = Long.parseLong(p0.m);
             }
          }else {
             obj.index = i;
          }
       }else {
          b = p0.a;
          if (i == b) {
             obj.index = i;
          }else if(2 == b){
             obj.index = 2;
          }
          photoPackage.fullScreenDisplay = this.a.u;
       }
       a$a l = p0.l;
       if (l != null) {
          uContentPack.liveStreamPackage = l;
       }
       l = p0.k;
       if (l != null) {
          uContentPack.photoSeekBarDragPackage = l;
       }
       l = p0.n;
       if (l != null) {
          l.apply(uContentPack);
       }
       if (!TextUtils.x(p0.q)) {
          uContentPack.ksOrderInfoPackage = l0.a(p0.q);
       }
       p0.r(i);
       u1.B(new ClickMetaData().setLogPage(this.a.r).setType(p0.a).setDirection(p0.h).setElementPackage(obj).setContentPackage(uContentPack).setIsRealTime(false).setFeedLogCtx(p0.w).setCommonParams(p0.e()));
       return null;
    }
    public void b(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = p0.c;
       uElementPack.type = 2;
       int i = 0;
       uElementPack.status = i;
       uElementPack.action = p0.b;
       uElementPack.action2 = TextUtils.k(p0.e);
       uElementPack.params = TextUtils.k(p0.p);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.a.t.mEntity);
       a$a n = p0.n;
       if (n != null) {
          n.apply(uContentPack);
       }
       if (!q.f(p0.i)) {
          ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
          ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[p0.i.size()];
          while (i < p0.i.size()) {
             User user = p0.i.get(i);
             if (user != null) {
                ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                userPackage.identity = user.getId();
                userPackageA[i] = userPackage;
             }
             i = i + 1;
          }
          uBatchUserPa.userPackage = userPackageA;
          uContentPack.batchUserPackage = uBatchUserPa;
       }
       if (!TextUtils.x(p0.q)) {
          uContentPack.ksOrderInfoPackage = l0.a(p0.q);
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.contentPackage = p0.d(uContentPack);
       showEvent.elementPackage = uElementPack;
       if (p0.t != null) {
          if (this.a.s.enableSlidePlay()) {
             this.a.m8().post(new m(this, showEvent));
          }else {
             this.a.R8(showEvent);
          }
          return;
       }else if(this.a.s.enableSlidePlay()){
          this.a.m8().post(new l(this, uElementPack, uContentPack));
       }else {
          this.a.P8(uElementPack, uContentPack);
       }
       return;
    }
}
