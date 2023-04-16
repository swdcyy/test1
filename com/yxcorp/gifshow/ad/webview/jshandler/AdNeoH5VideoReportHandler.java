package com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoReportHandler;
import zl9.b;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoReportHandler$a;
import nsd.u;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zl9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;
import java.lang.CharSequence;
import fg6.a;
import com.yxcorp.gifshow.ad.webview.jshandler.ReportData;
import com.google.gson.Gson;
import k59.t0;
import com.yxcorp.gifshow.ad.webview.jshandler.ReportParams;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoReportHandler$handleJsCall$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import java.lang.Throwable;
import zl9.a;

public final class AdNeoH5VideoReportHandler implements b	// class@0018e0
{
    public final Map a;
    public static final AdNeoH5VideoReportHandler$a b;

    static {
       AdNeoH5VideoReportHandler.b = new AdNeoH5VideoReportHandler$a(null);
    }
    public void AdNeoH5VideoReportHandler(Map p0){
       a.p(p0, "mAdSessionMap");
       super();
       this.a = p0;
    }
    public void e(String p0,e p1){
       Object[] objArray1;
       ReportData reportData;
       String str = "reportData.params is null";
       String str1 = "sessionId is invalid";
       String str2 = "reportData is null";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdNeoH5VideoReportHandler.class, "1")) {
          return;
       }
       a.p(p1, "function");
       Object[] objArray = new Object[0];
       j0.f("adNeoH5VideoReport", "data is "+p0, objArray);
       Gson gson = (p0 == null || !p0.length())? 1: null;
       if (gson) {
          objArray1 = new Object[0];
          j0.c("adNeoH5VideoReport", "data is null or empty", objArray1);
          p1.onError(-1, "data is null or empty");
          return;
       }else {
          reportData = a.a.h(p0, ReportData.class);
          if (reportData == null) {
             objArray1 = new Object[0];
             j0.c("adNeoH5VideoReport", str2, objArray1);
             p1.onError(-1, str2);
             return;
          }else {
             t0 ot0 = this.a.get(reportData.getSessionId());
             if (ot0 == null) {
                objArray1 = new Object[0];
                j0.c("adNeoH5VideoReport", str1, objArray1);
                p1.onError(-1, str1);
                return;
             }else if(reportData.getParams() == null){
                objArray1 = new Object[0];
                j0.c("adNeoH5VideoReport", str, objArray1);
                p1.onError(-1, str);
                return;
             }else {
                i0.a().e(reportData.getParams().getAdActionType(), ot0.d.getEntity()).f(new AdNeoH5VideoReportHandler$handleJsCall$1(reportData)).o(reportData.getParams().getClientExtras()).a();
                p1.onSuccess(null);
                return;
             }
          }
       }
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "adNeoH5VideoReport";
    }
    public void onDestroy(){
       a.a(this);
    }
}
