package com.yxcorp.gifshow.action.config.live.c;
import yv8.a;
import java.lang.Object;
import com.yxcorp.gifshow.action.model.RealActionFeed;

public final class c implements a	// class@001319
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final boolean a(RealActionFeed p0){
       boolean b = (p0.mLiveStreamBizType == 6)? true: false;
       return b;
    }
}
