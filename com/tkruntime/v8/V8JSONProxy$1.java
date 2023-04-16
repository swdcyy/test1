package com.tkruntime.v8.V8JSONProxy$1;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.V8JSONProxy$ObjectMeta;

public final class V8JSONProxy$1 implements Runnable	// class@000fb6
{
    public final Class val$clz;

    public void V8JSONProxy$1(Class p0){
       this.val$clz = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, V8JSONProxy$1.class, "1")) {
          return;
       }
       V8JSONProxy$ObjectMeta.loadMetaAsync(this.val$clz);
       return;
    }
}
