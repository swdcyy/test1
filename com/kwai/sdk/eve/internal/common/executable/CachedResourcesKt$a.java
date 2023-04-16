package com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt$a;
import java.lang.Runnable;
import zn7.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt;

public final class CachedResourcesKt$a implements Runnable	// class@001472
{
    public final a b;
    public final String c;

    public void CachedResourcesKt$a(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, CachedResourcesKt$a.class, "1")) {
          return;
       }
       CachedResourcesKt.e(this.b).remove(this.c);
       PatchProxy.onMethodExit(CachedResourcesKt$a.class, "1");
       return;
    }
}
