package com.kwai.yoda.util.a;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import android.view.View;
import java.lang.Object;
import yz7.o;
import yz7.p;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import com.kwai.yoda.util.WebViewAdjustResizeHelper$2;
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
import yz7.n;

public class a	// class@0012f6
{
    public View a;
    public int b;
    public ViewGroup$LayoutParams c;
    public boolean d;

    public void a(Activity p0,Lifecycle p1){
       View view = p0.findViewById(0x1020002);
       super();
       if (view != null) {
          this.a = view;
          view.addOnAttachStateChangeListener(new p(this, new o(this)));
          if (p1 != null) {
             p1.addObserver(new WebViewAdjustResizeHelper$2(this));
          }
          this.c = this.a.getLayoutParams();
       }
       return;
    }
    public static void a(Activity p0){
       Lifecycle lifecycle = null;
       if (PatchProxy.applyVoidOneRefs(p0, lifecycle, a.class, "1")) {
          return;
       }
       if (p0 instanceof LifecycleOwner) {
          lifecycle = p0.getLifecycle();
       }
       a uoa = new a(p0, lifecycle);
       return;
    }
    public void b(){
       int i;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          return;
       }
       Rect obj = PatchProxy.apply(objArray, this, uoa, "5");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = new Rect();
          this.a.getWindowVisibleDisplayFrame(obj);
          i = n.e(this.a.getContext()) + (obj.bottom - obj.top);
       }
       if (i != this.b) {
          int height = this.a.getRootView().getHeight();
          int i1 = height - i;
          ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
          this.c = layoutParams;
          if (i1 > (height / 4)) {
             layoutParams.height = height - i1;
             this.d = true;
          }else {
             layoutParams.height = -1;
             this.d = false;
          }
          this.a.requestLayout();
          this.b = i;
       }
       return;
    }
}
