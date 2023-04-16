package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter;
import b93.d;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$b;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$e;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$c;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$d;
import e93.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import xp5.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import k73.d;
import vq5.d;
import e93.b;
import jm1.b;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$a;
import h73.t;
import android.app.Activity;
import e93.c;
import xa3.a;
import pg1.e;
import jm1.a;
import jm1.c;
import ip3.a;
import j73.j;
import dd3.j;
import eq3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import qrd.l1;
import org.greenrobot.eventbus.a;
import qi1.b;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$f;
import vq5.b;
import java.util.Objects;
import lf3.g;
import hf3.a;
import crd.b;
import lnc.b9;
import c93.b;
import td3.o;
import v51.a;
import n91.f;
import d93.a;
import s93.s;
import com.kuaishou.livestream.message.nano.LiveFansGroupMessages$SCLiveFansGroupStatusChanged;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import androidx.lifecycle.MutableLiveData;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$init$1;
import e73.j;
import msd.l;
import erd.g;
import i95.b;
import e73.c;
import eoc.f;
import i95.h;
import e73.b;
import eda.l;
import e73.e;
import wca.n;
import e73.d;
import i95.e;
import e73.f;
import d93.b;
import kg1.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import xp5.g;
import com.kwai.component.fansgroup.FansGroupParams;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.fansgroup.FansGroupSourceType;
import com.kuaishou.live.lite.LiveLiteParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveFansGroupRelationInfoResponse;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.utility.TextUtils;
import com.kwai.component.fansgroup.FansGroupHelper;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import l95.a;
import l95.c;
import i95.c;
import k73.a;
import java.lang.Float;
import java.net.URLEncoder;
import java.lang.StringBuilder;
import android.content.Context;
import i95.f;
import e73.a;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import android.net.Uri$Builder;
import g73.a;
import va1.f;
import bp6.a;
import e73.i;
import e73.h;
import java.util.concurrent.TimeUnit;
import e73.g;

public final class LiveLiteFansGroupPresenter extends d	// class@001d9a
{
    public b A;
    public c B;
    public e C;
    public a D;
    public c E;
    public b F;
    public i G;
    public j H;
    public f I;
    public a J;
    public LiveLiteFansGroupDataModel K;
    public d L;
    public t M;
    public j N;
    public final LiveLiteFansGroupPresenter$b O;
    public final LiveLiteFansGroupPresenter$e P;
    public final LiveLiteFansGroupPresenter$c Q;
    public final LiveLiteFansGroupPresenter$d R;
    public final String v;
    public o w;
    public a x;
    public a y;
    public d z;

