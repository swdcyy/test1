package com.kuaishou.live.common.core.component.gift.gift.a;
import ok.o;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;

public final class a implements o	// class@00128b
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean apply(Object p0){
       return p0 instanceof BroadcastGiftMessage;
    }
}
