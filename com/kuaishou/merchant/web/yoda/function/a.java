package com.kuaishou.merchant.web.yoda.function.a;
import f55.g;
import com.kuaishou.merchant.web.yoda.function.b;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.merchant.web.yoda.function.SelectIdCardFunction$Result;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.c;
import com.kwai.feature.post.api.feature.bridge.JsSelectImageResult;

public class a implements g	// class@0009e3
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "2")) {
          return;
       }
       SelectIdCardFunction$Result result = new SelectIdCardFunction$Result(null);
       result.mResult = 0x1e850;
       a tb = this.b;
       tb.o.l(tb.k, result, tb.l, tb.m, null, tb.n);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       SelectIdCardFunction$Result result = new SelectIdCardFunction$Result(null);
       if (p0 instanceof JsSelectImageResult) {
          result.mResult = 1;
          result.mData = p0.mImageDatas;
       }
       p0 = this.b;
       p0.o.l(p0.k, result, p0.l, p0.m, "", p0.n);
       return;
    }
}
