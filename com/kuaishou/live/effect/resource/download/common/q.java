package com.kuaishou.live.effect.resource.download.common.q;
import java.util.Comparator;
import java.lang.Object;
import android.util.Pair;
import java.lang.Long;

public final class q implements Comparator	// class@001b48
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(p0.second.longValue(), p1.second.longValue());
    }
}
