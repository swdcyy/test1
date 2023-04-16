package com.yxcorp.gifshow.log.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Long;
import ok.k;

public final class e$b	// class@001aff
{
    public final long a;
    public final long b;

    public void e$b(long p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       e$b uob = e$b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uob != p0.getClass()) {
          return false;
       }
       if (this.a - p0.a || this.b - p0.b) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, e$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Long.valueOf(this.a),Long.valueOf(this.b)};
       return k.b(obj);
    }
}
