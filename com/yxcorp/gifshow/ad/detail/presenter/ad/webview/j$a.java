package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j;
import java.lang.Object;
import uxc.f;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import u09.d0;
import erd.g;
import k59.j2;

public class j$a implements WebViewFragment$a	// class@00164e
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.c(this);
    }
    public void b(WebView p0,String p1,boolean p2){
       f.b(this, p0, p1, p2);
    }
    public void c(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, j$a.class, "1")) {
          return;
       }
       j$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, j.class, "2") && ta.b != null) {
          o.z().e(59, ta.b).f(ta.f).d(new d0(ta)).a();
       }
       return;
    }
    public void d(WebView p0,int p1){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, j$a.class, "2")) {
          return;
       }
       j h = this.a.h;
       if (h != null) {
          h.g(p1);
       }
       return;
    }
}
