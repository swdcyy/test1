package cgd.c;
import android.view.View$OnClickListener;
import cgd.b$b;
import bgd.a;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import u07.t$a;
import android.app.Activity;
import com.kwai.framework.cache.a;
import java.lang.CharSequence;
import cgd.d;
import u07.u;
import u07.t;
import u07.j;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.library.widget.button.SlipSwitchButton;

public final class c implements View$OnClickListener	// class@000323
{
    public final b$b b;
    public final a c;
    public final int d;
    public final String e;

    public void c(b$b p0,a p1,int p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onClick(View p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       Objects.requireNonNull(tb);
       if (!tc.b()) {
          b$b j = tb.j;
          if (!PatchProxy.isSupport(b$b.class) || !PatchProxy.applyVoidThreeRefs(j, Integer.valueOf(td), tc, tb, b$b.class, "3")) {
             t$a uoa = new t$a(j);
             uoa.X0(a.d(tc.c(), 2));
             uoa.z0(a.d(tc.c(), 3));
             uoa.S0(R.string.cancel);
             uoa.Q0(R.string.arg_RES_7f104007);
             uoa.t0(new d(tb, tc, td));
             j.d(uoa);
          }
       }else {
          a.q(te, false);
          tb.a(tc, false);
          tb.n.m0(td, Integer.valueOf(999));
          tb.m.setSwitch(false);
       }
       return;
    }
}
