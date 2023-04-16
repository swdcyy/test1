package com.android.kwai.platform.notification.core.KwaiNotificationService$install$2;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.reflect.Method;
import msd.l;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.android.kwai.platform.notification.core.KwaiNotificationService;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import t7.b;
import nsd.s0;
import qrd.l1;
import android.app.NotificationChannel;

public final class KwaiNotificationService$install$2 extends Lambda implements q	// class@000403
{
    public static final KwaiNotificationService$install$2 INSTANCE;

    static {
       KwaiNotificationService$install$2.INSTANCE = new KwaiNotificationService$install$2();
    }
    public void KwaiNotificationService$install$2(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return this.invoke(p0, p1, p2);
    }
    public final Object invoke(Method p0,Object[] p1,l p2){
       l1 ol1;
       a.p(p0, "method");
       a.p(p2, "jPoint");
       KwaiNotificationService d = KwaiNotificationService.d;
       if (KwaiNotificationService.a(d)) {
          AzerothCodeAdapter.b.logI("KwaiNotifyService", "Force method hook disable, not hook method: "+p0.getName());
          return p2.invoke(p1);
       }else {
          String name = p0.getName();
          if (name != null) {
             switch (name.hashCode()){
                 case 0x90512092:
                   if (name.equals("deleteNotificationChannelGroup")) {
                   label_00cf :
                      ol1 = d.i(p0, p1, p2);
                   label_00d8 :
                      return ol1;
                   }
                   break;
                 case 0xbde10661:
                   if (name.equals("enqueueNotificationWithTag")) {
                      if (!KwaiNotificationService.b(d).e(p0, p1)) {
                         d.f(p1, s0.q(p2, 1));
                      }
                      ol1 = l1.a;
                      goto label_00d8 ;
                   }
                   break;
                 case 0xc2449a62:
                   if (name.equals("getNotificationChannel")) {
                      if (Build$VERSION.SDK_INT >= 26 && !KwaiNotificationService.b(d).e(p0, p1)) {
                         ol1 = d.j(p1, s0.q(p2, 1));
                         goto label_00d8 ;
                      }else {
                         ol1 = null;
                         goto label_00d8 ;
                      }
                   }
                   break;
                 case 0xef2f74f7:
                   if (name.equals("createNotificationChannels")) {
                      if (Build$VERSION.SDK_INT >= 26 && !KwaiNotificationService.b(d).e(p0, p1)) {
                         d.c(p1, s0.q(p2, 1));
                      }
                      ol1 = l1.a;
                      goto label_00d8 ;
                   }
                   break;
                 case 0x3c1c11ed:
                   if (name.equals("deleteNotificationChannel")) {
                      goto label_00cf ;
                   }
                   break;
                 case 0x3eae8ed6:
                   if (name.equals("getNotificationChannelGroups")) {
                      goto label_00cf ;
                   }
                   break;
                 case 0x7de4993d:
                   if (name.equals("getNotificationChannelGroup")) {
                      goto label_00cf ;
                   }
                   break;
                 default:
             }
          }
          ol1 = p2.invoke(p1);
          goto label_00d8 ;
       }
    }
}
