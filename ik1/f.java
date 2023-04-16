package ik1.f;
import lf3.g;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCEnterRoomAck;
import java.util.Objects;
import bm1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView$c;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import lf3.f;

public final class f implements g	// class@002927
{
    public final i b;

    public void f(i p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b b;
       i d = this.b.D;
       LiveStreamMessages$SCEnterRoomAck giftSlotAThr = p0.giftSlotAThreshold;
       LiveStreamMessages$SCEnterRoomAck giftSlotBThr = p0.giftSlotBThreshold;
       Objects.requireNonNull(d);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(giftSlotAThr), Integer.valueOf(giftSlotBThr), d, uob, "17")) {
          b = d.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.isSupport(GiftAnimContainerView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(giftSlotAThr), Integer.valueOf(giftSlotBThr), b, GiftAnimContainerView.class, "14")) {
             b.m = giftSlotAThr;
             b.n = giftSlotBThr;
             GiftAnimContainerView i = b.i;
             if (i != null) {
                i.a = b.m;
             }
             i = b.j;
             if (i != null) {
                i.a = b.n;
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
