package cg3.a;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.live.core.basic.utils.e;
import zj2.b;

public final class a implements Runnable	// class@000501
{
    public final RecyclerView b;
    public final int c;
    public final Activity d;
    public final boolean e;

    public void a(RecyclerView p0,int p1,Activity p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       LinearLayoutManager layoutManage = tb.getLayoutManager();
       boolean b = (!e.r(td) || te != null)? true: false;
       b.e(tb, layoutManage, tc, td, b);
       return;
    }
}
