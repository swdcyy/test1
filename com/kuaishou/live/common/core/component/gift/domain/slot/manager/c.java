package com.kuaishou.live.common.core.component.gift.domain.slot.manager.c;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$a;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotQueueManager;
import java.lang.Object;
import java.lang.String;
import xj1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class c implements a$a	// class@001271
{
    public final LiveGiftSlotQueueManager a;

    public void c(LiveGiftSlotQueueManager p0){
       this.a = p0;
       super();
    }
    public String a(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = p0.f();
       }
       return str;
    }
    public int b(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): p0.e();
       return i;
    }
}
