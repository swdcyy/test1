package com.kwai.framework.network.degrade.DegradeInitModule$b;
import com.kwai.framework.network.degrade.e$b;
import com.kwai.framework.network.degrade.DegradeInitModule;
import java.lang.Object;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade;
import okhttp3.Request;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.kwai.framework.network.degrade.e;

public class DegradeInitModule$b implements e$b	// class@0017b4
{
    public final DegradeInitModule a;

    public void DegradeInitModule$b(DegradeInitModule p0){
       this.a = p0;
       super();
    }
    public String a(DegradeConfig$UrlDegrade p0,Request p1,String p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DegradeInitModule$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return b.a(-1538291188).f();
    }
}
