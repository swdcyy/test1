package com.yxcorp.gifshow.longinus.SpUtil$ONE_HOUR_INTERVAL_MILLIS$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.concurrent.TimeUnit;
import java.lang.Long;

public final class SpUtil$ONE_HOUR_INTERVAL_MILLIS$2 extends Lambda implements a	// class@001b7b
{
    public static final SpUtil$ONE_HOUR_INTERVAL_MILLIS$2 INSTANCE;

    static {
       SpUtil$ONE_HOUR_INTERVAL_MILLIS$2.INSTANCE = new SpUtil$ONE_HOUR_INTERVAL_MILLIS$2();
    }
    public void SpUtil$ONE_HOUR_INTERVAL_MILLIS$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, SpUtil$ONE_HOUR_INTERVAL_MILLIS$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return TimeUnit.HOURS.toMillis(1);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
