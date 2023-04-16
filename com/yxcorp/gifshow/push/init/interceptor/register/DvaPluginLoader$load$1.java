package com.yxcorp.gifshow.push.init.interceptor.register.DvaPluginLoader$load$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.gifshow.push.init.interceptor.register.DvaPluginLoader;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DvaPluginLoader$load$1 extends ContinuationImpl	// class@00166b
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object result;
    public final DvaPluginLoader this$0;

    public void DvaPluginLoader$load$1(DvaPluginLoader p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DvaPluginLoader$load$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.c(this);
    }
}
