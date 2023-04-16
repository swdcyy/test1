package com.kwai.live.gzone.guess.kshell.g0;
import java.lang.Runnable;
import com.kwai.live.gzone.guess.kshell.h0;
import java.lang.Object;
import p57.i1;
import n57.b$a;
import n57.b;

public final class g0 implements Runnable	// class@000d39
{
    public final h0 b;

    public void g0(h0 p0){
       this.b = p0;
    }
    public final void run(){
       g0 tb = this.b;
       h0 p = tb.p;
       if (p != null) {
          p.i(new i1(tb));
       }
       return;
    }
}
