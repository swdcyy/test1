package com.kuaishou.live.core.show.redpacket.krn.a;
import d61.k0$a;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import com.kuaishou.live.core.show.redpacket.krn.LiveKrnRedPacketFragment;
import java.lang.Long;

public final class a implements k0$a	// class@000ed0
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Object get(Object p0){
       return Long.valueOf(p0.senderId);
    }
}
