package com.kuaishou.live.preview.item.presenter.g;
import im8.g;
import dk3.b;
import com.kuaishou.live.preview.item.presenter.d;
import ok.x;
import com.google.common.base.Suppliers;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.preview.item.presenter.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dl3.m;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import dl3.l;
import com.kuaishou.live.preview.item.presenter.f;
import mk3.a;
import com.kuaishou.live.preview.item.presenter.router.enterlive.a;
import vq5.f;
import hl3.b;
import dk3.a;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import fl3.a;
import mk3.b;
import nk3.w;
import com.kuaishou.live.preview.item.presenter.g$b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.preview.item.presenter.n$h;
import java.util.HashMap;
import com.kuaishou.android.live.model.QLivePlayConfig;
import u53.b;
import ll3.o;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import uk3.a;
import java.util.List;
import java.util.Collections;
import com.kuaishou.live.preview.container.data.a;
import java.util.ArrayList;
import ekd.j;
import tkd.b;
import tkd.d;
import hv5.a;
import qvb.i;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.kuaishou.live.preview.item.presenter.g$c;
import wy6.d;
import java.util.UUID;
import ekd.q;
import yqb.c;
import com.kwai.feature.api.live.base.model.LiveStyleParams$a;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import os5.e;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import dl3.q;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;

public class g extends b implements g	// class@000e25
{
    public n$h A;
    public a B;
    public BaseFragment C;
    public f D;
    public PublishSubject E;
    public a F;
    public c G;
    public SlidePlayViewModel H;
    public f I;
    public a J;
    public b K;
    public final PublishSubject L;
    public final b M;
    public QPhoto y;
    public PhotoDetailParam z;
    public static final x N;

