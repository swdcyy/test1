package com.tachikoma.core.component.text.a$b;
import oo8.e;
import java.lang.String;
import com.tachikoma.core.component.text.a$d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zp8.a;
import android.graphics.Typeface;
import com.tachikoma.core.component.text.a;
import hp8.e;
import oo8.d;
import java.lang.Throwable;

public final class a$b implements e	// class@000d95
{
    public final String a;
    public final a$d b;

    public void a$b(String p0,a$d p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "3")) {
          return;
       }
       a.c("FontFaceManager download canceled");
       a.a(this.b, null);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a.a(this.b, e.c().g(this.a, 0));
       return;
    }
    public void c(){
       d.d(this);
    }
    public void error(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       a.g("FontFaceManager download error", p0);
       a.a(this.b, null);
       return;
    }
}
