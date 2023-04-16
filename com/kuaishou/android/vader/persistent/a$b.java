package com.kuaishou.android.vader.persistent.a$b;
import java.lang.Runnable;
import com.kuaishou.android.vader.persistent.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$b implements Runnable	// class@000720
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.b.g();
       return;
    }
}
