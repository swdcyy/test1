package com.kwai.framework.network.keyconfig.a$o;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;

public final class a$o implements g	// class@0017ee
{
    public static final a$o b;

    static {
       a$o.b = new a$o();
    }
    public void a$o(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$o.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          c.C().w("KeyConfigManager", "Error while requesting key config: "+p0.getMessage(), objArray);
       }
       return;
    }
}