    public void LiveLiteFansGroupPresenter(){
       super();
       this.v = "LiveLiteFansGroupPresenter";
       this.K = new LiveLiteFansGroupDataModel();
       this.O = new LiveLiteFansGroupPresenter$b(this);
       this.P = new LiveLiteFansGroupPresenter$e(this);
       this.Q = new LiveLiteFansGroupPresenter$c(this);
       this.R = new LiveLiteFansGroupPresenter$d(this);
    }
    public static final a c9(LiveLiteFansGroupPresenter p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("liveLiteAudienceInfoManager");
       }
       return p0;
    }
    public static final i d9(LiveLiteFansGroupPresenter p0){
       p0 = p0.G;
       if (p0 == null) {
          a.S("liveLogPackageProvider");
       }
       return p0;
    }
    public void F8(){
       LiveLiteFansGroupPresenter a;
       LiveLiteFansGroupPresenter b;
       d uod = this;
       if (PatchProxy.applyVoid(null, uod, LiveLiteFansGroupPresenter.class, "4")) {
          return;
       }
       super.F8();
       b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(uod.v), "onCreate");
       LiveLiteFansGroupPresenter z = uod.z;
       String str = "liveRouterManager";
       if (z == null) {
          a.S(str);
       }
       a = uod.A;
       if (a == null) {
          a.S("liveLiteEnterService");
       }
       LiveLiteFansGroupPresenter x = uod.x;
       if (x == null) {
          a.S("liveLiteAudienceInfoManager");
       }
       LiveLiteFansGroupPresenter f = uod.F;
       if (f == null) {
          a.S("liveGiftSendService");
       }
       LiveLiteFansGroupPresenter g = uod.G;
       if (g == null) {
          a.S("liveLogPackageProvider");
       }
       d uod1 = new d(z, a, x, f, g, uod.R);
       uod.L = v1;
       Activity activity = this.getActivity();
       b = uod.B;
       String str1 = "liveLiteFragmentService";
       if (b == null) {
          a.S(str1);
       }
       LiveLiteFansGroupPresenter x1 = uod.x;
       if (x1 == null) {
          a.S("liveLiteAudienceInfoManager");
       }
       z = uod.O;
       a = uod.C;
       if (a == null) {
          a.S("liveFollowManager");
       }
       x = uod.z;
       if (x == null) {
          a.S(str);
       }
       f = uod.D;
       if (f == null) {
          a.S("liveGiftBoxService");
       }
       LiveLiteFansGroupPresenter e = uod.E;
       if (e == null) {
          a.S("liveRechargeService");
       }
       LiveLiteFansGroupPresenter j = uod.J;
       if (j == null) {
          a.S("liveLiteCommentService");
       }
       String str2 = str;
       LiveLiteFansGroupPresenter g1 = uod.G;
       if (g1 == null) {
          a.S("liveLogPackageProvider");
       }
       t ot = new t(activity, b, x1, z, a, x, f, e, j, g1);
       uod.M = v1;
       g1 = uod.H;
       if (g1 == null) {
          a.S("liveLiteShareService");
       }
       z = uod.x;
       if (z == null) {
          a.S("liveLiteAudienceInfoManager");
       }
       a = uod.G;
       if (a == null) {
          a.S("liveLogPackageProvider");
       }
       x = uod.B;
       if (x == null) {
          a.S(str1);
       }
       j oj = new j(g1, z, a, x);
       this.P8().xg(oj);
       uod.N = oj;
       if (!a.d().i(uod)) {
          a.d().p(uod);
       }
       LiveLiteFansGroupPresenter d = uod.D;
       if (d == null) {
          a.S("liveGiftBoxService");
       }
       d.a(uod.Q);
       d = uod.z;
       if (d == null) {
          a.S(str2);
       }
       d.t5("joinfansgroupdialog", new LiveLiteFansGroupPresenter$f(uod));
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteFansGroupPresenter.class, "8")) {
          return;
       }
       b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.v), "onDestroy");
       LiveLiteFansGroupPresenter tK = this.K;
       Objects.requireNonNull(tK);
       if (!PatchProxy.applyVoid(objArray, tK, LiveLiteFansGroupDataModel.class, "3")) {
          LiveLiteFansGroupDataModel l = tK.l;
          if (l != null) {
             l.o(595, tK.z);
          }
          b9.a(tK.m);
          b9.a(tK.n);
          b9.a(tK.o);
          b9.a(tK.p);
          b9.a(tK.q);
          b9.a(tK.r);
          b9.a(tK.s);
          b9.a(tK.t);
          b9.a(tK.u);
          tK.v = false;
       }
       if (a.d().i(this)) {
          a.d().t(this);
       }
       tK = this.z;
       if (tK == null) {
          a.S("liveRouterManager");
       }
       tK.Z4("joinfansgroupdialog");
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(o.class);
       this.x = p0.a(a.class);
       a uoa = p0.a(a.class).u();
       a.o(uoa, "provider.get\(LiveLongCon¡­.java\).liveLongConnection");
       this.y = uoa;
       this.z = p0.a(d.class);
       this.C = p0.a(e.class);
       this.G = p0.a(i.class);
       this.I = p0.a(f.class);
       return;
    }
    public void Y8(a p0){
       b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.A = p0.a(b.class);
       this.B = p0.a(c.class);
       this.D = p0.a(a.class);
       this.E = p0.a(c.class);
       this.F = p0.a(b.class);
       this.H = p0.a(j.class);
       this.J = p0.e(s.class);
       LiveLiteFansGroupPresenter tK = this.K;
       LiveLiteFansGroupPresenter tw = this.w;
       if (tw == null) {
          a.S("liveLiteUserStatusManager");
       }
       LiveLiteFansGroupPresenter tx = this.x;
       if (tx == null) {
          a.S("liveLiteAudienceInfoManager");
       }
       LiveLiteFansGroupPresenter tI = this.I;
       if (tI == null) {
          a.S("liveServerTimeProvider");
       }
       LiveLiteFansGroupPresenter ty = this.y;
       if (ty == null) {
          a.S("liveLongConnection");
       }
       Objects.requireNonNull(tK);
       if (!PatchProxy.applyVoidFourRefs(tw, tx, tI, ty, tK, LiveLiteFansGroupDataModel.class, "2")) {
          a.p(tw, "_liveLiteUserStatusManager");
          a.p(tx, "_liveLiteAudienceInfoManager");
          a.p(tI, "_liveServerTimeProvider");
          a.p(ty, "_liveLongConnection");
          tK.i = tw;
          tK.j = tx;
          tK.k = tI;
          tK.l = ty;
          tK.a();
          LiveLiteFansGroupDataModel l = tK.l;
          if (l != null) {
             l.u0(595, LiveFansGroupMessages$SCLiveFansGroupStatusChanged.class, tK.z);
          }
          l = tK.h;
          LiveLiteFansGroupDataModel i = tK.i;
          if (i != null) {
             LiveLiteUserStatusResponse liveLiteUser = i.D1();
             if (liveLiteUser != null) {
                liveLiteUser = liveLiteUser.mLiveFansGroupInfo;
             label_00cd :
                l.setValue(liveLiteUser);
                l = tK.i;
                if (l != null) {
                   t ot = l.T3();
                   if (ot != null) {
                      ot = ot.observeOn(d.a);
                      if (ot != null) {
                         uob = ot.subscribe(new j(new LiveLiteFansGroupDataModel$init$1(tK)));
                      label_00f2 :
                         tK.m = uob;
                         if (!PatchProxy.applyVoid(null, tK, LiveLiteFansGroupDataModel.class, "16")) {
                            b9.a(tK.n);
                            tK.n = f.a(b.class, new c(tK));
                         }
                         if (!PatchProxy.applyVoid(null, tK, LiveLiteFansGroupDataModel.class, "17")) {
                            b9.a(tK.o);
                            tK.o = f.a(h.class, new b(tK));
                         }
                         if (!PatchProxy.applyVoid(null, tK, LiveLiteFansGroupDataModel.class, "18")) {
                            b9.a(tK.p);
                            tK.p = f.a(l.class, new e(tK));
                         }
                         if (!PatchProxy.applyVoid(null, tK, LiveLiteFansGroupDataModel.class, "19")) {
                            b9.a(tK.q);
                            tK.q = f.a(n.class, new d(tK));
                         }
                         if (!PatchProxy.applyVoid(null, tK, LiveLiteFansGroupDataModel.class, "20")) {
                            b9.a(tK.u);
                            tK.u = f.a(e.class, new f(tK));
                         }
                      }
                   }
                }
                uob = null;
                goto label_00f2 ;
             }
          }
          Object[] objArray = null;
          goto label_00cd ;
       }
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter.class, "1")) {
          return;
       }
       a.p(p0, "register");
       p0.d(a.class, this.O);
       p0.d(h.class, this.P);
       return;
    }
    public final boolean e9(){
       Integer obj = PatchProxy.apply(null, this, LiveLiteFansGroupPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.O.W2().getValue();
       boolean b = true;
       if (obj == null || obj.intValue() != b) {
          obj = this.O.W2().getValue();
          if (obj == null || obj.intValue() != 2) {
             b = false;
          }
       }
       return b;
    }
    public final void h9(){
       boolean b1;
       Object[] objArray1;
       LiveLiteFansGroupPresenter liveLiteFans = LiveLiteFansGroupPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteFans, "13")) {
          return;
       }
       LiveLiteFansGroupPresenter tx = this.x;
       String str = "liveLiteAudienceInfoManager";
       if (tx == null) {
          a.S(str);
       }
       FansGroupParams uFansGroupPa = new FansGroupParams().setActivity(this.getActivity()).setAuthorUser(tx.I());
       LiveLiteFansGroupPresenter tx1 = this.x;
       if (tx1 == null) {
          a.S(str);
       }
       uFansGroupPa = uFansGroupPa.setLiveStreamId(tx1.getLiveStreamId()).setSource(FansGroupSourceType.LITE);
       Object obj = PatchProxy.apply(objArray, this, liveLiteFans, "12");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          tx1 = this.x;
          if (tx1 == null) {
             a.S(str);
          }
          LiveLiteParam liveLitePara = tx1.ok();
          a.o(liveLitePara, "liveLiteAudienceInfoManager.liveLiteParam");
          LiveStreamFeed liveStreamFe = liveLitePara.getLiveStreamFeed();
          if (liveStreamFe != null) {
             liveStreamFe = liveStreamFe.mLiveLiteFansGroupRelationInfo;
             if (liveStreamFe != null) {
                b1 = liveStreamFe.mCanShowSuperFansGroupInfo;
             }
          }
          b1 = false;
       }
       uFansGroupPa = uFansGroupPa.setIsFansGroupPageV2(b1).setHasJoinedFansGroup(this.e9());
       LiveLiteFansGroupPresenter tG = this.G;
       if (tG == null) {
          a.S("liveLogPackageProvider");
       }
       FeedLogCtx uFeedLogCtx = tG.c0();
       uFeedLogCtx = (uFeedLogCtx != null)? uFeedLogCtx.stidContainer: objArray;
       uFansGroupPa = uFansGroupPa.setInterStid(TextUtils.k(uFeedLogCtx));
       a.o(uFansGroupPa, "FansGroupParams\(\)\n      \x20\x02edLogCtx?.stidContainer\)\)\x00");
       FansGroupHelper.e(uFansGroupPa);
       if (!PatchProxy.applyVoid(objArray, this, liveLiteFans, "15") && FansGroupKswitchUtil.b()) {
          b uob = new b(true, "Entrance", "CLICK_ENTRY");
          a uoa = new a();
          Integer value = this.K.j().getValue();
          int i = (value != null)? value.intValue(): 0;
          uoa.d(i);
          value = this.K.h().getValue();
          i = (value != null)? value.intValue(): 0;
          uoa.b(i);
          Boolean value1 = this.K.g.getValue();
          i = (value1 != null)? value1.booleanValue(): false;
          uoa.a(i);
          value1 = this.K.g().getValue();
          if (value1 != null) {
             b = value1.booleanValue();
          }
          uoa.e(b);
          uob.e(uoa);
          c.a(uob);
       }
       return;
    }
    public final void onEventMainThread(c p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter.class, "10")) {
          return;
       }
       a.p(p0, "liteH5Event");
       LiveLiteFansGroupPresenter tL = this.L;
       if (tL != null) {
          String str = "3";
          if (!PatchProxy.applyVoidOneRefs(p0, tL, d.class, str)) {
             c b = p0.b;
             p0 = p0.c;
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                str = PatchProxy.applyTwoRefs(b, Float.valueOf(p0), null, uoa, str);
                if (str != PatchProxyResult.class) {
                label_007d :
                   tL.a(str, null);
                }
             }
             str = "h5Url";
             try{
                a.p(b, str);
                str1 = "kwailive://webview?url="+URLEncoder.encode(b, "utf-8")+"&transparent=1"+"&dismisstouchoutside=true"+"&heightRatio="+p0;
             }catch(java.lang.Exception e7){
                b.S(LiveLiteLogTag.LITE_FANS_GROUP.appendTag("FansGroupLiveTaskRouterHelper"), "createH5RouterUrl error", "errorMsg", e7);
                str1 = "";
             }
             str = str1;
             goto label_007d ;
          }
       }
       return;
    }
    public final void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter.class, "9")) {
          return;
       }
       a.p(p0, "taskEvent");
       LiveLiteFansGroupPresenter tL = this.L;
       if (tL != null) {
          Activity activity = this.getActivity();
          if (!PatchProxy.applyVoidTwoRefs(p0, activity, tL, d.class, "2") && p0.e == FansGroupSourceType.LITE) {
             int i = p0.d();
             if (a.a.contains(Integer.valueOf(i))) {
                if (i == 1000) {
                   tL.a(p0.c(), null);
                }else {
                   String str = x0.a(Uri.parse(p0.c()), "internaljump");
                   if (TextUtils.x(str)) {
                      if (i == 7) {
                         tL.a(p0.c(), activity);
                      }
                   }else {
                      Uri$Builder uBuilder = Uri.parse(str).buildUpon();
                      uBuilder.appendQueryParameter("rnViewTag", p0.b());
                      tL.a(uBuilder.build().toString(), null);
                   }
                }
             }
          }
       }
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteFansGroupPresenter.class, "7")) {
          return;
       }
       LiveLiteFansGroupPresenter tK = this.K;
       Objects.requireNonNull(tK);
       if (PatchProxy.applyVoid(objArray, tK, LiveLiteFansGroupDataModel.class, "6") || (!(a.g(tK.f.getValue(), Boolean.TRUE) ^ 0x01) && tK.v != null)) {
          b9.a(tK.s);
          LiveLiteFansGroupDataModel j = tK.j;
          if (j != null) {
             tK.s = f.a(a.class).d(j.getLiveStreamId(), tK.b()).subscribe(new a(), new i(tK));
          }
       }
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteFansGroupPresenter.class, "6")) {
          return;
       }
       LiveLiteFansGroupPresenter tK = this.K;
       Objects.requireNonNull(tK);
       if (!PatchProxy.applyVoid(objArray, tK, LiveLiteFansGroupDataModel.class, "5") && !(a.g(tK.f.getValue(), Boolean.TRUE) ^ 0x01)) {
          b9.a(tK.r);
          tK.r = t.timer(tK.w, TimeUnit.MILLISECONDS, d.a).subscribe(new h(tK), new g(tK));
       }
       LiveLiteFansGroupPresenter tK1 = this.K;
       LiveLiteFansGroupDataModel.d(tK1, false, a.g(tK1.e().getValue(), Boolean.TRUE), this.e9(), false, 9, null);
       return;
    }
}
