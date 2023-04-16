package com.yxcorp.gateway.pay.webview.b$k;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
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
import android.app.Activity;

public class b$k extends d	// class@001289
{
    public final b e;

    public void b$k(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$k.class, "1")) {
       }else {
          JsDeviceInfoResult jsDeviceInfo = new JsDeviceInfoResult();
          JsDeviceInfoResult$DeviceInfo uDeviceInfo = new JsDeviceInfoResult$DeviceInfo();
          g initCommonPa = PayManager.getInstance().getInitCommonParams();
          uDeviceInfo.mAppVersion = initCommonPa.getAppVersion();
          uDeviceInfo.mNetworkType = p0.g(this.e.a);
          uDeviceInfo.mManufacturer = initCommonPa.getManufacturerAndModel();
          uDeviceInfo.mModel = Build.MODEL;
          uDeviceInfo.mSystemVersion = initCommonPa.getSysRelease();
          uDeviceInfo.mLocale = String.valueOf(Locale.getDefault());
          uDeviceInfo.mUUID = initCommonPa.getDeviceId();
          uDeviceInfo.mImei = TextUtils.I(q.g(this.e.a));
          uDeviceInfo.mAndroidId = q.a(this.e.a).or("");
          uDeviceInfo.mMac = TextUtils.I(q.e(this.e.a));
          uDeviceInfo.mScreenWidth = q.f(this.e.a);
          uDeviceInfo.mScreenHeight = q.d(this.e.a);
          uDeviceInfo.mPaySDKVersion = "3.4.14";
          jsDeviceInfo.mDeviceInfo = uDeviceInfo;
          this.b(p0.mCallback, jsDeviceInfo);
       }
       return;
    }
}
