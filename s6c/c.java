package s6c.c;
import com.kwai.android.common.intercept.Interceptor;
import s6c.c$a;
import nsd.u;
import java.lang.Object;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.notification.NotificationChain;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.common.bean.PushData;
import java.util.Objects;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import i6c.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import c97.d;
import q97.c;
import java.util.List;
import fg6.a;
import com.google.gson.Gson;
import i6c.a;
import a45.a;

public final class c implements Interceptor	// class@0023eb
{
    public static final c$a a;

    static {
       c.a = new c$a(null);
    }
    public void c(){
       super();
    }
    public void intercept(Chain p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.p(p0, "chain");
          String str = "KwaiPushSDK";
          PushLogcat.INSTANCE.i(str, "push process notification KwaiPrivateMsgInterceptor run...channel:"+p0.getChannel()+" id:"+p0.getPushData().pushId);
          PushData pushData = p0.getPushData();
          Objects.requireNonNull(pushData, "null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData");
          if (TextUtils.equals("PUSH_MESSAGE", k.c(pushData.serverKey, "push_type")) && k.e()) {
             d uod = d.a();
             a.o(uod, "Azeroth.get\(\)");
             uod.f().i(str, "hit private msg drop");
             String str1 = String.valueOf((pushData.mId).hashCode());
             if (!PatchProxy.applyVoidOneRefs(str1, null, k.class, "4")) {
                List list = k.b();
                list.add(str1);
                a.e(a.a.q(list));
             }
          }else {
             p0.proceed();
          }
       }
       return;
    }
    public int supportProcess(){
       return a.a(this);
    }
}
