package com.yxcorp.gifshow.v3.previewer.d0$a;
import t36.f$a;
import com.yxcorp.gifshow.v3.previewer.d0;
import java.lang.String;
import java.lang.Object;
import ooc.r0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class d0$a implements f$a	// class@001590
{
    public final String a;
    public final d0 b;

    public void d0$a(d0 p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0$a.class, "1")) {
       }else {
          p0.u(this.b.a, this.a);
       }
       return;
    }
}
