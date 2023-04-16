package com.tkruntime.v8.V8Map;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8;
import java.lang.Object;
import com.tkruntime.v8.V8Value;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;

public class V8Map extends V8Object	// class@000fbd
{

    public void V8Map(V8 p0){
       super(p0, null);
    }
    public void V8Map(V8 p0,long p1){
       super(p0);
       if (p0 != null) {
          this.objectHandle = p1;
          this.released = false;
          this.v8.checkThread();
          this.addObjectReference(this.objectHandle);
       }
       return;
    }
    public void V8Map(V8 p0,Object p1){
       super(p0);
       if (p0 != null) {
          this.v8.checkThread();
          this.initialize(this.v8.getV8RuntimePtr(), p1);
       }
       return;
    }
    public void initialize(long p0,Object p1){
       if (PatchProxy.isSupport(V8Map.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, V8Map.class, "1")) {
          return;
       }
       this.released = false;
       this.addObjectReferenceAndTrackedObj(this.v8.initNewV8Map(p0));
       return;
    }
}
