package c35.b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import com.kuaishou.viewbinder.IViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public class b extends RecyclerView$ViewHolder	// class@000409
{
    public final IViewBinder a;

    public void b(View p0,IViewBinder p1){
       a.p(p0, "itemView");
       a.p(p1, "viewBinder");
       super(p0);
       this.a = p1;
    }
    public final IViewBinder a(){
       return this.a;
    }
}
