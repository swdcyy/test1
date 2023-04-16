package bu7.u;
import erd.g;
import com.kwai.tokenshare.KwaiTokenInitModule;
import java.lang.Object;
import zca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import lc5.b;
import com.kwai.sdk.switchconfig.a;
import j4d.b;
import com.yxcorp.utility.Log;

public final class u implements g	// class@00049d
{
    public final KwaiTokenInitModule b;

    public void u(KwaiTokenInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, KwaiTokenInitModule.class, "6")) {
       }else if(KwaiTokenInitModule.B && tb.q != null){
          p0 = new Object[]{"KwaiTokenInitModule"};
          String[] stringArray = new String[]{"kwai_token"};
          b.h(b.b(null, "receive PermissionDialogDisappearEvent and run task", null, p0), stringArray);
          if (a.t().d("enableOnlineParseToken", 0)) {
             tb.q.L1();
             Log.g("KwaiTokenInitModule", "handlePermissionDialogDisappearEvent 执行无限口令剪切板读取");
          }else {
             tb.q.M1();
             Log.g("KwaiTokenInitModule", "handlePermissionDialogDisappearEvent 执行非无限口令剪切板读取");
          }
          Log.g("KwaiTokenInitModule", "handlePermissionDialogDisappearEvent 执行非无限口令剪切板读取");
       }
       return;
    }
}
