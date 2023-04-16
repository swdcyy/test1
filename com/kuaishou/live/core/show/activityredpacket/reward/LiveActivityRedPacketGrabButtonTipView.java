package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView$a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import l12.d;
import va1.f0;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView$b;

public class LiveActivityRedPacketGrabButtonTipView extends FrameLayout	// class@000986
{
    public TextView b;
    public KwaiImageView c;
    public LiveActivityRedPacketGrabButtonTipView$b d;

    public void LiveActivityRedPacketGrabButtonTipView(Context p0){
       super(p0, null);
    }
    public void LiveActivityRedPacketGrabButtonTipView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketGrabButtonTipView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b(p0);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketGrabButtonTipView.class, "2")) {
          return;
       }
       p0.setOnClickListener(new LiveActivityRedPacketGrabButtonTipView$a(this));
       return;
    }
    public void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketGrabButtonTipView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d09ae, this);
       this.b = m1.f(this, 0x7f0a184c);
       this.c = m1.f(this, 0x7f0a184b);
       f0.a(this.c, this.getDefaultBackgroundImageResource());
       this.a(this.b);
       return;
    }
    public void c(boolean p0,int p1,String p2){
       if (PatchProxy.isSupport(LiveActivityRedPacketGrabButtonTipView.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, LiveActivityRedPacketGrabButtonTipView.class, "3")) {
          return;
       }
       if (p0) {
          f0.a(this.c, this.getDefaultBackgroundImageResource());
       }
       this.b.setTextColor(p1);
       this.b.setText(p2);
       return;
    }
    public LiveRedPacketResourcePathConstant getDefaultBackgroundImageResource(){
       return LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_PREPARE_TIP_BUTTON;
    }
    public void setTipListener(LiveActivityRedPacketGrabButtonTipView$b p0){
       this.d = p0;
    }
}
