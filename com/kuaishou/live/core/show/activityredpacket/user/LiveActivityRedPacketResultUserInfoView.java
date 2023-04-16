package com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketResultUserInfoView;
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
import android.widget.TextView;

public class LiveActivityRedPacketResultUserInfoView extends LiveActivityRedPacketBaseUserInfoView	// class@00099d
{

    public void LiveActivityRedPacketResultUserInfoView(Context p0){
       super(p0);
    }
    public void LiveActivityRedPacketResultUserInfoView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveActivityRedPacketResultUserInfoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketResultUserInfoView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d09bb, this);
       if (!PatchProxy.applyVoidOneRefs(this, this, LiveActivityRedPacketResultUserInfoView.class, "2")) {
          this.b = m1.f(this, 0x7f0a1871);
          this.d = m1.f(this, 0x7f0a1872);
       }
       return;
    }
}
