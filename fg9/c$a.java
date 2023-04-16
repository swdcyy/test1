package fg9.c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import fg9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import a2.i0;
import android.view.ViewTreeObserver;

public class c$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@002313
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       if (!i0.Y(this.b.o)) {
          return;
       }
       this.b.o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       c$a tb = this.b;
       tb.s = (int)tb.o.getTranslationY();
       return;
    }
}
