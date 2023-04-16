package ef9.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ef9.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import android.view.ViewTreeObserver;

public final class d$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@002135
{
    public final d b;
    public final View c;

    public void d$a(d p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       if (this.c.getHeight() > 0) {
          this.b.b = (float)n.p(this.c)[1];
          this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this.b.d);
          this.b.d = null;
       }
       return;
    }
}
