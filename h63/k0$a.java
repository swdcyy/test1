package h63.k0$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import h63.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;

public class k0$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@002c87
{
    public final k0 b;

    public void k0$a(k0 p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, k0$a.class, "1")) {
          return;
       }
       this.b.P8();
       this.b.D.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
