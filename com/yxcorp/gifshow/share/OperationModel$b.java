package com.yxcorp.gifshow.share.OperationModel$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class OperationModel$b implements g	// class@001b5a
{
    public static final OperationModel$b b;

    static {
       OperationModel$b.b = new OperationModel$b();
    }
    public void OperationModel$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationModel$b.class, "1")) {
       }else {
          Log.d("ShareDebugLog", "Fail when requesting share config"+Log.f(p0));
       }
       return;
    }
}
