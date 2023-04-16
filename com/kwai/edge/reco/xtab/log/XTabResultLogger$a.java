package com.kwai.edge.reco.xtab.log.XTabResultLogger$a;
import java.lang.Runnable;
import yj5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import k2b.u1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class XTabResultLogger$a implements Runnable	// class@000d62
{
    public final a b;

    public void XTabResultLogger$a(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, XTabResultLogger$a.class, "1")) {
          return;
       }
       String str = DataKt.a().q(this.b);
       u1.R("XTabEveTaskVerify", str, 22);
       Log.g("XTabResultLogger", "reportXTabResult "+str);
       return;
    }
}
