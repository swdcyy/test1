package com.kwai.soc.arch.rubas.base.util.LogUtil$ENABLE$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Log;

public final class LogUtil$ENABLE$2 extends Lambda implements a	// class@00189a
{
    public static final LogUtil$ENABLE$2 INSTANCE;

    static {
       LogUtil$ENABLE$2.INSTANCE = new LogUtil$ENABLE$2();
    }
    public void LogUtil$ENABLE$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LogUtil$ENABLE$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Log.isLoggable("rubas.enable.debuglog", 3);
    }
}
