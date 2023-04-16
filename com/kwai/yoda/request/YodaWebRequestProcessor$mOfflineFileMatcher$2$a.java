package com.kwai.yoda.request.YodaWebRequestProcessor$mOfflineFileMatcher$2$a;
import ub7.f;
import com.kwai.yoda.request.YodaWebRequestProcessor$mOfflineFileMatcher$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.request.YodaWebRequestProcessor;
import com.kwai.yoda.model.LaunchModel;
import kotlin.jvm.internal.a;
import com.kwai.yoda.model.LaunchModelInternal;

public final class YodaWebRequestProcessor$mOfflineFileMatcher$2$a implements f	// class@0012cc
{
    public final YodaWebRequestProcessor$mOfflineFileMatcher$2 a;

    public void YodaWebRequestProcessor$mOfflineFileMatcher$2$a(YodaWebRequestProcessor$mOfflineFileMatcher$2 p0){
       this.a = p0;
       super();
    }
    public Object get(){
       List list = PatchProxy.apply(null, this, YodaWebRequestProcessor$mOfflineFileMatcher$2$a.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          LaunchModel launchModel = this.a.this$0.b().getLaunchModel();
          a.h(launchModel, "webView.launchModel");
          list = launchModel.getHyIds();
       }
       return list;
    }
}
