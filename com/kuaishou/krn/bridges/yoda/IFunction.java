package com.kuaishou.krn.bridges.yoda.IFunction;
import java.lang.Object;
import com.facebook.react.bridge.Callback;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public abstract class IFunction	// class@000838
{

    public void IFunction(){
       super();
    }
    public static void b(Callback p0,int p1,String p2){
       if (PatchProxy.isSupport(IFunction.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, IFunction.class, "1")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p1),p2};
       p0.invoke(objArray);
       return;
    }
    public abstract void a(String p0,String p1,String p2,Callback p3);
    public abstract void c(long p0);
}
