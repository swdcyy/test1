package com.kwai.framework.util.gson.GsonLifeCycleTypeAdapterWrapper;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mkd.a;
import com.google.gson.stream.b;

public class GsonLifeCycleTypeAdapterWrapper extends TypeAdapter	// class@000ce6
{
    public TypeAdapter a;

    public void GsonLifeCycleTypeAdapterWrapper(TypeAdapter p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GsonLifeCycleTypeAdapterWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = this.a.read(p0);
       if (p0 != null) {
          p0.afterDeserialize();
       }
       return p0;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GsonLifeCycleTypeAdapterWrapper.class, "1")) {
          return;
       }
       this.a.write(p0, p1);
       return;
    }
}
