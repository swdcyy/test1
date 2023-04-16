package com.kuaishou.pagedy.manager.c;
import erd.g;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import nv.c;

public class c implements g	// class@000a92
{
    public final DynamicPageCenter b;

    public void c(DynamicPageCenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          c.f("req refresh error throwable"+p0.getMessage());
       }
       return;
    }
}
