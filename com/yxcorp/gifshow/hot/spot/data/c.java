package com.yxcorp.gifshow.hot.spot.data.c;
import erd.g;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList$b;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn5.h;
import qc5.a;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import wkd.b;
import com.yxcorp.gifshow.action.i;
import com.yxcorp.gifshow.hot.spot.data.b;
import yv8.c;
import yv8.a;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import nl9.c0;
import java.util.List;
import gb5.a;

public final class c implements g	// class@001829
{
    public final HotSpotFeedPageList$b b;

    public void c(HotSpotFeedPageList$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       HotSpotFeedPageList$b b;
       HotSpotFeedPageList c;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          h.b(p0);
          h.a(p0);
          c tb = this.b;
          if (tb.c != null) {
             tb.b.Y2().b();
          }
          b.a(-129117978).d(this.b.b.D, b.a);
          b = this.b.b;
          a.o(p0, "r");
          c = this.b.b.C;
          Objects.requireNonNull(b);
          HotSpotFeedPageList hotSpotFeedP = HotSpotFeedPageList.class;
          if (!PatchProxy.isSupport(hotSpotFeedP) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(c), b, hotSpotFeedP, "9")) {
             d.a(-500494672).t60(p0.getItems(), 0x272c, c);
          }
          Objects.requireNonNull(this.b.b);
          b.a(0x8708467).k("hot_spot", true);
       }
       return;
    }
}
