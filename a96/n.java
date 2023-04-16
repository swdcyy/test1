package a96.n;
import io.reactivex.g;
import com.kwai.framework.krn.init.preload.e;
import com.kwai.framework.krn.init.preload.e$i;
import com.kwai.framework.krn.init.network.RequestConfig;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.kwai.framework.krn.init.preload.f;
import brd.g;
import njd.a;
import com.kwai.framework.krn.init.preload.a;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;

public final class n implements g	// class@000050
{
    public final e b;
    public final e$i c;
    public final RequestConfig d;

    public void n(e p0,e$i p1,RequestConfig p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       Objects.requireNonNull(tb);
       tc.d = new f(tb, p0);
       e$i a = tc.a;
       if (a != null) {
          p0.onNext(a);
          p0.onComplete();
          e$i a1 = tc.a;
          String str = 1;
          if (a1 == null || a1.b() != str) {
             str = null;
          }
          if (str) {
             a.M().F("\x27\x02 \x54\x02\x4e\x02\x98\x02\x8b\x02\x6c\x02\xff\x02\x4e\x02\x8b\x02\x6c\x02\x5d\x02\x56\x02\x53\x02\xff\x02URL\x66\x02: \n \x00"+td.getUrl());
          }else {
             a.M().F("\x27\x02 \x54\x02\x4e\x02\x98\x02\x8b\x02\x6c\x02\xff\x02\x4f\x02\x8b\x02\x6c\x02\x59\x02\x8d\x02\x4e\x02\xff\x02URL\x66\x02: \n \x00"+td.getUrl()+"\nÕ¯¬Á¥ÌŒÛ–≈œ¢: \n"+tc.a.c());
          }
          tb.f.remove(td);
       }else {
          a.M().F("\x27\x02 \x54\x02\x4e\x02\x98\x02\x8b\x02\x6c\x02\xff\x02\x4f\x02\x8b\x02\x6c\x02\x8f\x02\x67\x02\x56\x02\x53\x02\xff\x02URL\x66\x02: \n \x00"+td.getUrl());
       }
       return;
    }
}
