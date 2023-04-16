package com.kuaishou.live.common.core.component.gift.domain.slot.model.a;
import ok.o;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import fk1.a;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;

public final class a implements o	// class@001276
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (a.d(p0) && !p0 instanceof BroadcastGiftMessage)? true: false;
       return b;
    }
}
