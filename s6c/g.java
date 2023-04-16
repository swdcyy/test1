package s6c.g;
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
import com.kwai.android.dispatcher.KwaiPush;
import o6c.a;
import androidx.core.app.NotificationCompat$Builder;
import android.graphics.Color;
import java.util.Objects;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import androidx.core.app.NotificationCompat$d;
import java.lang.CharSequence;
import androidx.core.app.NotificationCompat$j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public final class g implements Interceptor	// class@0023ef
{

    public void g(){
       super();
    }
    public void intercept(Chain p0){
       NotificationCompat$Builder notification;
       try{
          g og = g.class;
          if (PatchProxy.applyVoidOneRefs(p0, this, og, "1")) {
          }else {
             a.p(p0, "chain");
             PushLogcat.INSTANCE.i("KwaiPushSDK", "push process notification KwaiPushTypeSubProcessInterceptor run...channel:"+p0.getChannel()+" id:"+p0.getPushData().pushId);
             if (!PatchProxy.applyVoidOneRefs(p0, this, og, "2") && a.a(KwaiPush.INSTANCE)) {
                notification = p0.getNotificationBuilder();
                if (notification != null) {
                   notification.setColor(Color.parseColor("#FF4906"));
                }
             }
             if (!PatchProxy.applyVoidOneRefs(p0, this, og, "3")) {
                PushData pushData = p0.getPushData();
                Objects.requireNonNull(pushData, "null cannot be cast to non-null type com.yxcorp.gifshow.push.model.KwaiPushMsgData");
                NotificationCompat$d uod = new NotificationCompat$d();
                uod.z(pushData.title);
                uod.y(pushData.body);
                notification = p0.getNotificationBuilder();
                if (notification != null) {
                   notification.setStyle(uod);
                }
                if (!PatchProxy.applyVoidOneRefs(p0, this, og, "4")) {
                   NotificationCompat$Builder notification1 = p0.getNotificationBuilder();
                   if (notification1 != null) {
                      notification1.setLargeIcon(BitmapFactory.decodeResource(p0.getContext().getResources(), R.drawable.notification_icon_large));
                   }
                }
                p0.proceed();
             }
          }
       }catch(java.lang.Exception e0){
       }
       return;
    }
    public int supportProcess(){
       return 2;
    }
}
