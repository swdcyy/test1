package com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.CharSequence;
import e17.i;

public final class PlcDynamicUtils$a implements Runnable	// class@000ffd
{
    public static final PlcDynamicUtils$a b;

    static {
       PlcDynamicUtils$a.b = new PlcDynamicUtils$a();
    }
    public void PlcDynamicUtils$a(){
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcDynamicUtils$a.class, "1")) {
          return;
       }
       String str = PatchProxy.apply(objArray, objArray, PlcDynamicUtils.class, "4");
       if (str == PatchProxyResult.class) {
          str = PlcDynamicUtils.b.getValue();
       }
       i.e(R.style.arg_RES_7f11066a, str, 0);
       return;
    }
}
