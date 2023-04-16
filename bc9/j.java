package bc9.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import bc9.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class j implements ViewTreeObserver$OnGlobalLayoutListener	// class@0003f1
{
    public final k b;
    public final boolean c;
    public final int d;

    public void j(k p0,boolean p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       if (this.b.getItemCount() > 0 && !this.b.h0().getChildCount()) {
          return;
       }
       this.b.h0().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (this.c != null) {
          this.b.h0().smoothScrollToPosition(this.d);
       }else {
          this.b.h0().scrollToPosition(this.d);
       }
       return;
    }
}
