package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGiftRewardSingleTextView;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.f0;

public class LiveActivityRedPacketGiftRewardSingleTextView extends LinearLayout	// class@000978
{
    public TextView b;
    public TextView c;
    public TextView d;
    public KwaiImageView e;

    public void LiveActivityRedPacketGiftRewardSingleTextView(Context p0){
       super(p0);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketGiftRewardSingleTextView.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d09aa, this);
       }
       if (!PatchProxy.applyVoidOneRefs(this, this, LiveActivityRedPacketGiftRewardSingleTextView.class, "2")) {
          this.b = this.findViewById(0x7f0a1840);
          this.c = this.findViewById(0x7f0a1842);
          this.d = this.findViewById(0x7f0a1864);
          this.e = this.findViewById(0x7f0a1834);
       }
       f0.i(this.b, this.getContext());
       return;
    }
}
