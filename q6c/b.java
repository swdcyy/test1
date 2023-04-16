package q6c.b;
import com.kwai.android.common.intercept.Interceptor;
import java.lang.Object;
import com.kwai.android.register.core.click.ClickChain;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.PushData;
import java.util.Objects;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.net.Uri;
import ekd.x0;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import xh7.b;
import java.lang.Boolean;
import xh7.a;
import q6c.b$a;
import qh7.b;
import qh7.a;
import com.kwai.android.common.intercept.Chain;
import a45.a;

public final class b implements Interceptor	// class@00223e
{

    public void b(){
       super();
    }
    public void a(ClickChain p0){
       Uri uri;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "chain");
       PushData pushData = p0.getPushData();
       Objects.requireNonNull(pushData, "null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData");
       PushData pushData1 = pushData;
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       pushData = p0.getPushData().uri;
       a.o(pushData, "chain.pushData.uri");
       objectRef.element = pushData;
       uri = x0.f(pushData);
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       b uob = b.j(uoc.a(), objectRef.element);
       a.o(uob, "UriRequest.create\(AppEnv¡­ppContext, pushUriString\)");
       uob.h("com.kwai.platform.krouter.return_intent", Boolean.TRUE);
       b$a uoa = new b$a(this, uri, objectRef, pushData1, p0);
       a.b(uob, v1);
       return;
    }
    public void intercept(Chain p0){
       this.a(p0);
    }
    public int supportProcess(){
       return a.a(this);
    }
}
