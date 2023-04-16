package e5b.a$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import e5b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import a2.i0;
import android.view.ViewTreeObserver;

public final class a$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@002618
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a a = this.b.a;
       if (a == null) {
          return;
       }
       a.m(a);
       if (!i0.Y(a)) {
          return;
       }
       a = this.b.a;
       a.m(a);
       ViewTreeObserver viewTreeObse = a.getViewTreeObserver();
       if (viewTreeObse != null) {
          viewTreeObse.removeOnGlobalLayoutListener(this);
       }
       this.b.a();
       return;
    }
}
