package g82.v;
import im8.g;
import k51.c;
import g82.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import g82.p;
import g82.v$a;
import g82.v$b;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import g82.n;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupAudienceStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import kg1.f$b;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import sc1.e;
import lp3.c;
import lp3.i;
import g82.q;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupActiveNoticeInfo;
import lnc.c3$a;
import lnc.c3;
import androidx.lifecycle.LiveData;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import ekd.t0;
import java.lang.Math;
import com.kuaishou.livestream.message.nano.LiveFansGroupMessages$SCLiveFansGroupStatusChanged;
import t02.a0;
import brd.t;
import ry1.b;
import g82.h;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lj1.f;
import g82.f;
import eoc.f;
import wca.n;
import g82.e;
import i95.b;
import g82.i;
import i95.h;
import g82.u;
import g82.s;
import g82.v$c;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import g82.b;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import lf3.g;
import hf3.a;
import g82.v$d;
import vq5.b;
import vq5.d;
import g82.v$e;
import g82.v$f;
import h47.b;
import j47.d;
import mq5.h;
import mq5.b;
import g82.q0;
import g82.m;
import p91.m;
import ok.x;
import java.lang.Boolean;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LiveSuperFansGroupInfo;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import l95.a;
import l95.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import f82.c;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import g82.k0;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import lnc.a1;
import lnc.b9;
import com.kuaishou.live.core.show.fansgroup.b;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import g82.j;
import erd.o;
import cjd.e;
import g82.r;
import erd.a;
import g82.g;
import g82.c;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kwai.framework.model.user.User;
import android.view.ViewParent;
import android.widget.FrameLayout;
import g82.l;
import java.lang.Runnable;
import com.kuaishou.krn.event.a;
import oj0.a;
import g82.t;
import k92.a;
import kg1.e;
import com.kuaishou.live.core.show.conditionredpacket.dialog.c$c;
import h92.a;
import h92.s$d;
import java.util.HashMap;
import java.util.Map;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import e92.i;
import com.kwai.framework.model.user.UserInfo;
import ekd.m1;
import android.view.ViewGroup;
import ne1.k;
import android.graphics.Typeface;
import d61.f0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import g9c.a;
import g81.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g82.n0;
import mrd.c;
import brd.y;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import i82.a;
import com.yxcorp.utility.n;
import android.widget.RelativeLayout$LayoutParams;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import com.kuaishou.live.core.basic.activity.x;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.kwai.library.widget.popup.bubble.a$c;
import android.app.Activity;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import com.kwai.library.widget.popup.common.c$b;
import g82.v$g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import android.net.Uri;
import kg1.g;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import mg1.a;
import com.kwai.framework.model.user.QCurrentUser;
import e17.i;
import com.kwai.feature.api.live.base.model.LiveActivityTaskInfo;
import g82.k;
import g82.r0;
import d61.y;

public class v extends c implements g	// class@002ac1
{
    public a A;
    public RelativeLayout B;
    public TextView C;
    public KwaiImageView D;
    public RelativeLayout E;
    public RelativeLayout F;
    public KwaiImageView G;
    public TextView H;
    public TextView I;
    public FrameLayout J;
    public ViewGroup K;
    public b L;
    public long M;
    public int N;
    public int O;
    public String P;
    public LiveFansGroupTagInfo Q;
    public final MutableLiveData R;
    public final MutableLiveData S;
    public final MutableLiveData T;
    public boolean U;
    public boolean U0;
    public b V;
    public boolean V0;
    public boolean W;
    public LiveSuperFansGroupInfo W0;
    public final List X;
    public q0 X0;
    public LiveFansGroupAutoActivePromptDialogInfo Y;
    public Uri Y0;
    public c Z;
    public final g Z0;
    public h a1;
    public e b1;
    public final c c1;
    public final c d1;
    public final c e1;
    public final a f1;
    public a0 p;
    public d q;
    public boolean r;
    public boolean s;
    public i t;
    public LiveAudienceParam u;
    public LiveBizParam v;
    public a w;
    public s$d x;
    public c$c y;
    public b z;
    public static String sLivePresenterClassName = "LiveFansGroupAudiencePresenter";

