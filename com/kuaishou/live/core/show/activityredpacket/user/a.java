package com.kuaishou.live.core.show.activityredpacket.user.a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView$a;

public class a extends m	// class@00099e
{
    public final LiveActivityRedPacketBaseUserInfoView c;

    public void a(LiveActivityRedPacketBaseUserInfoView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       LiveActivityRedPacketBaseUserInfoView e = this.c.e;
       if (e != null) {
          e.H1();
       }
       return;
    }
}
