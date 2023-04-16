package bl5.f;
import java.lang.Runnable;
import bl5.g;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uk5.a;
import java.lang.Math;
import java.lang.StringBuilder;
import nk5.m;
import androidx.recyclerview.widget.GridLayoutManager;
import bl5.g$d;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class f implements Runnable	// class@0004d1
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, g.class, "5")) {
       }else if(tb.w == null || tb.v == null){
          int measuredWidt = tb.t.getMeasuredWidth();
          if (measuredWidt > 0) {
             int i = a.a(tb.getActivity(), measuredWidt);
             if (Math.abs((i - tb.D)) >= 2) {
                tb.x = measuredWidt;
                tb.D = i;
                m.d("EmojiPage", "reset page columns = "+tb.D);
                tb.w.setSpanCount(tb.D);
                tb.G.f();
                tb.v.k0();
             }
          }
       }
       return;
    }
}
