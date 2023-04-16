package com.kwai.yoda.function.webview.GetPageLoadDataFunction;
import ay7.a;
import com.kwai.yoda.function.webview.GetPageLoadDataFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.function.webview.GetPageLoadDataFunction$PerfDataResultParams;
import com.kwai.yoda.function.webview.GetPageLoadDataFunction$PerfDataResultParams$TimeData;
import nz7.e;
import sz7.q;
import java.util.Map;
import com.kwai.yoda.function.webview.GetPageLoadDataFunction$PerfDataResultParams$TimeData$a;
import com.kwai.yoda.session.logger.sample.WebSampleRateItem;
import com.kwai.yoda.bridge.YodaException;

public final class GetPageLoadDataFunction extends a	// class@001254
{
    public static final GetPageLoadDataFunction$a d;

    static {
       GetPageLoadDataFunction.d = new GetPageLoadDataFunction$a(null);
    }
    public void GetPageLoadDataFunction(){
       super();
    }
    public String c(){
       return "getPageLoadData";
    }
    public String d(){
       return "webview";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, GetPageLoadDataFunction.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       GetPageLoadDataFunction$PerfDataResultParams perfDataResu = new GetPageLoadDataFunction$PerfDataResultParams();
       perfDataResu.mResult = 1;
       perfDataResu.mTimeDatas = GetPageLoadDataFunction$PerfDataResultParams$TimeData.Companion.a(p0.getSessionLogger().m().a());
       perfDataResu.mSampleData = p0.getSessionLogger().g();
       return perfDataResu;
    }
}
