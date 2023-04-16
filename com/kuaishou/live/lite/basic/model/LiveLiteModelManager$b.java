package com.kuaishou.live.lite.basic.model.LiveLiteModelManager$b;
import z1.k;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteModelManager$b implements k	// class@001e8d
{
    public Object b;
    public final a c;

    public void LiveLiteModelManager$b(a p0){
       a.p(p0, "factory");
       super();
       this.c = p0;
    }
    public Object get(){
       LiveLiteModelManager$b obj = PatchProxy.apply(null, this, LiveLiteModelManager$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = this.c.invoke();
       }
       obj = this.b;
       a.m(obj);
       return obj;
    }
}
