package com.kuaishou.krn.bridges.yoda.a;
import com.kuaishou.krn.bridges.yoda.IFunction;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.c;
import kj0.l;
import java.lang.Integer;
import com.kuaishou.krn.bridges.yoda.IFunction$IllegalCallException;
import java.lang.Throwable;

public class a extends IFunction	// class@00083a
{

    public void a(){
       super();
    }
    public void a(String p0,String p1,String p2,Callback p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "1")) {
          return;
       }
       try{
          c.b().g().G(p2);
          IFunction iFunction = IFunction.class;
          if (!PatchProxy.isSupport(iFunction) || !PatchProxy.applyVoidTwoRefs(p3, Integer.valueOf(1), null, iFunction, "2")) {
             IFunction.b(p3, 1, null);
          }
          return;
       }catch(java.lang.Exception e8){
          throw new IFunction$IllegalCallException(this, e8);
       }
    }
    public void c(long p0){
    }
}
