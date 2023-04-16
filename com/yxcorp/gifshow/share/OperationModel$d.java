package com.yxcorp.gifshow.share.OperationModel$d;
import java.lang.Object;
import nsd.u;
import msd.l;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModel$c;

public final class OperationModel$d	// class@001b5c
{

    public void OperationModel$d(){
       super();
    }
    public void OperationModel$d(u p0){
       super();
    }
    public final OperationModel a(l p0){
       OperationModel$c obj = PatchProxy.applyOneRefs(p0, this, OperationModel$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "block");
       obj = new OperationModel$c();
       p0.invoke(obj);
       return obj.a();
    }
}
