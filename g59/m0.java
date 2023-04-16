package g59.m0;
import erd.g;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import vq4.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class m0 implements g	// class@00240d
{
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public void m0(String p0,String p1,int p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       m0 tb = this.b;
       m0 tc = this.c;
       m0 td = this.d;
       m0 te = this.e;
       p0.F.t2 = "auto_deeplink";
       if (!TextUtils.x(tb)) {
          p0.F.t = tb;
       }
       p0.F.z3 = tc.length();
       p0 = p0.F;
       p0.j = td;
       p0.n = te;
       return;
    }
}
