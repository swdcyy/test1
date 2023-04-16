package com.yxcorp.gifshow.webview.bridge.e$a;
import du5.a;
import com.yxcorp.gifshow.webview.bridge.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.middleware.facerecognition.model.JsVerifyRealNameInfoParams;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import vxc.z;
import java.lang.Integer;
import android.os.Looper;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import com.yxcorp.gifshow.webview.bridge.a$n;
import com.yxcorp.gifshow.webview.bridge.a;
import vxc.w;
import java.lang.Runnable;
import android.app.Activity;

public class e$a implements a	// class@001723
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       e$a ta = this.a;
       ta.b.d(ta.a.mCallback, new JsSuccessResult());
       return;
    }
    public void b(int p0,String p1){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       if (Looper.myLooper() == Looper.getMainLooper()) {
          uoa = this.a;
          uoa.b.d(uoa.a.mCallback, new JsErrorResult(p0, p1));
       }else {
          uoa = this.a;
          uoa.b.k.a.runOnUiThread(new w(this, uoa.a, p0, p1));
       }
       return;
    }
}
