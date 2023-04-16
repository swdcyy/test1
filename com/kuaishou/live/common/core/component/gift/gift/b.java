package com.kuaishou.live.common.core.component.gift.gift.b;
import ok.o;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.common.core.component.gift.gift.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftMergedMessage;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMergedMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;

public final class b implements o	// class@00129d
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b1;
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "1");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(p0 instanceof LiveGiftToAudienceMessage){
          b1 = p.l();
       }else if(p0 instanceof LiveGiftMergedMessage || p0 instanceof LiveGiftToAudienceMergedMessage){
          b1 = false;
       }else {
          b1 = p0 instanceof GiftMessage;
       }
       if (b1 && !p0 instanceof BroadcastGiftMessage) {
          b = true;
       }
       return b;
    }
}
