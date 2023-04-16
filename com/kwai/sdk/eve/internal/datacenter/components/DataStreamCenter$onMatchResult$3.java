package com.kwai.sdk.eve.internal.datacenter.components.DataStreamCenter$onMatchResult$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.datacenter.components.DataStreamCenter;
import com.kuaishou.eve.packageinfo.model.FilterAction;
import zn7.a;
import ml5.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q50.g;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import in7.f;
import gn7.c;

public final class DataStreamCenter$onMatchResult$3 extends Lambda implements a	// class@0014b6
{
    public final a $data;
    public final FilterAction $r;
    public final a $task;
    public final DataStreamCenter this$0;

    public void DataStreamCenter$onMatchResult$3(DataStreamCenter p0,FilterAction p1,a p2,a p3){
       this.this$0 = p0;
       this.$r = p1;
       this.$task = p2;
       this.$data = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, DataStreamCenter$onMatchResult$3.class, "1")) {
          return;
       }
       Iterator iterator = this.$r.a().iterator();
       while (iterator.hasNext()) {
          this.this$0.g.b().c(this.$task, this.$data, iterator.next());
       }
       return;
    }
}
