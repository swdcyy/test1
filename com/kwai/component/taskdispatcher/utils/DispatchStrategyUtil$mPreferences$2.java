package com.kwai.component.taskdispatcher.utils.DispatchStrategyUtil$mPreferences$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import vid.b;

public final class DispatchStrategyUtil$mPreferences$2 extends Lambda implements a	// class@000bc0
{
    public static final DispatchStrategyUtil$mPreferences$2 INSTANCE;

    static {
       DispatchStrategyUtil$mPreferences$2.INSTANCE = new DispatchStrategyUtil$mPreferences$2();
    }
    public void DispatchStrategyUtil$mPreferences$2(){
       super(0);
    }
    public final SharedPreferences invoke(){
       Object obj = PatchProxy.apply(null, this, DispatchStrategyUtil$mPreferences$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(a.b(), "dispatch_strategy_preferences", 0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
