package s7.b;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.core.app.e;
import java.lang.Exception;
import android.app.NotificationChannel;
import u7.a;
import android.os.Trace;
import s7.a;
import com.android.kwai.platform.notification.core.KwaiNotificationService;
import android.app.Notification;
import android.app.Service;
import android.os.Build$VERSION;
import t7.a;
import java.lang.CharSequence;
import kotlin.Result;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import v7.a;
import kotlin.Pair;
import qrd.r0;
import java.lang.Class;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager;
import java.util.Map;
import gv6.c;
import java.lang.Boolean;
import java.util.List;
import com.android.kwai.platform.notification.core.MethodCallName;
import t7.c;

public final class b	// class@0023f2
{
    public static Context a;
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public static final boolean a(Context p0){
       boolean b;
       try{
          a.p(p0, "context");
          b = e.e(p0).a();
       }catch(java.lang.Exception e0){
          b = false;
       }
       return b;
    }
    public static final void b(int p0){
       try{
          Context a = b.a;
          if (a == null) {
             a.S("context");
          }
          e.e(a).b(p0);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public static final void c(NotificationChannel p0){
       Context a;
       String str = "channel";
       try{
          a.p(p0, str);
          a = b.a;
          if (a == null) {
             a.S("context");
          }
          e.e(a).d(p0);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public static final NotificationChannel e(Context p0,String p1){
       NotificationChannel notification;
       a.p(p0, "context");
       try{
          a.p(p1, "channelId");
          notification = e.e(p0).g(p1);
       }catch(java.lang.Exception e0){
          notification = null;
       }
       return notification;
    }
    public static synchronized final void f(Context p0,a p1){
       Context a;
       _monitor_enter(b.class);
       a.p(p0, "context");
       a.p(p1, "initConfig");
       if (b.a != null) {
          _monitor_exit(b.class);
          return;
       }else {
          p0 = p0.getApplicationContext();
          a.o(p0, "context.applicationContext");
          b.a = p0;
          Trace.beginSection("KwaiNotificationManager.step1");
          p0 = b.a;
          if (p0 == null) {
             a.S("context");
          }
          a.b(p0);
          Trace.endSection();
          b.b.d(p1);
          Trace.beginSection("KwaiNotificationManager.step2");
          KwaiNotificationService d = KwaiNotificationService.d;
          a = b.a;
          if (a == null) {
             a.S("context");
          }
          d.k(a);
          Trace.endSection();
          Trace.beginSection("KwaiNotificationManager.step3");
          Trace.endSection();
          _monitor_exit(b.class);
          return;
       }
    }
    public static final void g(int p0,Notification p1){
       Context a;
       String str = "notification";
       try{
          a.p(p1, str);
          a = b.a;
          if (a == null) {
             a.S("context");
          }
          e.e(a).i(p0, p1);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public static final void i(Service p0,int p1,Notification p2){
       a.p(p0, "service");
       a.p(p2, "notification");
       b.j(p0, p1, p2, -1);
    }
    public static final void j(Service p0,int p1,Notification p2,int p3){
       b b;
       String str = "service";
       a.p(p0, str);
       a.p(p2, "notification");
       if (Build$VERSION.SDK_INT >= 26) {
          String channelId = p2.getChannelId();
          KwaiNotificationService d = KwaiNotificationService.d;
          a.o(channelId, "originId");
          a uoa = d.h(channelId);
          if (uoa != null) {
             d.o(p2, uoa.d());
             if (b.e(p0, uoa.d()) == null) {
                b.c(new NotificationChannel(uoa.d(), channelId, 3));
             }
             b.b.k(p0, p1, p2, p3);
             p0 = Result.constructor-impl(l1.a);
             Result.box-impl(p0);
          }else {
             b = b.b;
             if (d.l()) {
                d.g("前台服务的Channel需要报备,请联系白亚豪!");
                if (b.e(p0, channelId) == null) {
                   b.c(new NotificationChannel(channelId, channelId, 3));
                }
                b.k(p0, p1, p2, p3);
                p0 = Result.constructor-impl(l1.a);
                Result.box-impl(p0);
             }else {
                d.g("禁止前台服务的创建,原因Channel未允许,请检查配置!联系白亚豪!");
                Pair[] pairArray = new Pair[]{r0.a("method", "setForeground"),r0.a(str, String.valueOf(p0.getClass().getCanonicalName())),r0.a("notificationId", String.valueOf(p1)),r0.a("content", p2.toString())};
                a.b(a.c, "logger_set_foreground_warning", "enable hook but not found channel info in white list, and not allow unknown channel create!", pairArray, null, 8, null);
             }
          }
       }else {
          b.b.k(p0, p1, p2, p3);
          Result.constructor-impl(l1.a);
       }
       return;
    }
    public final void d(a p0){
       RemoteConfigManager j = RemoteConfigManager.j;
       j.i().put("apiBuilder", p0.a());
       j.i().put("interruptTakeOverSystem", Boolean.valueOf(p0.d()));
       j.i().put("clientChannelList", p0.b());
       j.i().put("forceRequest", Boolean.valueOf(p0.c()));
       j.f();
    }
    public final c h(MethodCallName p0,c p1){
       a.p(p0, "name");
       a.p(p1, "handler");
       return KwaiNotificationService.d.n(p0, p1);
    }
    public final void k(Service p0,int p1,Notification p2,int p3){
       if (Build$VERSION.SDK_INT >= 29) {
          p0.startForeground(p1, p2, p3);
       }else {
          p0.startForeground(p1, p2);
       }
       return;
    }
}
