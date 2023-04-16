package com.yxcorp.gifshow.action.config.live.f;
import yv8.a;
import java.lang.Object;
import com.yxcorp.gifshow.action.model.RealActionFeed;

public final class f implements a	// class@00131c
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final boolean a(RealActionFeed p0){
       boolean b = (p0.mLiveStreamBizType == 4)? true: false;
       return b;
    }
}
