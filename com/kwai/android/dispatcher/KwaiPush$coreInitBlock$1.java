package com.kwai.android.dispatcher.KwaiPush$coreInitBlock$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.app.Application;
import com.kwai.android.dispatcher.PushConfig;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.common.config.PushConfigManager;
import kotlinx.coroutines.CoroutineDispatcher;
import com.kwai.android.dispatcher.KwaiPush$coreInitBlock$1$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import ftd.z1;
import com.kwai.android.common.coroutines.PushScopeKt;

public final class KwaiPush$coreInitBlock$1 extends Lambda implements p	// class@0009ac
{
    public static final KwaiPush$coreInitBlock$1 INSTANCE;

    static {
       KwaiPush$coreInitBlock$1.INSTANCE = new KwaiPush$coreInitBlock$1();
    }
    public void KwaiPush$coreInitBlock$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(Application p0,PushConfig p1){
       a.p(p0, "application");
       a.p(p1, "config");
       PushScopeKt.launch$default(PushConfigManager.INSTANCE.getCoroutineDispatcher(), null, new KwaiPush$coreInitBlock$1$1(p0, p1, null), 2, null);
    }
}
