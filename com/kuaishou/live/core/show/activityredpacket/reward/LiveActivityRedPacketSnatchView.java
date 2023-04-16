package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketSnatchView;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.ImageView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketSnatchView$b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import y22.d$c;
import y22.d;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import d61.h;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketSnatchView$a;
import java.lang.Integer;
import android.widget.TextView;

public class LiveActivityRedPacketSnatchView extends LiveRedPackSnatchView	// class@000990
{
    public int p;
    public CDNUrl[] q;
    public int r;
    public CDNUrl[] s;
    public boolean t;

    public void LiveActivityRedPacketSnatchView(Context p0){
       super(p0, null);
    }
    public void LiveActivityRedPacketSnatchView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketSnatchView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p = 0xffff0000;
    }
    public void d(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketSnatchView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d09bd, this);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketSnatchView.class, "7")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       this.d.setClickable(false);
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "start show snatch animation");
       d.a(this.d, this.s, new LiveActivityRedPacketSnatchView$b(this));
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketSnatchView.class, "5")) {
          return;
       }
       int[] ointArray = new int[]{this.p};
       this.setBackground(h.c(GradientDrawable$Orientation.BR_TL, ointArray));
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketSnatchView.class, "6")) {
          return;
       }
       this.d.setImageResource(this.r);
       d.b(this.d, this.q, new LiveActivityRedPacketSnatchView$a(this));
       return;
    }
    public void setCountDownBackgroundColor(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketSnatchView.class, "4")) {
          return;
       }
       this.i.setBackground(h.c(GradientDrawable$Orientation.TOP_BOTTOM, p0));
       return;
    }
    public void setCountDownTextColor(int p0){
       if (PatchProxy.isSupport(LiveActivityRedPacketSnatchView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveActivityRedPacketSnatchView.class, "3")) {
          return;
       }
       this.e.setTextColor(p0);
       this.f.setTextColor(p0);
       this.h.setTextColor(p0);
       return;
    }
    public void setEnableSnatch(boolean p0){
       this.t = p0;
    }
    public void setSnatchAnimationUrl(CDNUrl[] p0){
       this.s = p0;
    }
    public void setSnatchBackgroundColor(int p0){
       this.p = p0;
    }
    public void setSnatchImageResourceId(int p0){
       this.r = p0;
    }
    public void setSnatchImageUrl(CDNUrl[] p0){
       this.q = p0;
    }
}
