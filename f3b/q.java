package f3b.q;
import com.yxcorp.gifshow.log.utils.c$a;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.utils.c;
import ukd.a;

public final class q implements c$a	// class@00288e
{
    public final Object a;

    public void q(Object p0){
       this.a = p0;
    }
    public final void a(String p0,String p1){
       q ta = this.a;
       if (!TextUtils.x(p1)) {
          a.o(ta, c.c(p0), p1);
       }
       return;
    }
}
