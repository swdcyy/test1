package c54.d;
import com.kuaishou.pagedy.b$b;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import ekd.q;
import ot3.l0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class d implements b$b	// class@0004b5
{
    public final int a;
    public final String b;

    public void d(int p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(Map p0,int p1){
       d ta = this.a;
       d tb = this.b;
       boolean b = false;
       if (!q.h(p0)) {
          String str = l0.i("tabId", p0);
          if (l0.e("tabType", p0) == ta && TextUtils.n(str, tb)) {
             b = true;
          }
       }
       return b;
    }
}
