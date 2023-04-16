package com.facebook.react.bridge.Arguments$1;
import java.util.AbstractList;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Array;
import java.lang.Number;

public final class Arguments$1 extends AbstractList	// class@001198
{
    public final Object val$objects;

    public void Arguments$1(Object p0){
       this.val$objects = p0;
       super();
    }
    public Object get(int p0){
       if (PatchProxy.isSupport(Arguments$1.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, Arguments$1.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Array.get(this.val$objects, p0);
    }
    public int size(){
       Object obj = PatchProxy.apply(null, this, Arguments$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Array.getLength(this.val$objects);
    }
}
