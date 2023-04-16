package com.kuaishou.merchant.customerservice.notification.b$b;
import android.os.Handler;
import com.kuaishou.merchant.customerservice.notification.b;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import sv3.a;
import q87.c;
import yv3.f;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
import android.media.SoundPool;
import com.kuaishou.merchant.customerservice.notification.a;

public class b$b extends Handler	// class@001688
{
    public b a;

    public void b$b(b p0){
       super();
       this.a = p0;
    }
    public void dispatchMessage(Message p0){
       b$b ta;
       Object[] objArray1;
       b b;
       Object[] objArray2;
       b a;
       StringBuilder str1;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       super.dispatchMessage(p0);
       String str = 1541;
       int i = 0;
       Object[] objArray = null;
       switch (p0.what){
           case 1541:
             ta = this.a;
             if (ta != null) {
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(objArray, ta, uob, "7")) {
                   objArray1 = new Object[i];
                   a.C().A("SoundPoolPlayer", "doReleaseFocus", objArray1);
                   b = ta.b;
                   if (b != null) {
                      b.e();
                   }
                }
             }
             break;
           case 1542:
             ta = this.a;
             if (ta != null) {
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(objArray, ta, uob, "2")) {
                   uob = ta.b;
                   if (uob != null && (ta.a != null && ta.c != null)) {
                      if (uob.b() && ta.f != null) {
                         objArray2 = new Object[i];
                         a.C().A("SoundPoolPlayer", "already get sound focus!", objArray2);
                         ta.c.removeMessages(str);
                         ta.a.stop(ta.f);
                         ta.b();
                         ta.a(1000);
                      }else if(ta.b.d()){
                         objArray2 = new Object[i];
                         a.C().A("SoundPoolPlayer", "get sound focus successful!", objArray2);
                         ta.c.removeMessages(str);
                         ta.b();
                         ta.a(1000);
                      }
                   }
                   ta.h.set(i);
                }
             }
             break;
           case 1543:
             ta = this.a;
             if (ta != null) {
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(objArray, ta, uob, "4")) {
                   uob = ta.a;
                   if (uob != null && ta.c != null) {
                      b f = ta.f;
                      if (f != null) {
                         uob.stop(f);
                         ta.c.removeMessages(str);
                         ta.c.sendEmptyMessage(str);
                      }
                   }
                }
             }
             break;
           case 1544:
             ta = this.a;
             if (ta != null) {
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(objArray, ta, uob, "5")) {
                   uob = ta.a;
                   if (uob != null) {
                      b = ta.f;
                      if (b != null) {
                         uob.pause(b);
                      }
                   }
                }
             }
             break;
           case 1545:
             ta = this.a;
             if (ta != null) {
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(objArray, ta, uob, "6")) {
                   uob = ta.a;
                   if (uob != null) {
                      b = ta.f;
                      if (b != null) {
                         uob.resume(b);
                      }
                   }
                }
             }
             break;
           case 1546:
             ta = this.a;
             if (ta != null) {
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(objArray, ta, uob, "8")) {
                   objArray1 = new Object[i];
                   a.C().A("SoundPoolPlayer", "doTurnUp", objArray1);
                   ta.e = 0x3f800000;
                   a = ta.a;
                   if (a != null) {
                      b = ta.f;
                      if (b != null) {
                         a.setVolume(b, 0x3f800000, 0x3f800000);
                      }
                   }
                }
             }
             break;
           case 1547:
             ta = this.a;
             if (ta != null) {
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(objArray, ta, uob, "9")) {
                   objArray1 = new Object[i];
                   a.C().A("SoundPoolPlayer", "doTurnDown", objArray1);
                   ta.e = 0x3f000000;
                   a = ta.a;
                   if (a != null) {
                      b = ta.f;
                      if (b != null) {
                         a.setVolume(b, 0x3f000000, 0x3f000000);
                      }
                   }
                }
             }
             break;
           case 1548:
             ta = this.a;
             if (ta != null) {
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(objArray, ta, uob, "10")) {
                   Object[] objArray3 = new Object[i];
                   a.C().A("SoundPoolPlayer", "doCheckNext", objArray3);
                   uob = ta.g;
                   _monitor_enter(uob);
                   if (uob.a <= null) {
                      _monitor_exit(uob);
                      str1 = null;
                   }else {
                      str1 = 1;
                      uob.a = uob.a - str1;
                      _monitor_exit(uob);
                   }
                   if (str1) {
                      objArray3 = new Object[i];
                      a.C().A("SoundPoolPlayer", ta.g+"times to play , begin startJob", objArray3);
                      ta.d();
                   }
                   ta.i.set(i);
                }
             }
             break;
           default:
       }
    label_01ce :
       return;
    }
}
