package com.yxcorp.gifshow.ad.tachikoma.a$d;
import erd.g;
import com.yxcorp.gifshow.ad.tachikoma.a;
import java.lang.Object;
import sx4.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$d implements g	// class@001805
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          this.b.onTKV8SoLoadSuccessEvent();
       }
       return;
    }
}
