package com.kwai.yoda.function.webview.GetLaunchParamsFunction;
import ay7.a;
import com.kwai.yoda.function.webview.GetLaunchParamsFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.function.webview.GetLaunchParamsFunction$GetLaunchResultParams;
import android.widget.AbsoluteLayout;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.model.RunTimeState;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kwai.yoda.model.LaunchModelInternal;
import com.kwai.yoda.bridge.YodaException;

public final class GetLaunchParamsFunction extends a	// class@001247
{
    public static final GetLaunchParamsFunction$a d;

    static {
       GetLaunchParamsFunction.d = new GetLaunchParamsFunction$a(null);
    }
    public void GetLaunchParamsFunction(){
       super();
    }
    public String c(){
       return "getLaunchParams";
    }
    public String d(){
       return "webview";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, GetLaunchParamsFunction.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       GetLaunchParamsFunction$GetLaunchResultParams getLaunchRes = new GetLaunchParamsFunction$GetLaunchResultParams();
       getLaunchRes.mResult = 1;
       String loadUrl = p0.getLoadUrl();
       String str = "";
       if (loadUrl == null) {
          loadUrl = str;
       }
       getLaunchRes.mUrl = loadUrl;
       getLaunchRes.mId = String.valueOf(p0.hashCode());
       LaunchModel launchModel = p0.getLaunchModel();
       if (launchModel != null) {
          RunTimeState runTimeState = p0.getRunTimeState();
          a.h(runTimeState, "webView.runTimeState");
          String bizId = runTimeState.getBizId();
          if (bizId != null) {
             str = bizId;
          }
          getLaunchRes.mBizId = str;
          getLaunchRes.mLaunchOptions = launchModel;
          if (launchModel.getDataParams() != null) {
             getLaunchRes.mData = launchModel.getDataParams();
          }else if(launchModel.getDataStr() != null){
             getLaunchRes.mData = launchModel.getDataStr();
          }
       }
       return getLaunchRes;
    }
}
