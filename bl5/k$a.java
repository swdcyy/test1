package bl5.k$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import bl5.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import bl5.k$a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;

public class k$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0004dc
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       this.b.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.S8();
       this.b.p.addOnScrollListener(new k$a$a(this));
       return;
    }
}
