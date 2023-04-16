package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.a;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView$a;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import android.widget.TextView;
import android.widget.ImageView;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView$b;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Math;
import java.lang.StringBuilder;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView$c;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView$d;
import android.animation.AnimatorSet$Builder;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import android.view.animation.AlphaAnimation;
import android.os.CountDownTimer;
import android.os.Handler;
import bh2.b;
import vg2.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import bh2.a;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import com.kuaishou.livestream.message.nano.LiveRedPackMessage$AudienceRedPack;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import tw1.f;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.a$a;

public class LiveFellowRedPacketFloatView extends RelativeLayout implements a	// class@000ec3
{
    public LiveUserView b;
    public ImageView c;
    public TextView d;
    public ImageView e;
    public TextView f;
    public a g;
    public CountDownTimer h;
    public long i;
    public UserInfo j;
    public a$a k;
    public int l;
    public long m;
    public AlphaAnimation n;
    public AnimatorSet o;
    public Handler p;

    public void LiveFellowRedPacketFloatView(Context p0){
       super(p0, null);
    }
    public void LiveFellowRedPacketFloatView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFellowRedPacketFloatView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p = new LiveFellowRedPacketFloatView$a(this, Looper.getMainLooper());
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0b08, this);
       this.b = this.findViewById(0x7f0a1c9b);
       this.d = this.findViewById(0x7f0a1c9f);
       this.e = this.findViewById(0x7f0a1c9e);
       this.c = this.findViewById(0x7f0a1c9d);
       this.f = this.findViewById(0x7f0a1c9c);
       this.setOnClickListener(new LiveFellowRedPacketFloatView$b(this));
    }
    public void a(int p0,long p1){
       String str;
       if (PatchProxy.isSupport(LiveFellowRedPacketFloatView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, LiveFellowRedPacketFloatView.class, "3")) {
          return;
       }
       this.l = Math.max(p0, 0);
       long l = Math.max(p1, 0);
       this.m = l;
       LiveFellowRedPacketFloatView tl = this.l;
       if (tl > 1) {
          str = ((long)tl - l > 0)? this.m+"+": String.valueOf(tl);
       }else {
          str = "";
       }
       this.setDisplayCount(str);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketFloatView.class, "6")) {
          return;
       }
       this.d();
       this.o = new AnimatorSet();
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[2]{0x3f800000,0x3f000000}),PropertyValuesHolder.ofFloat("scaleY", new float[2]{0x3f800000,0x3f000000})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.f, propertyValu);
       objectAnimat.setDuration(300);
       objectAnimat.addListener(new LiveFellowRedPacketFloatView$c(this, p0));
       PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[2]{0x3f000000,0x3f800000}),PropertyValuesHolder.ofFloat("scaleY", new float[2]{0x3f000000,0x3f800000})};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.f, propertyValu1);
       objectAnimat1.setupEndValues();
       objectAnimat1.setDuration(300);
       this.o.addListener(new LiveFellowRedPacketFloatView$d(this));
       this.o.play(objectAnimat1).after(objectAnimat);
       this.o.start();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveFellowRedPacketFloatView.class, "14")) {
          return;
       }
       this.b.p0(this.j, HeadImageSize.ADJUST_SMALL, false);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveFellowRedPacketFloatView.class, "8")) {
          return;
       }
       LiveFellowRedPacketFloatView to = this.o;
       if (to != null && to.isRunning()) {
          this.o.cancel();
       }
       to = this.n;
       if (to != null) {
          to.cancel();
       }
       return;
    }
    public final void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFellowRedPacketFloatView.class, "7")) {
          return;
       }
       LiveFellowRedPacketFloatView th = this.h;
       if (th != null) {
          th.cancel();
          this.h = objArray;
       }
       this.p.removeMessages(1001);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveFellowRedPacketFloatView.class, "12")) {
          return;
       }
       this.b.setVisibility(8);
       this.e.setVisibility(0);
       this.d.setVisibility(8);
       this.c.setImageResource(R.drawable.arg_RES_7f08114a);
       this.c();
       return;
    }
    public void g(long p0,long p1){
       if (PatchProxy.isSupport(LiveFellowRedPacketFloatView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, LiveFellowRedPacketFloatView.class, "9")) {
          return;
       }
       this.b.setVisibility(8);
       this.e.setVisibility(8);
       this.c.setImageResource(R.drawable.arg_RES_7f08114a);
       this.d.setVisibility(0);
       long l = p1 - p0;
       if (!PatchProxy.isSupport(LiveFellowRedPacketFloatView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, LiveFellowRedPacketFloatView.class, "10")) {
          this.e();
          b uob = new b(this, l, 100);
          this.h = PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, LiveFellowRedPacketFloatView.class, "10");
          PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, LiveFellowRedPacketFloatView.class, "10").start();
       }
       return;
    }
    public int getCurrentDisplayCount(){
       return this.l;
    }
    public long getMaxDisplayCount(){
       return this.m;
    }
    public a getRedPackInfo(){
       return this.g;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveFellowRedPacketFloatView.class, "2")) {
          return;
       }
       this.e();
       this.d();
       return;
    }
    public final void setDisplayCount(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketFloatView.class, "4")) {
          return;
       }
       CharSequence text = this.f.getText();
       if (TextUtils.n(text, p0)) {
          return;
       }
       if (TextUtils.x(text)) {
          LiveFellowRedPacketFloatView tf = this.f;
          int i = (TextUtils.x(p0))? 8: 0;
          tf.setVisibility(i);
          this.f.setText(p0);
          return;
       }else if(TextUtils.x(p0)){
          if (!PatchProxy.applyVoid(null, this, LiveFellowRedPacketFloatView.class, "5")) {
             this.d();
             AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
             this.n = uAlphaAnimat;
             uAlphaAnimat.setAnimationListener(new a(this));
             this.n.setDuration(300);
             this.f.startAnimation(this.n);
          }
       }else {
          this.b(p0);
       }
       return;
    }
    public void setLiveFellowRedPackInfo(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketFloatView.class, "1")) {
          return;
       }
       this.g = p0;
       if (p0 != null) {
          a a = p0.a;
          if (a != null) {
             this.i = a.grabTime;
             this.j = UserInfo.convertFromProto(a.sendUser);
          }
       }
       this.e();
       int i = 0;
       Object[] objArray = null;
       if (p0 != null && p0.a(f.a())) {
          if (p0.b != null) {
             if (!PatchProxy.applyVoid(objArray, this, LiveFellowRedPacketFloatView.class, "11")) {
                this.b.setVisibility(i);
                this.e.setVisibility(8);
                this.d.setVisibility(8);
                this.c.setImageResource(R.drawable.arg_RES_7f0813b6);
                this.c();
             }
          }else {
             this.f();
          }
       }else if(PatchProxy.applyVoid(objArray, this, LiveFellowRedPacketFloatView.class, "13")){
          long l = f.a();
          LiveFellowRedPacketFloatView ti = this.i;
          if ((ti - l) - 0xea60 <= 0) {
             this.g(l, ti);
          }else {
             this.c.setImageResource(R.drawable.arg_RES_7f08114a);
             this.d.setVisibility(8);
             this.e.setVisibility(8);
             this.b.setVisibility(i);
             this.c();
             this.p.sendEmptyMessageDelayed(1001, (((this.i - l) - 0xea60) + 1000));
          }
       }
       return;
    }
    public void setOnLiveFellowRedPackFloatViewClickListener(a$a p0){
       this.k = p0;
    }
}
