package com.yxcorp.gateway.pay.webview.n;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import android.view.View;
import java.lang.Object;
import rv8.p;
import rv8.q;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import com.yxcorp.gateway.pay.webview.WebviewAdjustResizeHelperOpt$2;
import androidx.lifecycle.LifecycleObserver;
import android.view.ViewGroup$LayoutParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Rect;
import android.content.Context;
import lv8.c;
import java.lang.StringBuilder;
import lv8.g;

public class n	// class@0012a5
{
    public View a;
    public int b;
    public ViewGroup$LayoutParams c;
    public boolean d;

    public void n(Activity p0,Lifecycle p1){
       View view = p0.findViewById(0x1020002);
       super();
       if (view != null) {
          this.a = view;
          view.addOnAttachStateChangeListener(new q(this, new p(this)));
          if (p1 != null) {
             p1.addObserver(new WebviewAdjustResizeHelperOpt$2(this));
          }
          this.c = this.a.getLayoutParams();
       }
       return;
    }
    public static void a(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, n.class, "1")) {
          return;
       }
       n on = new n(p0, p0.getLifecycle());
       return;
    }
    public void b(){
       int i;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "4")) {
          return;
       }
       Rect obj = PatchProxy.apply(objArray, this, on, "5");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = new Rect();
          this.a.getWindowVisibleDisplayFrame(obj);
          i = c.a(this.a.getContext()) + (obj.bottom - obj.top);
       }
       g.d("possiblyResizeChildOfContent, usableHeightNow="+i+", mUsableHeightPrevious="+this.b);
       if (i != this.b) {
          boolean height = this.a.getRootView().getHeight();
          int i1 = height - i;
          ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
          this.c = layoutParams;
          if (i1 > (height / 4)) {
             layoutParams.height = height - i1;
             height = true;
          }else {
             layoutParams.height = -1;
             height = false;
          }
          this.d = height;
          this.a.requestLayout();
          this.b = i;
       }
       return;
    }
}
