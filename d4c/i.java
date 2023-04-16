package d4c.i;
import erd.g;
import d4c.v;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import kob.r;
import qm9.f0;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class i implements g	// class@0020d2
{
    public final v b;
    public final Music c;

    public void i(v p0,Music p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       p0 = tb.C;
       if (p0 != null) {
          p0.b(tb.D.e40(), tc);
       }
       i.d(R.style.arg_RES_7f110669, a1.r(R.string.arg_RES_7f104bcc, a1.p(R.string.arg_RES_7f103aa5)));
       return;
    }
}
