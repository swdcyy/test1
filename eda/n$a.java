package eda.n$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import eda.n;
import eda.n$b;
import com.yxcorp.gifshow.util.rx.RxBus;

public class n$a	// class@00265e
{
    public boolean a;
    public final String b;

    public void n$a(String p0){
       super();
       this.b = p0;
    }
    public static n$a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          return new n$a(p0);
       }
       throw new IllegalArgumentException("必须传入登出触发来源");
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, n$a.class, "2")) {
          return;
       }
       n on = new n(this);
       n$b c = n.c;
       if (c != null) {
          c.onSendLogoutEvent(this.b);
       }
       RxBus.f.b(on);
       return;
    }
}
