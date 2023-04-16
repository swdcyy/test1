package com.tachikoma.core.bridge.e$a;
import java.lang.Runnable;
import com.tachikoma.core.bridge.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$a implements Runnable	// class@000d47
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       this.b.c();
       return;
    }
}
