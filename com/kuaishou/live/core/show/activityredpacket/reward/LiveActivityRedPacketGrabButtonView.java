package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonView;
import android.widget.FrameLayout;
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
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketSnatchView;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView;
import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo;
import java.lang.Integer;
import com.kwai.library.widget.progressbar.RedPacketCircleProgressBar;
import android.widget.TextView;
import d61.f0;
import ekd.j;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView$c;

public class LiveActivityRedPacketGrabButtonView extends FrameLayout	// class@000987
{
    public LiveActivityRedPacketSnatchView b;
    public LiveActivityRedPacketGrabButtonTipView c;

    public void LiveActivityRedPacketGrabButtonView(Context p0){
       super(p0, null);
    }
    public void LiveActivityRedPacketGrabButtonView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketGrabButtonView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketGrabButtonView.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d09ad, this);
          this.b = m1.f(this, 0x7f0a184a);
          this.c = m1.f(this, 0x7f0a184d);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketGrabButtonView.class, "6")) {
          return;
       }
       LiveActivityRedPacketGrabButtonView tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, LiveRedPackSnatchView.class, "4")) {
          LiveRedPackSnatchView k = tb.k;
          if (k != null && k.isRunning()) {
             tb.d.setVisibility(8);
             tb.k.stop();
             tb.k = null;
          }
       }
       return;
    }
    public void b(LiveActivityRedPacketGrabButtonInfo p0){
       CDNUrl[] uCDNUrlArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketGrabButtonView.class, "3")) {
          return;
       }
       this.b.setEnableSnatch(p0.e());
       this.b.setVisibility(0);
       this.c.setVisibility(8);
       if (p0.e()) {
          LiveActivityRedPacketGrabButtonView tb = this.b;
          LiveActivityRedPacketGrabButtonInfo g = p0.g;
          LiveActivityRedPacketGrabButtonInfo h = p0.h;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(LiveActivityRedPacketSnatchView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(g), Integer.valueOf(h), tb, LiveActivityRedPacketSnatchView.class, "2")) {
             tb.c.setProgressBackgroundColor(g);
             tb.c.setProgressColor(h);
          }
          this.b.setCountDownTextColor(p0.e);
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, LiveActivityRedPacketSnatchView.class, "8")) {
             f0.i(tb.e, tb.getContext());
             f0.i(tb.f, tb.getContext());
             f0.i(tb.h, tb.getContext());
          }
          this.b.setCountDownBackgroundColor(p0.f);
          this.b.setSnatchBackgroundColor(p0.o);
          LiveActivityRedPacketGrabButtonInfo p = p0.p;
          if (j.h(p)) {
             p = e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_SNATCH_ICON.getResourcePath()));
          }
          this.b.setSnatchImageUrl(p);
          this.b.setSnatchAnimationUrl(p0.r);
          this.b.e(p0.m, p0.l);
       }else {
          p0 = p0.q;
          if (j.h(p0)) {
             uCDNUrlArray = e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_DISABLE_SNATCH_ICON.getResourcePath()));
          }
          this.b.setSnatchImageUrl(uCDNUrlArray);
          this.b.e(0, 0);
       }
       return;
    }
    public void setOnSnatchViewListener(LiveRedPackSnatchView$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketGrabButtonView.class, "4")) {
          return;
       }
       this.b.setOnSnatchViewListener(p0);
       return;
    }
}
