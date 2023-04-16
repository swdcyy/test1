package ifd.h$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ifd.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public class h$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001009
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "1")) {
          return;
       }
       this.b.p.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       this.b.P8(false);
       return;
    }
}
