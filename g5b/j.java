package g5b.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import a2.i0;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public class j implements ViewTreeObserver$OnGlobalLayoutListener	// class@002a84
{
    public final h b;

    public void j(h p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       if (!i0.Y(this.b.F)) {
          return;
       }
       this.b.o9(false);
       this.b.F.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
