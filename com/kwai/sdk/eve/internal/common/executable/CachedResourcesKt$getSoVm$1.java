package com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt$getSoVm$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import zn7.a;
import java.lang.String;
import java.lang.Object;
import ym7.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ao7.a;
import java.io.File;
import kotlin.jvm.internal.a;

public final class CachedResourcesKt$getSoVm$1 extends Lambda implements a	// class@001476
{
    public final String $id;
    public final a $this_getSoVm;

    public void CachedResourcesKt$getSoVm$1(a p0,String p1){
       this.$this_getSoVm = p0;
       this.$id = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final g invoke(){
       Object obj = PatchProxy.apply(null, this, CachedResourcesKt$getSoVm$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String absolutePath = this.$this_getSoVm.l().N3(this.$id).getAbsolutePath();
       a.o(absolutePath, "resourceLocator.soFile\(id\).absolutePath");
       return new g(absolutePath);
    }
}
