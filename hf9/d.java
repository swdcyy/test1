package hf9.d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import hf9.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public final class d implements ViewTreeObserver$OnGlobalLayoutListener	// class@00263f
{
    public final e b;
    public final int c;

    public void d(e p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.h0().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.h0().scrollToPosition(this.c);
       return;
    }
}
