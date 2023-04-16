package ed2.a;
import tj3.o;
import ed2.e;
import java.lang.Object;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class a implements o	// class@0026fb
{
    public final e a;

    public void a(e p0){
       this.a = p0;
    }
    public final void a(Map p0){
       a ta = this.a;
       e t = ta.t;
       if (TextUtils.x(t)) {
       }else {
          p0.put("liveAudienceCpuUIFpsInfo", t);
          ta.t = null;
       }
       return;
    }
}
