package com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPluginImpl$mCoroutineDispatcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import am8.a;
import am8.d;
import kotlin.jvm.internal.a;
import java.util.concurrent.ExecutorService;
import ftd.o1;

public final class GrowthFreeTrafficPluginImpl$mCoroutineDispatcher$2 extends Lambda implements a	// class@00137e
{
    public static final GrowthFreeTrafficPluginImpl$mCoroutineDispatcher$2 INSTANCE;

    static {
       GrowthFreeTrafficPluginImpl$mCoroutineDispatcher$2.INSTANCE = new GrowthFreeTrafficPluginImpl$mCoroutineDispatcher$2();
    }
    public void GrowthFreeTrafficPluginImpl$mCoroutineDispatcher$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ExecutorCoroutineDispatcher invoke(){
       a obj = PatchProxy.apply(null, this, GrowthFreeTrafficPluginImpl$mCoroutineDispatcher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.b("plugin_growth_ft", 3);
       a.o(obj, "ElasticExecutorService.g¡­TASK_PRIORITY_BACKGROUND\)");
       return o1.c(obj);
    }
}
