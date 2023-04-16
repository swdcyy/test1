package gf.g;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import java.lang.Runnable;
import java.lang.Object;
import android.view.ViewTreeObserver;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class g implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener	// class@0020a8
{
    public final View b;
    public ViewTreeObserver c;
    public final Runnable d;

    public void g(View p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p0.getViewTreeObserver();
       this.d = p1;
    }
    public static g a(View p0,Runnable p1){
       g obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new g(p0, p1);
       p0.getViewTreeObserver().addOnPreDrawListener(obj);
       p0.addOnAttachStateChangeListener(obj);
       return obj;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       if (this.c.isAlive()) {
          this.c.removeOnPreDrawListener(this);
       }else {
          this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       }
       this.b.removeOnAttachStateChangeListener(this);
       return;
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b();
       this.d.run();
       return true;
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       this.c = p0.getViewTreeObserver();
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       this.b();
       return;
    }
}
