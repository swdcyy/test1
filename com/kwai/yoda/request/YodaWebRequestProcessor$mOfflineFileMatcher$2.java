package com.kwai.yoda.request.YodaWebRequestProcessor$mOfflineFileMatcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.request.YodaWebRequestProcessor;
import gz7.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.model.LaunchModel;
import java.util.List;
import com.kwai.yoda.model.LaunchModelInternal;
import com.kwai.yoda.request.YodaWebRequestProcessor$mOfflineFileMatcher$2$a;
import ub7.f;

public final class YodaWebRequestProcessor$mOfflineFileMatcher$2 extends Lambda implements a	// class@0012cd
{
    public final YodaWebRequestProcessor this$0;

    public void YodaWebRequestProcessor$mOfflineFileMatcher$2(YodaWebRequestProcessor p0){
       this.this$0 = p0;
       super(0);
    }
    public final b invoke(){
       Object[] objArray = null;
       YodaBaseWebView obj = PatchProxy.apply(objArray, this, YodaWebRequestProcessor$mOfflineFileMatcher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.b();
       if (obj != null) {
          LaunchModel launchModel = obj.getLaunchModel();
          if (launchModel != null) {
             objArray = launchModel.getHyIds();
          }
       }
       b uob = (objArray != null)? new b(new YodaWebRequestProcessor$mOfflineFileMatcher$2$a(this)): new b("");
       return uob;
    }
    public Object invoke(){
       return this.invoke();
    }
}
