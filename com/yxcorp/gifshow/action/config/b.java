package com.yxcorp.gifshow.action.config.b;
import yv8.a;
import java.lang.Object;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class b implements a	// class@001314
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final boolean a(RealActionFeed p0){
       return TextUtils.x(p0.mSubBizTag);
    }
}
