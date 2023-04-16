package ar7.p;
import android.view.View$OnAttachStateChangeListener;
import ar7.n;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qp7.d;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class p implements View$OnAttachStateChangeListener	// class@00035a
{
    public final n b;

    public void p(n p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       a.p(p0, "v");
       this.b.p().getViewTreeObserver().addOnGlobalLayoutListener(this.b.n);
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       a.p(p0, "v");
       this.b.p().getViewTreeObserver().removeOnGlobalLayoutListener(this.b.n);
       return;
    }
}
