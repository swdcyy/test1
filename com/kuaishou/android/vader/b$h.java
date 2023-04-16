package com.kuaishou.android.vader.b$h;
import java.lang.Runnable;
import com.kuaishou.android.vader.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uq.a;

public class b$h implements Runnable	// class@000f71
{
    public final String b;
    public final b c;

    public void b$h(b p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, b$h.class, "1")) {
          return;
       }
       this.c.e.k(this.b);
       PatchProxy.onMethodExit(b$h.class, "1");
       return;
    }
}
