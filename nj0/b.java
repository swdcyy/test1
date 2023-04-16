package nj0.b;
import com.facebook.react.bridge.Callback;
import com.kuaishou.krn.delegate.KrnDelegate;
import java.lang.String;
import java.lang.Object;
import je.e;
import java.lang.Boolean;
import td.a;

public final class b implements Callback	// class@00332f
{
    public final KrnDelegate a;
    public final int b;
    public final String[] c;
    public final int[] d;

    public void b(KrnDelegate p0,int p1,String[] p2,int[] p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void invoke(Object[] p0){
       b ta = this.a;
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       KrnDelegate g = ta.g;
       if (g != null && g.onRequestPermissionsResult(tb, tc, td)) {
          ta.g = null;
       }
       return;
    }
    public void invokeNew(Boolean p0,String[] p1){
       a.a(this, p0, p1);
    }
}
