package jc9.t;
import erd.g;
import jc9.b0;
import lc9.b;
import java.lang.Object;
import java.util.Objects;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import nc9.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import hc9.e;

public final class t implements g	// class@00294c
{
    public final b0 b;
    public final int c;
    public final b d;

    public void t(b0 p0,int p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       t tb = this.b;
       t tc = this.c;
       t td = this.d;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("AutoDownloadBarHandler", "onPrepare, subscribe state:"+tc, objArray);
       if (TextUtils.x(a.b(p0))) {
          tb.e.c(null, 0);
       }else if(tc == 1){
          tb.e.d(2, p0);
       }else {
          b0 e = tb.e;
          int i = (td.h(p0))? 3: 5;
          e.d(i, p0);
       }
       return;
    }
}
