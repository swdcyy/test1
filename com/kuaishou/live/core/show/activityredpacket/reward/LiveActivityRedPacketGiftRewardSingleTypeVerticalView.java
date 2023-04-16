package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGiftRewardSingleTypeVerticalView;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGiftRewardBaseView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.LinearLayout;

public class LiveActivityRedPacketGiftRewardSingleTypeVerticalView extends LiveActivityRedPacketGiftRewardBaseView	// class@00097a
{

    public void LiveActivityRedPacketGiftRewardSingleTypeVerticalView(Context p0){
       super(p0, null);
    }
    public void LiveActivityRedPacketGiftRewardSingleTypeVerticalView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketGiftRewardSingleTypeVerticalView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketGiftRewardSingleTypeVerticalView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d09ab, this);
       this.setOrientation(1);
       return;
    }
}
