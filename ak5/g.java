package ak5.g;
import java.lang.Runnable;
import android.app.Application;
import ak5.a;
import java.lang.Object;
import java.lang.String;
import ak5.a$c;
import com.kwai.robust.PatchProxyResult;
import nk5.h;
import nk5.m;
import mk5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jl5.o;
import java.io.File;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.content.Context;
import jl5.v;
import android.text.TextUtils;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.Exception;
import nk5.c;
import nk5.d;
import android.os.Message;
import android.os.Handler;
import java.lang.Boolean;
import nk5.e;
import java.lang.IllegalArgumentException;

public final class g implements Runnable	// class@0000c2
{
    public final Application b;
    public final a c;

    public void g(Application p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e uoe;
       ActivityManager$RunningAppProcessInfo runningAppPr;
       g tb = this.b;
       String str = this.c.a.e();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str1 = "1";
       if (PatchProxy.applyVoidTwoRefs(tb, str, null, a.class, str1)) {
       }else {
          File uFile = PatchProxy.applyTwoRefs(tb, str, null, o.class, str1);
          if (uFile != patchProxyRe) {
          }else if(!TextUtils.x(str)){
             uFile = new File(str);
             if (!uFile.exists() && !uFile.mkdirs()) {
             }
          }else {
          }
       label_0074 :
          if (uFile != null) {
             uFile.getAbsolutePath();
          }
          str = PatchProxy.applyOneRefs(tb, null, v.class, str1);
          if (str != patchProxyRe) {
          }else if(tb != null){
             v.a = tb;
          }
          if (!TextUtils.isEmpty(v.b)) {
             str = v.b;
          }else {
             try{
                int i = Process.myPid();
                ActivityManager systemServic = tb.getSystemService("activity");
                if (systemServic != null) {
                   List runningAppPr1 = systemServic.getRunningAppProcesses();
                   if (runningAppPr1 != null) {
                      Iterator iterator = runningAppPr1.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            ActivityManager$RunningAppProcessInfo runningAppPr2 = iterator.next();
                            if (runningAppPr2.pid == i) {
                               runningAppPr = runningAppPr2.processName;
                               v.b = runningAppPr;
                               break ;
                            }
                         }
                      }
                   }
                }
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
             runningAppPr = null;
          }
          c uoc = new c(uFile.getAbsoluteFile(), "EMOTION_SDK");
          uoc.c = 0x19bfcc00;
          uoc.f = 2;
          d uod = new d(uoc);
          String str2 = TextUtils.k(str);
          if (!PatchProxy.applyVoidThreeRefs(uod, str2, tb, null, m.class, "7")) {
             if (tb != null) {
                m.f = uod;
                m.i = str2;
                Message message = m.h.obtainMessage(0);
                message.obj = tb;
                m.h.sendMessageAtFrontOfQueue(message);
             }else {
                throw new IllegalArgumentException("WTF£¡context is null");
             }
          }
          String str3 = "5";
          if (!PatchProxy.isSupport(m.class) || (!PatchProxy.applyVoidOneRefs(Boolean.TRUE, null, m.class, str3) && (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidTwoRefs("log_control_global_mylog", Boolean.TRUE, null, h.class, "7")))) {
             uoe = h.a("log_control_global_mylog");
             if (uoe != null) {
                uoe.b(true);
             }
          }
          if (!PatchProxy.isSupport(m.class) || (!PatchProxy.applyVoidOneRefs(Boolean.TRUE, null, m.class, "6") && (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidTwoRefs("log_control_global_mylog", Boolean.TRUE, null, h.class, str3)))) {
             uoe = h.a("log_control_global_mylog");
             if (uoe != null) {
                uoe.e(true);
             }
          }
          if (!PatchProxy.isSupport(m.class) || (!PatchProxy.applyVoidOneRefs(Boolean.TRUE, null, m.class, "4") && (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidTwoRefs("log_control_global_mylog", Boolean.TRUE, null, h.class, "3")))) {
             uoe = h.a("log_control_global_mylog");
             if (uoe != null) {
                uoe.a(true);
             }
          }
       }
    label_018f :
       return;
    }
}
