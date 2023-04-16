package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGiftRewardBaseView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import d61.f0;

public abstract class LiveActivityRedPacketGiftRewardBaseView extends LinearLayout	// class@000977
{
    public KwaiImageView b;
    public TextView c;

    public void LiveActivityRedPacketGiftRewardBaseView(Context p0){
       super(p0, null);
    }
    public void LiveActivityRedPacketGiftRewardBaseView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketGiftRewardBaseView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0);
       if (PatchProxy.applyVoidOneRefs(this, this, LiveActivityRedPacketGiftRewardBaseView.class, "1")) {
       }else {
          KwaiImageView kwaiImageVie = m1.f(this, R.id.live_activity_red_packet_gift_reward_single_icon_view);
          this.b = kwaiImageVie;
          kwaiImageVie.setImageResource(R.drawable.arg_RES_7f0811bb);
          TextView textView = m1.f(this, R.id.live_activity_red_packet_gift_reward_count_view);
          this.c = textView;
          f0.i(textView, this.getContext());
       }
       return;
    }
    public abstract void a(Context p0);
}
