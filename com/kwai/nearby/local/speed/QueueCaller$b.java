package com.kwai.nearby.local.speed.QueueCaller$b;
import lsb.a;
import com.kwai.nearby.local.speed.QueueCaller;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Queue;

public final class QueueCaller$b implements a	// class@000fe1
{
    public final QueueCaller a;

    public void QueueCaller$b(QueueCaller p0){
       this.a = p0;
       super();
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, QueueCaller$b.class, "1")) {
          return;
       }
       if (this.a.d.isEmpty()) {
          this.a.e = false;
       }else {
          this.a.a();
       }
       return;
    }
}
