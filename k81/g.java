package k81.g;
import msd.a;
import k81.h;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import qrd.l1;

public final class g implements a	// class@002cd8
{
    public final h b;
    public final QLiveMessage c;
    public final int d;

    public void g(h p0,QLiveMessage p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object invoke(){
       g tb = this.b;
       tb.a(tb.itemView, this.c, this.d);
       return l1.a;
    }
}
