package com.kuaishou.android.vader.b$g;
import java.lang.Runnable;
import com.kuaishou.android.vader.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uq.a;

public class b$g implements Runnable	// class@000f70
{
    public final b b;

    public void b$g(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, b$g.class, "1")) {
          return;
       }
       this.b.e.l();
       PatchProxy.onMethodExit(b$g.class, "1");
       return;
    }
}
