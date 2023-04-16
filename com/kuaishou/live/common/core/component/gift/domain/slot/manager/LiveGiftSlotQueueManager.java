package com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotQueueManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import vj1.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ak1.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.c;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$a;
import ek1.b;
import java.util.Objects;
import java.util.List;
import java.util.Map;

public class LiveGiftSlotQueueManager extends LifecycleManager	// class@001268
{
    public final a c;
    public final a d;
    public final b e;

    public void LiveGiftSlotQueueManager(LifecycleOwner p0,a p1){
       super(p0);
       LiveGiftSlotQueueConfig liveGiftSlot = p1.f();
       a uoa = PatchProxy.applyOneRefs(liveGiftSlot, this, LiveGiftSlotQueueManager.class, "7");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(liveGiftSlot.c, liveGiftSlot.d);
       }
       this.d = uoa;
       a uoa1 = PatchProxy.applyOneRefs(uoa, this, LiveGiftSlotQueueManager.class, "8");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          uoa1 = new a(new c(this), uoa);
       }
       this.c = uoa1;
       liveGiftSlot = p1.f();
       b uob = PatchProxy.applyTwoRefs(liveGiftSlot, uoa, this, LiveGiftSlotQueueManager.class, "9");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(liveGiftSlot, uoa);
       }
       this.e = uob;
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGiftSlotQueueManager.class, "5")) {
          return;
       }
       LiveGiftSlotQueueManager tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, a.class, "8")) {
          tc.c.clear();
          tc.d.clear();
          tc.b.c = 0;
       }
       return;
    }
    public List c(){
       Object obj = PatchProxy.apply(null, this, LiveGiftSlotQueueManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.c;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSlotQueueManager.class, "6")) {
          return;
       }
       super.onDestroy(p0);
       this.b();
       return;
    }
}
