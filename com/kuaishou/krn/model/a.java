package com.kuaishou.krn.model.a;
import java.lang.Runnable;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.model.KrnBundleLoadInfo$ReportType;

public class a implements Runnable	// class@000909
{
    public final KrnBundleLoadInfo b;

    public void a(KrnBundleLoadInfo p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.n(KrnBundleLoadInfo$ReportType.REPORT_ON_CONTENTAPPEAR_DELAY_3MIN);
       return;
    }
}
