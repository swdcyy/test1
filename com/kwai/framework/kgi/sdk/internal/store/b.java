package com.kwai.framework.kgi.sdk.internal.store.b;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.kgi.sdk.internal.store.EvictingQueue;
import com.kwai.framework.kgi.sdk.internal.store.EvictingQueue$a;
import com.kwai.framework.kgi.sdk.internal.store.b$a;
import a86.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import com.kwai.framework.kgi.sdk.internal.store.a;
import qk.p;
import java.util.ArrayList;

public final class b	// class@0015a5
{
    public final EvictingQueue a;
    public final EvictingQueue b;

    public void b(int p0,int p1,l p2){
       a.p(p2, "isNeedKeep");
       super();
       EvictingQueue$a companion = EvictingQueue.Companion;
       EvictingQueue uEvictingQue = companion.a(p0);
       this.a = uEvictingQue;
       this.b = companion.a(p1);
       uEvictingQue.setListener(new b$a(this, p2));
    }
    public final boolean a(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       return (this.a.addAll(p0.a) | this.a.addAll(p0.b));
    }
    public final boolean b(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.a, p0);
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.b.clear();
       this.a.clear();
       return;
    }
    public final ArrayList d(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(this.b);
       obj.addAll(this.a);
       return obj;
    }
}
