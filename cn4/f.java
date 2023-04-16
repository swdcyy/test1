package cn4.f;
import com.yxcorp.gifshow.webview.yoda.g$c;
import com.kuaishou.merchant.web.trilateral.MerchantTrilateralYodaWebViewFragment;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kwai.yoda.YodaWebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.view.View;
import myc.q;
import android.graphics.Bitmap;
import java.lang.Integer;

public class f implements g$c	// class@00049a
{
    public final MerchantTrilateralYodaWebViewFragment b;

    public void f(MerchantTrilateralYodaWebViewFragment p0){
       this.b = p0;
       super();
    }
    public void H(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, f.class, "2")) {
          return;
       }
       this.b.vh().t(p0, p1, p2);
       p0.setProgressVisibility(4);
       if (p2) {
          this.b.s.setVisibility(8);
       }else {
          this.b.s.setVisibility(0);
       }
       return;
    }
    public void L5(){
       q.a(this);
    }
    public void O(WebView p0,String p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "1")) {
          return;
       }
       p0.setProgressVisibility(0);
       this.b.vh().j(p1);
       return;
    }
    public void q0(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, f.class, "3")) {
          return;
       }
       this.b.s.setVisibility(0);
       return;
    }
}
