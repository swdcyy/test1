package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOpenActionView;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import l12.d;
import va1.f0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class LiveActivityRedPacketOpenActionView extends LiveActivityRedPacketGrabButtonTipView	// class@000989
{
    public KwaiImageView e;
    public ObjectAnimator f;

    public void LiveActivityRedPacketOpenActionView(Context p0){
       super(p0, null);
    }
    public void LiveActivityRedPacketOpenActionView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketOpenActionView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketOpenActionView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d09b4, this);
       this.b = m1.f(this, 0x7f0a184c);
       this.c = m1.f(this, 0x7f0a184b);
       this.e = m1.f(this, 0x7f0a1849);
       f0.a(this.c, this.getDefaultBackgroundImageResource());
       this.a(this.c);
       this.a(this.b);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketOpenActionView.class, "4")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "startScaleExpandAnimation");
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[3]{0x3f666666,0x3f800000,0x3f666666}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[3]{0x3f666666,0x3f800000,0x3f666666})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this, propertyValu);
       this.f = objectAnimat;
       objectAnimat.setDuration(1000);
       this.f.setRepeatCount(-1);
       this.f.start();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketOpenActionView.class, "5")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "stopScaleAnimation");
       LiveActivityRedPacketOpenActionView tf = this.f;
       if (tf != null && tf.isRunning()) {
          this.f.end();
       }
       this.setScaleX(0x3f800000);
       this.setScaleY(0x3f800000);
       return;
    }
    public void f(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketOpenActionView.class, "3")) {
          return;
       }
       if (j.h(p0)) {
          this.e.setVisibility(8);
       }else {
          this.e.setVisibility(0);
          this.e.U(p0);
       }
       return;
    }
    public LiveRedPacketResourcePathConstant getDefaultBackgroundImageResource(){
       return LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_OPENED_ACTION_BUTTON;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketOpenActionView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       this.e();
       return;
    }
}
