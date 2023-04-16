package com.kuaishou.live.external.c;
import erd.g;
import com.kuaishou.live.external.a$a;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.external.a;

public class c implements g	// class@001b70
{
    public final a$a b;

    public void c(a$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.b.P8();
          p0.d = true;
       }
       return;
    }
}
