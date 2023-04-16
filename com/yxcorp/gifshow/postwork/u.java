package com.yxcorp.gifshow.postwork.u;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.postwork.PostWorkManager$LoadPostCacheStatus;

public final class u implements r	// class@0010d8
{
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_COMPLETE)? true: false;
       return b;
    }
}
