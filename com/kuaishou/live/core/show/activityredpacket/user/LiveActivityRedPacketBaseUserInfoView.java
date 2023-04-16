package com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import com.kuaishou.live.core.show.activityredpacket.user.b;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Integer;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView$a;

public abstract class LiveActivityRedPacketBaseUserInfoView extends RelativeLayout	// class@000999
{
    public LiveUserView b;
    public KwaiImageView c;
    public TextView d;
    public LiveActivityRedPacketBaseUserInfoView$a e;

    public void LiveActivityRedPacketBaseUserInfoView(Context p0){
       super(p0, null);
    }
    public void LiveActivityRedPacketBaseUserInfoView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketBaseUserInfoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0);
    }
    public abstract void a(Context p0);
    public void b(boolean p0){
       if (PatchProxy.isSupport(LiveActivityRedPacketBaseUserInfoView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveActivityRedPacketBaseUserInfoView.class, "2")) {
          return;
       }
       LiveActivityRedPacketBaseUserInfoView tc = this.c;
       if (tc == null) {
          return;
       }
       if (!p0) {
          tc.setClickable(true);
          LiveActivityRedPacketBaseUserInfoView tc1 = this.c;
          if (!PatchProxy.applyVoidOneRefs(tc1, this, LiveActivityRedPacketBaseUserInfoView.class, "3") && tc1 != null) {
             tc1.setOnClickListener(new b(this));
          }
       }else {
          tc.setOnClickListener(null);
          this.c.setClickable(false);
       }
       return;
    }
    public void setFollowViewVisibility(int p0){
       if (PatchProxy.isSupport(LiveActivityRedPacketBaseUserInfoView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveActivityRedPacketBaseUserInfoView.class, "5")) {
          return;
       }
       LiveActivityRedPacketBaseUserInfoView tc = this.c;
       if (tc != null) {
          tc.setVisibility(p0);
       }
       return;
    }
    public void setUserInfoListener(LiveActivityRedPacketBaseUserInfoView$a p0){
       this.e = p0;
    }
}
