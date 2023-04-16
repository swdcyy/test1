package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView$b;

public class b extends m	// class@000f3b
{
    public final LiveRedPackRainSnatchView c;

    public void b(LiveRedPackRainSnatchView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       LiveRedPackRainSnatchView i = this.c.i;
       if (i != null) {
          i.c();
       }
       return;
    }
}
