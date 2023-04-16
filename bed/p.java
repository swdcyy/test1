package bed.p;
import erd.o;
import bed.y;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;
import java.lang.Object;
import om6.q;
import java.util.Objects;
import lnc.s6;
import uy5.a;
import q87.c;
import qm6.b$a;
import android.content.Context;
import brd.t;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class p implements o	// class@00041c
{
    public final y b;
    public final SimpleMagicFace c;
    public final String d;

    public void p(y p0,SimpleMagicFace p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       p tb = this.b;
       p tc = this.c;
       p td = this.d;
       Objects.requireNonNull(tb);
       if (s6.H()) {
          Object[] objArray = new Object[0];
          p0 = t.just(new b$a(tb.a, 0));
       }else {
          p0 = p0.y00(tb.a, tc, td);
       }
       return p0;
    }
}
