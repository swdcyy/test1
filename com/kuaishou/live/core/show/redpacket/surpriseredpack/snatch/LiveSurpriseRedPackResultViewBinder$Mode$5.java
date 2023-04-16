package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$5;
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
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import d61.h;
import ekd.m1;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.widget.LiveSurpriseRedPackGiftListView;

public final class LiveSurpriseRedPackResultViewBinder$Mode$5 extends LiveSurpriseRedPackResultViewBinder$Mode	// class@000fa9
{

    public void LiveSurpriseRedPackResultViewBinder$Mode$5(String p0,int p1){
       super(p0, p1, null);
    }
    public void bind(View p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSurpriseRedPackResultViewBinder$Mode$5.class, "1")) {
          return;
       }
       LiveRedPackPrize liveRedPackP = LiveSurpriseRedPackResultViewBinder.b(p1);
       ArrayList uArrayList = PatchProxy.applyOneRefs(p1, null, LiveSurpriseRedPackResultViewBinder.class, "6");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          if (!q.f(p1)) {
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                LiveRedPackPrize liveRedPackP1 = iterator.next();
                if (liveRedPackP1 != null && liveRedPackP1.mDisplayType != 2) {
                   uArrayList.add(liveRedPackP1);
                }
             }
          }
       }
       p0 = h.f(p0, R.id.live_red_pack_lucky_coupon_with_both_view_stub, 0x7f0a24ad);
       if (liveRedPackP != null) {
          this.updateCouponView(p0, liveRedPackP, true);
       }
       m1.f(p0, R.id.red_pack_gift_list).y(uArrayList);
       return;
    }
}
