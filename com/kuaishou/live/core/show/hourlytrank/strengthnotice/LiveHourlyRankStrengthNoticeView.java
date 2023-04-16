package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import android.widget.RelativeLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import fa2.r;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.e;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeViewFlipper;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankSuffixCheckImageView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.f$a;
import fa2.u;
import android.view.ViewOutlineProvider;
import android.widget.ViewFlipper;
import fa2.q;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView$b;
import fa2.p;
import android.view.View$OnClickListener;
import android.animation.ObjectAnimator;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.degrade.j;
import th0.d;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import fa2.o;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.util.Property;
import android.widget.ImageView;
import java.util.Objects;
import ga2.a;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.LifecycleRegistry;
import ga2.f;
import android.animation.Animator;
import va1.l0;
import ekd.k1;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeBaseFlipperItemView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView;
import java.lang.Number;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$e;
import ta1.a;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$FoldMessage;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$BattleDistrictRankFold;
import java.util.ArrayList;
import fa2.l;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import fa2.v;
import android.animation.Animator$AnimatorListener;
import java.lang.Runnable;
import java.lang.Boolean;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$c;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$b;
import android.animation.AnimatorSet;
import ekd.j;
import java.lang.Long;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$BattleDistrictRankUnfold;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import java.lang.CharSequence;
import android.widget.TextView;
import fa2.k;
import android.os.CountDownTimer;
import java.lang.Math;

public class LiveHourlyRankStrengthNoticeView extends RelativeLayout	// class@000c3a
{
    public LiveHourlyRankStrengthNoticeViewFlipper b;
    public LiveHourlyRankSuffixCheckImageView c;
    public LiveHourlyRankStrengthNoticeExpandView d;
    public LiveHourlyRankSuffixCheckImageView e;
    public View f;
    public Animator g;
    public AnimatorSet h;
    public Animator i;
    public Animator j;
    public Animator k;
    public int l;
    public final Object m;
    public final Object n;
    public LiveHourlyRankStrengthNoticeView$e o;
    public LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank p;
    public final Runnable q;
    public final Runnable r;
    public long s;
    public f t;
    public final f$a u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;

