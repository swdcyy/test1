package com.tachikoma.core.bridge.a$b$a;
import java.lang.Runnable;
import com.tachikoma.core.bridge.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$b$a implements Runnable	// class@000d3d
{
    public final a$b b;

    public void a$b$a(a$b p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$b$a.class, "1")) {
          return;
       }
       this.b.i();
       return;
    }
}
