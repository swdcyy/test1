package com.facebook.react.modules.storage.AsyncStorageModule$g$a;
import java.lang.Runnable;
import com.facebook.react.modules.storage.AsyncStorageModule$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class AsyncStorageModule$g$a implements Runnable	// class@0012ed
{
    public final Runnable b;
    public final AsyncStorageModule$g c;

    public void AsyncStorageModule$g$a(AsyncStorageModule$g p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AsyncStorageModule$g$a.class, "1")) {
          return;
       }
       this.b.run();
       this.c.a();
       return;
    }
}
