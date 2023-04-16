package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketKwaiCoinRewardView;
import u22.r;
import android.widget.RelativeLayout;
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
import d61.f0;
import java.lang.Integer;
import java.lang.CharSequence;
import java.lang.Long;

public class LiveActivityRedPacketKwaiCoinRewardView extends RelativeLayout implements r	// class@000988
{
    public TextView b;
    public TextView c;

    public void LiveActivityRedPacketKwaiCoinRewardView(Context p0){
       super(p0, null);
    }
    public void LiveActivityRedPacketKwaiCoinRewardView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketKwaiCoinRewardView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketKwaiCoinRewardView.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d09b1, this);
          if (!PatchProxy.applyVoidOneRefs(this, this, LiveActivityRedPacketKwaiCoinRewardView.class, "2")) {
             this.b = m1.f(this, 0x7f0a1853);
             this.c = m1.f(this, 0x7f0a1854);
             f0.i(this.b, this.getContext());
             f0.f(this.c, "sans-serif-medium");
          }
       }
       return;
    }
    public void a(String p0,int p1){
       if (PatchProxy.isSupport(LiveActivityRedPacketKwaiCoinRewardView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveActivityRedPacketKwaiCoinRewardView.class, "4")) {
          return;
       }
       this.c.setText(p0);
       this.c.setTextColor(p1);
       return;
    }
    public void b(long p0,int p1){
       if (PatchProxy.isSupport(LiveActivityRedPacketKwaiCoinRewardView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, LiveActivityRedPacketKwaiCoinRewardView.class, "3")) {
          return;
       }
       this.b.setTextColor(p1);
       this.b.setText(String.valueOf(p0));
       return;
    }
    public void c(String p0){
    }
    public View getKwaiCoinRewardView(){
       return this;
    }
}
