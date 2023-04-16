package com.facebook.react.modules.storage.AsyncStorageModule$g;
import java.util.concurrent.Executor;
import com.facebook.react.modules.storage.AsyncStorageModule;
import java.lang.Object;
import java.util.ArrayDeque;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import com.facebook.react.modules.storage.AsyncStorageModule$g$a;

public class AsyncStorageModule$g implements Executor	// class@0012ee
{
    public final ArrayDeque b;
    public Runnable c;
    public final Executor d;
    public final AsyncStorageModule e;

    public void AsyncStorageModule$g(AsyncStorageModule p0,Executor p1){
       this.e = p0;
       super();
       this.b = new ArrayDeque();
       this.d = p1;
    }
    public synchronized void a(){
       if (PatchProxy.applyVoid(null, this, AsyncStorageModule$g.class, "2")) {
          return;
       }
       Runnable runnable = this.b.poll();
       this.c = runnable;
       if (runnable != null) {
          this.d.execute(runnable);
       }
       return;
    }
    public synchronized void execute(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStorageModule$g.class, "1")) {
          return;
       }
       this.b.offer(new AsyncStorageModule$g$a(this, p0));
       if (this.c == null) {
          this.a();
       }
       return;
    }
}
