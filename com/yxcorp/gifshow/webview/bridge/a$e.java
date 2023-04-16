package com.yxcorp.gifshow.webview.bridge.a$e;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationResult$JsLocationData;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationResult;

public class a$e extends z	// class@001711
{
    public final a k;

    public void a$e(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          JsLocationResult$JsLocationData jsLocationDa = new JsLocationResult$JsLocationData();
          LocationCityInfo locationCity = u.d();
          if (locationCity == null) {
             this.d(p0.mCallback, new JsLocationResult(412, jsLocationDa));
          }else {
             jsLocationDa.mLatitude = locationCity.mLatitude;
             jsLocationDa.mLongitude = locationCity.mLongitude;
             this.d(p0.mCallback, new JsLocationResult(1, jsLocationDa));
          }
       }
       return;
    }
}
