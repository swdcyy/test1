package com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoReportHandler$handleJsCall$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.yxcorp.gifshow.ad.webview.jshandler.ReportData;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.webview.jshandler.ReportParams;
import vq4.d;

public final class AdNeoH5VideoReportHandler$handleJsCall$1 implements AdDataWrapper$AdLogParamAppender	// class@0018df
{
    public final ReportData $reportData;

    public void AdNeoH5VideoReportHandler$handleJsCall$1(ReportData p0){
       this.$reportData = p0;
       super();
    }
    public final void appendAdLogParam(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoH5VideoReportHandler$handleJsCall$1.class, "1")) {
          return;
       }
       p0.F.b = this.$reportData.getParams().getItemClickType();
       p0.F.w1 = this.$reportData.getParams().getItemClickAction();
       p0.F.C = this.$reportData.getParams().getElementType();
       p0.F.b1 = this.$reportData.getParams().getItemDuration();
       p0.F.a1 = this.$reportData.getParams().getPlayedDuration();
       p0.Z = this.$reportData.getParams().getReplayTimes();
       return;
    }
}
