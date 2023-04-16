package com.yxcorp.gifshow.reddot.f;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.yxcorp.gifshow.reddot.i;
import com.yxcorp.gifshow.reddot.RedDotConfig;
import java.lang.reflect.Type;
import aub.a;
import java.lang.Boolean;

public final class f implements Callable	// class@0017c6
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object call(){
       RedDotConfig redDotConfig = a.a(RedDotConfig.class);
       if (redDotConfig != null) {
       }else {
          redDotConfig = Boolean.TRUE;
       }
       return redDotConfig;
    }
}
