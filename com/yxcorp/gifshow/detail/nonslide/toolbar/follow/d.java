package com.yxcorp.gifshow.detail.nonslide.toolbar.follow.d;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import java.lang.String;
import com.kwai.framework.model.channel.HotChannel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import mhc.j2$a;
import mhc.o0;
import ohc.g;
import com.kwai.robust.PatchProxyResult;
import d3a.h;
import java.util.Collection;
import ekd.q;
import java.util.Objects;
import java.lang.ref.WeakReference;
import android.app.Activity;
import com.kwai.sharelib.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.OperationModelFactory;
import whc.k0;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import j2a.b;
import rhc.w;
import rhc.v;
import com.yxcorp.gifshow.share.KwaiOperator;
import com.yxcorp.gifshow.share.KwaiOperator$Style;
import rhc.u;
import rhc.t;
import mhc.v1;
import rhc.p;
import rhc.o;
import java.util.Map;
import mhc.h0;
import mhc.g2;
import mhc.g2$a;
import com.kuaishou.android.model.feed.VideoFeed;
import com.google.common.base.Optional;
import d3a.f;
import ok.h;
import d3a.g;
import ok.x;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.o;
import yic.t0;
import zic.e;
import kic.a;
import sic.e;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import pj2.r;
import msd.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;
import djc.y0;
import mhc.n1;
import gic.l;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.kwai.feature.api.social.login.model.LoginParams;
import mhc.o2;
import msd.q;
import uo7.q;
import uo7.l;
import com.google.gson.JsonObject;
import uo7.b0;
import uo7.d;
import uo7.k;
import ohc.k;
import sic.f;
import vhc.q;
import fp7.c;
import uo7.g0;
import uo7.f0;
import fp7.k;
import fp7.q;
import vhc.o;
import cp7.d;
import cp7.j;
import gp7.c;
import vhc.r;
import rhc.h0;
import uo7.u;
import uo7.h;
import oic.z;
import mhc.c0;
import rhc.d0;
import com.google.gson.JsonArray;

public class d	// class@0015f3
{

