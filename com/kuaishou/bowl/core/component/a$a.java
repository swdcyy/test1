package com.kuaishou.bowl.core.component.a$a;
import java.lang.Runnable;
import com.kuaishou.bowl.core.component.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$a implements Runnable	// class@001197
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       this.b.reportModuleShowEvent();
       this.b.reportShowEvent();
       return;
    }
}
