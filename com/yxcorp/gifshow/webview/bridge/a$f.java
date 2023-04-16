package com.yxcorp.gifshow.webview.bridge.a$f;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.component.JsStartVibrateParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.ka;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;

public class a$f extends z	// class@001712
{
    public final a k;

    public void a$f(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
       }else {
          JsStartVibrateParams mStrength = p0.mStrength;
          int i = 2;
          if (mStrength == i) {
             ka.b(this.e(), new long[i]{0,40}, -1);
          }else if(mStrength == 3){
             ka.b(this.e(), new long[i]{10,500}, -1);
          }
          this.d(p0.mCallback, new JsSuccessResult());
       }
       return;
    }
}
