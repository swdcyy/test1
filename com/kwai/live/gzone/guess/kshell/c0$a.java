package com.kwai.live.gzone.guess.kshell.c0$a;
import erd.g;
import com.kwai.live.gzone.guess.kshell.c0;
import brd.v;
import java.lang.Object;
import com.kwai.live.gzone.guess.bean.KShellGuessConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public class c0$a implements g	// class@000d2a
{
    public final v b;
    public final c0 c;

    public void c0$a(c0 p0,v p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0$a.class, "1")) {
       }else {
          this.b.onNext(p0);
       }
       return;
    }
}
