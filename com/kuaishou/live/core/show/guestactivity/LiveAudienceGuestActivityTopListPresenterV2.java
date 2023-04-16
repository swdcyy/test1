package com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2;
import im8.g;
import c12.f;
import com.kuaishou.live.core.show.guestactivity.c;
import n92.q;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2$a;
import n92.p;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2$b;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2$c;
import n92.o;
import n92.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import t02.a0;
import hf3.a;
import p91.m;
import lf3.g;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import ug1.a1;
import ik1.i0;
import java.util.HashMap;
import java.lang.Long;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import ekd.k1;
import java.lang.Runnable;
import android.content.res.Configuration;
import com.kuaishou.live.core.show.guestactivity.h$f;
import android.view.ViewGroup;
import android.view.View;
import android.animation.Animator;
import n92.g0;
import com.kuaishou.live.core.show.guestactivity.e;
import android.animation.Animator$AnimatorListener;
import n92.u;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedList;
import ekd.j;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSpecialAudienceRankInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import n92.j;
import java.util.Map;
import qk.m;
import n92.l;
import ok.o;
import n92.t;
import ok.h;
import java.util.Collection;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.guestactivity.a;
import com.kuaishou.live.core.show.guestactivity.b$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import androidx.recyclerview.widget.h$b;
import com.kuaishou.live.core.show.guestactivity.a$a;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import n92.r;
import java.lang.IndexOutOfBoundsException;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ks5.b;
import ks5.c;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import n92.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2$4;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import com.kuaishou.live.core.show.guestactivity.d;
import java.lang.Integer;
import com.kuaishou.live.core.show.guestactivity.g;
import p51.c;
import mw1.c;
import p51.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n92.b;
import android.content.Context;
import i2b.a;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import n92.v;
import androidx.recyclerview.widget.RecyclerView$q;
import android.view.ViewGroup$LayoutParams;
import va1.n0;
import n92.s;
import android.view.View$OnClickListener;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo;

public class LiveAudienceGuestActivityTopListPresenterV2 extends f implements g	// class@000bcc
{
    public Map K;
    public boolean L;
    public AnimatorSet M;
    public CustomRecyclerView N;
    public View O;
    public View P;
    public KwaiDialogFragment Q;
    public long R;
    public a S;
    public Map T;
    public LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo U;
    public h$f U0;
    public b V;
    public c V0;
    public b$b W;
    public a0 W0;
    public Runnable X;
    public c X0;
    public final a1 Y;
    public z Y0;
    public final b Z;
    public LiveAudienceGuestActivityTopListPresenterV2$d Z0;
    public final g a1;
    public final g b1;
    public static String sLivePresenterClassName = "LiveAudienceGuestActivityTopListPresenterV2";

