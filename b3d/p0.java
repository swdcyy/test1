package b3d.p0;
import erd.r;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;

public final class p0 implements r	// class@00033d
{
    public final int[] b;
    public final int c;

    public void p0(int[] p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean test(Object p0){
       p0 tb = this.b;
       p0 tc = this.c;
       int i = 0;
       if (p0 instanceof KwaiException) {
          p0 = p0.mErrorCode;
          if (p0 == 0x5f375 || (p0 == 0x5f373 && tb[i] < tc)) {
             tb[i] = tb[i] + 1;
             i = true;
          }
       }
       return i;
    }
}
