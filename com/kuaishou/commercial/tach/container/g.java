package com.kuaishou.commercial.tach.container.g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zp8.a;

public final class g implements g	// class@001685
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          a.g("TKContainer", p0);
       }
       return;
    }
}
