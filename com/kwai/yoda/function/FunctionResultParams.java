package com.kwai.yoda.function.FunctionResultParams;
import java.io.Serializable;
import com.kwai.yoda.function.FunctionResultParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public class FunctionResultParams implements Serializable	// class@0011c9
{
    public String mMessage;
    public String mMsg;
    public int mResult;
    public static final FunctionResultParams$a Companion;
    public static final long serialVersionUID;

    static {
       FunctionResultParams.Companion = new FunctionResultParams$a(null);
    }
    public void FunctionResultParams(){
       super();
    }
    public static final FunctionResultParams createErrorResult(int p0,String p1){
       if (PatchProxy.isSupport(FunctionResultParams.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, FunctionResultParams.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return FunctionResultParams.Companion.a(p0, p1);
    }
    public static final FunctionResultParams createSuccessResult(){
       Object obj = PatchProxy.apply(null, null, FunctionResultParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FunctionResultParams.Companion.b();
    }
}
