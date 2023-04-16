package com.yxcorp.gateway.pay.webview.yoda.b$k;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import com.yxcorp.gateway.pay.params.result.JsDeviceInfoResult;
import com.yxcorp.gateway.pay.params.result.JsDeviceInfoResult$DeviceInfo;
import com.yxcorp.gateway.pay.api.PayManager;
import h97.g;
import android.content.Context;
import ekd.p0;
import android.os.Build;
import java.util.Locale;
import lv8.q;
import com.yxcorp.utility.TextUtils;
import com.google.common.base.Optional;

public class b$k extends p0	// class@0012ba
{
    public final b g;

    public void b$k(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$k.class, "1")) {
       }else {
          g.d("bridge: getDeviceInfo");
          JsDeviceInfoResult jsDeviceInfo = new JsDeviceInfoResult();
          JsDeviceInfoResult$DeviceInfo uDeviceInfo = new JsDeviceInfoResult$DeviceInfo();
          g initCommonPa = PayManager.getInstance().getInitCommonParams();
          uDeviceInfo.mAppVersion = initCommonPa.getAppVersion();
          uDeviceInfo.mNetworkType = p0.g(this.g.a);
          uDeviceInfo.mManufacturer = initCommonPa.getManufacturerAndModel();
          uDeviceInfo.mModel = Build.MODEL;
          uDeviceInfo.mSystemVersion = initCommonPa.getSysRelease();
          uDeviceInfo.mLocale = String.valueOf(Locale.getDefault());
          uDeviceInfo.mUUID = initCommonPa.getDeviceId();
          uDeviceInfo.mOaid = initCommonPa.g();
          uDeviceInfo.mImei = TextUtils.I(q.g(this.g.a));
          uDeviceInfo.mAndroidId = q.a(this.g.a).or("");
          uDeviceInfo.mMac = TextUtils.I(q.e(this.g.a));
          uDeviceInfo.mScreenWidth = q.f(this.g.a);
          uDeviceInfo.mScreenHeight = q.d(this.g.a);
          uDeviceInfo.mPaySDKVersion = "3.4.14";
          jsDeviceInfo.mDeviceInfo = uDeviceInfo;
          this.b(p0.mCallback, jsDeviceInfo);
       }
       return;
    }
}
