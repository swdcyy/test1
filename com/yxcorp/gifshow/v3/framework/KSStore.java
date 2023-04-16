package com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.e;
import msd.p;
import tvc.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.KSStore$middlewareList$2;
import msd.a;
import qrd.p;
import qrd.s;
import tvc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;

public abstract class KSStore	// class@001525
{
    public final p a;
    public e b;
    public final e c;
    public final p d;

    public void KSStore(e p0,p p1,c[] p2){
       a.p(p0, "initState");
       a.p(p1, "reducer");
       a.p(p2, "_middlewareList");
       super();
       this.c = p0;
       this.d = p1;
       this.a = s.c(new KSStore$middlewareList$2(this, p2));
       this.b = p0;
    }
    public void a(a p0){
       KSStore kSStore = KSStore.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, kSStore, "3")) {
          return;
       }
       a.p(p0, "action");
       KSStore tb = this.b;
       List list = PatchProxy.apply(null, this, kSStore, "1");
       if (list == PatchProxyResult.class) {
          list = this.a.getValue();
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          tb = iterator.next().b(p0, tb);
       }
       e uoe = this.d.invoke(p0, tb);
       this.c(uoe);
       this.b = uoe;
       return;
    }
    public final e b(){
       return this.b;
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSStore.class, "4")) {
          return;
       }
       a.p(p0, "newState");
       return;
    }
}
