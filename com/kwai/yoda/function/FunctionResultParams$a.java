package com.kwai.yoda.function.FunctionResultParams$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public final class FunctionResultParams$a	// class@0011c8
{

    public void FunctionResultParams$a(){
       super();
    }
    public void FunctionResultParams$a(u p0){
       super();
    }
    public final FunctionResultParams a(int p0,String p1){
       FunctionResultParams obj;
       FunctionResultParams$a uoa = FunctionResultParams$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new FunctionResultParams();
       obj.mResult = p0;
       obj.mMessage = p1;
       obj.mMsg = p1;
       return obj;
    }
    public final FunctionResultParams b(){
       FunctionResultParams obj = PatchProxy.apply(null, this, FunctionResultParams$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FunctionResultParams();
       obj.mResult = 1;
       return obj;
    }
}
