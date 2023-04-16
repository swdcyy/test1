package com.yxcorp.gifshow.v3.previewer.f1$a;
import t36.f$a;
import com.yxcorp.gifshow.v3.previewer.f1;
import java.lang.String;
import java.lang.Object;
import ooc.r0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class f1$a implements f$a	// class@00159a
{
    public final String a;
    public final f1 b;

    public void f1$a(f1 p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1$a.class, "1")) {
       }else {
          p0.u(this.b.a, this.a);
       }
       return;
    }
}
