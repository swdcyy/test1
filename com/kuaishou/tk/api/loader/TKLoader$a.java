package com.kuaishou.tk.api.loader.TKLoader$a;
import java.lang.Object;
import nsd.u;
import android.content.SharedPreferences;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tk.api.loader.TKLoader;
import qrd.p;

public final class TKLoader$a	// class@000f90
{

    public void TKLoader$a(){
       super();
    }
    public void TKLoader$a(u p0){
       super();
    }
    public final SharedPreferences a(){
       Object obj = PatchProxy.apply(null, this, TKLoader$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKLoader.d.getValue();
    }
}
