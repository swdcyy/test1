package com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView;
import ml8.d;
import mt5.a;
import android.widget.RelativeLayout;
import android.content.Context;
import com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView$a;
import android.os.Looper;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.view.View;
import fh2.e;
import android.animation.Animator$AnimatorListener;
import com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.AnimationDrawable;
import fh2.a;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.Animator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import fh2.d;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import wb5.g;
import android.view.ViewGroup;
import i2b.a;
import fh2.b;
import android.view.View$OnClickListener;
import com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket$a;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import va1.n0;
import lnc.a1;
import tw1.f;
import java.lang.Long;
import android.os.CountDownTimer;
import java.lang.CharSequence;
import fh2.c;

public class LiveNormalRedPacketFloatTipsView extends RelativeLayout implements d, a	// class@000eef
{
    public ImageView b;
    public View c;
    public LiveUserView d;
    public TextView e;
    public RelativeLayout f;
    public View g;
    public ImageView h;
    public AnimationDrawable i;
    public boolean j;
    public RedPacket k;
    public UserInfo l;
    public CountDownTimer m;
    public boolean n;
    public boolean o;
    public long p;
    public boolean q;
    public View$OnClickListener r;
    public AnimatorListenerAdapter s;
    public long t;
    public Handler u;

    public void LiveNormalRedPacketFloatTipsView(Context p0){
       super(p0);
       this.t = -1;
       this.u = new LiveNormalRedPacketFloatTipsView$a(this, Looper.getMainLooper());
       this.f();
    }
    public void LiveNormalRedPacketFloatTipsView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.t = -1;
       this.u = new LiveNormalRedPacketFloatTipsView$a(this, Looper.getMainLooper());
       this.f();
    }
    public void LiveNormalRedPacketFloatTipsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.t = -1;
       this.u = new LiveNormalRedPacketFloatTipsView$a(this, Looper.getMainLooper());
       this.f();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveNormalRedPacketFloatTipsView.class, "14")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveNormalRedPacketFloatTipsView.class, "18")) {
          AnimatorSet contentViewA = this.getContentViewAnim();
          this.c.setVisibility(4);
          contentViewA.addListener(new e(this));
          contentViewA.start();
       }
       return;
    }
    public void b(RedPacket p0,View p1){
       int i2;
       boolean b = this;
       Object obj = p0;
       AnimationDrawable obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, b, LiveNormalRedPacketFloatTipsView.class, "6")) {
          return;
       }
       Object[] objArray = null;
       if ((v10 = (obj.mDou - b.p) - null) > 0 && obj1 == b) {
          if (!PatchProxy.applyVoid(objArray, b, LiveNormalRedPacketFloatTipsView.class, "17") && b.j == null) {
             b.j = true;
             b.h.setVisibility(0);
             obj1 = b.h.getDrawable();
             b.i = obj1;
             obj1.start();
             k1.s(new a(b), b, 1000);
             b.setNormalRedPacket(b.k);
          }
       }else if(p0.hasAlreadySnatched() && b.o == null){
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoid(objArray, b, LiveNormalRedPacketFloatTipsView.class, "15")) {
             b.o = true;
             AnimatorSet uAnimatorSet = new AnimatorSet();
             AnimatorSet uAnimatorSet1 = PatchProxy.applyOneRefs(b, b, LiveNormalRedPacketFloatTipsView.class, "20");
             int i = 3;
             int i1 = 2;
             float[] uofloatArray = 100;
             if (uAnimatorSet1 != patchProxyRe) {
             }else {
                uAnimatorSet1 = new AnimatorSet();
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(b, View.SCALE_X, new float[i1]{0x3f800000,0x3f000000});
                objectAnimat.setDuration(uofloatArray);
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(b, View.SCALE_Y, new float[i1]{0x3f800000,0x3f000000});
                objectAnimat1.setDuration(uofloatArray);
                ObjectAnimator objectAnimat2 = j.a(b, new float[i1]{0x3f800000,0x3e99999a});
                objectAnimat2.setDuration(uofloatArray);
                Animator[] uAnimatorArr4 = new Animator[i];
                uAnimatorArr4[0] = objectAnimat;
                uAnimatorArr4[1] = objectAnimat1;
                uAnimatorArr4[i1] = objectAnimat2;
                uAnimatorSet1.playTogether(uAnimatorArr4);
                uAnimatorSet1.setInterpolator(new LinearInterpolator());
             }
             AnimatorSet uAnimatorSet2 = PatchProxy.applyOneRefs(b, b, LiveNormalRedPacketFloatTipsView.class, "21");
             if (uAnimatorSet2 != patchProxyRe) {
                i2 = 2;
             }else {
                uAnimatorSet2 = new AnimatorSet();
                AnimatorSet uAnimatorSet3 = new AnimatorSet();
                AnimatorSet uAnimatorSet4 = new AnimatorSet();
                AnimatorSet uAnimatorSet5 = new AnimatorSet();
                Animator[] uAnimatorArr1 = new Animator[i];
                uAnimatorArr1[0] = ObjectAnimator.ofFloat(b, View.SCALE_X, new float[i1]{0x3f000000,0x3f800000});
                uAnimatorArr1[1] = ObjectAnimator.ofFloat(b, View.SCALE_Y, new float[i1]{0x3f000000,0x3f800000});
                i2 = 2;
                uAnimatorArr1[i2] = j.a(b, new float[i1]{0x3e99999a,0x3f800000});
                uAnimatorSet3.playTogether(uAnimatorArr1);
                uAnimatorSet3.setDuration(100);
                uAnimatorSet3.setInterpolator(new LinearInterpolator());
                Animator[] uAnimatorArr2 = new Animator[i2];
                uAnimatorArr2[0] = ObjectAnimator.ofFloat(b, View.SCALE_X, new float[i2]{0x3f800000,0x3f400000});
                uAnimatorArr2[1] = ObjectAnimator.ofFloat(b, View.SCALE_Y, new float[i2]{0x3f800000,0x3f400000});
                uAnimatorSet4.playTogether(uAnimatorArr2);
                uAnimatorSet4.setInterpolator(new AccelerateDecelerateInterpolator());
                uAnimatorSet4.setDuration(50);
                uAnimatorArr1 = new Animator[i2];
                uAnimatorArr1[0] = ObjectAnimator.ofFloat(b, View.SCALE_X, new float[i2]{0x3f400000,0x3f800000});
                uAnimatorArr1[1] = ObjectAnimator.ofFloat(b, View.SCALE_Y, new float[i2]{0x3f400000,0x3f800000});
                uAnimatorSet5.playTogether(uAnimatorArr1);
                uAnimatorSet5.setInterpolator(new AccelerateDecelerateInterpolator());
                uAnimatorSet5.setDuration(50);
                Animator[] uAnimatorArr3 = new Animator[]{uAnimatorSet3,uAnimatorSet4,uAnimatorSet5};
                uAnimatorSet2.playSequentially(uAnimatorArr3);
             }
             uAnimatorSet1.addListener(new d(b));
             Animator[] uAnimatorArr = new Animator[i2];
             uAnimatorArr[0] = uAnimatorSet1;
             uAnimatorArr[1] = uAnimatorSet2;
             uAnimatorSet.playSequentially(uAnimatorArr);
             uAnimatorSet.start();
          }
       }
       b.k = obj;
       b.p = obj.mDou;
       this.g();
       this.h();
       if (v10 <= 0) {
          this.i();
       }
       return;
    }
    public void c(AnimatorListenerAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNormalRedPacketFloatTipsView.class, "22")) {
          return;
       }
       this.s = p0;
       if (this.q == null) {
          this.q = true;
          if (!this.getVisibility()) {
             this.u.sendEmptyMessageDelayed(1002, 0x7530);
          }else {
             LiveNormalRedPacketFloatTipsView ts = this.s;
             if (ts != null) {
                ts.onAnimationEnd(null);
             }
          }
       }
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, LiveNormalRedPacketFloatTipsView.class, "24")) {
          return;
       }
       this.u.removeMessages(1001);
       this.u.removeMessages(1002);
       this.d.setAnimationEnabled(false);
       this.j = false;
       LiveNormalRedPacketFloatTipsView ti = this.i;
       if (ti != null && ti.isRunning()) {
          this.i.stop();
       }
       k1.n(this);
       this.removeAllViews();
       this.clearAnimation();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveNormalRedPacketFloatTipsView.class, "7")) {
          return;
       }
       if (this.n == null) {
          this.l();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNormalRedPacketFloatTipsView.class, "1")) {
          return;
       }
       this.g = m1.f(p0, 0x7f0a2223);
       this.c = m1.f(p0, 0x7f0a2221);
       this.e = m1.f(p0, 0x7f0a2224);
       this.b = m1.f(p0, 0x7f0a2222);
       this.f = m1.f(p0, 0x7f0a2225);
       this.d = m1.f(p0, 0x7f0a2220);
       this.h = m1.f(p0, 0x7f0a221f);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LiveNormalRedPacketFloatTipsView.class, "28")) {
          return;
       }
       LiveNormalRedPacketFloatTipsView tl = this.l;
       if (tl != null) {
          g.d(this.d, tl, HeadImageSize.SMALL);
       }
       this.d.setAnimationEnabled(false);
       return;
    }
    public final void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveNormalRedPacketFloatTipsView.class, "2")) {
          return;
       }
       a.k(this, this.getLayoutRes(), true);
       this.doBindView(this);
       if (!PatchProxy.applyVoid(objArray, this, LiveNormalRedPacketFloatTipsView.class, "3")) {
          this.c.setOnClickListener(new b(this));
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, LiveNormalRedPacketFloatTipsView.class, "25")) {
          return;
       }
       if (!this.k.hasAlreadySnatched() && this.k.mExtraInfo.e == null) {
          this.b.setImageResource(R.drawable.arg_RES_7f08114a);
       }
       return;
    }
    public final AnimatorSet getContentViewAnim(){
       float f;
       AnimatorSet obj = PatchProxy.apply(null, this, LiveNormalRedPacketFloatTipsView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimatorSet();
       float[] uofloatArray = new float[]{(float)n0.f(),f};
       f = (float)(- n.c(a.a().a(), 8.00f));
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.c, View.TRANSLATION_X, uofloatArray);
       objectAnimat.setDuration(252);
       float[] uofloatArray1 = new float[]{f,f};
       f = (float)n.c(a.a().a(), 2.00f);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.c, View.TRANSLATION_X, uofloatArray1);
       objectAnimat1.setDuration(126);
       uofloatArray1 = new float[]{f,0};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this.c, View.TRANSLATION_X, uofloatArray1);
       objectAnimat2.setDuration(84);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       obj.playSequentially(uAnimatorArr);
       obj.setInterpolator(new LinearInterpolator());
       return obj;
    }
    public int getLayoutRes(){
       return 0x7f0d0d95;
    }
    public RedPacket getNormalRedPacket(){
       return this.k;
    }
    public long getOpenTime(){
       return this.k.mOpenTime;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, LiveNormalRedPacketFloatTipsView.class, "29")) {
          return;
       }
       this.e.setTextColor(a1.a(R.color.arg_RES_7f060c72));
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, LiveNormalRedPacketFloatTipsView.class, "27")) {
          return;
       }
       this.f.setBackgroundResource(R.drawable.arg_RES_7f081149);
       return;
    }
    public void j(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveNormalRedPacketFloatTipsView.class, "16")) {
          return;
       }
       this.g.setVisibility(8);
       this.c.setVisibility(0);
       if (!PatchProxy.applyVoid(objArray, this, LiveNormalRedPacketFloatTipsView.class, "26")) {
          this.b.setImageResource(R.drawable.arg_RES_7f0813b6);
       }
       this.f.setVisibility(0);
       this.i();
       this.d.setVisibility(0);
       this.e();
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveNormalRedPacketFloatTipsView.class, "13")) {
          return;
       }
       this.n = true;
       this.d.setVisibility(8);
       this.d.setAnimationEnabled(false);
       this.e.setVisibility(8);
       this.g.setVisibility(false);
       this.g();
       this.i();
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, LiveNormalRedPacketFloatTipsView.class, "8")) {
          return;
       }
       long l = f.a();
       RedPacket mOpenTime = this.k.mOpenTime;
       if (mOpenTime - l < 0) {
          this.k();
       }else {
          this.n = false;
          long l1 = mOpenTime - l;
          if (l1 - 0xea60 <= 0) {
             this.m(l, mOpenTime);
          }else {
             this.g();
             this.f.setVisibility(false);
             this.e.setVisibility(8);
             this.i();
             this.d.setVisibility(false);
             this.e();
             l1 = (l1 - 0xea60) + 1000;
             if (!PatchProxy.isSupport(LiveNormalRedPacketFloatTipsView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), this, LiveNormalRedPacketFloatTipsView.class, "11")) {
                this.u.sendEmptyMessageDelayed(1001, l1);
             }
          }
       }
       return;
    }
    public void m(long p0,long p1){
       if (PatchProxy.isSupport(LiveNormalRedPacketFloatTipsView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, LiveNormalRedPacketFloatTipsView.class, "10")) {
          return;
       }
       this.d.setVisibility(8);
       this.d.setAnimationEnabled(false);
       this.e.setVisibility(false);
       this.i();
       long l = p1 - p0;
       if (!PatchProxy.isSupport(LiveNormalRedPacketFloatTipsView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, LiveNormalRedPacketFloatTipsView.class, "9")) {
          this.h();
          LiveNormalRedPacketFloatTipsView tm = this.m;
          if (tm != null) {
             tm.cancel();
             this.m = null;
          }
          if (!this.t - -1) {
             this.t = l;
             this.e.setText(String.valueOf((l / 1000)));
          }
          c uoc = new c(this, l, 40);
          this.m = this.e;
          this.e.start();
       }
       return;
    }
    public void setNormalRedPacket(RedPacket p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNormalRedPacketFloatTipsView.class, "4")) {
          return;
       }
       this.k = p0;
       this.l = p0.mAuthorUserInfo;
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveNormalRedPacketFloatTipsView.class, "5")) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, LiveNormalRedPacketFloatTipsView.class, "12")) {
             LiveNormalRedPacketFloatTipsView tm = this.m;
             if (tm != null) {
                tm.cancel();
                this.m = objArray;
             }
             this.u.removeMessages(1001);
          }
          if (p0.isOpening(f.a())) {
             if (p0.hasAlreadySnatched()) {
                this.j();
                this.o = true;
             }else {
                this.o = false;
                this.k();
             }
          }else {
             this.o = false;
             this.l();
          }
       }
       this.p = p0.mDou;
       return;
    }
    public void setOnContentClickListener(View$OnClickListener p0){
       this.r = p0;
    }
}