    static {
       g.N = Suppliers.a(d.b);
    }
    public void g(){
       super();
       this.L = PublishSubject.g();
       this.M = new g$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       super.E8();
       this.X7(this.E.subscribe(new m(this)));
       this.H = SlidePlayViewModel.B0(this.C.getParentFragment());
       this.X7(this.F.a(new l(this), f.b));
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.S8(new a(this.I, this.M));
       return;
    }
    public void W8(boolean p0,boolean p1,boolean p2,String p3,MerchantAudienceParams p4,LivePassThruParamExtraInfo p5,Map p6,int p7,int p8){
       Object[] objArray;
       g y;
       String str;
       MerchantAudienceParams merchantAudi;
       g og = this;
       boolean b = p1;
       int i = 6;
       int i1 = 5;
       int i2 = 3;
       int i3 = 2;
       int i4 = 7;
       int i5 = 4;
       if (PatchProxy.isSupport(g.class)) {
          objArray = new Object[9];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = Boolean.valueOf(p1);
          objArray[i3] = Boolean.valueOf(p2);
          objArray[i2] = p3;
          objArray[i5] = p4;
          objArray[i1] = p5;
          objArray[i] = p6;
          objArray[i4] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, g.class, "6")) {
             return;
          }
       }
       og.B.a(b);
       if (PatchProxy.isSupport(g.class)) {
          objArray = new Object[i4];
          objArray[0] = Boolean.valueOf(p1);
          objArray[1] = p3;
          objArray[i3] = p4;
          objArray[i2] = p5;
          objArray[i5] = p6;
          objArray[i1] = Integer.valueOf(p7);
          objArray[i] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, g.class, "8")) {
          label_00c3 :
             if (p2) {
                y = og.y;
                g k = og.K;
                Map map = PatchProxy.apply(null, this, g.class, "7");
                if (map != PatchProxyResult.class) {
                }else {
                   g a = og.A;
                   map = (a != null)? a.a(): null;
                   if (map == null) {
                      map = new HashMap();
                   }
                   str = (b.f(og.y.mEntity.mConfig))? "1": "0";
                   map.put("is_game_live", str);
                }
                if (!PatchProxy.isSupport(o.class) || !PatchProxy.applyVoidFourRefs(y, Boolean.valueOf(p0), k, map, null, o.class, "2")) {
                   str = (p0)? "OTHER": "TEXT_BUTTON";
                   ClientEvent$ElementPackage uElementPack = o.b(y, str, k, "CLICK_ENTER", map);
                   u1.B(new ClickMetaData().setLogPage(null).setType(1).setElementPackage(uElementPack).setContentPackage(o.d(y)).setFeedLogCtx(y.getFeedLogCtx()).setIsRealTime(0).setCommonParams(o.c(y.getEntity(), uElementPack.action2, k)));
                   o.a(y, str, "CLICK_ENTER");
                }
             }
             y = og.A;
             if (y != null) {
                y.b();
             }
             return;
          }
       }
       if (p4 != null) {
          merchantAudi = p4;
       }else {
          MerchantAudienceParams merchantAudi1 = PatchProxy.apply(null, this, g.class, "9");
          if (merchantAudi1 != PatchProxyResult.class) {
          }else {
             y = og.K;
             merchantAudi1 = (y != null && y.a() == i5)? w.a(og.K.a()): null;
          }
          merchantAudi = merchantAudi1;
       }
       og.L.onNext(new g$b(b));
       this.X8(merchantAudi, p1, p3, og.y.mEntity, p5, p6, p7, p8);
       goto label_00c3 ;
    }
    public final void X8(MerchantAudienceParams p0,boolean p1,String p2,LiveStreamFeed p3,LivePassThruParamExtraInfo p4,Map p5,int p6,int p7){
       g g;
       i oi;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       int i = p7;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),oobject1,oobject2,oobject3,oobject4,Integer.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, obj, og, "10")) {
             return;
          }
       }
       LiveAudienceParam$a uoa = new LiveAudienceParam$a();
       uoa.s(oobject);
       uoa.j(oobject2);
       uoa.o(oobject1);
       uoa.i(obj.y.getLiveStreamId());
       LiveAudienceParam liveAudience = uoa.a();
       LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
       uob.C(obj.y);
       uob.d(1);
       uob.l(p1);
       uob.t(p6);
       uob.m(liveAudience);
       uob.h(oobject3);
       LiveSlidePlayEnterParam$b uob1 = uob.k(obj.y.getUserId(), liveAudience.mInternalJumpSchema);
       uob1.y(obj.y);
       if (i) {
          uob1.o(i);
       }else {
          uob1.o(obj.J.b());
       }
       if (obj.J.a() == 2) {
          uob1.z(p3.getId());
          uob1.n(4);
          uob1.v("/rest/n/live/feed/hotPage/slide/more");
          uob1.w(Collections.singletonList(new QPhoto(oobject2)));
       }else if(obj.J.a() == 11){
          uob1.z(p3.getId());
          uob1.n(0x272a);
          uob1.v("/rest/n/live/feed/common/slide/more");
          uob1.w(Collections.singletonList(new QPhoto(oobject2)));
       }else if(obj.J.a() == 10){
          uob1.G(1);
       }else if(obj.J.a() == 5 || obj.J.a() == 9){
          oi = d.a(0x6c2883df).oH(new QPhoto(oobject2));
          uob1.g(1);
          uob1.s(g.N.get());
       }else {
          QPhoto[] qPhotoArray = new QPhoto[]{new QPhoto(oobject2)};
          oi = new a(obj.J.a(), p3.getId(), j.a(qPhotoArray));
       }
       b uob2 = b.g(j.b(oi, f.b(obj.C), SlideMediaType.LIVE));
       uob2.l4(new g$c(oi));
       uob1.F(uob2.id());
       HashMap hashMap = new HashMap();
       String str = UUID.randomUUID().toString();
       if (!q.h(p5)) {
          hashMap.putAll(oobject4);
       }
       hashMap.put("slide_session_id", str);
       hashMap.put("slide_first_photo_id", p3.getId());
       uob1.u(hashMap);
       g = obj.G;
       if (g != null && g.r()) {
          uob1.x(obj.G.w());
          LiveStyleParams$a uoa1 = new LiveStyleParams$a();
          uoa1.e(1);
          uob1.r(uoa1.a());
          uob1.b();
       }
       d.a(-1835681758).b1(this.getActivity(), uob1.a());
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new q());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       this.A = this.t8("LIVE_SIMPLE_PLAY_GZONE_CAMERA_SERVICE");
       this.y = this.q8(QPhoto.class);
       this.z = this.q8(PhotoDetailParam.class);
       this.C = this.r8("DETAIL_FRAGMENT");
       this.D = this.x8("LIVE_ANCHOR_END");
       this.E = this.r8("LIVE_SIMPLE_NEGATIVE_FEEDBACK_PUBLISHER");
       this.G = this.r8("LIVE_PLAYER_REUSE_DELEGATE");
       this.F = this.r8("LIVE_SIMPLE_PLAY_BOTTOM_CARD_OBSERVER");
       this.I = this.r8("ROUTER_SERVICE");
       this.J = this.r8("LIVE_FEATURE_CONFIG");
       this.B = this.r8("LIVE_PREVIEW_ENTER_LIVE_AD_SERVICE");
       return;
    }
}
