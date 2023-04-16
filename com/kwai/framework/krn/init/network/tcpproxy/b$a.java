package com.kwai.framework.krn.init.network.tcpproxy.b$a;
import java.util.TimerTask;
import com.kwai.framework.krn.init.network.tcpproxy.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import p86.b;

public class b$a extends TimerTask	// class@0015f6
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, b.class, "3")) {
          tb.a = false;
          b.a(false);
          b.b(0);
       }
       return;
    }
}
