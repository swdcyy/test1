package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$2;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$a;
import android.view.View;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder;
import d61.h;
import ekd.m1;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView;

public final class LiveSurpriseRedPackResultViewBinder$Mode$2 extends LiveSurpriseRedPackResultViewBinder$Mode	// class@000fa6
{

    public void LiveSurpriseRedPackResultViewBinder$Mode$2(String p0,int p1){
       super(p0, p1, null);
    }
    public void bind(View p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSurpriseRedPackResultViewBinder$Mode$2.class, "1")) {
          return;
       }
       m1.f(h.f(p0, R.id.live_surprise_red_pack_lucky_gifts_with_coupon_and_gift_view_stub, 0x7f0a266d), R.id.red_pack_gift_list).y(LiveSurpriseRedPackResultViewBinder.c(p1));
       return;
    }
}
