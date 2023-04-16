package com.kuaishou.live.core.show.activityredpacket.user.f$b;
import y22.d$c;
import com.kuaishou.live.core.show.activityredpacket.user.f;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class f$b implements d$c	// class@0009a5
{
    public final boolean a;
    public final f b;

    public void f$b(f p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(Animatable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       f t = this.b.t;
       if (t != null) {
          t.b(this.a);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "get Cached follow Drawable error");
       return;
    }
}
