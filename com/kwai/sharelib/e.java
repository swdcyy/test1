package com.kwai.sharelib.e;
import erd.a;
import com.kwai.sharelib.a$b;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.a;

public final class e implements a	// class@0016be
{
    public final a$b b;
    public final b c;

    public void e(a$b p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.b.b.b(this.c);
       return;
    }
}
