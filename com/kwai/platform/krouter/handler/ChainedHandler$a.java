package com.kwai.platform.krouter.handler.ChainedHandler$a;
import qh7.c;
import com.kwai.platform.krouter.handler.ChainedHandler;
import java.util.Iterator;
import xh7.b;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ChainedHandler$a implements c	// class@00128b
{
    public final Iterator a;
    public final b b;
    public final c c;
    public final ChainedHandler d;

    public void ChainedHandler$a(ChainedHandler p0,Iterator p1,b p2,c p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChainedHandler$a.class, "2")) {
          return;
       }
       this.c.a(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ChainedHandler$a.class, "1")) {
          return;
       }
       this.d.e(this.a, this.b, this.c);
       return;
    }
}
