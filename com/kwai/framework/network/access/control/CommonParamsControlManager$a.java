package com.kwai.framework.network.access.control.CommonParamsControlManager$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.network.access.control.CommonParamsControlManager;
import wkd.b;
import wa6.a;

public final class CommonParamsControlManager$a implements Runnable	// class@001793
{
    public final String b;

    public void CommonParamsControlManager$a(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, CommonParamsControlManager$a.class, "1")) {
          return;
       }
       CommonParamsControlManager m = CommonParamsControlManager.m;
       if (!m.e(this.b) && (!m.f(this.b) && !m.g(this.b))) {
          b.a(-1942878494).c(this.b);
       }
    label_0034 :
       return;
    }
}
