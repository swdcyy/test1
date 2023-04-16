package com.yxcorp.gifshow.action.config.live.b;
import yv8.a;
import java.lang.Object;
import com.yxcorp.gifshow.action.model.RealActionFeed;

public final class b implements a	// class@001318
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final boolean a(RealActionFeed p0){
       boolean b = (p0.mLiveStreamBizType == 5)? true: false;
       return b;
    }
}
