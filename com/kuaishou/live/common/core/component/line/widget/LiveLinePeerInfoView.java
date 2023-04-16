package com.kuaishou.live.common.core.component.line.widget.LiveLinePeerInfoView;
import ml8.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.lsjwzh.widget.text.FastTextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import b61.b;
import hf1.f;
import com.kuaishou.live.common.core.component.follow.cache.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.common.core.component.line.widget.LiveLinePeerInfoView$a;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.common.core.component.line.widget.LiveLinePeerInfoView$b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import ro1.f;
import android.view.View$OnClickListener;
import ro1.e;
import android.view.ViewGroup;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import ro1.g;
import erd.g;
import crd.b;
import lnc.b9;
import lnc.a1;

public class LiveLinePeerInfoView extends LinearLayout implements d	// class@001497
{
    public FastTextView b;
    public KwaiImageView c;
    public LottieAnimationView d;
    public UserInfo e;
    public LiveLinePeerInfoView$b f;
    public b g;
    public static final int h;

    public void LiveLinePeerInfoView(Context p0){
       super(p0);
    }
    public void LiveLinePeerInfoView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveLinePeerInfoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLinePeerInfoView.class, "3")) {
          return;
       }
       if (p0 == null) {
          this.setVisibility(8);
          this.b.setText("");
          this.c.setVisibility(4);
       }else {
          this.setVisibility(0);
          g.d(this.c, p0, HeadImageSize.SMALL);
          this.b.setText(f.e(b.c(p0), 6));
          this.c.setVisibility(0);
          if (!PatchProxy.applyVoidOneRefs(p0, this, LiveLinePeerInfoView.class, "5") && this.d != null) {
             if (c.b().c(p0.mId)) {
                this.c();
             }else {
                this.d();
             }
          }
       }
       this.e = p0;
       return;
    }
    public boolean b(UserInfo p0){
       LiveLinePeerInfoView obj = PatchProxy.applyOneRefs(p0, this, LiveLinePeerInfoView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       if (obj != null && (obj.mId).equals(p0.mId)) {
          return true;
       }
       return false;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveLinePeerInfoView.class, "12")) {
          return;
       }
       LiveLinePeerInfoView td = this.d;
       if (td != null) {
          td.setVisibility(8);
          this.d.setAlpha(0x3f800000);
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveLinePeerInfoView.class, "11")) {
          return;
       }
       LiveLinePeerInfoView td = this.d;
       if (td != null) {
          td.setAlpha(0x3f800000);
          this.d.setVisibility(0);
          this.d.t();
          this.d.setAnimation(R.raw.arg_RES_7f0f0039);
          this.d.setProgress(0);
          this.d.a(new LiveLinePeerInfoView$a(this));
          td = this.f;
          if (td != null) {
             td.c();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLinePeerInfoView.class, "2")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a179d);
       this.c = m1.f(p0, 0x7f0a179b);
       this.d = m1.f(p0, 0x7f0a179c);
       m1.a(p0, new f(this), R.id.line_peer_name);
       m1.a(p0, new e(this), R.id.line_peer_follow_button);
       return;
    }
    public KwaiImageView getAvatarImageView(){
       return this.c;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveLinePeerInfoView.class, "8")) {
          return;
       }
       super.onAttachedToWindow();
       this.g = RxBus.f.f(n.class).observeOn(d.a).subscribe(new g(this));
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveLinePeerInfoView.class, "9")) {
          return;
       }
       super.onDetachedFromWindow();
       b9.a(this.g);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveLinePeerInfoView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.b.setMaxWidth(a1.e(74.00f));
       return;
    }
    public void setFollowPeerButtonListener(LiveLinePeerInfoView$b p0){
       this.f = p0;
    }
}
