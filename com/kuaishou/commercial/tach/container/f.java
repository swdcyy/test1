package com.kuaishou.commercial.tach.container.f;
import erd.g;
import java.lang.String;
import java.lang.Object;
import tx4.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import zp8.a;

public final class f implements g	// class@001684
{
    public final String b;

    public void f(String p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          StringBuilder str = "remote bundle load success: "+this.b+", bundleInfo:";
          boolean b = (p0 != null)? true: false;
          a.i("TKContainer", str+b);
       }
       return;
    }
}
