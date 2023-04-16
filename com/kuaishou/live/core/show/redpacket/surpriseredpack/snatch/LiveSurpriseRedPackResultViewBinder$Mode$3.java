package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$3;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$a;
import android.view.View;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackPrize;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder;
import d61.h;

public final class LiveSurpriseRedPackResultViewBinder$Mode$3 extends LiveSurpriseRedPackResultViewBinder$Mode	// class@000fa7
{

    public void LiveSurpriseRedPackResultViewBinder$Mode$3(String p0,int p1){
       super(p0, p1, null);
    }
    public void bind(View p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSurpriseRedPackResultViewBinder$Mode$3.class, "1")) {
          return;
       }
       LiveRedPackPrize liveRedPackP = LiveSurpriseRedPackResultViewBinder.a(p1);
       p0 = h.f(p0, R.id.live_surprise_red_pack_lucky_gifts_with_coin_only_view_stub, 0x7f0a2670);
       if (liveRedPackP != null) {
          this.updateCoinView(p0, liveRedPackP);
       }
       return;
    }
}
