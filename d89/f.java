package d89.f;
import java.lang.Runnable;
import d89.k;
import android.app.Activity;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Objects;
import kzc.d;
import u07.t$a;
import u07.f;
import java.lang.CharSequence;
import d89.a;
import u07.u;
import d89.b;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;

public final class f implements Runnable	// class@002088
{
    public final k b;
    public final Activity c;
    public final String d;
    public final PublishSubject e;
    public final String f;
    public final Throwable g;

    public void f(k p0,Activity p1,String p2,PublishSubject p3,String p4,Throwable p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       f te = this.e;
       Objects.requireNonNull(tb);
       t$a uoa = f.e(new d(tc));
       uoa.X0(tc.getString(R.string.arg_RES_7f100dce));
       uoa.T0(tc.getString(R.string.arg_RES_7f100dcd));
       uoa.R0(tc.getString(R.string.arg_RES_7f100dcc));
       a uoa1 = new a(tb, tc, this.d, te, this.f);
       uoa.u0(v9);
       uoa.t0(new b(te, this.g));
       uoa.z(false);
       uoa.A(false);
       uoa.v(true);
       uoa.X();
    }
}
