package k59.h1;
import erd.g;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vq4.d;

public final class h1 implements g	// class@002ae2
{
    public final String b;
    public final String c;

    public void h1(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h1 tb = this.b;
       h1 tc = this.c;
       if (!TextUtils.x(tb)) {
          p0.F.t = tb;
       }
       c f = p0.F;
       int i = (tc != null)? tc.length(): 0;
       f.z3 = i;
       p0.t2 = "click_deeplink";
       return;
    }
}
