package com.kwai.framework.initmodule.ProcessBroadCastInitModel;
import com.kwai.framework.init.a;
import com.kwai.framework.initmodule.ProcessBroadCastInitModel$receiver$1;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.sdk.switchconfig.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import tb7.b;
import android.os.Handler;
import android.os.Looper;
import com.kwai.framework.initmodule.ProcessBroadCastInitModel$a;
import java.lang.Runnable;

public final class ProcessBroadCastInitModel extends a	// class@001578
{
    public final ProcessBroadCastInitModel$receiver$1 q;

    public void ProcessBroadCastInitModel(){
       super();
       this.q = new ProcessBroadCastInitModel$receiver$1();
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, ProcessBroadCastInitModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class,AzerothInitModule.class,SwitchConfigInitModule.class};
       return CollectionsKt___CollectionsKt.J5(CollectionsKt__CollectionsKt.L(obj));
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, ProcessBroadCastInitModel.class, "1")) {
          return;
       }
       if (a.t().d("ugSim", false)) {
          b.e(a.b());
          new Handler(Looper.getMainLooper()).postDelayed(new ProcessBroadCastInitModel$a(this), 1000);
       }else {
          b.e(a.b());
       }
       return;
    }
}
