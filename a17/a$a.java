package a17.a$a;
import java.lang.Runnable;
import a17.a;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Path$Direction;

public final class a$a implements Runnable	// class@00000b
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       a d;
       a e;
       a$a tb = this.b;
       tb.a.set(0, 0, (float)tb.f().getMeasuredWidth(), (float)this.b.f().getMeasuredHeight());
       this.b.b.reset();
       tb = this.b;
       float[] uofloatArray = new float[]{d,d,d,d,e,e,e,e};
       d = tb.d;
       e = tb.e;
       tb.b.addRoundRect(tb.a, uofloatArray, Path$Direction.CCW);
    }
}
