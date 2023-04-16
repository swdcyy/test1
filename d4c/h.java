package d4c.h;
import erd.g;
import d4c.v;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import kob.r;
import qm9.f0;
import e17.i;

public final class h implements g	// class@0020d1
{
    public final v b;
    public final Music c;

    public void h(v p0,Music p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       p0 = tb.C;
       if (p0 != null) {
          p0.e(tb.D.e40(), tc);
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f10060d);
       return;
    }
}
