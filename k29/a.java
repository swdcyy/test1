package k29.a;
import erd.g;
import k29.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import qp7.t0;
import qp7.b;
import w19.e;
import e17.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import n19.f;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uw9.v3;
import com.kwai.feature.api.feed.detail.router.biz.thanos.ThanosDetailBizParam;
import whc.k0;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sharelib.a;
import brd.t;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.OperationModelFactory;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import wh5.c;
import vca.i;
import com.yxcorp.gifshow.share.KwaiOperator$Style;
import rhc.d;
import rhc.s;
import o19.c;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.framework.model.channel.HotChannel;
import mhc.v1;
import com.kuaishou.android.model.mix.w;
import com.yxcorp.gifshow.share.OperationFactoryAdapter;
import com.yxcorp.gifshow.share.im.a;
import rhc.t;
import o19.d;
import az6.a;
import java.util.Map;
import trd.t0;
import kotlin.Pair;
import mhc.g2;
import mhc.g2$a;
import oic.p0;
import qrd.r0;
import oic.x;
import kotlin.jvm.internal.a;
import nsd.u;
import oic.y;
import oic.z0;
import o19.b;
import o19.a;
import oic.q0;
import com.yxcorp.gifshow.share.post.PostEntrance;
import vhc.m;
import com.yxcorp.gifshow.share.operation.KsFansTopFactory;
import com.yxcorp.gifshow.share.operation.KsFansTopOtherFactory;
import oic.p;
import oic.o;
import oic.u0;
import kp.x1;
import oic.n0;
import o19.g;
import com.kuaishou.android.model.mix.PhotoMeta;
import oic.d0;
import oic.t0;
import oic.f1;
import oic.y0;
import rhc.i;
import oic.s0;
import oic.r0;
import oic.a0;
import oic.o0;
import oic.s;
import oic.q2;
import oic.x0;
import java.lang.Runnable;
import oic.v;
import oic.d1;
import oic.c1;
import com.kuaishou.android.model.feed.VideoFeed;
import o19.h;
import yy6.c;
import java.util.Collection;
import com.yxcorp.gifshow.util.o;
import android.util.Pair;
import yic.t0;
import zic.e;
import sic.e;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment;
import pj2.r;
import msd.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;
import djc.y0;
import gic.l;
import gic.f;
import gic.p;
import mhc.n1;
import gic.n;
import n19.d;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.kwai.feature.api.social.login.model.LoginParams;
import mhc.o2;
import mhc.j2$a;
import msd.q;
import n19.g;
import mhc.o0;
import kic.a;
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

