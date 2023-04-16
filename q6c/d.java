package q6c.d;
import com.kwai.android.common.intercept.Interceptor;
import java.lang.Object;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.click.ClickChain;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import i6c.f;
import com.kwai.android.common.bean.PushData;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import java.lang.NullPointerException;
import a45.a;

public final class d implements Interceptor	// class@002240
{

    public void d(){
       super();
    }
    public void intercept(Chain p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          a.p(p0, "chain");
          f b = f.b;
          PushData pushData = p0.getPushData();
          if (pushData != null) {
             b.a(pushData);
             p0.proceed();
          }else {
             throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData");
          }
       }
       return;
    }
    public int supportProcess(){
       return a.a(this);
    }
}