    static {
       LiveHourlyRankStrengthNoticeView.v = a1.d(0x7f07027b);
       LiveHourlyRankStrengthNoticeView.w = a1.d(0x7f070340);
       LiveHourlyRankStrengthNoticeView.x = a1.d(0x7f07027b);
       LiveHourlyRankStrengthNoticeView.y = a1.d(0x7f0702b8);
       LiveHourlyRankStrengthNoticeView.z = a1.d(0x7f0702b8);
    }
    public void LiveHourlyRankStrengthNoticeView(Context p0){
       super(p0, null);
    }
    public void LiveHourlyRankStrengthNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHourlyRankStrengthNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.l = 0;
       this.m = new Object();
       this.n = new Object();
       this.q = new r(this);
       this.r = new e(this);
       this.s = 0;
       LiveHourlyRankStrengthNoticeView$a uoa = new LiveHourlyRankStrengthNoticeView$a(this);
       this.u = uoa;
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeView.class, "11")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0c32, this);
          this.b = this.findViewById(0x7f0a2041);
          this.c = this.findViewById(0x7f0a2040);
          this.d = this.findViewById(0x7f0a203e);
          this.e = this.findViewById(0x7f0a203d);
          this.f = this.findViewById(0x7f0a2037);
          this.t = new f(this.b, uoa);
          if (!PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeView.class, "12")) {
             this.b.setOutlineProvider(new u(this));
             this.b.setClipToOutline(true);
          }
          this.d.setNoticeExpandClickListener(new q(this));
          this.f.setOnClickListener(new p(this));
       }
       return;
    }
    public final ObjectAnimator a(View p0,int p1,int p2){
       float[] obj;
       if (PatchProxy.isSupport(LiveHourlyRankStrengthNoticeView.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveHourlyRankStrengthNoticeView.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new float[]{(float)p1,(float)p2};
       ObjectAnimator objectAnimat = j.a(p0, obj);
       objectAnimat.setDuration(300);
       objectAnimat.setInterpolator(new d());
       return objectAnimat;
    }
    public final ValueAnimator b(View p0,int p1,int p2){
       int[] obj;
       if (PatchProxy.isSupport(LiveHourlyRankStrengthNoticeView.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveHourlyRankStrengthNoticeView.class, "35");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new int[]{p1,p2};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(obj);
       valueAnimato.addUpdateListener(new o(p0));
       valueAnimato.setDuration(400);
       valueAnimato.setInterpolator(new d());
       return valueAnimato;
    }
    public final ObjectAnimator c(View p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveHourlyRankStrengthNoticeView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveHourlyRankStrengthNoticeView.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float[] uofloatArray = new float[]{(float)p1,(float)p2};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ROTATION, uofloatArray);
       objectAnimat.setDuration(260);
       objectAnimat.setInterpolator(new d());
       return objectAnimat;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeView.class, "5")) {
          return;
       }
       this.c.setVisibility(4);
       this.b.setVisibility(4);
       return;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHourlyRankStrengthNoticeView.class, "2")) {
          return;
       }
       this.n();
       this.l = 0;
       LiveHourlyRankStrengthNoticeView tt = this.t;
       if (tt != null) {
          tt.b();
       }
       tt = this.d;
       Objects.requireNonNull(tt);
       if (!PatchProxy.applyVoid(objArray, tt, LiveHourlyRankStrengthNoticeExpandView.class, "6")) {
          tt.L();
          tt.K.b();
          LiveHourlyRankStrengthNoticeExpandView o = tt.O;
          if (o != null && !PatchProxy.applyVoid(objArray, o, a.class, "1")) {
             o.e.setCurrentState(Lifecycle$State.DESTROYED);
             a d = o.d;
             Objects.requireNonNull(d);
             if (!PatchProxy.applyVoid(objArray, d, f.class, "2")) {
                l0.m(d.e);
             }
          }
          l0.m(tt.N);
       }
       k1.n(this.m);
       k1.n(this.n);
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeView.class, "26")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.d.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.height = LiveHourlyRankStrengthNoticeView.w;
          layoutParams.width = LiveHourlyRankStrengthNoticeView.v;
       }
       this.d.setLayoutParams(layoutParams);
       this.e.setRotation(0);
       this.d.setAlpha(0x3f800000);
       return;
    }
    public final void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHourlyRankStrengthNoticeView.class, "28")) {
          return;
       }
       this.f();
       if (!PatchProxy.applyVoid(objArray, this, LiveHourlyRankStrengthNoticeView.class, "25")) {
          ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = LiveHourlyRankStrengthNoticeView.y;
             layoutParams.width = LiveHourlyRankStrengthNoticeView.x;
          }
          this.b.setLayoutParams(layoutParams);
          this.e.setRotation(180.00f);
       }
       return;
    }
    public String getCurrentNarrowItemViewExtraInfo(){
       Object obj = PatchProxy.apply(null, this, LiveHourlyRankStrengthNoticeView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.t.a() instanceof LiveHourlyRankStrengthNoticeNarrowItemView) {
          return this.t.a().getExtraInfo();
       }
       return "";
    }
    public final long getExpandShowDurationMs(){
       LiveHourlyRankStrengthNoticeView obj = PatchProxy.apply(null, this, LiveHourlyRankStrengthNoticeView.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.o;
       if (obj != null) {
          return obj.e();
       }
       return 0xea60;
    }
    public final long getLiveServerTimeMs(){
       a obj = PatchProxy.apply(null, this, LiveHourlyRankStrengthNoticeView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.getLiveServerTimeService();
       if (obj != null) {
          return obj.s();
       }
       return System.currentTimeMillis();
    }
    public final a getLiveServerTimeService(){
       LiveHourlyRankStrengthNoticeView obj = PatchProxy.apply(null, this, LiveHourlyRankStrengthNoticeView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj != null) {
          return obj.a();
       }
       return null;
    }
    public int getStatus(){
       return this.l;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHourlyRankStrengthNoticeView.class, "21")) {
          return;
       }
       this.d.setVisibility(0);
       this.t.d();
       LiveHourlyRankStrengthNoticeView td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, LiveHourlyRankStrengthNoticeExpandView.class, "2")) {
          td.K.c();
       }
       return;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHourlyRankStrengthNoticeView.class, "7")) {
          return;
       }
       LiveHourlyRankStrengthNoticeView tp = this.p;
       boolean b = false;
       if (tp != null) {
          LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank battleDistri = tp.battleDistrictRankFold;
          if (battleDistri != null && !PatchProxy.applyVoidOneRefs(battleDistri, this, LiveHourlyRankStrengthNoticeView.class, "17")) {
             if (this.t == null) {
                b.Z(LiveLogTag.HOURLY_RANK, "update strength notice narrow view error : controller is null");
             }else {
                LiveDistrictRankFinalBattle$FoldMessage uFoldMessage = new LiveDistrictRankFinalBattle$FoldMessage();
                uFoldMessage.iconUrl = battleDistri.waitIconUrl;
                uFoldMessage.contentWithStyle = battleDistri.waitEndText;
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(new l(e0.i(battleDistri.backgroundPicUrl), e0.i(battleDistri.unfoldPicUrl), uFoldMessage, uFoldMessage.extraInfo));
                this.t.e(uArrayList, b);
             }
          }
       }
       tp = this.l;
       int i = 1;
       if (tp == i) {
          k1.n(this.m);
          if (!PatchProxy.applyVoid(objArray, this, LiveHourlyRankStrengthNoticeView.class, "8") && this.p != null) {
             this.l(b);
             this.d.M(i, this.p);
          }
       }else if(tp == 2){
          k1.n(this.m);
          if (!PatchProxy.applyVoid(objArray, this, LiveHourlyRankStrengthNoticeView.class, "9")) {
             tp = this.p;
             if (tp != null) {
                this.d.M(2, tp);
             }
          }
       }
       return;
    }
    public void j(LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankStrengthNoticeView.class, "4")) {
          return;
       }
       this.d.G = this.getLiveServerTimeService();
       this.o(p0);
       this.d();
       if (!PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeView.class, "20")) {
          this.f();
          this.d();
          this.d.setVisibility(8);
          ViewGroup$LayoutParams layoutParams = this.d.getLayoutParams();
          int i = 0;
          if (layoutParams != null) {
             layoutParams.height = i;
          }
          this.d.setLayoutParams(layoutParams);
          this.n();
          this.l = 2;
          ValueAnimator valueAnimato = this.b(this.d, i, LiveHourlyRankStrengthNoticeView.w);
          this.g = valueAnimato;
          valueAnimato.addListener(new v(this));
          this.g.start();
          k1.s(this.q, this.m, this.getExpandShowDurationMs());
       }
       return;
    }
    public final void k(){
       ObjectAnimator objectAnimat;
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeView.class, "22")) {
          return;
       }
       l0.m(this.k);
       LiveHourlyRankStrengthNoticeView tl = this.l;
       if (tl == 2) {
          objectAnimat = this.c(this.e, 180, 0);
          this.k = objectAnimat;
          objectAnimat.start();
       }else if(tl == 1){
          objectAnimat = this.c(this.e, 0, 180);
          this.k = objectAnimat;
          objectAnimat.start();
       }
       return;
    }
    public void l(boolean p0){
       if (PatchProxy.isSupport(LiveHourlyRankStrengthNoticeView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveHourlyRankStrengthNoticeView.class, "31")) {
          return;
       }
       this.n();
       this.l = 2;
       this.g();
       ValueAnimator valueAnimato = this.b(this.d, LiveHourlyRankStrengthNoticeView.z, LiveHourlyRankStrengthNoticeView.w);
       this.j = valueAnimato;
       valueAnimato.addListener(new LiveHourlyRankStrengthNoticeView$c(this));
       this.j.start();
       if (p0) {
          k1.s(this.q, this.m, this.getExpandShowDurationMs());
       }
       this.k();
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeView.class, "30")) {
          return;
       }
       this.n();
       this.l = 1;
       this.g();
       ValueAnimator valueAnimato = this.b(this.d, LiveHourlyRankStrengthNoticeView.w, LiveHourlyRankStrengthNoticeView.z);
       this.i = valueAnimato;
       valueAnimato.addListener(new LiveHourlyRankStrengthNoticeView$b(this));
       this.i.start();
       this.k();
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeView.class, "32")) {
          return;
       }
       LiveHourlyRankStrengthNoticeView tg = this.g;
       if (tg != null && tg.isRunning()) {
          this.g.end();
          this.g = null;
       }
       tg = this.h;
       if (tg != null && tg.isRunning()) {
          this.h.end();
          this.h = null;
       }
       l0.m(this.j);
       l0.m(this.i);
       l0.m(this.k);
       k1.m(this.q);
       return;
    }
    public void o(LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankStrengthNoticeView.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.p = p0;
       LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank battleDistri = p0.battleDistrictRankFold;
       LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank sCLiveBattle = null;
       LiveHourlyRankStrengthNoticeView liveHourlyRa = 1;
       if (battleDistri != null && !PatchProxy.applyVoidOneRefs(battleDistri, this, LiveHourlyRankStrengthNoticeView.class, "18")) {
          if (j.h(battleDistri.foldMessage)) {
             b.Z(LiveLogTag.HOURLY_RANK, "update strength notice narrow view error : illegal info");
          }else if(this.t == null){
             b.Z(LiveLogTag.HOURLY_RANK, "update strength notice narrow view error : controller is null");
          }else {
             ArrayList uArrayList1 = new ArrayList();
             LiveDistrictRankFinalBattle$BattleDistrictRankFold foldMessage = battleDistri.foldMessage;
             int len = foldMessage.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                object oobject = foldMessage[i1];
                uArrayList1.add(new l(e0.i(battleDistri.backgroundPicUrl), e0.i(battleDistri.unfoldPicUrl), oobject, oobject.extraInfo));
             }
             this.c.U(e0.i(battleDistri.backgroundPicUrl));
             LiveHourlyRankStrengthNoticeView tt = this.t;
             b = (this.l == liveHourlyRa)? true: false;
             tt.e(uArrayList1, b);
          }
       }
       battleDistri = p0.battleDistrictRankUnfold;
       if (battleDistri != null) {
          LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank battleDistri1 = p0.battleDistrictRankEndTime;
          if (!PatchProxy.isSupport(LiveHourlyRankStrengthNoticeView.class) || !PatchProxy.applyVoidTwoRefs(battleDistri, Long.valueOf(battleDistri1), this, LiveHourlyRankStrengthNoticeView.class, "16")) {
             LiveHourlyRankStrengthNoticeView td = this.d;
             Objects.requireNonNull(td);
             if (!PatchProxy.isSupport(LiveHourlyRankStrengthNoticeExpandView.class) || !PatchProxy.applyVoidTwoRefs(battleDistri, Long.valueOf(battleDistri1), td, LiveHourlyRankStrengthNoticeExpandView.class, "1")) {
                if (!j.h(battleDistri.backgroundPicUrl)) {
                   td.E.U(e0.i(battleDistri.backgroundPicUrl));
                }
                if (!j.h(battleDistri.iconUrl)) {
                   td.J.U(e0.i(battleDistri.iconUrl));
                }
                LiveDistrictRankFinalBattle$BattleDistrictRankUnfold countDownTex = battleDistri.countDownText;
                if (countDownTex != null) {
                   td.B.setText(countDownTex.content);
                   int i = 0xff000000;
                   td.B.setTextColor(l0.j(battleDistri.countDownText.color, i));
                   td.C.setTextColor(l0.j(battleDistri.countDownColor, i));
                }
                LiveDistrictRankFinalBattle$BattleDistrictRankUnfold unfoldMessag = battleDistri.unfoldMessage;
                if (!PatchProxy.applyVoidOneRefs(unfoldMessag, td, LiveHourlyRankStrengthNoticeExpandView.class, "11")) {
                   if (j.h(unfoldMessag)) {
                      b.Z(LiveLogTag.HOURLY_RANK, "update strength notice expand view error : illegal info");
                   }else {
                      LiveHourlyRankStrengthNoticeExpandView k = td.K;
                      ArrayList uArrayList = j.a(unfoldMessag);
                      if (!td.getVisibility()) {
                         sCLiveBattle = true;
                      }
                      k.e(uArrayList, sCLiveBattle);
                   }
                }
                if (!PatchProxy.isSupport(LiveHourlyRankStrengthNoticeExpandView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(battleDistri1), td, LiveHourlyRankStrengthNoticeExpandView.class, "12")) {
                   if (battleDistri1 - td.getServerTimeMs() <= 0) {
                      td.L();
                      td.N();
                   }else if(!battleDistri1 - td.I){
                      if (!PatchProxy.isSupport(LiveHourlyRankStrengthNoticeExpandView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(battleDistri1), td, LiveHourlyRankStrengthNoticeExpandView.class, "13")) {
                         td.L();
                         k ok = new k(td, (battleDistri1 - td.getServerTimeMs()), 79);
                         td.H = unfoldMessag;
                         unfoldMessag.start();
                      }
                      td.I = battleDistri1;
                      td.M = liveHourlyRa;
                   }
                }
             }
          }
          if (!j.h(p0.battleDistrictRankUnfold.foldPicUrl)) {
             this.e.U(e0.i(p0.battleDistrictRankUnfold.foldPicUrl));
          }
       }
       battleDistri = p0.waitEndTimestamp;
       if (!PatchProxy.isSupport(LiveHourlyRankStrengthNoticeView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(battleDistri), this, LiveHourlyRankStrengthNoticeView.class, "10")) {
          long l = 0;
          if (!this.s - l && battleDistri - l > 0) {
             this.s = battleDistri;
             k1.s(this.r, this.n, Math.max(3000, (battleDistri - this.getLiveServerTimeMs())));
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       this.e();
       return;
    }
    public void setNoticeViewDelegate(LiveHourlyRankStrengthNoticeView$e p0){
       this.o = p0;
    }
}