public final class a implements g	// class@002a9f
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       String str2;
       String str5;
       OperationModel operationMod1;
       String str6;
       String str7;
       f uof2;
       int b1;
       f c;
       QPhoto obj1;
       int i3;
       boolean b3;
       ForwardGridSectionWithImPanelFragment uForwardGrid;
       l ol;
       KsShareBuilder b1;
       f b11;
       f uof3;
       f uof4;
       f uof5;
       f uof6;
       d a;
       b obj2;
       a b = this.b;
       GifshowActivity obj = p0;
       Objects.requireNonNull(b);
       int i = 0;
       if (VisitorModeManager.g(i)) {
       }else if(b.H().B()){
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
       }else {
          String str = "5";
          Object[] objArray = null;
          int i1 = 33;
          int i2 = 1;
          if (!PatchProxy.applyVoid(objArray, b, b.class, str)) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(b.t.mEntity);
             obj2 = b.t;
             if (obj2 != null && !TextUtils.x(obj2.getUserId())) {
                ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                uContentPack.userPackage = userPackage;
                userPackage.identity = b.t.getUserId();
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.type = i2;
             uElementPack.action = i1;
             uElementPack.name = "share_photo";
             u1.u(i2, uElementPack, uContentPack);
          }
          f uof = new f(b.v, b.w, b.x, b.z, "");
          f uof1 = f.class;
          if (!PatchProxy.applyVoidOneRefs(obj, v4, uof1, str) && obj != null) {
             obj = a.a(obj);
             if (obj != null) {
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                String str1 = "1";
                a uoa = PatchProxy.applyOneRefs(obj, v4, uof1, str1);
                if (uoa != patchProxyRe) {
                }else if(TextUtils.x(v4.g)){
                   str2 = "";
                }else {
                   uof6 = v4.g;
                }
                String str3 = str2;
                OperationModel operationMod = OperationModelFactory.d(v4.c.mEntity, v4.e, null, true, false, str3);
                String str4 = "2";
                KwaiOperator kwaiOperator = PatchProxy.applyTwoRefsWithListener(obj, operationMod, v4, uof1, str4);
                if (kwaiOperator != patchProxyRe) {
                   str5 = str4;
                   operationMod1 = operationMod;
                   str6 = str3;
                   str7 = str1;
                   uof2 = 8;
                }else {
                   obj2 = PatchProxy.apply(objArray, v4, uof1, "8");
                   if (obj2 != patchProxyRe) {
                      b3 = obj2.booleanValue();
                   }else {
                      b3 = a.t().d("privacyPhotoAllowForward", i);
                      boolean b4 = c.h();
                      boolean b5 = i.d(v4.c);
                      b3 = (v4.c.isMine() && (!v4.c.isPublic() && (!b5 && (b4 && b3))))? true: false;
                   }
                   if (b3) {
                      str5 = str4;
                      operationMod1 = operationMod;
                      str6 = str3;
                      str7 = str1;
                      kwaiOperator = new KwaiOperator(obj, operationMod, KwaiOperator$Style.SECTION_LIGHT_REFACTOR, new d(), new s(), new c(v4.f, v4.b.getDetailCommonParam().getHotChannel()));
                   }else {
                      str5 = str4;
                      operationMod1 = operationMod;
                      str6 = str3;
                      str7 = str1;
                      uof2 = 8;
                      if (v4.c.isMine() && !v4.c.isPublic()) {
                         kwaiOperator = new KwaiOperator(obj, operationMod1, KwaiOperator$Style.SECTION_LIGHT_REFACTOR, new d(), new d(), new c(v4.f, v4.b.getDetailCommonParam().getHotChannel()));
                      }else if(w.g0(v4.c.mEntity, uof2)){
                         kwaiOperator = new KwaiOperator(obj, operationMod1, KwaiOperator$Style.SECTION_LIGHT_REFACTOR, OperationFactoryAdapter.c(), new c(v4.f, v4.b.getDetailCommonParam().getHotChannel()), OperationFactoryAdapter.c());
                      }else {
                         kwaiOperator = new KwaiOperator(obj, operationMod1, KwaiOperator$Style.SECTION_LIGHT_REFACTOR, a.T0(), new t(), new c(v4.f, v4.b.getDetailCommonParam().getHotChannel()));
                      }
                   }
                   PatchProxy.onMethodExit(uof1, str5);
                }
                d uod = new d(v4.f, v4.d, v4.b.mSource, operationMod1);
                Map map = PatchProxy.apply(null, uod, d.class, str7);
                if (map != patchProxyRe) {
                }else {
                   QPhoto qPhoto = uod.a.n();
                   if (i.d(qPhoto)) {
                      map = t0.z();
                   }else {
                      Pair[] pairArray = new Pair[33];
                      g2$a x1 = g2.X;
                      g2 og2 = x1.A();
                      str3 = og2.a();
                      pairArray[0] = r0.a(str3, new p0(uod.a, og2.b(), true));
                      g2 og21 = x1.p();
                      String str8 = og21.a();
                      a.o(qPhoto, "photo");
                      String str9 = og21.b();
                      obj1 = qPhoto;
                      x ox = new x(obj1, str9, uod.c, 0, 8, null);
                      Pair pair1 = r0.a(str8, og2);
                      pairArray[1] = pair1;
                      og21 = x1.q();
                      str8 = og21.a();
                      str9 = og21.b();
                      y oy = new y(obj1, str9, 0, null, 12, null);
                      pairArray[2] = r0.a(str8, og2);
                      g2 og22 = x1.H();
                      String str10 = og22.a();
                      pairArray[3] = r0.a(str10, new z0(qPhoto, og22.b()));
                      og22 = x1.P();
                      b uob = new b(uod.a, og22.b(), null, 4, null);
                      pairArray[4] = r0.a(og22.a(), str3);
                      og21 = x1.O();
                      a uoa1 = new a(uod.a, og21.b(), 0, 4, null);
                      pairArray[5] = r0.a(og21.a(), str10);
                      og21 = x1.I();
                      str10 = og21.a();
                      pairArray[6] = r0.a(str10, new q0(uod.a, PostEntrance.SAME_FRAME, og21.b()));
                      og21 = x1.z();
                      str8 = og21.a();
                      pair1 = r0.a(str8, new q0(uod.a, PostEntrance.FOLLOW_SHOOT, og21.b()));
                      pairArray[7] = pair1;
                      og21 = x1.F();
                      str8 = og21.a();
                      pair1 = r0.a(str8, new q0(uod.a, PostEntrance.RECREATION, og21.b()));
                      pairArray[8] = pair1;
                      og21 = x1.u();
                      str8 = og21.a();
                      pair1 = r0.a(str8, new q0(uod.a, PostEntrance.DISABLE_RECREATION, og21.b()));
                      pairArray[9] = pair1;
                      pairArray[10] = m.b(qPhoto, x1.w(), x1.x());
                      og22 = x1.i();
                      str10 = og22.a();
                      pairArray[11] = r0.a(str10, new KsFansTopFactory(qPhoto, og22.b()));
                      og22 = x1.j();
                      str10 = og22.a();
                      pairArray[12] = r0.a(str10, new KsFansTopOtherFactory(qPhoto, og22.b()));
                      og21 = x1.B();
                      str8 = og21.a();
                      pair1 = r0.a(str8, new q0(uod.a, PostEntrance.USE_MUSIC, og21.b()));
                      pairArray[13] = pair1;
                      og21 = x1.b();
                      str8 = og21.a();
                      pair1 = r0.a(str8, new p(uod.a, uod.c, og21.b()));
                      pairArray[14] = pair1;
                      og21 = x1.a();
                      str8 = og21.a();
                      pairArray[15] = r0.a(str8, new o(uod.a, og21.b(), uod.c, "SHARE_PANNEL"));
                      g2 Pair og23 = x1.G();
                      String str11 = og23.a();
                      og23 = r0.a(str11, new u0(uod.a, x1.a(uod.b), uod.c, og23.b()));
                      pairArray[16] = og23;
                      og21 = x1.y();
                      QPhoto qPhoto1 = uod.a.n();
                      str1 = "funcOperationHelper.photo";
                      a.o(qPhoto1, str1);
                      n0 on0 = new n0(qPhoto1, og21.b(), 0, 4, null);
                      pairArray[17] = r0.a(og21.a(), str10);
                      b1 = 18;
                      a = uod.a;
                      Pair pair2 = PatchProxy.applyOneRefs(a, null, g.class, str5);
                      if (pair2 != patchProxyRe) {
                      }else {
                         a.p(a, "funcOperationHelper");
                         QPhoto qPhoto2 = a.n();
                         a.o(qPhoto2, str1);
                         PhotoMeta photoMeta = qPhoto2.getPhotoMeta();
                         photoMeta = (photoMeta != null)? photoMeta.mDownloadSetting: -1;
                         if (photoMeta != 1) {
                            og22 = x1.f();
                            str10 = og22.a();
                            pair2 = r0.a(str10, new d0(a, photoMeta, og22.b()));
                         }else {
                            og22 = x1.g();
                            str10 = og22.a();
                            pair2 = r0.a(str10, new d0(a, photoMeta, og22.b()));
                         }
                      }
                      pairArray[b1] = pair2;
                      g2 og24 = x1.E();
                      str11 = og24.a();
                      pairArray[19] = r0.a(str11, new t0(uod.a, og24.b()));
                      og24 = x1.Q();
                      str11 = og24.a();
                      pairArray[20] = r0.a(str11, new f1(qPhoto, og24.b()));
                      og24 = x1.h();
                      str11 = og24.a();
                      pairArray[21] = r0.a(str11, new y0(og24.b(), uod.d));
                      og24 = x1.m();
                      str11 = og24.a();
                      pairArray[22] = r0.a(str11, new i(og24.b(), qPhoto));
                      og24 = x1.D();
                      str11 = og24.a();
                      pairArray[23] = r0.a(str11, new s0(uod.a, og24.b()));
                      og24 = x1.C();
                      str11 = og24.a();
                      pairArray[24] = r0.a(str11, new r0(uod.a, og24.b()));
                      og24 = x1.t();
                      str11 = og24.a();
                      pairArray[25] = r0.a(str11, new a0(uod.a, og24.b()));
                      og24 = x1.L();
                      str11 = og24.a();
                      pairArray[26] = r0.a(str11, new o0(uod.a, og24.b()));
                      og24 = x1.M();
                      str11 = og24.a();
                      pairArray[27] = r0.a(str11, new s(uod.a, og24.b()));
                      og24 = x1.N();
                      str11 = og24.a();
                      pairArray[28] = r0.a(str11, new q2(uod.a, og24.b()));
                      og24 = x1.K();
                      str11 = og24.a();
                      str9 = og24.b();
                      obj1 = qPhoto;
                      x0 ox0 = new x0(obj1, str9, null, 4, null);
                      pairArray[29] = r0.a(str11, str8);
                      og21 = x1.n();
                      v ov = new v(obj1, og21.b(), null, 4, null);
                      pairArray[30] = r0.a(og21.a(), qPhoto1);
                      g2 og25 = x1.s();
                      d1 uod1 = new d1(uod.a, og25.b(), 0, 4, null);
                      pairArray[31] = r0.a(og25.a(), og21);
                      og25 = x1.r();
                      c1 uoc1 = new c1(uod.a, og25.b(), 0, 4, null);
                      pairArray[32] = r0.a(og25.a(), og21);
                      map = t0.W(pairArray);
                   }
                }
                if (!PatchProxy.applyVoidOneRefs(map, v4, uof1, "3")) {
                   g2$a x = g2.X;
                   map.remove(x.p().a());
                   map.remove(x.q().a());
                }
                b1 = (v4.c.isVideoType() && v4.c.mEntity.isPayCourse())? true: false;
                h oh = new h(v4.a.f, v4.b);
                Collection uCollection = o.c(map, b1);
                Collection uCollection1 = o.j(v4.c, b1);
                c = v4.c;
                if (PatchProxy.isSupport(uof1)) {
                   Boolean fALSE = Boolean.FALSE;
                   obj1 = map;
                   i3 = 5;
                   if (PatchProxy.applyVoidFourRefs(c, fALSE, Boolean.valueOf(b1), fALSE, v4, f.class, "7")) {
                   label_06cb :
                      e uoe = new e(kwaiOperator, v4.c);
                      boolean b2 = e.b(v4.c);
                      b3 = (v4.b.getSource() == 82 && a.t().d("BottomBarFollowForwardPanel", false))? true: false;
                      if (PatchProxy.isSupport(uof1)) {
                         uForwardGrid = PatchProxy.applyOneRefs(Boolean.valueOf(b3), v4, uof1, "4");
                         if (uForwardGrid != patchProxyRe) {
                         label_070c :
                            ForwardGridSectionFragment uForwardGrid1 = ForwardGridSectionFragment.W0.c(obj, new r(uForwardGrid));
                            ForwardGridSectionFragment uForwardGrid2 = (uForwardGrid1 instanceof y0)? uForwardGrid1: null;
                            c = v4.c;
                            uof = v4.k;
                            if (PatchProxy.isSupport(uof1)) {
                               objArray = new Object[i3];
                               objArray[0] = c;
                               objArray[1] = oh;
                               objArray[2] = Boolean.valueOf(b1);
                               objArray[3] = uof;
                               objArray[4] = uForwardGrid2;
                               ol = PatchProxy.apply(objArray, v4, uof1, "9");
                               if (ol != patchProxyRe) {
                               }else if(b1){
                                  ol = new l(o.f(c), oh, new p(), uForwardGrid2);
                               }else {
                                  ol = new l(new d(c), oh, uof, uForwardGrid2);
                               }
                            }else {
                               goto label_0749 ;
                            }
                            KsShareBuilder ksShareBuild = new KsShareBuilder(obj, v4.i, v4.c.getPhotoId(), o2.e(v4.c.mEntity, obj), uForwardGrid1);
                            b1.B(new j2$a(v4.c));
                            b1 = b1.C(str6).u(uCollection1);
                            b1.z(new g(v4, v4.c.mEntity));
                            b1 = b1.s(uCollection).n(new a(v4.c.mEntity, v4.i)).o(v4.j).p(o.m(v4.c));
                            b1.h(e.a(b2));
                            k ok = new k(v4.c, false, b1.e(o.h(v4.c)).g(o.e(v4.c, obj)).f(uoe).a());
                            if (b2) {
                               b11 = new f(new q(v4.c, true, new c()));
                               uof3 = new f(new q(v4.c, false, new k()));
                               uof4 = new f(new q());
                               uof5 = new f(new o(v4.c, false, new d()));
                               uof2 = new f(new o(v4.c, false, new j()));
                               uof6 = new f(new c());
                            }else {
                               b11 = new q(v4.c, true, new c());
                               uof3 = new q(v4.c, false, new k());
                               uof4 = new q(v4.c, false, new q());
                               uof5 = new o(v4.c, false, new d());
                               uof6 = new r(v4.c, new h0(new c()));
                               o oo = new o(v4.c, false, new j());
                            }
                            uoa = new a(ok, oh).j(ol).f("copyLink", new z(v4.c)).f("h5", new c0()).f("wechatMomentsUserChoose", new d0(v4.c)).g(obj1).f("im", ol).f("wechat", b11).f("wechatMoments", uof3).f("qq", uof5).f("qzone", uof2).f("wechatWow", uof4).f("weibo", uof6);
                         }
                      }
                      uForwardGrid = new ForwardGridSectionWithImPanelFragment();
                      goto label_070c ;
                   }
                }else {
                   obj1 = map;
                   i3 = 5;
                   int i4 = 0;
                }
                Pair pair = t0.a(c, false, b1, false);
                v4.i = pair.first;
                v4.j = pair.second;
                goto label_06cb ;
                uoa.l();
             }
          }
       }
       return;
    }
}
