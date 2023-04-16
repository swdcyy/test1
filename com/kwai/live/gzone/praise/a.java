package com.kwai.live.gzone.praise.a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ml8.d;
import a77.a;
import a77.a$b;
import com.kwai.library.widget.popup.common.c$b;
import o67.d;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import o67.e;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.view.ViewParent;
import android.view.ViewGroup;
import p67.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.LayoutInflater;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.app.Activity;
import d61.y;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import lnc.a1;
import o67.c;
import android.widget.ViewSwitcher$ViewFactory;
import android.widget.TextSwitcher;
import android.content.Context;
import o07.n;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kwai.live.gzone.popup.bean.LiveGzonePraiseCommentInfo$Comment;
import com.kwai.live.gzone.praise.a$a;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.lang.Long;
import android.animation.AnimatorSet;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import ekd.m1;
import android.widget.TextView;
import o67.a;
import android.view.View$OnClickListener;
import o67.b;
import java.lang.CharSequence;
import android.text.TextUtils;

public class a extends a implements PopupInterface$f, d	// class@000da2
{
    public TextSwitcher r;
    public TextView s;
    public a$a t;
    public List u;
    public int v;
    public LiveGzonePraiseCommentInfo$Comment w;
    public String x;
    public LiveGzonePraiseCommentInfo$Comment y;
    public ClientContent$LiveStreamPackage z;

    public void a(a$b p0){
       super(p0);
       this.v = -1;
       p0.L(this);
       p0.z(true);
       p0.A(true);
       p0.F(new d(this));
       p0.N(new e(this));
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       if (this.z() != null) {
          ViewParent parent = this.z().getParent();
          if (parent instanceof ViewGroup) {
             parent.removeAllViews();
          }
       }
       return;
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.f0();
       a tz = this.z;
       if (!PatchProxy.applyVoidOneRefs(tz, null, a.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_RAINBOW_BARRAGE_DIALOG";
          uElementPack.type = 18;
          u1.u0(10, uElementPack, a.a(tz));
       }
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.g(p1, R.layout.arg_RES_7f0d0bdc, p2, false);
       this.doBindView(view);
       if (y.d(this.u())) {
          p1.width = n.j(this.u()) - a1.e(22.00f);
       }
       this.r.setFactory(new c(this));
       this.r.setInAnimation(this.u(), R.anim.arg_RES_7f010105);
       this.r.setOutAnimation(this.u(), R.anim.arg_RES_7f010115);
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
    public final String c0(){
       LiveGzonePraiseCommentInfo$Comment mCommentText;
       Object[] objArray = null;
       LiveGzonePraiseCommentInfo$Comment obj = PatchProxy.apply(objArray, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.u) && (this.v + 1) < this.u.size()) {
          int i = this.v + 1;
          this.v = i;
          obj = this.u.get(i);
          this.w = obj;
          mCommentText = obj.mCommentText;
          a.b(this.z, obj.mCommentId);
       }else {
          a tw = this.w;
          if (tw != null) {
             this.v = -1;
             a tt = this.t;
             if (tt != null) {
                tt.y5(tw.mCommentId);
             }
             this.w = objArray;
          }
          mCommentText = "";
       }
       return mCommentText;
    }
    public final void d0(long p0,Animator$AnimatorListener p1,Animator[] p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, a.class, "2")) {
          return;
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.playTogether(p2);
       uAnimatorSet.setDuration(p0);
       uAnimatorSet.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       if (p1 != null) {
          uAnimatorSet.addListener(p1);
       }
       uAnimatorSet.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1f68);
       this.s = m1.f(p0, 0x7f0a1f6b);
       m1.a(p0, new a(this), R.id.live_gzone_praise_comment_next_btn);
       m1.a(p0, new b(this), R.id.live_gzone_praise_comment_send_btn);
       return;
    }
    public void e0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.x = p0;
       }
       return;
    }
    public void f0(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.v = -1;
       a ty = this.y;
       if (ty != null) {
          this.r.setText(ty.mCommentText);
          ty = this.y;
          this.w = ty;
          a.b(this.z, ty.mCommentId);
       }else {
          this.r.setText(this.c0());
       }
       if (!TextUtils.isEmpty(this.x)) {
          this.s.setText(this.x);
       }
       this.y = null;
       return;
    }
}
