package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketResultKwaiCoinRewardView;
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
import com.yxcorp.utility.TextUtils;

public class LiveActivityRedPacketResultKwaiCoinRewardView extends RelativeLayout implements r	// class@00098d
{
    public TextView b;
    public TextView c;
    public TextView d;

    public void LiveActivityRedPacketResultKwaiCoinRewardView(Context p0){
       super(p0, null);
    }
    public void LiveActivityRedPacketResultKwaiCoinRewardView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketResultKwaiCoinRewardView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketResultKwaiCoinRewardView.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d09b8, this);
          if (!PatchProxy.applyVoidOneRefs(this, this, LiveActivityRedPacketResultKwaiCoinRewardView.class, "2")) {
             this.b = m1.f(this, 0x7f0a1853);
             this.c = m1.f(this, 0x7f0a1854);
             this.d = m1.f(this, 0x7f0a1864);
             f0.i(this.b, this.getContext());
             this.d.setAlpha(0x3f000000);
             f0.f(this.c, "sans-serif-medium");
          }
       }
       return;
    }
    public void a(String p0,int p1){
       if (PatchProxy.isSupport(LiveActivityRedPacketResultKwaiCoinRewardView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveActivityRedPacketResultKwaiCoinRewardView.class, "4")) {
          return;
       }
       this.c.setTextColor(p1);
       this.c.setText(p0);
       this.d.setTextColor(p1);
       return;
    }
    public void b(long p0,int p1){
       if (PatchProxy.isSupport(LiveActivityRedPacketResultKwaiCoinRewardView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, LiveActivityRedPacketResultKwaiCoinRewardView.class, "3")) {
          return;
       }
       this.b.setTextColor(p1);
       this.b.setText(String.valueOf(p0));
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketResultKwaiCoinRewardView.class, "5")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.d.setText(p0);
       }
       return;
    }
    public View getKwaiCoinRewardView(){
       return this;
    }
}
