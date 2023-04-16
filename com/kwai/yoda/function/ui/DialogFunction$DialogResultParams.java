package com.kwai.yoda.function.ui.DialogFunction$DialogResultParams;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class DialogFunction$DialogResultParams extends FunctionResultParams	// class@00122f
{
    public String mTarget;

    public void DialogFunction$DialogResultParams(){
       super();
       this.mTarget = "";
    }
    public final String getMTarget(){
       return this.mTarget;
    }
    public final void setMTarget(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogFunction$DialogResultParams.class, "1")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.mTarget = p0;
       return;
    }
}
