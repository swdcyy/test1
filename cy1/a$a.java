package cy1.a$a;
import com.yxcorp.gifshow.widget.m;
import cy1.a;
import y8c.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import n17.a;

public class a$a extends m	// class@001ea8
{
    public final f c;
    public final a d;

    public void a$a(a p0,f p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a w = this.d.w;
       if (w != null) {
          a$a tc = this.c;
          w.a(tc.itemView, tc.getLayoutPosition(), this.c);
       }
       return;
    }
}
