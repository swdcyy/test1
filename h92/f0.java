package h92.f0;
import vq5.b;
import h92.i0;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import java.lang.String;
import ekd.x0;
import lnc.o5;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;

public final class f0 implements b	// class@002d07
{
    public final i0 a;

    public void f0(i0 p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       f0 ta = this.a;
       Objects.requireNonNull(ta);
       int i = -1;
       int i1 = o5.b(x0.a(p0, "giftid"), i);
       String str = x0.a(p0, "gifttoken");
       int i2 = o5.b(x0.a(p0, "entrytype"), 0);
       int i3 = o5.b(x0.a(p0, "sourcetype"), 0);
       int i4 = o5.b(x0.a(p0, "panelsource"), 0);
       String str1 = x0.a(p0, "keysource");
       if (i1 != i && !TextUtils.x(str)) {
          Gift gift = a.a(i1);
          if (gift != null) {
             ta.c9(gift, str, i3, i2, i4, str1);
          }
       }
       return;
    }
}
