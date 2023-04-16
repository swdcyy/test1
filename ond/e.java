package ond.e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ond.d;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;

public final class e implements ViewTreeObserver$OnGlobalLayoutListener	// class@00202f
{
    public final d b;
    public final a c;

    public void e(d p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.b.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.c.invoke();
       return;
    }
}
