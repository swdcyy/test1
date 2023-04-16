package djc.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.share.widget.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class j implements ViewTreeObserver$OnGlobalLayoutListener	// class@002200
{
    public final d b;

    public void j(d p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.b.n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       ViewGroup$MarginLayoutParams layoutParams = this.b.E.getLayoutParams();
       int i = this.b.r();
       layoutParams.height = i;
       layoutParams.topMargin = d.J - i;
       this.b.E.setLayoutParams(layoutParams);
       return;
    }
}