    public void LiveAudienceGuestActivityTopListPresenterV2(){
       super();
       this.L = false;
       this.W = new c(this);
       this.X = new q(this);
       this.Y = new LiveAudienceGuestActivityTopListPresenterV2$a(this);
       this.Z = new p(this);
       this.Y0 = new LiveAudienceGuestActivityTopListPresenterV2$b(this);
       this.Z0 = new LiveAudienceGuestActivityTopListPresenterV2$c(this);
       this.a1 = new o(this);
       this.b1 = new n(this);
    }
    public void Q(boolean p0){
       LiveAudienceGuestActivityTopListPresenterV2 liveAudience = LiveAudienceGuestActivityTopListPresenterV2.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "3")) {
          return;
       }
       this.W0.Z2.u().o(714, this.a1);
       this.W0.Z2.u().o(715, this.b1);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.W0.N().G5(this.Z, uoaArray);
       this.W0.V1.J8(this.Y);
       this.a9();
       if (this.T != null && this.R) {
          HashMap hashMap = new HashMap();
          hashMap.put(this.T.toString(), Long.valueOf(this.R));
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString(b.d("user")+"liveAudienceGuestActivityLastReceiveGiftGuestId", b.e(hashMap));
          g.a(uEditor);
       }
       k1.n(this);
       k1.m(this.X);
       this.T = null;
       this.R = 0;
       this.L = false;
       this.S = null;
       return;
    }
    public void S8(Configuration p0,boolean p1){
       if (PatchProxy.isSupport(LiveAudienceGuestActivityTopListPresenterV2.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveAudienceGuestActivityTopListPresenterV2.class, "4")) {
          return;
       }
       if (this.N != null && this.P != null) {
          if (p1) {
             this.d9();
          }else if(this.W0.N().r2(AudienceBizRelation.GUEST_ACTIVITY)){
             if (this.L != null) {
                this.e9();
             }else {
                this.U0.b();
             }
          }
       }
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGuestActivityTopListPresenterV2.class, "13")) {
          return;
       }
       this.d9();
       return;
    }
    public void b9(){
       LiveAudienceGuestActivityTopListPresenterV2 liveAudience = LiveAudienceGuestActivityTopListPresenterV2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "11")) {
          return;
       }
       if (this.W0.N().r2(AudienceBizRelation.GUEST_ACTIVITY) && this.L != null) {
          if (!PatchProxy.applyVoid(objArray, this, liveAudience, "12")) {
             this.N.setVisibility(false);
             this.P.setVisibility(false);
             Animator uAnimator = g0.a(this.N);
             uAnimator.addListener(new e(this));
             uAnimator.start();
             uAnimator = g0.a(this.P);
             uAnimator.addListener(new u(this));
             uAnimator.start();
          }
          this.L = false;
       }
       return;
    }
    public void c9(LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo p0,boolean p1){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceGuestActivityTopListPresenterV2 liveAudience = LiveAudienceGuestActivityTopListPresenterV2.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveAudience, "9")) {
          return;
       }
       LinkedList linkedList = PatchProxy.applyOneRefs(p0, this, liveAudience, "10");
       if (linkedList != patchProxyRe) {
       }else if(p0 == null || j.h(p0.specialAudienceRankInfo)){
          linkedList = null;
       }else {
          LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo specialAudie = p0.specialAudienceRankInfo;
          LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo showCount = p0.showCount;
          if (this.R - null) {
             i = 0;
             while (true) {
                if (i < specialAudie.length) {
                   if (!this.R - specialAudie[i].specialAudienceUser.userId) {
                      break ;
                   }else {
                      i = i + 1;
                   }
                }
             }
             LinkedList linkedList1 = new LinkedList();
             if (i >= 0) {
                linkedList1.add(new j(specialAudie[i], p0.payScene, p0.extraMessage));
                if (i < showCount) {
                   showCount = showCount - 1;
                }
             }
             m.t(specialAudie).p(new l(this)).v(showCount).F(new t(this, p0)).n(linkedList1);
             if (!TextUtils.x(p0.moreUrl)) {
                linkedList1.add(new j(p0.moreUrl));
             }
             linkedList = linkedList1;
          }
          i = -1;
          goto label_0050 ;
       }
       if (this.S == null) {
          a uoa = new a(this.W0, this.W);
          this.S = uoa;
          this.N.setAdapter(uoa);
       }
       if (linkedList != null) {
          try{
             LiveAudienceGuestActivityTopListPresenterV2 tS = this.S;
             Objects.requireNonNull(tS);
             a$a uoa1 = PatchProxy.applyOneRefs(linkedList, tS, a.class, "5");
             if (uoa1 != patchProxyRe) {
             }else {
                uoa1 = new a$a(tS.Q0(), linkedList);
             }
             this.S.W0(linkedList);
             h.b(uoa1).d(this.S);
             if (p1) {
                k1.p(new r(this), this);
             }
          }catch(java.lang.IndexOutOfBoundsException e10){
             e10.printStackTrace();
             b.B(LiveLogTag.LIVE_GUEST_ACTIVITY, "ArrayIndexOutOfBoundsException current update list size is:"+linkedList.size());
          }
       }
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGuestActivityTopListPresenterV2.class, "17")) {
          return;
       }
       this.V0.c(this.V);
       this.h9(false);
       return;
    }
    public void e9(){
       LiveAudienceGuestActivityTopListPresenterV2 liveAudience = LiveAudienceGuestActivityTopListPresenterV2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "6")) {
          return;
       }
       LiveAudienceGuestActivityTopListPresenterV2 tU = this.U;
       int i = 0;
       Integer integer = 1;
       if (tU != null && (j.h(tU.specialAudienceRankInfo) || this.W0.N().r2(AudienceBizRelation.VOICE_PARTY))) {
          this.a9();
          LiveLogTag lIVE_GUEST_A = LiveLogTag.LIVE_GUEST_ACTIVITY;
          liveAudience = this.U;
          if (liveAudience == null || j.h(liveAudience.specialAudienceRankInfo)) {
             i = 1;
          }
          b.d0(lIVE_GUEST_A, "receive guest activity top list show : disable for some reason", "guestActivityTopListInfo is null", Integer.valueOf(i), "inVoiceParty", Integer.valueOf(this.W0.N().r2(AudienceBizRelation.VOICE_PARTY)));
          return;
       }else {
          tU = this.U;
          b.e0(LiveLogTag.LIVE_GUEST_ACTIVITY, "receive guest activity top list show", "activityId", tU.activityId, "payScene", tU.payScene, "extraMessage", a.a.q(tU.extraMessage));
          if (!this.W0.N().r2(AudienceBizRelation.GUEST_ACTIVITY)) {
             ClientContent$LiveStreamPackage liveStreamPa = this.W0.Z2.a();
             if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, c.class, "3")) {
                u1.u0(9, c.b(objArray, "KWAI_ACTIVE_TOP_CARD"), c.a(liveStreamPa, objArray));
             }
          }
          if (!this.R - null && this.T != null) {
             Type type = new LiveAudienceGuestActivityTopListPresenterV2$4(this).getType();
             String str = a.a.getString(b.d("user")+"liveAudienceGuestActivityLastReceiveGiftGuestId", "null");
             Object[] objArray1 = (str == null || str == "")? objArray: b.a(str, type);
             if (objArray1 != null && objArray1.get(this.T.toString()) != null) {
                this.R = objArray1.get(this.T.toString()).longValue();
             }
          }
       label_00d8 :
          this.L = integer;
          this.c9(this.U, i);
          if (!PatchProxy.applyVoid(objArray, this, liveAudience, "16")) {
             this.V0.b(this.V);
             this.h9(integer);
          }
          if (!PatchProxy.applyVoid(objArray, this, liveAudience, "7")) {
             this.N.setVisibility(i);
             this.N.startLayoutAnimation();
             this.P.setPivotX(0);
             LiveAudienceGuestActivityTopListPresenterV2 tP = this.P;
             tP.setPivotY((float)(tP.getHeight() / 2));
             this.P.invalidate();
             this.P.setVisibility(i);
             AnimatorSet uAnimatorSet = new AnimatorSet();
             this.M = uAnimatorSet;
             Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.P, View.ALPHA, new float[2]{0,0x42c80000}),ObjectAnimator.ofFloat(this.P, View.SCALE_X, new float[2]{0x3f333333,0x3f800000}),ObjectAnimator.ofFloat(this.P, View.SCALE_Y, new float[2]{0x3f333333,0x3f800000})};
             uAnimatorSet.playTogether(uAnimatorArr);
             this.M.setDuration(200);
             this.M.addListener(new d(this));
             this.M.start();
          }
          return;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceGuestActivityTopListPresenterV2.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceGuestActivityTopListPresenterV2.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceGuestActivityTopListPresenterV2.class, new g());
       }else {
          obj.put(LiveAudienceGuestActivityTopListPresenterV2.class, null);
       }
       return obj;
    }
    public final void h9(boolean p0){
       LiveAudienceGuestActivityTopListPresenterV2 liveAudience = LiveAudienceGuestActivityTopListPresenterV2.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "18")) {
          return;
       }
       c uoc = this.X0.j();
       if (uoc instanceof a) {
          uoc.n = p0;
          this.X0.n3();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGuestActivityTopListPresenterV2.class, "1")) {
          return;
       }
       super.j8();
       this.U0 = this.q8(h$f.class);
       this.V0 = this.q8(c.class);
       this.W0 = this.q8(a0.class);
       this.X0 = this.q8(c.class);
       return;
    }
    public void x(boolean p0){
       LiveAudienceGuestActivityTopListPresenterV2 liveAudience = LiveAudienceGuestActivityTopListPresenterV2.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "2")) {
          return;
       }
       Object[] objArray = null;
       b uob = PatchProxy.apply(objArray, this, liveAudience, "15");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
          if (this.N == null) {
             View view = a.a(this.getContext(), R.layout.arg_RES_7f0d0b54);
             this.O = view;
             if (view != null) {
                view = view.findViewById(R.id.live_guest_activity_recycler_view);
                View view1 = this.O.findViewById(R.id.live_guest_activity_recycler_view_left_button);
                this.P = view1;
                if (this.W0.r != null) {
                   view1.setBackgroundResource(R.drawable.arg_RES_7f080d82);
                }else {
                   view1.setBackgroundResource(R.drawable.arg_RES_7f08020f);
                }
                if (view != null && view instanceof CustomRecyclerView) {
                   this.N = view;
                   view.setItemViewCacheSize(10);
                   this.N.setItemAnimator(objArray);
                   this.N.addItemDecoration(new b(0, a1.e(10.00f), a1.e(4.00f)));
                   this.N.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
                   this.N.setVisibility(4);
                   this.N.addOnItemTouchListener(new v(this));
                   objArray.width = (n0.f() - (a1.e(10.00f) * 2)) - a1.d(0x7f070295);
                }
                LiveAudienceGuestActivityTopListPresenterV2 tP = this.P;
                if (tP != null) {
                   tP.setOnClickListener(new s(this));
                }
             }
          }
          uob.a = this.O;
       }
       this.V = uob;
       this.W0.Z2.u().u0(714, LiveActivitySignalMessage$LiveSpecialAudienceRankExpandInfo.class, this.a1);
       this.W0.Z2.u().u0(715, LiveActivitySignalMessage$LiveSpecialAudienceRankShrinkInfo.class, this.b1);
       this.W0.V1.Nk(this.Y);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.W0.N().u5(this.Z, uoaArray);
       return;
    }
}
