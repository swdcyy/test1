package com.yxcorp.gifshow.ad.webview.jsbridge.h;
import zl9.e;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import f55.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import o59.x;
import java.lang.Runnable;
import o59.y;

public class h implements e	// class@0018d3
{
    public final g a;
    public final g b;

    public void h(g p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onError(int p0,String p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "2")) {
          return;
       }
       this.b.h(new x(this, this.a, p0, p1));
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.b.h(new y(this, this.a, p0));
       return;
    }
}
