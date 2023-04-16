package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$1;
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
import ekd.m1;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView;

public final class LiveSurpriseRedPackResultViewBinder$Mode$1 extends LiveSurpriseRedPackResultViewBinder$Mode	// class@000fa5
{

    public void LiveSurpriseRedPackResultViewBinder$Mode$1(String p0,int p1){
       super(p0, p1, null);
    }
    public void bind(View p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSurpriseRedPackResultViewBinder$Mode$1.class, "1")) {
          return;
       }
       LiveRedPackPrize liveRedPackP = LiveSurpriseRedPackResultViewBinder.a(p1);
       p1 = LiveSurpriseRedPackResultViewBinder.c(p1);
       p0 = h.f(p0, R.id.live_surprise_red_pack_lucky_gifts_with_both_view_stub, 0x7f0a266f);
       if (liveRedPackP != null) {
          this.updateCoinView(p0, liveRedPackP);
       }
       m1.f(p0, R.id.red_pack_gift_list).y(p1);
       return;
    }
}
