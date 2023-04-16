package com.kuaishou.commercial.tach.container.a;
import tx4.f;
import java.lang.Object;
import tx4.w;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tx4.e;

public final class a implements f	// class@00167f
{
    public final f a;

    public void a(f p0){
       this.a = p0;
       super();
    }
    public void a(w p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p1, "e");
       a ta = this.a;
       if (ta != null) {
          ta.a(p0, p1);
       }
       return;
    }
    public void b(boolean p0){
       e.a(this, p0);
    }
    public void c(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "tkBundleInfo");
       a ta = this.a;
       if (ta != null) {
          ta.c(p0);
       }
       return;
    }
}
