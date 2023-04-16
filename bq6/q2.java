package bq6.q2;
import io.reactivex.g;
import bq6.x2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import pq6.a;
import java.lang.String;
import bq6.y2;
import op6.a;
import cp6.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import brd.g;

public final class q2 implements g	// class@0005b1
{
    public final x2 b;
    public final AtomicLong c;
    public final AtomicBoolean d;

    public void q2(x2 p0,AtomicLong p1,AtomicBoolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       q2 tb = this.b;
       q2 td = this.d;
       Objects.requireNonNull(tb);
       this.c.set(a.b());
       Object[] objArray = new Object[]{tb.a,y2.a()};
       int i = 0;
       a uoa = h.c(3005, String.format("%s_key_attachment_sync_offset_%s", objArray));
       String str = (uoa != null)? uoa.d(): "";
       if (TextUtils.isEmpty(str) || str.equals("0")) {
          i = true;
       }
       td.set(i);
       p0.onNext(str);
       p0.onComplete();
       return;
    }
}
