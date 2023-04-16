package com.kwai.yoda.function.tool.GetKwaiSwitchConfig$GetKswitchResultParams;
import com.kwai.yoda.function.FunctionResultParams;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class GetKwaiSwitchConfig$GetKswitchResultParams extends FunctionResultParams	// class@00120b
{
    public List resultData;

    public void GetKwaiSwitchConfig$GetKswitchResultParams(){
       super();
       this.resultData = new ArrayList();
    }
    public final List getResultData(){
       return this.resultData;
    }
    public final void setResultData(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GetKwaiSwitchConfig$GetKswitchResultParams.class, "1")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.resultData = p0;
       return;
    }
}
