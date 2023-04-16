package com.kwai.component.taskdispatcher.utils.DispatchLogger$enableDispatchDebugLog$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class DispatchLogger$enableDispatchDebugLog$2 extends Lambda implements a	// class@000bbd
{
    public static final DispatchLogger$enableDispatchDebugLog$2 INSTANCE;

    static {
       DispatchLogger$enableDispatchDebugLog$2.INSTANCE = new DispatchLogger$enableDispatchDebugLog$2();
    }
    public void DispatchLogger$enableDispatchDebugLog$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DispatchLogger$enableDispatchDebugLog$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableDispatchDebugLog", false);
    }
}
