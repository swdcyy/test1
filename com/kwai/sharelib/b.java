package com.kwai.sharelib.b;
import erd.a;
import com.kwai.sharelib.a$b;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.a;

public final class b implements a	// class@0016bb
{
    public final a$b b;
    public final b c;

    public void b(a$b p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.b.b(this.c);
       return;
    }
}
