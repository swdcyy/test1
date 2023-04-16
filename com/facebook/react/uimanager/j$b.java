package com.facebook.react.uimanager.j$b;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.uimanager.j;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class j$b extends GuardedRunnable	// class@001354
{
    public final j b;

    public void j$b(j p0,ReactContext p1){
       this.b = p0;
       super(p1);
    }
    public void runGuarded(){
       if (PatchProxy.applyVoid(null, this, j$b.class, "1")) {
          return;
       }
       this.b.k();
       return;
    }
}
