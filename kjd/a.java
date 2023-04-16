package kjd.a;
import com.kuaishou.godzilla.idc.KwaIDCSpeedTestCallback;
import kjd.b;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import mjd.a;

public class a implements KwaIDCSpeedTestCallback	// class@001c0a
{
    public final b a;

    public void a(b p0){
       super();
       this.a = p0;
    }
    public void onTestFinished(String p0,List p1,long p2,long p3){
       if (this.a != null && !q.f(p1)) {
          if (TextUtils.x(p0)) {
             return;
          }else {
             a.c("SpeedTestCallback", "IDCSpeedTestCallback.onTestFinished "+p1.size()+" results for "+p0);
             this.a.a(p0, p1, p2, p3);
          }
       }
       return;
    }
}
