package ox0.o$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ox0.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewTreeObserver;

public final class o$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0035c9
{
    public final o b;

    public void o$b(o p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, o$b.class, "1")) {
          return;
       }
       this.b.d().getViewTreeObserver().removeGlobalOnLayoutListener(this);
       o$b tb = this.b;
       tb.e = null;
       tb.a();
       return;
    }
}
