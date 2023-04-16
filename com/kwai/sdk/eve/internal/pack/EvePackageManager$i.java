package com.kwai.sdk.eve.internal.pack.EvePackageManager$i;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import tn7.b;
import java.util.List;
import tn7.c;
import trd.y;
import xn7.b;
import qrd.l1;

public final class EvePackageManager$i implements Runnable	// class@001586
{
    public final EvePackageManager b;

    public void EvePackageManager$i(EvePackageManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EvePackageManager$i.class, "1")) {
          return;
       }
       EvePackageManager g = this.b.g;
       _monitor_enter(g);
       Collection uCollection = this.b.g.values();
       a.o(uCollection, "mTaskPackageMap.values");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          a.o(uob, "it");
          y.q0(uArrayList, c.b(uob));
       }
       b.a.a(uArrayList);
       _monitor_exit(g);
       return;
    }
}
