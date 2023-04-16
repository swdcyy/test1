package ah8.g;
import java.lang.Runnable;
import com.mini.plcmanager.live.a;
import java.lang.ref.WeakReference;
import com.mini.widget.capsule.a;
import android.view.ViewGroup;
import com.mini.plcmanager.PlcModel;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import nf8.d;
import n88.b;
import ah8.i;
import nf8.j;

public final class g implements Runnable	// class@00009b
{
    public final a b;
    public final WeakReference c;
    public final a d;
    public final ViewGroup e;
    public final int f;
    public final PlcModel g;

    public void g(a p0,WeakReference p1,a p2,ViewGroup p3,int p4,PlcModel p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       g te = this.e;
       g tf = this.f;
       g tg = this.g;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{tc,td,te,Integer.valueOf(tf),tg};
          if (PatchProxy.applyVoid(objArray, tb, uoa, "3")) {
          label_0048 :
             return;
          }
       }
       tb.f.R().g6(tc, td, te, tf, new i(tb, tc, tg), 1);
       goto label_0048 ;
    }
}
