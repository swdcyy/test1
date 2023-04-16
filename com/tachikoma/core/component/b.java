package com.tachikoma.core.component.b;
import erd.g;
import wo8.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import zp8.a;

public class b implements g	// class@000d62
{
    public final String b;
    public final a c;

    public void b(a p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.g("setBackgroundImage request exception, backgroundImage: "+this.b, p0);
       }
       return;
    }
}
