package com.kwaishou.merchant.daccore.PendantEnvReadyLatch$singleThreadPoolExecutor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import t45.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.lang.String;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public final class PendantEnvReadyLatch$singleThreadPoolExecutor$2 extends Lambda implements a	// class@001302
{
    public static final PendantEnvReadyLatch$singleThreadPoolExecutor$2 INSTANCE;

    static {
       PendantEnvReadyLatch$singleThreadPoolExecutor$2.INSTANCE = new PendantEnvReadyLatch$singleThreadPoolExecutor$2();
    }
    public void PendantEnvReadyLatch$singleThreadPoolExecutor$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final e invoke(){
       e uoe = new e(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new b("DynamicPendantEnvReadyWaitThread"));
       v8.allowCoreThreadTimeOut(true);
       return v8;
    }
}
