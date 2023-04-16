package b90.d$b;
import androidx.lifecycle.Observer;
import b90.d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.util.PostUtils;
import e17.i;
import b90.e;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.widget.TextView;
import android.view.View;

public final class d$b implements Observer	// class@000af1
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
       }else {
          d$b tb = this.b;
          a.o(p0, "error");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, d.class, "9")) {
             PostUtils.D("MediaSceneLoadingViewBinder", "loading media scene error: ", p0);
             i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
             if (tb.q.t0()) {
                tb.g.setImageResource(R.drawable.arg_RES_7f0816ed);
                p0.width = a1.e(96.00f);
                p0.height = a1.e(96.00f);
                tb.h.setTextColor(-1);
                tb.m.setTextColor(-1);
                tb.m.setBackgroundResource(R.drawable.arg_RES_7f0815ae);
             }
             tb.d.setVisibility(8);
             tb.c.setVisibility(8);
             tb.f.setVisibility(0);
          }
       }
       return;
    }
}
