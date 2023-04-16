package com.kuaishou.tachikoma.api.TachikomaBundleApi$1;
import oo8.h;
import com.kuaishou.tachikoma.api.TachikomaBundleApi;
import java.lang.Object;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tw4.a;
import java.lang.Boolean;
import qp8.d;
import java.lang.Integer;

public class TachikomaBundleApi$1 implements h	// class@000f5e
{
    public final TachikomaBundleApi this$0;
    public final h val$bundleCallback;

    public void TachikomaBundleApi$1(TachikomaBundleApi p0,h p1){
       this.this$0 = p0;
       this.val$bundleCallback = p1;
       super();
    }
    public void onBundleLoadFinish(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TachikomaBundleApi$1.class, "1")) {
          return;
       }
       if (a.c.booleanValue()) {
          d.p().l(p0.b, "", "loadBundle");
       }
       TachikomaBundleApi$1 tval$bundleC = this.val$bundleCallback;
       if (tval$bundleC != null) {
          tval$bundleC.onBundleLoadFinish(p0);
       }
       return;
    }
    public void onLoadBundleError(int p0,String p1,String p2){
       if (PatchProxy.isSupport(TachikomaBundleApi$1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TachikomaBundleApi$1.class, "2")) {
          return;
       }
       TachikomaBundleApi$1 tval$bundleC = this.val$bundleCallback;
       if (tval$bundleC != null) {
          tval$bundleC.onLoadBundleError(p0, p1, p2);
       }
       return;
    }
}
