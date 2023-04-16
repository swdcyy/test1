package com.yxcorp.gifshow.longinus.LonginusLog$logClz$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LonginusLog$logClz$2 extends Lambda implements a	// class@001b6f
{
    public static final LonginusLog$logClz$2 INSTANCE;

    static {
       LonginusLog$logClz$2.INSTANCE = new LonginusLog$logClz$2();
    }
    public void LonginusLog$logClz$2(){
       super(0);
    }
    public final Class invoke(){
       Object obj = PatchProxy.apply(null, this, LonginusLog$logClz$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Class.forName("android.util.Log");
    }
    public Object invoke(){
       return this.invoke();
    }
}
