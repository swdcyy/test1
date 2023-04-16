package com.yxcorp.gifshow.commercial.AdOverScrollWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.webkit.WebView;
import android.widget.AbsoluteLayout;

public final class AdOverScrollWebView extends KwaiYodaWebView	// class@001115
{
    public boolean u;
    public HashMap v;

    public void AdOverScrollWebView(Context p0){
       super(p0, null);
    }
    public void AdOverScrollWebView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public final boolean getMIsOverScrolled(){
       return this.u;
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(AdOverScrollWebView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, AdOverScrollWebView.class, "4")) {
          return;
       }
       if (p3) {
          this.u = true;
       }
       super.onOverScrolled(p0, p1, p2, p3);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdOverScrollWebView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       if (!p0.getActionMasked()) {
          this.u = false;
       }
       return super.onTouchEvent(p0);
    }
    public final void setMIsOverScrolled(boolean p0){
       this.u = p0;
    }
    public final boolean x(){
       Object obj = PatchProxy.apply(null, this, AdOverScrollWebView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (((float)(this.getContentHeight() - i) * this.getScale()) - (float)this.getHeight() > 0) {
          i = false;
       }
       return i;
    }
    public final void y(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdOverScrollWebView.class, "2")) {
          return;
       }
       if (p0 != null && this.x()) {
          p0.offsetLocation(0, 0x3f800000);
          super.onTouchEvent(p0);
       }
       return;
    }
}