    public void v(){
       super();
       this.A = new a();
       this.N = 0;
       this.O = 0;
       this.R = new MutableLiveData();
       this.S = new MutableLiveData(Integer.valueOf(this.N));
       this.T = new MutableLiveData();
       this.X = new ArrayList();
       this.V0 = false;
       this.Z0 = new p(this);
       this.a1 = new v$a(this);
       this.b1 = new v$b(this);
       this.c1 = PublishSubject.g();
       this.d1 = PublishSubject.g();
       this.e1 = a.g();
       this.f1 = new n(this);
    }
    public void B9(LiveFansGroupAudienceStatusResponse p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "24")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Iterator iterator = this.X.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       this.A.d = p0.mIntimacyInfo;
       this.n9(p0.mMedalType);
       this.L = null;
       this.F9();
       LiveFansGroupAudienceStatusResponse mIntimacyInf = p0.mIntimacyInfo;
       if (mIntimacyInf.mStatus == true) {
          this.C9(mIntimacyInf.mLevel);
       }
       mIntimacyInf = p0.mActiveNoticeInfo;
       LiveFansGroupIntimacyInfo mStatus = p0.mIntimacyInfo.mStatus;
       if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidTwoRefs(mIntimacyInf, Integer.valueOf(mStatus), this, ov, "25")) {
          if (mIntimacyInf == null) {
             b.Z(LiveLogTag.FANS_GROUP, "fansGroup active notice info is null");
          }else {
             ov = this.t;
             if (ov == null) {
                b.Z(LiveLogTag.FANS_GROUP, "fail ShowActiveNotice. service manager is null");
             }else {
                c3.c(ov.a(e.class), new q(mIntimacyInf, mStatus));
             }
          }
       }
       this.e9(this.A.d);
       b.c0(LiveLogTag.FANS_GROUP, "update fans group medal type", "medal", Integer.valueOf(p0.mMedalType));
       return;
    }
    public final void C9(int p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov, "26")) {
          return;
       }
       if (p0 <= 0) {
          return;
       }
       if (this.R.getValue() == null || p0 > this.R.getValue().intValue()) {
          this.R.setValue(Integer.valueOf(p0));
       }
       this.F9();
       if (TextUtils.x(this.C.getText()) || !t0.a(this.C.getText())) {
          this.m9(String.valueOf(p0));
       }else {
          try{
             this.m9(String.valueOf(Math.max(p0, Integer.parseInt(this.C.getText().toString()))));
          }catch(java.lang.NumberFormatException e0){
             this.m9(String.valueOf(p0));
          }
       }
    }
    public final void D9(LiveFansGroupMessages$SCLiveFansGroupStatusChanged p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "12")) {
          return;
       }
       v tA = this.A;
       if (tA.d == null) {
          tA.d = new LiveFansGroupIntimacyInfo();
       }
       LiveFansGroupMessages$SCLiveFansGroupStatusChanged activeStatus = p0.activeStatus;
       if (activeStatus != null) {
          this.A.d.mStatus = activeStatus;
       }
       this.A.d.mLevel = p0.intimacyLevel;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "6")) {
          return;
       }
       this.X7(this.p.b3.T3().subscribe(new h(this), e.b));
       this.X7(f.a(f.class, new f(this)));
       this.X7(f.a(n.class, new e(this)));
       this.X7(f.a(b.class, new i(this)));
       this.X7(f.a(h.class, new u(this)));
       this.X7(this.A.f.subscribe(new s(this)));
       if (this.p.h != null) {
          v$c uoc = new v$c(this);
          this.Z = uoc;
          this.p.y2.P4(uoc);
       }else {
          this.Z8();
       }
       this.B.setOnClickListener(new b(this));
       this.p.C.u0(595, LiveFansGroupMessages$SCLiveFansGroupStatusChanged.class, this.Z0);
       this.q.t5("fansgroup", new v$d(this));
       this.q.t5("joinfansgroup", new v$e(this));
       a0 t1 = this.p.t1;
       if (t1 != null) {
          t1.Q1(new v$f(this));
       }
       this.p.D2.Km(this.a1);
       this.X0 = new q0(new m(this), this.p.Z2.d(), this.q);
       return;
    }
    public final void E9(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "41")) {
          return;
       }
       v tW0 = this.W0;
       if (tW0 != null && p0 != null) {
          tW0.mStatus = p0.booleanValue();
          if (FansGroupKswitchUtil.b()) {
             new a().e(p0.booleanValue());
             c.a(new b(false, "Entrance", "UPDATE_ENTRY"));
          }
       }
       return;
    }
    public final void F9(){
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "27")) {
          return;
       }
       a d = this.A.d;
       if (d != null && (d.mStatus == 3 && this.N == null)) {
          this.D.setImageResource(R.drawable.arg_RES_7f0810e0);
       }else if(PatchProxy.applyVoid(objArray, this, ov, "55")){
          if (FansGroupKswitchUtil.a()) {
             this.D.a0(e0.h(c.e(this.O, this.N)), new k0(this));
          }else {
             this.D.L(c.e(this.O, this.N));
          }
       }
       if (this.N != null) {
          this.k9(this.C);
          this.k9(this.H);
       }else {
          this.l9(this.C);
          this.l9(this.H);
       }
       this.G.L(c.f(this.N));
       this.C.setTextColor(a1.a(c.h(this.O, this.N)));
       this.H.setTextColor(a1.a(c.g(this.N)));
       return;
    }
    public void J8(){
       v ov = v.class;
       if (PatchProxy.applyVoid(null, this, ov, "13")) {
          return;
       }
       this.Y0 = null;
       v tp = this.p;
       if (tp.h != null) {
          v tZ = this.Z;
          if (tZ != null) {
             tp.y2.d5(tZ);
             this.Z = null;
          }
       }
       this.M = 0;
       this.p.C.o(595, this.Z0);
       b9.a(this.z);
       this.q.Z4("fansgroup");
       this.q.Z4("joinfansgroup");
       this.p.D2.le(this.a1);
       this.S8();
       if (!PatchProxy.applyVoid(null, this, ov, "14")) {
          ov = this.X0;
          if (ov != null) {
             if (!PatchProxy.applyVoid(null, ov, q0.class, "2")) {
                b9.a(ov.d);
             }
             this.X0 = null;
          }
       }
       this.y9();
       return;
    }
    public void P8(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "23")) {
          return;
       }
       if (p0) {
          this.W = true;
          this.t9();
       }else {
          this.S8();
       }
       return;
    }
    public boolean R8(){
       if (this.s != null && (this.A.d == null && this.U0 == null)) {
          return true;
       }
       return false;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, v.class, "29")) {
          return;
       }
       v tV = this.V;
       if (tV != null && tV.a()) {
          this.V.b();
       }
       this.W = false;
       return;
    }
    public final void V8(){
       boolean b;
       b uob;
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "17")) {
          return;
       }
       LiveConfigStartupResponse$LiveFansGroupConfig liveFansGrou = a.o(LiveConfigStartupResponse$LiveFansGroupConfig.class);
       a obj = PatchProxy.applyOneRefs(liveFansGrou, this, ov, "22");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(liveFansGrou == null){
          b.Z(LiveLogTag.FANS_GROUP, "cannot fetch my status in fans group : liveFansGroupConfig is null");
       }else {
          obj = this.A.c;
          if (obj == null) {
             b.Z(LiveLogTag.FANS_GROUP, "cannot fetch my status in fans group : mFansGroupInfo is null");
          }else if(obj.mHasFansGroupAuthority == null){
             b.Z(LiveLogTag.FANS_GROUP, "cannot fetch my status in fans group : no authority");
          }else if((System.currentTimeMillis() - this.M) - liveFansGrou.mPullStatusRetryIntervalInMs < 0){
             b.Z(LiveLogTag.FANS_GROUP, "cannot fetch my status in fans group : time filter");
          }else if(this.L != null){
             b.Z(LiveLogTag.FANS_GROUP, "cannot fetch my status in fans group : requesting");
          }else {
             b = true;
          }
       }
       b = false;
       if (!b) {
          return;
       }else if(!PatchProxy.applyVoid(objArray, this, ov, "48") && FansGroupKswitchUtil.b()){
          uob = new b(false, "Entrance", "FETCH_MYSTATUS");
          uob.f(1);
          c.a(uob);
       }
       uob = t.timer((long)(Math.random() * (double)liveFansGrou.mPullStatusMaxDelayIntervalInMs), TimeUnit.MILLISECONDS).flatMap(new j(this)).map(new e()).doFinally(new r(this)).subscribe(new g(this), new c(this));
       this.L = uob;
       this.X7(uob);
       this.M = System.currentTimeMillis();
       return;
    }
    public final String W8(){
       Object obj = PatchProxy.apply(null, this, v.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.p.c0() != null) {
          return TextUtils.k(this.p.c0().stidContainer);
       }
       return "";
    }
    public LiveFansGroupIntimacyInfo X8(){
       v ov = v.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, ov, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A.d;
       if (obj != null) {
          return obj;
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "16")) {
          if (this.A.d != null) {
             b.Z(LiveLogTag.FANS_GROUP, "cannot fetch my status in fans group : mIntimacyInfo is not null");
          }else {
             this.V8();
          }
       }
       return new LiveFansGroupIntimacyInfo(0, 0, 0);
    }
    public String Y8(){
       v obj = PatchProxy.apply(null, this, v.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj != null) {
          a0 z2 = obj.Z2;
          if (z2 != null && z2.I() != null) {
             return this.p.Z2.I().getId();
          }
       }
       return null;
    }
    public void Z8(){
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "15")) {
          View parent = this.J.getParent();
          if (parent != null) {
             parent.post(new l(this, parent));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "4")) {
          a.b().a("updateWalletInfoAfterSendGift", this.f1);
       }
       this.j9();
       this.X7(this.p.b3.T3().subscribe(new t(this)));
       v tp = this.p;
       this.x.a(new a(tp.r1, this.y, tp.Z2.d()));
       return;
    }
    public final void a9(int p0,a p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ov, "52")) {
          return;
       }
       if (FansGroupKswitchUtil.b()) {
          b uob = new b(false, "Entrance", "UPDATE_ENTRY");
          HashMap hashMap = new HashMap();
          hashMap.put("changedType", String.valueOf(p0));
          uob.d(hashMap);
          uob.e(p1);
          c.a(uob);
       }
       return;
    }
    public void b9(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "50")) {
          return;
       }
       if (FansGroupKswitchUtil.b()) {
          b uob = new b(false, "Entrance", "FETCH_MYSTATUS");
          uob.f(404);
          if (p0 instanceof KwaiException) {
             uob.b(p0.getErrorCode());
             uob.c(TextUtils.k(p0.getMessage()));
          }
          c.a(uob);
       }
       return;
    }
    public void c9(LiveFansGroupIntimacyInfo p0,boolean p1,LiveSuperFansGroupInfo p2){
       LiveFansGroupIntimacyInfo mStatus;
       boolean b;
       if (PatchProxy.isSupport(v.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, v.class, "49")) {
          return;
       }
       if (FansGroupKswitchUtil.b()) {
          if (p0 != null) {
             mStatus = p0.mStatus;
             p0 = p0.mLevel;
          }else {
             int i = -1;
             mStatus = 0;
          }
          p2 = (p2 != null)? p2.mStatus: false;
          a uoa = new a();
          uoa.d(mStatus);
          uoa.b(p0);
          uoa.a(p1);
          uoa.e(p2);
          b uob = new b(false, "Entrance", "FETCH_MYSTATUS");
          uob.f(200);
          uob.e(uoa);
          c.a(uob);
       }
       return;
    }
    public final void d9(int p0){
       object oobject;
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov, "46")) {
          return;
       }
       if (!p0) {
          b.Z(LiveLogTag.FANS_GROUP, "User self join fansGroup, fail mock gift slot");
          return;
       }else {
          v tp = this.p;
          i oi = i.class;
          if (PatchProxy.isSupport(oi)) {
             Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(1),Boolean.TRUE,tp,oobject};
             oobject = null;
             if (PatchProxy.applyVoid(objArray, oobject, oi, "1")) {
             label_005a :
                return;
             }
          }
          i.a(p0, 1, true, tp, null, i.a, i.b);
          goto label_005a ;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a22ef);
       this.J = m1.f(p0, 0x7f0a1cee);
       this.K = m1.f(p0, 0x7f0a18b1);
       this.C = m1.f(p0, 0x7f0a22f1);
       this.I = m1.f(p0, 0x7f0a22f6);
       if (k.a()) {
          f0.j(this.C, Typeface.DEFAULT_BOLD, 1);
          ViewGroup$MarginLayoutParams layoutParams = this.C.getLayoutParams();
          layoutParams.bottomMargin = 1;
          this.C.setLayoutParams(layoutParams);
       }else {
          f0.j(this.C, Typeface.DEFAULT_BOLD, 3);
       }
       this.D = m1.f(p0, 0x7f0a22f0);
       this.E = m1.f(p0, 0x7f0a22f4);
       this.F = m1.f(p0, 0x7f0a22f5);
       this.H = m1.f(p0, 0x7f0a22f3);
       this.G = m1.f(p0, 0x7f0a22f2);
       f0.j(this.H, Typeface.DEFAULT_BOLD, 3);
       return;
    }
    public void e9(LiveFansGroupIntimacyInfo p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "36")) {
          return;
       }
       v tA = this.A;
       int i = (tA.d == null)? 1: 0;
       if (p0 == null) {
          b.Z(LiveLogTag.FANS_GROUP, "fail notifyIntimacyInfoChanged. intimacyInfo is null");
          return;
       }else {
          tA.d = p0;
          tA.f.onNext(Integer.valueOf(p0.mLevel));
          LiveFansGroupIntimacyInfo mStatus = p0.mStatus;
          if (mStatus != null) {
             this.o9(mStatus);
          }
          this.F9();
          p0 = p0.mStatus;
          if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov, "37")) {
             if (p0 == null || p0 == 3) {
                this.C.setVisibility(8);
             }else if(p0 == 1 || p0 == 2){
                this.C.setVisibility(0);
             }
          }
          if (i) {
             a0 h = this.p.H;
             if (h != null) {
                h.ia().k0();
             }
          }
          return;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, v.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(v.class, new n0());
       }else {
          obj.put(v.class, null);
       }
       return obj;
    }
    public void h9(Object p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "20")) {
          return;
       }
       if (p0 != null && p1 != null) {
          p1.onNext(p0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("LIVE_ROUTER_SERVICE");
       this.t = this.r8("LIVE_SERVICE_MANAGER");
       this.u = this.r8("LIVE_AUDIENCE_PARAM");
       this.v = this.q8(LiveBizParam.class);
       this.w = this.t8("SUPER_FANS_GROUP_ID");
       this.x = this.q8(s$d.class);
       this.y = this.q8(c$c.class);
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, v.class, "19")) {
          return;
       }
       View[] viewArray = new View[]{this.I};
       n.Z(8, viewArray);
       return;
    }
    public final void k9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "30")) {
          return;
       }
       if (p0.getLayoutParams() instanceof RelativeLayout$LayoutParams) {
          RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.removeRule(13);
          layoutParams.addRule(14);
          layoutParams.addRule(12);
          layoutParams.bottomMargin = a1.e(8.50f);
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void l9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "31")) {
          return;
       }
       if (p0.getLayoutParams() instanceof RelativeLayout$LayoutParams) {
          RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.removeRule(14);
          layoutParams.removeRule(12);
          layoutParams.addRule(13);
          layoutParams.bottomMargin = a1.e(0);
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void m9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "33")) {
          return;
       }
       this.C.setText(p0);
       this.H.setText(p0);
       return;
    }
    public final void n9(int p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov, "32")) {
          return;
       }
       this.N = p0;
       this.S.setValue(Integer.valueOf(p0));
       return;
    }
    public final void o9(int p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov, "34")) {
          return;
       }
       this.O = p0;
       this.T.setValue(Integer.valueOf(p0));
       return;
    }
    public void q9(){
       if (PatchProxy.applyVoid(null, this, v.class, "43")) {
          return;
       }
       a0 t1 = this.p.t1;
       if (t1 == null) {
          return;
       }
       LiveGzoneConfigResponse liveGzoneCon = t1.Ue();
       if (liveGzoneCon == null) {
          return;
       }
       if (liveGzoneCon.mEnableGameLiveFansGroupTips == null) {
          return;
       }
       if (!this.p.R().v0()) {
          return;
       }
       if (this.X8().mStatus != 2 && this.X8().mStatus != 1) {
          return;
       }
       if (a.a.getBoolean(b.d("user")+"LiveGzoneGiftSendTipHasShowed", false)) {
          return;
       }
       String str = a1.p(R.string.arg_RES_7f100e3f);
       a$c uoc = new a$c(this.getActivity());
       uoc.F0(str);
       uoc.o0(this.B);
       uoc.D(PopupInterface$Excluded.NOT_AGAINST);
       uoc.T(3000);
       uoc.M(new v$g(this, str));
       p.e(uoc);
       return;
    }
    public void s9(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "9")) {
          return;
       }
       this.b1.Zk(p0.getQueryParameter("source"));
       return;
    }
    public void t9(){
       if (PatchProxy.applyVoid(null, this, v.class, "28")) {
          return;
       }
       if (this.A.c.mHasFansGroupAuthority == null || this.p.c.isGRPRCustomizedLive()) {
          b.Z(LiveLogTag.FANS_GROUP, "top bar :disable soon inactive animation");
          return;
       }else if(this.V == null){
          this.V = new b(this.F, this.E);
       }
       if (!this.V.a()) {
          this.V.c(true, c.a, 0);
       }
       return;
    }
    public final void u9(){
       if (PatchProxy.applyVoid(null, this, v.class, "8")) {
          return;
       }
       if (this.Y0 == null) {
          return;
       }
       if (this.b1.Gl() && !this.R8()) {
          this.s9(this.Y0);
          this.Y0 = null;
       }
       return;
    }
    public void x9(String p0,a p1){
       LiveActivityTaskInfo mTaskBackUrl;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "38")) {
          return;
       }
       if (this.R8()) {
          return;
       }
       int i = 0;
       if (TextUtils.n(this.p.Z2.d(), QCurrentUser.ME.getId())) {
          i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f102182), i);
          return;
       }else {
          p1 = this.A.d;
          if (p1 != null) {
             i = p1.mStatus;
          }
          v tv = this.v;
          if (tv != null) {
             LiveBizParam mLiveActivit = tv.mLiveActivityTaskInfo;
             if (mLiveActivit != null) {
                mTaskBackUrl = mLiveActivit.mTaskBackUrl;
             label_004b :
                k ok = new k(this, i, mTaskBackUrl, p0);
                if (r0.a()) {
                   y.a(this.getActivity(), ok, this, 400);
                }else {
                   ok.run();
                }
                return;
             }
          }
          mTaskBackUrl = "";
          goto label_004b ;
       }
    }
    public void y9(){
       if (PatchProxy.applyVoid(null, this, v.class, "5")) {
          return;
       }
       a.b().c("updateWalletInfoAfterSendGift", this.f1);
       return;
    }
}
