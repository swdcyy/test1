package com.yxcorp.gifshow.webview.bridge.c;
import f55.g;
import com.yxcorp.gifshow.webview.bridge.a$l;
import com.yxcorp.gifshow.webview.jsmodel.JsCallbackParams;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;

public class c implements g	// class@001721
{
    public final JsCallbackParams b;
    public final a$l c;

    public void c(a$l p0,JsCallbackParams p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, c.class, "2")) {
          return;
       }
       this.c.d(this.b.mCallback, new JsErrorResult(p0, p1));
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.c.d(this.b.mCallback, new JsSuccessResult());
       return;
    }
}
