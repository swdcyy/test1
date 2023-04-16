package com.kuaishou.live.core.show.subscribe.pendant.d;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.HashSet;
import java.util.Collection;

public final class d implements o	// class@00114f
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (p0.mSubscribeInfo == null)? new HashSet(): new HashSet(p0.mSubscribeInfo);
       return p0;
    }
}
