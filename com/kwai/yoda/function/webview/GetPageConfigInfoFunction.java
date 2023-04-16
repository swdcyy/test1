package com.kwai.yoda.function.webview.GetPageConfigInfoFunction;
import ay7.a;
import com.kwai.yoda.function.webview.GetPageConfigInfoFunction$b;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import hz7.d;
import com.kwai.yoda.function.webview.GetPageConfigInfoFunction$c;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import java.util.Set;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import java.util.HashSet;
import com.kwai.yoda.function.webview.GetPageConfigInfoFunction$AuthorityInfo;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import trd.u;
import ny7.d;
import com.kwai.yoda.function.webview.GetPageConfigInfoFunction$a;
import java.util.Collection;
import com.kwai.yoda.function.webview.GetPageConfigInfoFunction$PageConfigInfoData;
import com.kwai.yoda.function.webview.GetPageConfigInfoFunction$GetPageConfigInfoResultParam;
import com.kwai.yoda.bridge.YodaException;

public final class GetPageConfigInfoFunction extends a	// class@00124e
{
    public static final GetPageConfigInfoFunction$b d;

    static {
       GetPageConfigInfoFunction.d = new GetPageConfigInfoFunction$b(null);
    }
    public void GetPageConfigInfoFunction(){
       super();
    }
    public String c(){
       return "getPageConfigInfo";
    }
    public String d(){
       return "webview";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       d uod;
       Set set;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, GetPageConfigInfoFunction.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       p1 = p0.getCurrentUrl();
       if (p1 == null) {
          throw new YodaException(0x1e84a, "The webview do not has url.");
       }
       ArrayList uArrayList = new ArrayList();
       List offlineMatch = p0.getOfflineMatchRecord();
       a.h(offlineMatch, "webView.offlineMatchRecord");
       Iterator iterator = offlineMatch.iterator();
       while (iterator.hasNext()) {
          uod = iterator.next();
          GetPageConfigInfoFunction$c uoc = new GetPageConfigInfoFunction$c();
          uoc.hyId = uod.hyId;
          uoc.hyVersion = uod.version;
          uoc.hasPackage = uod.hasPackage;
          uoc.hasConfig = uod.hasConfig;
          uArrayList.add(uoc);
       }
       NewYodaJavascriptBridge javascriptBr = p0.getJavascriptBridge();
       if (javascriptBr != null) {
          set = javascriptBr.e();
          if (set != null) {
          label_0060 :
             GetPageConfigInfoFunction$AuthorityInfo uAuthorityIn = new GetPageConfigInfoFunction$AuthorityInfo();
             uAuthorityIn.hasCookieAuth = YodaCookie.f.m(p1);
             ArrayList uArrayList1 = new ArrayList(u.Y(set, 10));
             Iterator iterator1 = set.iterator();
             while (iterator1.hasNext()) {
                uod = iterator1.next();
                uArrayList1.add(new GetPageConfigInfoFunction$a(uod.namespace, uod.command));
             }
             uAuthorityIn.bridgeList = uArrayList1;
             GetPageConfigInfoFunction$PageConfigInfoData pageConfigIn = new GetPageConfigInfoFunction$PageConfigInfoData();
             pageConfigIn.hybridInfoList = uArrayList;
             pageConfigIn.authorityInfo = uAuthorityIn;
             GetPageConfigInfoFunction$GetPageConfigInfoResultParam getPageConfi = new GetPageConfigInfoFunction$GetPageConfigInfoResultParam();
             getPageConfi.data = pageConfigIn;
             return getPageConfi;
          }
       }
       set = new HashSet();
       goto label_0060 ;
    }
}
