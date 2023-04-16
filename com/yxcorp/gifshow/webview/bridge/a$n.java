package com.yxcorp.gifshow.webview.bridge.a$n;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.middleware.facerecognition.model.JsVerifyRealNameInfoParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.middleware.facerecognition.model.JsVerifyRealNameInfoParams$InputData;
import com.yxcorp.gifshow.webview.bridge.e;
import du5.g;
import du5.f;
import e17.i;

public class a$n extends z	// class@00171a
{
    public final a k;

    public void a$n(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$n.class, "1")) {
       }else {
          JsVerifyRealNameInfoParams mInputData = p0.mInputData;
          if (mInputData == null || mInputData.mResult != 1) {
             i.a(R.style.arg_RES_7f110668, 0x7f100d6e);
          }else {
             f.a(this.k.a, new e(this, p0), "ft-platform-JsInject");
          }
       }
       return;
    }
}
