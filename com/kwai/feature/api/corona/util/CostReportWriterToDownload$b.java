package com.kwai.feature.api.corona.util.CostReportWriterToDownload$b;
import java.lang.Runnable;
import com.kwai.feature.api.corona.util.CostReportWriterToDownload;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class CostReportWriterToDownload$b implements Runnable	// class@000e3a
{
    public final CostReportWriterToDownload b;

    public void CostReportWriterToDownload$b(CostReportWriterToDownload p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, CostReportWriterToDownload$b.class, "1")) {
          return;
       }
       this.b.d();
       return;
    }
}
