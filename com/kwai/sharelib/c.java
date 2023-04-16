package com.kwai.sharelib.c;
import erd.g;
import com.kwai.sharelib.a$b;
import crd.b;
import java.lang.Object;
import com.kwai.sharelib.model.ShareAnyResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.a;

public final class c implements g	// class@0016bc
{
    public final a$b b;
    public final b c;

    public void c(a$b p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.b.b.b(this.c);
       }
       return;
    }
}
