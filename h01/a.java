package h01.a;
import u07.u;
import h01.e;
import java.lang.Runnable;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import t02.a0;
import java.lang.String;
import hm2.a$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public final class a implements u	// class@0025e2
{
    public final e b;
    public final Runnable c;

    public void a(e p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       if (tc != null) {
          tc.run();
       }
       e p = tb.p;
       p.i2.Y7(p, tb.p.i2.Xa(), p.Z2.b().getChildFragmentManager(), "LiveWealthGradeDetailFragment");
       return;
    }
}
