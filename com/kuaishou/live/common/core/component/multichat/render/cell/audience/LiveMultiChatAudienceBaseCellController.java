package com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;
import zp1.c;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewGroup;
import lnc.a1;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import d61.f0;
import android.widget.ImageView;
import fq1.d;
import zp1.b;
import zp1.m;
import com.kuaishou.live.common.core.component.follow.cache.c;
import d61.j0;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import bq1.d;
import zh3.c;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$d;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2$a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import android.app.Dialog;
import pp.c;
import va1.m;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Map;
import yp1.a;
import usd.q;
import bq1.e;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import yh3.a;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import java.lang.Number;
import android.content.Context;
import xd1.g$a;
import xd1.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import android.graphics.Rect;
import java.lang.Float;
import zp1.j;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$a;
import com.kuaishou.live.widget.LiveLottieAnimationView;

public abstract class LiveMultiChatAudienceBaseCellController extends c	// class@0014e2
{
    public LiveLottieAnimationView H;
    public Dialog I;
    public final p J;
    public final String K;
    public final b L;
    public final i M;
    public final l N;

    public void LiveMultiChatAudienceBaseCellController(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.K = p0;
       this.L = p1;
       this.M = p2;
       this.N = p3;
       this.J = s.c(new LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2(this));
    }
    public void E3(int p0,boolean p1,boolean p2){
       LiveMultiChatAudienceBaseCellController tH1;
       if (PatchProxy.isSupport(LiveMultiChatAudienceBaseCellController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, LiveMultiChatAudienceBaseCellController.class, "11")) {
          return;
       }
       if (this.l3().getMeasuredWidth() > 0 && this.q3().getMeasuredWidth() > 0) {
          int i = (((this.l3().getMeasuredWidth() - p0) - this.s3()) - this.t3()) - a1.e(6.00f);
          if (i <= 0) {
             return;
          }else {
             TextPaint paint = this.o3().getPaint();
             CharSequence text = this.o3().getText();
             String str = null;
             String str1 = (text != null)? text.toString(): str;
             paint = (int)paint.measureText(f0.b(str1, 2));
             int i1 = d.g(this.n3());
             LiveMultiChatAudienceBaseCellController tH = this.H;
             if (tH == null) {
                a.S("audienceMultiChatFollowLottie");
             }
             int i2 = d.g(tH);
             int i3 = i1 + i2;
             int i4 = (i3 + paint) + d.f(this.o3());
             TextPaint paint1 = this.o3().getPaint();
             CharSequence text1 = this.o3().getText();
             if (text1 != null) {
                str = text1.toString();
             }
             int i5 = (int)paint1.measureText(str);
             int i6 = 0;
             if (this.L.k(this.K)) {
                if (i < a1.e(37.00f)) {
                   tH1 = this.H;
                   if (tH1 == null) {
                      a.S("audienceMultiChatFollowLottie");
                   }
                   tH1.setVisibility(8);
                   this.o3().setVisibility(8);
                }else if(i < ((i3 + d.f(this.o3())) + i5)){
                   this.L3(i, paint, i1, i2);
                }
                if (i < i4) {
                   this.w3();
                   this.C3();
                   i = i + this.m3().getMeasuredWidth();
                   this.L3(i, paint, i1, i2);
                }
                if (p2 && this.G3()) {
                   tH1 = this.H;
                   if (tH1 == null) {
                      a.S("audienceMultiChatFollowLottie");
                   }
                   if (!tH1.getVisibility()) {
                      tH1 = this.H;
                      if (tH1 == null) {
                         a.S("audienceMultiChatFollowLottie");
                      }
                      if (tH1 != null) {
                         if (i < i4) {
                            i6 = 8;
                         }
                         tH1.setVisibility(i6);
                      }
                   }
                }
             }else if(i < a1.e(25.00f)){
                this.n3().setVisibility(8);
                tH1 = this.H;
                if (tH1 == null) {
                   a.S("audienceMultiChatFollowLottie");
                }
                tH1.setVisibility(8);
                this.o3().setVisibility(8);
                this.k3().setVisibility(8);
             }else if(i < ((i3 + d.f(this.o3())) + i5)){
                this.L3(i, paint, i1, i2);
             }
             if (p1) {
                ImageView imageView = this.n3();
                i5 = (i < i4)? 8: 0;
                imageView.setVisibility(i5);
             }
             i4 = i4 - i1;
             if (i < i4) {
                this.w3();
                this.C3();
                i = i + this.m3().getMeasuredWidth();
                this.L3(i, paint, i1, i2);
             }
             if (p2 && this.G3()) {
                tH1 = this.H;
                if (tH1 == null) {
                   a.S("audienceMultiChatFollowLottie");
                }
                if (!tH1.getVisibility()) {
                   tH1 = this.H;
                   if (tH1 == null) {
                      a.S("audienceMultiChatFollowLottie");
                   }
                   if (i < i4) {
                      i6 = 8;
                   }
                   tH1.setVisibility(i6);
                }
             }
          label_01a3 :
             if (this.k3().getVisibility() != 8) {
                this.k3().requestLayout();
             }
          }
       }
       return;
    }
    public void F3(b p0){
       LiveMultiChatAudienceBaseCellController liveMultiCha = LiveMultiChatAudienceBaseCellController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveMultiCha, "4")) {
          return;
       }
       a.p(p0, "viewModel");
       super.f3(p0);
       if (!c.b().c(this.K)) {
          this.N3(0, 0);
       }
       LiveMultiChatAudienceBaseCellController tH = this.H;
       String str = "audienceMultiChatFollowLottie";
       if (tH == null) {
          a.S(str);
       }
       j0.b(tH, a1.e(6.00f));
       tH = this.H;
       if (tH == null) {
          a.S(str);
       }
       tH.setOnClickListener(new LiveMultiChatAudienceBaseCellController$b(this, p0));
       p0.o.observe(this, new LiveMultiChatAudienceBaseCellController$c(this));
       if (!PatchProxy.applyVoid(null, this, liveMultiCha, "5")) {
          this.l3().setOnClickListener(new d(this));
       }
       this.L.h().observe(this, new LiveMultiChatAudienceBaseCellController$d(this));
       return;
    }
    public final boolean G3(){
       Object obj = PatchProxy.apply(null, this, LiveMultiChatAudienceBaseCellController.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.N.d() && (!this.L.k(this.K) && !this.L.i(this.K)))? true: false;
       return b;
    }
    public final LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2$a H3(){
       Object obj = PatchProxy.apply(null, this, LiveMultiChatAudienceBaseCellController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.J.getValue();
    }
    public abstract int I3();
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiChatAudienceBaseCellController.class, "16")) {
          return;
       }
       super.J2();
       m.a(this.I, LiveCommonLogTag.NEW_MULTI_CHAT);
       LiveMultiChatAudienceBaseCellController tH = this.H;
       if (tH == null) {
          a.S("audienceMultiChatFollowLottie");
       }
       tH.v(this.H3());
       return;
    }
    public final void J3(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiChatAudienceBaseCellController.class, "17")) {
          return;
       }
       a.e(this.L.d(), this.L.f(), this.L.e(this.K), p0, this.K);
       return;
    }
    public final void K3(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiChatAudienceBaseCellController.class, "18")) {
          return;
       }
       a.f(this.L.d(), this.L.f(), this.L.e(this.K), p0, this.K);
       return;
    }
    public final void L3(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveMultiChatAudienceBaseCellController.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveMultiChatAudienceBaseCellController.class, "12")) {
          return;
       }
       if (this.o3().getVisibility()) {
          return;
       }
       TextPaint paint = this.o3().getPaint();
       int i = this.I3();
       CharSequence text = this.o3().getText();
       String str = (text != null)? text.toString(): null;
       int i1 = (int)paint.measureText(f0.b(str, i));
       p0 = p0 - d.f(this.o3());
       if (!this.n3().getVisibility()) {
          p0 = p0 - p2;
       }
       LiveMultiChatAudienceBaseCellController tH = this.H;
       if (tH == null) {
          a.S("audienceMultiChatFollowLottie");
       }
       if (!tH.getVisibility()) {
          p0 = p0 - p3;
       }
       this.o3().setMaxWidth(q.n(p1, q.u(i1, p0)));
       this.o3().setMinWidth(p1);
       return;
    }
    public final void M3(){
       int i;
       LiveMultiChatAudienceBaseCellController liveMultiCha = LiveMultiChatAudienceBaseCellController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiCha, "6")) {
          return;
       }
       m.a(this.I, LiveCommonLogTag.NEW_MULTI_CHAT);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Dialog uDialog = PatchProxy.apply(objArray, this, liveMultiCha, "15");
       if (uDialog != patchProxyRe) {
       }else {
          this.K3("MUTE");
          this.K3("CLOSE");
          this.K3("CANCEL");
          boolean b = this.z3();
          if (b) {
             this.K3("BEAUTIFY");
             this.K3("TURN_OVER");
          }
          e uoe = new e(this);
          Activity uActivity = this.B2();
          Boolean value = this.b3().y0().getValue();
          Object obj = PatchProxy.applyOneRefs(value, this, c.class, "35");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(a.g(value, Boolean.FALSE)){
             i = 0x7f1027c3;
          }else {
             i = 0x7f1027c7;
          }
          uDialog = g.g(uActivity, false, b, a1.p(i), uoe);
       }
       this.I = uDialog;
       return;
    }
    public final void N3(int p0,boolean p1){
       ClientEvent$ElementPackage uElementPack;
       LiveMultiChatAudienceBaseCellController liveMultiCha = LiveMultiChatAudienceBaseCellController.class;
       if (PatchProxy.isSupport(liveMultiCha) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, liveMultiCha, "13")) {
          return;
       }
       liveMultiCha = this.H;
       if (liveMultiCha == null) {
          a.S("audienceMultiChatFollowLottie");
       }
       if (this.G3()) {
          liveMultiCha.setVisibility(p0);
          if (!p0) {
             String str = "liveStreamPackage";
             String str1 = "logPage";
             if (this.y3()) {
                LiveMultiChatAudienceBaseCellController tK = this.K;
                e0 uoe0 = this.L.d();
                ClientContent$LiveStreamPackage liveStreamPa = this.L.f();
                Map map = this.L.e(this.K);
                if (!PatchProxy.applyVoidFourRefs(tK, uoe0, liveStreamPa, map, null, a.class, "7")) {
                   a.p(tK, "userId");
                   a.p(uoe0, str1);
                   a.p(liveStreamPa, str);
                   a.p(map, "interactiveParams");
                   uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "MULTI_FOLLOW_BUTTON";
                   i3 oi3 = i3.f();
                   a.o(oi3, "jsonObject");
                   a.a(map, oi3);
                   uElementPack.params = oi3.e();
                   ClientContent$ContentPackage uContentPack = a.b(liveStreamPa);
                   ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                   uContentPack.userPackage = userPackage;
                   userPackage.identity = tK;
                   u1.B0(new ShowMetaData().setLogPage(uoe0).setType(9).setElementPackage(uElementPack).setContentPackage(uContentPack));
                }
             }else {
                e0 uoe01 = this.L.d();
                ClientContent$LiveStreamPackage liveStreamPa1 = this.L.f();
                if (!PatchProxy.applyVoidTwoRefs(uoe01, liveStreamPa1, null, a.class, "1")) {
                   a.p(uoe01, str1);
                   a.p(liveStreamPa1, str);
                   uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "CHAT_SMALL_WINDOW_FOLLOW";
                   u1.B0(new ShowMetaData().setLogPage(uoe01).setType(9).setElementPackage(uElementPack).setContentPackage(a.b(liveStreamPa1)));
                }
             }
          }
          if (p1 && this.r3()) {
             this.D3(this.r3());
          }
       }
    label_0103 :
       return;
    }
    public void V2(a p0){
       this.F3(p0);
    }
    public a X2(){
       b uob = PatchProxy.apply(null, this, LiveMultiChatAudienceBaseCellController.class, "2");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this.L, this.K, this.M, this.N);
       }
       return uob;
    }
    public void d3(float p0,Rect p1){
       LiveMultiChatAudienceBaseCellController liveMultiCha = LiveMultiChatAudienceBaseCellController.class;
       if (PatchProxy.isSupport(liveMultiCha) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, liveMultiCha, "8")) {
          return;
       }
       a.p(p1, "cellRect");
       super.d3(p0, p1);
       if (this.y3() && this.j3() != null) {
          LiveMultiChatAudienceBaseCellController tH = this.H;
          String str = "audienceMultiChatFollowLottie";
          if (tH == null) {
             a.S(str);
          }
          j oj = this.j3();
          int i = (oj != null && (oj.e() == true && (!c.b().c(this.K) && this.G3())))? 0: 8;
          tH.setVisibility(i);
          tH = this.H;
          if (tH == null) {
             a.S(str);
          }
          float f = 16.00f;
          tH.width = a1.e(f);
          tH = this.H;
          if (tH == null) {
             a.S(str);
          }
          tH.height = a1.e(f);
       }
       if (this.L.i(this.K)) {
          if (!PatchProxy.applyVoid(null, this, c.class, "25")) {
             c tv = this.v;
             if (tv == null) {
                a.S("multiChatMuteImageView");
             }
             tv.setVisibility(8);
          }
          this.v3();
       }
       return;
    }
    public void e3(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiChatAudienceBaseCellController.class, "7")) {
          return;
       }
       a.p(p0, "viewModel");
       super.e3(p0);
       this.n3().setOnClickListener(new LiveMultiChatAudienceBaseCellController$a(this, p0));
       return;
    }
    public void f3(m p0){
       this.F3(p0);
    }
    public int g3(){
       return 0x7f0d0ca7;
    }
    public void u3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiChatAudienceBaseCellController.class, "10")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.n3().getLayoutParams();
       j oj = this.j3();
       Integer integer = (oj != null)? Integer.valueOf(oj.c()): objArray;
       a.m(integer);
       layoutParams.width = integer.intValue();
       layoutParams = this.n3().getLayoutParams();
       oj = this.j3();
       if (oj != null) {
          objArray = Integer.valueOf(oj.a());
       }
       a.m(objArray);
       layoutParams.height = objArray.intValue();
       return;
    }
    public void x3(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiChatAudienceBaseCellController.class, "3")) {
          return;
       }
       a.p(p0, "chatCellView");
       p0 = p0.findViewById(R.id.live_multi_chat_peer_follow_button);
       a.o(p0, "chatCellView.findViewByI¡­_chat_peer_follow_button\)");
       this.H = p0;
       String str = "audienceMultiChatFollowLottie";
       if (p0 == null) {
          a.S(str);
       }
       p0.setCancelTaskOnDetachedFromWindow(false);
       LiveMultiChatAudienceBaseCellController tH = this.H;
       if (tH == null) {
          a.S(str);
       }
       tH.a(this.H3());
       return;
    }
}
