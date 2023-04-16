package com.yxcorp.gifshow.action.config.live.d;
import yv8.a;
import java.lang.Object;
import com.yxcorp.gifshow.action.model.RealActionFeed;

public final class d implements a	// class@00131a
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final boolean a(RealActionFeed p0){
       boolean b = (p0.mLiveStreamBizType == 2)? true: false;
       return b;
    }
}
