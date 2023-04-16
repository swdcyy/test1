package com.kuaishou.live.external.e;
import erd.g;
import com.kuaishou.live.external.a$a;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.external.a;

public class e implements g	// class@001b72
{
    public final a$a b;

    public void e(a$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          this.b.P8();
          p0.d = false;
       }
       return;
    }
}
