package com.kuaishou.live.core.show.activityredpacket.user.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView$a;

public class b extends m	// class@00099f
{
    public final LiveActivityRedPacketBaseUserInfoView c;

    public void b(LiveActivityRedPacketBaseUserInfoView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       LiveActivityRedPacketBaseUserInfoView e = this.c.e;
       if (e != null) {
          e.a();
       }
       return;
    }
}
