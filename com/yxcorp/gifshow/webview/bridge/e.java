package com.yxcorp.gifshow.webview.bridge.e;
import du5.g;
import com.yxcorp.gifshow.webview.bridge.a$n;
import com.kwai.middleware.facerecognition.model.JsVerifyRealNameInfoParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import vxc.z;
import du5.d;
import com.yxcorp.gifshow.webview.bridge.a;
import com.yxcorp.gifshow.webview.bridge.e$a;
import android.app.Activity;
import com.kwai.middleware.facerecognition.model.JsVerifyRealNameInfoParams$InputData;
import du5.a;

public class e implements g	// class@001724
{
    public final JsVerifyRealNameInfoParams a;
    public final a$n b;

    public void e(a$n p0,JsVerifyRealNameInfoParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "2")) {
          return;
       }
       this.b.d(this.a.mCallback, new JsErrorResult(p0, "so load error"));
       return;
    }
    public void b(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       p0.y40(this.b.k.a, this.a.mInputData, new e$a(this));
       return;
    }
}
