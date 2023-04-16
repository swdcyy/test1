package jz0.c;
import erd.g;
import jz0.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import mk1.h;
import java.util.List;
import mk1.f;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@002c42
{
    public final e b;
    public final String c;
    public final boolean d;

    public void c(e p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c tb = this.b;
       tb.w = false;
       List list = tb.t.c.j(this.c);
       if (this.d != null) {
          if (!q.f(list)) {
             tb.S8(list);
          }else {
             tb.R8(p0);
          }
       }else {
          b.P(tb.p, "[requestToAudienceGift][loadToAudienceGifts] failed , enableRefreshUI == false");
       }
       return;
    }
}
