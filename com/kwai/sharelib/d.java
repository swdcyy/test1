package com.kwai.sharelib.d;
import erd.g;
import com.kwai.sharelib.a$b;
import crd.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.a;

public final class d implements g	// class@0016bd
{
    public final a$b b;
    public final b c;

    public void d(a$b p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          this.b.b.b(this.c);
       }
       return;
    }
}
