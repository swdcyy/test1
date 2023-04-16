package com.kwai.live.gzone.guess.kshell.m0;
import com.kwai.live.gzone.widget.f;
import com.kwai.live.gzone.guess.kshell.n0;
import com.kwai.live.gzone.widget.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.live.gzone.guess.kshell.n0$b;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import j47.c;
import com.kwai.live.gzone.widget.e;

public class m0 extends f	// class@000d4f
{
    public final n0 G;

    public void m0(n0 p0,f$b p1){
       this.G = p0;
       super(p1);
    }
    public int c0(){
       Object obj = PatchProxy.apply(null, this, m0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.G.c0();
    }
    public int e0(){
       n0$b obj = PatchProxy.apply(null, this, m0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.G.K.L;
       if (obj != null) {
          return obj.e3(this.u());
       }
       return super.e0();
    }
}
