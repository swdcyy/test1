package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftRecyclerView$b;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage$GiftInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z12.a0;

public class b extends m	// class@000ece
{
    public final LiveGiftPackage$GiftInfo c;
    public final int d;
    public final LiveFellowRedPacketGiftRecyclerView$b e;

    public void b(LiveFellowRedPacketGiftRecyclerView$b p0,LiveGiftPackage$GiftInfo p1,int p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       LiveFellowRedPacketGiftRecyclerView$b d = this.e.d;
       if (d != null) {
          d.a(this.c, this.d);
       }
       return;
    }
}
