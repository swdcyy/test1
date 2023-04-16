package com.kwai.component.realtime.tab.RealtimeTabRequester$d;
import java.lang.Runnable;
import com.kwai.component.realtime.tab.RealtimeTabRequester;
import java.util.LinkedList;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import jg5.b;

public final class RealtimeTabRequester$d implements Runnable	// class@000b16
{
    public final RealtimeTabRequester b;
    public final LinkedList c;
    public final l d;

    public void RealtimeTabRequester$d(RealtimeTabRequester p0,LinkedList p1,l p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, RealtimeTabRequester$d.class, "1")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          this.b.t(this.d, iterator.next());
       }
       return;
    }
}
