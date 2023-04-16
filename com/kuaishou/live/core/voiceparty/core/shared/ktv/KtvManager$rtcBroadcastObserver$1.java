package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$rtcBroadcastObserver$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$GuestEnterRoom;
import ut7.e;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$SingerChangeSingType;

public final class KtvManager$rtcBroadcastObserver$1 extends Lambda implements l	// class@00143f
{
    public final KtvManager this$0;

    public void KtvManager$rtcBroadcastObserver$1(KtvManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveAryaBroadcastProto$LiveAryaBroadcastMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$rtcBroadcastObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "broadcast");
       if (a.g(p0.bizId, this.this$0.d().d())) {
          LiveAryaBroadcastProto$LiveAryaBroadcastMessage type = p0.type;
          if (type == 10 || type == 9) {
             KtvManager$rtcBroadcastObserver$1 tthis$0 = this.this$0;
             Objects.requireNonNull(tthis$0);
             if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, KtvManager.class, "14")) {
                LiveAryaBroadcastProto$LiveAryaBroadcastMessage senderId = p0.senderId;
                a.o(senderId, "broadcast.senderId");
                int i = (p0.type == 9)? 0: 1;
                tthis$0.r(new KtvManager$SingerChangeSingType(senderId, i));
             }
          }else if(type == 7){
             this.this$0.r(new KtvManager$GuestEnterRoom());
          }
       }
       return;
    }
}
