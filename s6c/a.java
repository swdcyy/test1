package s6c.a;
import com.kwai.android.common.intercept.Interceptor;
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
import qe6.b;
import com.yxcorp.gifshow.push.badge.b;
import android.content.Context;
import android.app.Notification;
import a45.a;

public final class a implements Interceptor	// class@0023e8
{

    public void a(){
       super();
    }
    public void intercept(Chain p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "chain");
          PushLogcat.INSTANCE.i("KwaiPushSDK", "push process notification KwaiBadgeInterceptor run...channel:"+p0.getChannel()+" id:"+p0.getPushData().pushId);
          PushData pushData = p0.getPushData();
          Objects.requireNonNull(pushData, "null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData");
          if (b.a() && pushData.showBadge != null) {
             b d = b.d;
             Context context = p0.getContext();
             pushData = pushData.badgeCount;
             Objects.requireNonNull(d);
             a.p(context, "context");
             if (pushData <= null) {
                d.c(context, null);
             }else {
                d.a(context, null, pushData);
             }
          }
          p0.proceed();
       }
       return;
    }
    public int supportProcess(){
       return a.a(this);
    }
}
