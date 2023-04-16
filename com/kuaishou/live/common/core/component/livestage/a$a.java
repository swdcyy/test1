package com.kuaishou.live.common.core.component.livestage.a$a;
import java.lang.Object;
import nsd.u;
import u71.a;
import com.kuaishou.live.common.core.component.livestage.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.livestage.a$a$a;
import msd.l;
import com.kuaishou.live.common.core.component.livestage.a$a$b;
import com.kuaishou.live.common.core.component.livestage.a$a$c;

public final class a$a	// class@0014b0
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final a a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "camera");
       return new a$a$a(p0);
    }
    public final a b(l p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cameraBuilder");
       return new a$a$b(p0);
    }
    public final a c(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "camera");
       return new a$a$c(p0);
    }
}
