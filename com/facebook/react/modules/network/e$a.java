package com.facebook.react.modules.network.e$a;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.modules.network.e;
import com.facebook.react.bridge.ReactContext;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$a extends GuardedAsyncTask	// class@0012d1
{
    public final Runnable a;
    public final e b;

    public void e$a(e p0,ReactContext p1,Runnable p2){
       this.b = p0;
       this.a = p2;
       super(p1);
    }
    public void doInBackgroundGuarded(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
       }else {
          this.a.run();
       }
       return;
    }
}
