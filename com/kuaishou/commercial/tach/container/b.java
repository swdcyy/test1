package com.kuaishou.commercial.tach.container.b;
import erd.g;
import java.lang.Object;
import sx4.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i00.e;
import com.kuaishou.commercial.tach.container.KwaiTKContainer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.a;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$c;
import tx4.w;
import tx4.f;
import com.kuaishou.tachikoma.api.d;

public final class b implements g	// class@001680
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else if(e.h.e()){
          p0 = KwaiTKContainer.X.iterator();
          a.o(p0, "mCompileInfoList.iterator\(\)");
          while (p0.hasNext()) {
             KwaiTKContainer$c uoc = p0.next();
             d.a(uoc.a, uoc.b, uoc.c);
          }
          KwaiTKContainer.X.clear();
       }
       return;
    }
}
