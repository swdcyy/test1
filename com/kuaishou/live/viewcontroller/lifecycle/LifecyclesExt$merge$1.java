package com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt$merge$1;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import nsd.q0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.lifecycle.LifecycleRegistry;
import com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt$merge$1$observer$1;
import java.util.Iterator;
import java.lang.Iterable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class LifecyclesExt$merge$1 implements LifecycleOwner	// class@000ff2
{
    public final List b;
    public final LifecycleRegistry c;
    public final LifecycleEventObserver d;
    public final LifecycleOwner e;
    public final LifecycleOwner f;
    public final LifecycleOwner[] g;

    public void LifecyclesExt$merge$1(LifecycleOwner p0,LifecycleOwner p1,LifecycleOwner[] p2){
       this.e = p0;
       this.f = p1;
       this.g = p2;
       super();
       q0 oq0 = new q0(3);
       oq0.a(p0);
       oq0.a(p1);
       oq0.b(p2);
       LifecycleOwner[] lifecycleOwn = new LifecycleOwner[oq0.c()];
       List list = CollectionsKt__CollectionsKt.L(oq0.d(lifecycleOwn));
       this.b = list;
       this.c = new LifecycleRegistry(this);
       this.d = new LifecyclesExt$merge$1$observer$1(this);
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          iterator.next().getLifecycle().addObserver(this.d);
       }
       return;
    }
    public Lifecycle getLifecycle(){
       return this.c;
    }
}
