package com.yxcorp.gifshow.postwork.q;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.postwork.PostWorkManager$LoadPostCacheStatus;
import java.lang.Boolean;

public final class q implements o	// class@0010d4
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final Object apply(Object p0){
       boolean b = (p0 == PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_COMPLETE)? true: false;
       return Boolean.valueOf(b);
    }
}
