package eod.d$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import eod.d;
import androidx.recyclerview.widget.RecyclerView;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class d$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000db6
{
    public final d b;
    public final RecyclerView c;
    public final int d;
    public final boolean e;
    public final a f;

    public void d$b(d p0,RecyclerView p1,int p2,boolean p3,a p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       if (this.c.getWidth() && (this.c.getHeight() && this.c.getChildCount())) {
          this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.b.F(this.d, this.c, this.e, this.f);
       }
    label_003a :
       return;
    }
}
