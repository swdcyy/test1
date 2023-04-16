package com.kwai.library.push.utils.c;
import com.kwai.library.push.model.InAppNotification;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import com.kwai.library.push.utils.InPushSettingExt;
import my6.d;
import oy6.a;
import com.kwai.library.push.utils.b;
import java.lang.Runnable;
import ekd.k1;
import ny6.a;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kwai.library.push.http.InPushApiExt;

public class c	// class@0008dc
{

    public static void a(InAppNotification p0){
       Object[] objArray = new Object[]{Integer.valueOf(0x2721)};
       c.e(String.format("errorCode={%s}, queue is full", objArray), 0x2721, p0);
    }
    public static void b(String p0,InAppNotification p1){
       c.e(p0, 0x2719, p1);
    }
    public static void c(String p0){
       c.e(p0, 0x2714, null);
    }
    public static void d(String p0){
       boolean b;
       a a = InPushSettingExt.a;
       if (a != null) {
          d uod = a.a();
          if (uod != null) {
             b = uod.c();
          label_0010 :
             if (b) {
                k1.o(new b(p0));
             }
             return;
          }
       }
       b = false;
       goto label_0010 ;
    }
    public static void e(String p0,int p1,InAppNotification p2){
       a.b(p0);
       if (p2 != null && p2.getIsFromKlink()) {
          a.p(p2, "notification");
          if (p2.getIsFromKlink()) {
             String msgId = p2.getMsgId();
             a.o(msgId, "it.msgId");
             String back = p2.getBack();
             a.o(back, "it.back");
             InPushApiExt.d(a.b.a(msgId, back, String.valueOf(p1), InPushSettingExt.e()));
          }
       }
       c.d(p0);
       return;
    }
    public static void f(String p0,InAppNotification p1){
       c.e(p0, 0x2713, p1);
    }
    public static void g(String p0,InAppNotification p1){
       c.e(p0, 0x2715, p1);
    }
}
