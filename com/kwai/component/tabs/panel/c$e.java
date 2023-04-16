package com.kwai.component.tabs.panel.c$e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import android.animation.ValueAnimator;
import com.kwai.component.tabs.panel.b;
import java.lang.Object;
import android.view.ViewTreeObserver;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class c$e implements ViewTreeObserver$OnPreDrawListener	// class@000b78
{
    public ViewTreeObserver b;
    public ValueAnimator c;
    public View d;
    public boolean e;

    public void c$e(View p0,ValueAnimator p1,b p2){
       super();
       this.e = true;
       this.d = p0;
       ViewTreeObserver viewTreeObse = p0.getViewTreeObserver();
       this.b = viewTreeObse;
       viewTreeObse.addOnPreDrawListener(this);
       this.c = p1;
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, c$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.removeOnPreDrawListener(this);
       if (this.e == null) {
          this.c.start();
       }
       return true;
    }
}
