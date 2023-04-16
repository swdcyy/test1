package com.kwai.framework.model.decompose.internal.ContainerSerializer$gson$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.decompose.internal.ContainerSerializer;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zk.d;

public final class ContainerSerializer$gson$2 extends Lambda implements a	// class@00169c
{
    public final ContainerSerializer this$0;

    public void ContainerSerializer$gson$2(ContainerSerializer p0){
       this.this$0 = p0;
       super(0);
    }
    public final Gson invoke(){
       Object obj = PatchProxy.apply(null, this, ContainerSerializer$gson$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.a.b();
    }
    public Object invoke(){
       return this.invoke();
    }
}
