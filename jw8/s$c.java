package jw8.s$c;
import java.lang.Runnable;
import jw8.s;
import ypc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import jw8.r$a;

public final class s$c implements Runnable	// class@0029cd
{
    public final s b;
    public final a c;

    public void s$c(s p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, s$c.class, "1")) {
          return;
       }
       s$c tb = this.b;
       s b = tb.b;
       if (b != null) {
          b.a(tb.itemView, this.c, tb.getAdapterPosition());
       }
       return;
    }
}
