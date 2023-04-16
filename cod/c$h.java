package cod.c$h;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import cod.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public final class c$h implements ViewTreeObserver$OnGlobalLayoutListener	// class@000357
{
    public final c b;
    public final int c;
    public final boolean d;

    public void c$h(c p0,int p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c$h.class, "1")) {
          return;
       }
       this.b.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.D(this.c, this.d);
       return;
    }
}
