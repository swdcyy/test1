package g71.a$b;
import gq1.p;
import g71.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.Objects;
import fg6.a;
import g71.a$a;
import com.google.gson.Gson;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;

public final class a$b implements p	// class@00242d
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       a.p(p1, "base64StatisticInfo");
       uob = this.a;
       Objects.requireNonNull(uob);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, uob, uoa, "6")) {
          uob.a(a.a.q(new a$a(p0, p1)));
       }
       return;
    }
}
