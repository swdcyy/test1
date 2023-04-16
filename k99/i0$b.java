package k99.i0$b;
import android.view.View$OnClickListener;
import k99.i0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import androidx.recyclerview.widget.RecyclerView;
import tyc.q4;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import k99.i0$b$a;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class i0$b implements View$OnClickListener	// class@002b80
{
    public final i0 b;

    public void i0$b(i0 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$b.class, "1")) {
          return;
       }
       if (i0.P8(this.b).get() != null) {
          RecyclerView recyclerView = i0.P8(this.b).get();
          q4.c(recyclerView);
          if (q4.a(recyclerView) == 1) {
             i0 q = this.b.q;
             if (q == null) {
                a.S("mAtlasScrollRef");
             }
             q.set(Integer.valueOf(0));
             recyclerView.post(new i0$b$a(recyclerView));
          }
       }
       return;
    }
}
