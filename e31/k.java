package e31.k;
import android.view.View$OnClickListener;
import e31.j$b;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.bottombar.component.widget.d;
import androidx.lifecycle.LiveData;
import z61.b;
import j61.c;

public final class k implements View$OnClickListener	// class@00209d
{
    public final j$b b;

    public void k(j$b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       k tb = this.b;
       if (tb.i != null) {
          d f = tb.f;
          if (f != null && f.getValue() != null) {
             tb.i.a(tb.f.getValue().mFeatureId);
          }
       }
       return;
    }
}