    public void d(){
       super();
    }
    public static void a(GifshowActivity p0,PhotoDetailParam p1,NormalDetailBizParam p2,String p3,HotChannel p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uod, "1")) {
             return;
          }
       }
       d.b(p0, p1, p2, p3, p4, null, null, null, null);
       return;
    }
    public static void b(GifshowActivity p0,PhotoDetailParam p1,NormalDetailBizParam p2,String p3,HotChannel p4,List p5,j2$a p6,o0 p7,g p8){
       boolean b;
       y0 obj2;
       f uof;
       f uof1;
       f uof2;
       f uof3;
       f uof4;
       f uof5;
       h i2;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p6;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       int i = 1;
       int i1 = 0;
       object oobject6 = null;
       String str = "2";
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[9];
          objArray[i1] = oobject;
          objArray[i] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = oobject6;
          objArray[6] = oobject5;
          objArray[7] = oobject6;
          objArray[8] = oobject6;
          if (PatchProxy.applyVoid(objArray, oobject6, uod, str)) {
             return;
          }
       }
       g og = new g();
       h oh1 = new h(oobject1, oobject2, oobject3, oobject4);
       a obj = PatchProxy.applyOneRefs(oobject6, oh1, oh, "3");
       if (obj != patchProxyRe) {
          oh1 = obj;
       }else {
          oh1.k = oobject6;
          if (!q.f(oobject6)) {
             JsonArray jsonArray = new JsonArray();
             throw null;
          }
       }
       Objects.requireNonNull(oh1);
       obj = PatchProxy.applyOneRefs(oobject5, oh1, oh, "1");
       if (obj != patchProxyRe) {
          oh1 = obj;
       }else if(oobject5 != null){
          oh1.h = new WeakReference(oobject5);
       }
       Objects.requireNonNull(oh1);
       obj = PatchProxy.applyOneRefs(oobject6, oh1, oh, str);
       if (obj != patchProxyRe) {
          oh1 = obj;
       }
       Objects.requireNonNull(oh1);
       if (PatchProxy.applyVoidTwoRefs(oobject, og, oh1, oh, "6") || (oobject != null && !p0.isFinishing())) {
          obj = PatchProxy.applyTwoRefs(oobject, og, oh1, oh, "4");
          if (obj != patchProxyRe) {
          }else {
             OperationModel operationMod = OperationModelFactory.d(oh1.a.mEntity, oh1.c.getSource(), null, 1, null, oh1.b);
             k0 ok0 = new k0(oh1.a, oh1.c.getDetailCommonParam().getPreInfo(), oobject);
             ok0.w(i);
             w ow = (b.b())? new w(ok0, oh1.d): new v(ok0);
             KwaiOperator kwaiOperator = new KwaiOperator(p0, operationMod, KwaiOperator$Style.SECTION_LIGHT_REFACTOR, new u(), new t(), ow);
             if (b.b()) {
                p op = new p(ok0, oh1.d, oh1.c.getSource(), oh1.c.getBizType(), operationMod);
             }else {
                o oo = new o(ok0, oh1.c.getSource(), operationMod);
             }
             Map map = ow.a();
             if (!PatchProxy.applyVoidOneRefs(map, oh1, oh, "5")) {
                g2$a x = g2.X;
                map.remove(x.p().a());
                map.remove(x.q().a());
             }
             b = (oh1.a.isVideoType() && oh1.a.mEntity.isPayCourse())? true: false;
             boolean b1 = Optional.fromNullable(oh1.e).transform(new f(oh1)).or(new g(oh1)).booleanValue();
             Collection uCollection = o.c(map, b);
             Collection uCollection1 = o.j(oh1.a, b);
             if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), oh1, oh, "10")) {
                if (t0.b(oh1.a)) {
                   oh1.f = "SHARE_KSCOIN_REWARD_PHOTO";
                   oh1.g = "NATIVE_TYPE";
                }else if(b1){
                   oh1.f = "PHOTO_FANS_ENCOURAGE";
                   oh1.g = "BANNER_GUIDE";
                }else {
                   oh1.f = o.l(oh1.a);
                   oh1.g = (oh1.a.isMine())? "PHOTO_SELF": "PHOTO_OTHER";
                }
             }
             e uoe = new e(oobject4, oh1.a);
             a uoa = new a(operationMod.i(), oh1.f);
             uoa.d = oh1.k;
             boolean b2 = e.b(oh1.a);
             ForwardGridSectionFragment uForwardGrid = ForwardGridSectionFragment.W0.c(oobject, new r(new ForwardGridSectionWithImPanelFragment()));
             ForwardGridSectionFragment uForwardGrid1 = (uForwardGrid instanceof y0)? uForwardGrid: null;
             Map map1 = map;
             l ol = o.b(oh1.a, oh1.a(og, oh1.c, b1), b, uForwardGrid1);
             KsShareBuilder ksShareBuild = new KsShareBuilder(p0, oh1.f, oh1.a.getPhotoId(), o2.e(oh1.a.mEntity, oobject), uForwardGrid);
             j2$a uoa1 = PatchProxy.apply(null, oh1, oh, "8");
             if (uoa1 != patchProxyRe) {
             }else {
                i2 = oh1.h;
                uoa1 = (i2 != null && i2.get() != null)? oh1.h.get(): new j2$a(oh1.a);
             }
             b.B(uoa1);
             KsShareBuilder ksShareBuild1 = b.C(oh1.b).u(uCollection1).s(uCollection).n(uoa).o(oh1.g);
             ksShareBuild1.h(e.a(b2));
             KsShareBuilder ksShareBuild2 = ksShareBuild1.p(o.m(oh1.a)).e(o.h(oh1.a)).l(oh1.j).g(o.e(oh1.a, oobject)).f(uoe);
             k obj1 = PatchProxy.apply(null, oh1, oh, "9");
             if (obj1 != patchProxyRe) {
                obj2 = obj1;
             }else {
                i2 = oh1.i;
                obj2 = (i2 != null && i2.get() != null)? oh1.i.get(): null;
             }
             if (obj2 != null) {
                ksShareBuild2.z(obj2);
             }
             obj1 = new k(oh1.a, false, ksShareBuild2.a());
             uoa.d(obj1);
             if (b2) {
                uof = new f(new q(oh1.a, true, new c()));
                uof1 = new f(new q(oh1.a, false, new k()));
                uof2 = new f(new q());
                uof3 = new f(new o(oh1.a, false, new d()));
                uof4 = new f(new o(oh1.a, false, new j()));
                uof5 = new f(new c());
             }else {
                uof = new q(oh1.a, true, new c());
                uof1 = new q(oh1.a, false, new k());
                uof2 = new q(oh1.a, false, new q());
                uof3 = new o(oh1.a, false, new d());
                uof5 = new r(oh1.a, new h0(new c()));
                uof4 = new o(oh1.a, false, new j());
             }
             l ol1 = ol;
             obj = new a(obj1, oh1.a(og, oh1.c, b1)).j(ol1).f("copyLink", new z(oh1.a)).f("h5", new c0()).f("wechatMomentsUserChoose", new d0(oh1.a)).g(map1).f("im", ol1).f("wechat", uof).f("wechatMoments", uof1).f("wechatWow", uof2).f("qq", uof3).f("qzone", uof4).f("weibo", uof5);
          }
          obj.l();
       }
    label_041d :
       return;
    }
}
