package ee1.f0;
import z1.a;
import ee1.i0;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import wv4.d1;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class f0 implements a	// class@002104
{
    public final i0 a;
    public final String b;
    public final AtomicReference c;
    public final String d;
    public final String e;

    public void f0(i0 p0,String p1,AtomicReference p2,String p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void accept(Object p0){
       f0 ta = this.a;
       f0 tb = this.b;
       f0 tc = this.c;
       f0 td = this.d;
       f0 te = this.e;
       if (ta.f == null) {
          if (!TextUtils.isEmpty(tb)) {
             p0.f0("subBiz", tb, 1);
          }
          tc.set(p0.E(td));
          if (!TextUtils.isEmpty(tc.get())) {
             ta.f = te;
          }
       }
       return;
    }
}
