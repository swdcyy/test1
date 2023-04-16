package com.kuaishou.live.core.show.activityredpacket.user.c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketCoupleUserView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketCoupleUserView$a;

public class c extends m	// class@0009a0
{
    public final LiveActivityRedPacketCoupleUserView c;

    public void c(LiveActivityRedPacketCoupleUserView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       LiveActivityRedPacketCoupleUserView f = this.c.F;
       if (f != null) {
          f.a();
       }
       return;
    }
}
