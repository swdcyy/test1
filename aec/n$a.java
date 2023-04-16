package aec.n$a;
import erd.r;
import java.lang.Object;
import sx5.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.reminder.push.SocialPushKt;

public final class n$a implements r	// class@00010b
{
    public static final n$a b;

    static {
       n$a.b = new n$a();
    }
    public void n$a(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, n$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (SocialPushKt.b(p0) || SocialPushKt.a(p0))? true: false;
       }
       return b;
    }
}
