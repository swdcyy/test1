package com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView$c;

public class LiveRedPackSnatchView$a extends m	// class@000fbe
{
    public final LiveRedPackSnatchView c;

    public void LiveRedPackSnatchView$a(LiveRedPackSnatchView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPackSnatchView$a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.RED_PACKET, "onSnatchRedPacketViewClick");
       this.c.g();
       LiveRedPackSnatchView j = this.c.j;
       if (j != null) {
          j.a();
       }
       return;
    }
}
