package com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt$getInterpreter$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.inference.a;
import java.lang.String;
import com.kwai.sdk.eve.internal.nn.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zn7.a;
import ao7.a;
import java.io.File;

public final class CachedResourcesKt$getInterpreter$1 extends Lambda implements a	// class@001474
{
    public final String $resourceId;
    public final a $this_getInterpreter;

    public void CachedResourcesKt$getInterpreter$1(a p0,String p1){
       this.$this_getInterpreter = p0;
       this.$resourceId = p1;
       super(0);
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, CachedResourcesKt$getInterpreter$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.$this_getInterpreter.k().l().L3(this.$resourceId));
    }
    public Object invoke(){
       return this.invoke();
    }
}
