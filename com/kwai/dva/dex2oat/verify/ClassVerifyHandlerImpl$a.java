package com.kwai.dva.dex2oat.verify.ClassVerifyHandlerImpl$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.dva.dex2oat.verify.ClassVerifyHandlerImpl;

public final class ClassVerifyHandlerImpl$a	// class@000d24
{

    public void ClassVerifyHandlerImpl$a(){
       super();
    }
    public void ClassVerifyHandlerImpl$a(u p0){
       super();
    }
    public final String a(int p0,int p1){
       ClassVerifyHandlerImpl$a uoa = ClassVerifyHandlerImpl$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ClassVerifyHandlerImpl.disableClassVerify(p0, p1);
    }
}
