package com.facebook.react.modules.fresco.FrescoModule$a;
import java.lang.reflect.InvocationHandler;
import com.facebook.react.modules.fresco.FrescoModule;
import ed.x;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.StringBuilder;
import cb.a;

public class FrescoModule$a implements InvocationHandler	// class@0012b7
{
    public final x b;
    public final FrescoModule c;

    public void FrescoModule$a(FrescoModule p0,x p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FrescoModule$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       int i = 0;
       if ((p1.getName()).contains("onAlloc")) {
          p0 = this.c;
          p0.mAllocSize = p0.mAllocSize + (long)p2[i].intValue();
          a.a("ReactNative", this.c.mAllocSize+" size after alloc");
       }else if((p1.getName()).contains("onFree")){
          p0 = this.c;
          p0.mAllocSize = p0.mAllocSize - (long)p2[i].intValue();
          a.a("ReactNative", this.c.mAllocSize+" size after free");
       }
       return p1.invoke(this.b, p2);
    }
}
