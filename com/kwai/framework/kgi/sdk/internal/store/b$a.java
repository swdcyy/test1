package com.kwai.framework.kgi.sdk.internal.store.b$a;
import a86.a;
import com.kwai.framework.kgi.sdk.internal.store.b;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.kgi.sdk.internal.store.EvictingQueue;
import com.kwai.framework.kgi.sdk.internal.store.a;

public final class b$a implements a	// class@0015a4
{
    public final b b;
    public final l c;

    public void b$a(b p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void entryRemoved(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (p0 != null && this.c.invoke(p0).booleanValue() == true) {
          a.a(this.b.b, p0);
       }
       return;
    }
}
