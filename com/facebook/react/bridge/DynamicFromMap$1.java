package com.facebook.react.bridge.DynamicFromMap$1;
import java.lang.ThreadLocal;
import androidx.core.util.Pools$SimplePool;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DynamicFromMap$1 extends ThreadLocal	// class@0011bd
{

    public void DynamicFromMap$1(){
       super();
    }
    public Pools$SimplePool initialValue(){
       Object obj = PatchProxy.apply(null, this, DynamicFromMap$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pools$SimplePool(10);
    }
    public Object initialValue(){
       return this.initialValue();
    }
}
