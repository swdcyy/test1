package com.yxcorp.gifshow.webview.bridge.b;
import f55.g;
import com.yxcorp.gifshow.webview.bridge.a$k;
import com.kwai.feature.api.social.bridge.beans.JsEncryptedNameParams;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import vxc.z;
import com.kwai.feature.api.social.bridge.beans.JsEncryptedNameResult;

public class b implements g	// class@00171f
{
    public final JsEncryptedNameParams b;
    public final a$k c;

    public void b(a$k p0,JsEncryptedNameParams p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "2")) {
          return;
       }
       this.c.d(this.b.mCallback, new JsErrorResult(p0, p1));
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          this.c.d(this.b.mCallback, p0);
       }
       return;
    }
}
