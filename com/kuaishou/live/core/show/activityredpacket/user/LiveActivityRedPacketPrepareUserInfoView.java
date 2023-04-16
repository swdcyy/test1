package com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketPrepareUserInfoView;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView;
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
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import d61.f0;

public class LiveActivityRedPacketPrepareUserInfoView extends LiveActivityRedPacketBaseUserInfoView	// class@00099c
{

    public void LiveActivityRedPacketPrepareUserInfoView(Context p0){
       super(p0);
    }
    public void LiveActivityRedPacketPrepareUserInfoView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveActivityRedPacketPrepareUserInfoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketPrepareUserInfoView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d09b6, this);
       if (!PatchProxy.applyVoidOneRefs(this, this, LiveActivityRedPacketPrepareUserInfoView.class, "2")) {
          this.b = m1.f(this, 0x7f0a1871);
          this.c = m1.f(this, 0x7f0a1873);
          TextView textView = m1.f(this, R.id.live_activity_red_packet_user_info_description_view);
          this.d = textView;
          f0.f(textView, "sans-serif-medium");
       }
       return;
    }
}
