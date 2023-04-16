package aj4.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import aj4.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements ViewTreeObserver$OnGlobalLayoutListener	// class@00008c
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public final void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.b.q9();
       this.b.t9();
       return;
    }
}
