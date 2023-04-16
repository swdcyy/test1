package com.kuaishou.live.core.show.activityredpacket.user.e;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketCoupleUserView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketCoupleUserView$a;

public class e extends m	// class@0009a2
{
    public final LiveActivityRedPacketCoupleUserView c;

    public void e(LiveActivityRedPacketCoupleUserView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       LiveActivityRedPacketCoupleUserView f = this.c.F;
       if (f != null) {
          f.b();
       }
       return;
    }
}
