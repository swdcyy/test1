package an6.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import lnc.p3;
import q87.c;

public final class c implements ViewTreeObserver$OnGlobalLayoutListener	// class@0000e5
{
    public final View b;
    public final Runnable c;

    public void c(View p0,Runnable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       Object[] objArray = new Object[0];
       p3.D().w("home_entrance_bubble", "show bubble while onGlobalLayout !!!", objArray);
       this.c.run();
       return;
    }
}
