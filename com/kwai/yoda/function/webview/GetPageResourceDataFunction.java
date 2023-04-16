package com.kwai.yoda.function.webview.GetPageResourceDataFunction;
import ay7.a;
import com.kwai.yoda.function.webview.GetPageResourceDataFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import hz7.e;
import com.kwai.yoda.function.webview.GetPageResourceDataFunction$b;
import java.io.File;
import tb7.c;
import com.kwai.yoda.function.webview.GetPageResourceDataFunction$PageResourceData;
import com.kwai.yoda.function.webview.GetPageResourceDataFunction$PageResourceDataResultParam;
import com.kwai.yoda.bridge.YodaException;

public final class GetPageResourceDataFunction extends a	// class@001259
{
    public static final GetPageResourceDataFunction$a d;

    static {
       GetPageResourceDataFunction.d = new GetPageResourceDataFunction$a(null);
    }
    public void GetPageResourceDataFunction(){
       super();
    }
    public String c(){
       return "getPageResourceData";
    }
    public String d(){
       return "webview";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, GetPageResourceDataFunction.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       List offlineReque = p0.getOfflineRequestRecord();
       ArrayList uArrayList = new ArrayList();
       a.h(offlineReque, "offlineRequestRecord");
       Iterator iterator = offlineReque.iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          GetPageResourceDataFunction$b uob = new GetPageResourceDataFunction$b();
          uob.url = uoe.url;
          i = i + 1;
          if (uoe.a()) {
             uob.hyId = uoe.hyId;
             uob.hyVersion = uoe.hyVersion;
             uob.status = uoe.statusCode;
             uob.size = c.c(new File(uoe.filepath));
             uArrayList.add(uob);
             i1 = i1 + 1;
          }
       }
       GetPageResourceDataFunction$PageResourceData pageResource = new GetPageResourceDataFunction$PageResourceData();
       pageResource.count = i;
       pageResource.hyCount = i1;
       pageResource.resources = uArrayList;
       GetPageResourceDataFunction$PageResourceDataResultParam pageResource1 = new GetPageResourceDataFunction$PageResourceDataResultParam();
       pageResource1.data = pageResource;
       return pageResource1;
    }
}
