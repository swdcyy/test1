package com.kuaishou.android.vader.b$f;
import java.lang.Runnable;
import com.kuaishou.android.vader.b;
import com.kuaishou.android.vader.Channel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zq.e;
import uq.a;

public class b$f implements Runnable	// class@000f6f
{
    public final Channel b;
    public final b c;

    public void b$f(b p0,Channel p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, b$f.class, "1")) {
          return;
       }
       b$f tc = this.c;
       tc.e.j(tc.d, this.b);
       PatchProxy.onMethodExit(b$f.class, "1");
       return;
    }
}
