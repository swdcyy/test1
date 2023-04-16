package com.kwai.plugin.dva.install.SuspendInstallInterceptor;
import com.kwai.plugin.dva.install.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.SuspendInstallInterceptor$intercept$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.a;

public abstract class SuspendInstallInterceptor implements a	// class@000e8f
{

    public void SuspendInstallInterceptor(){
       super();
    }
    public void a(String p0){
       a.p(p0, "pluginName");
       a.h(null, new SuspendInstallInterceptor$intercept$1(this, p0, null), 1, null);
    }
    public abstract Object b(String p0,c p1);
}
