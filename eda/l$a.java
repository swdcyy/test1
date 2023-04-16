package eda.l$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import eda.l;
import eda.l$b;
import com.yxcorp.gifshow.util.rx.RxBus;

public class l$a	// class@00265a
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;

    public void l$a(String p0){
       super();
       this.f = p0;
    }
    public static l$a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          return new l$a(p0);
       }
       throw new IllegalArgumentException("必须传入登录触发来源");
    }
    public l$a b(){
       this.d = true;
       return this;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "2")) {
          return;
       }
       l ol = new l(this);
       l$b g = l.g;
       if (g != null) {
          g.onSendLoginEvent(this.f);
       }
       RxBus.f.b(ol);
       return;
    }
}
