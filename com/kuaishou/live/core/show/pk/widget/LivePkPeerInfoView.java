package com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView;
import android.widget.RelativeLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.lsjwzh.widget.text.FastTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import fe2.e;
import android.view.View$OnClickListener;
import fe2.f;
import android.widget.ImageView;
import fe2.g;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import b61.b;
import hf1.f;
import com.kuaishou.live.common.core.component.follow.cache.c;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView$a;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView$b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import fe2.d;
import erd.g;
import crd.b;
import lnc.b9;
import java.lang.Boolean;
import java.lang.Integer;

public class LivePkPeerInfoView extends RelativeLayout	// class@000db0
{
    public KwaiImageView b;
    public FastTextView c;
    public View d;
    public LottieAnimationView e;
    public View f;
    public View g;
    public UserInfo h;
    public boolean i;
    public b j;
    public LivePkPeerInfoView$b k;
    public static final int l;

    static {
       LivePkPeerInfoView.l = a1.e(6.00f);
    }
    public void LivePkPeerInfoView(Context p0){
       super(p0, null);
    }
    public void LivePkPeerInfoView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePkPeerInfoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = true;
       this.f = a.c(p0, 0x7f0d0d00, this);
       if (PatchProxy.applyVoid(null, this, LivePkPeerInfoView.class, "5")) {
       }else {
          this.c = this.findViewById(0x7f0a30a8);
          this.b = this.findViewById(0x7f0a30a6);
          this.d = this.findViewById(0x7f0a227a);
          this.e = this.findViewById(0x7f0a30a7);
          this.g = this.findViewById(0x7f0a2248);
          this.c.setMaxWidth(a1.e(74.00f));
          this.c.setOnClickListener(new e(this));
          this.e.setOnClickListener(new f(this));
          this.b.setOnClickListener(new g(this));
       }
       this.f.setPadding(this.f.getLeft(), this.f.getTop(), LivePkPeerInfoView.l, this.f.getBottom());
       return;
    }
    public void a(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkPeerInfoView.class, "1")) {
          return;
       }
       int i = 0;
       if (p0 == null) {
          this.setBackgroundResource(i);
          this.c.setText("");
          this.b.setVisibility(4);
       }else {
          this.setBackgroundResource(R.drawable.arg_RES_7f0813c0);
          g.d(this.b, p0, HeadImageSize.SMALL);
          this.c.setText(f.e(b.c(p0), 6));
          LivePkPeerInfoView tb = this.b;
          if (this.i == null) {
             i = 8;
          }
          tb.setVisibility(i);
          if (!PatchProxy.applyVoidOneRefs(p0, this, LivePkPeerInfoView.class, "6") && this.e != null) {
             if (c.b().c(p0.mId)) {
                this.b();
             }else {
                this.c();
             }
          }
       }
       this.h = p0;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LivePkPeerInfoView.class, "14")) {
          return;
       }
       LivePkPeerInfoView te = this.e;
       if (te != null) {
          te.setVisibility(8);
          this.e.setAlpha(0x3f800000);
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LivePkPeerInfoView.class, "13")) {
          return;
       }
       LivePkPeerInfoView te = this.e;
       if (te != null) {
          te.setAlpha(0x3f800000);
          this.e.setVisibility(0);
          this.e.t();
          this.e.setAnimation(R.raw.arg_RES_7f0f0039);
          this.e.setProgress(0);
          this.e.a(new LivePkPeerInfoView$a(this));
          te = this.k;
          if (te != null) {
             te.c();
          }
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LivePkPeerInfoView.class, "10")) {
          return;
       }
       super.onAttachedToWindow();
       this.j = RxBus.f.f(n.class).observeOn(d.a).subscribe(new d(this));
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePkPeerInfoView.class, "11")) {
          return;
       }
       super.onDetachedFromWindow();
       b9.a(this.j);
       return;
    }
    public void setIsNeedShowUserAvatar(boolean p0){
       this.i = p0;
    }
    public void setMuteIconVisibility(boolean p0){
       if (PatchProxy.isSupport(LivePkPeerInfoView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePkPeerInfoView.class, "2")) {
          return;
       }
       LivePkPeerInfoView td = this.d;
       int i = (p0)? 0: 8;
       td.setVisibility(i);
       return;
    }
    public void setNameMaxWidth(int p0){
       if (PatchProxy.isSupport(LivePkPeerInfoView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkPeerInfoView.class, "4")) {
          return;
       }
       if (p0 != this.c.getMaxWidth()) {
          this.c.setMaxWidth(p0);
       }
       return;
    }
    public void setOnFollowPeerButtonClickListener(LivePkPeerInfoView$b p0){
       this.k = p0;
    }
}
