package m59.m;
import erd.g;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vq4.d;

public final class m implements g	// class@002e08
{
    public final String b;
    public final String c;

    public void m(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       m tb = this.b;
       m tc = this.c;
       if (!TextUtils.x(tb)) {
          p0.F.t = tb;
       }
       p0.z3 = tc.length();
       return;
    }
}
