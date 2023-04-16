package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$6;
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

public final class LiveSurpriseRedPackResultViewBinder$Mode$6 extends LiveSurpriseRedPackResultViewBinder$Mode	// class@000faa
{

    public void LiveSurpriseRedPackResultViewBinder$Mode$6(String p0,int p1){
       super(p0, p1, null);
    }
    public void bind(View p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSurpriseRedPackResultViewBinder$Mode$6.class, "1")) {
          return;
       }
       LiveRedPackPrize liveRedPackP = LiveSurpriseRedPackResultViewBinder.b(p1);
       LiveRedPackPrize liveRedPackP1 = LiveSurpriseRedPackResultViewBinder.a(p1);
       p0 = h.f(p0, R.id.live_red_pack_lucky_coupon_with_coin_layout_view_stub, 0x7f0a24ac);
       if (liveRedPackP != null) {
          this.updateCouponView(p0, liveRedPackP, true);
       }
       if (liveRedPackP1 != null) {
          this.updateCoinView(p0, liveRedPackP1);
       }
       return;
    }
}
