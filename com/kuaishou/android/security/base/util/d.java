package com.kuaishou.android.security.base.util.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.security.base.perf.d$b;
import com.kuaishou.android.security.base.perf.d;

public class d	// class@000f1b
{

    public void d(){
       super();
    }
    public static void a(String p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uod, "1")) {
          return;
       }
       d.a(d$b.a, p0, p1);
       return;
    }
}
