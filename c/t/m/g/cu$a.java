package c.t.m.g.cu$a;
import android.os.Handler;
import c.t.m.g.cu;
import android.os.Looper;
import android.os.Message;
import c.t.m.g.ed;
import java.lang.String;
import c.t.m.g.cd;
import java.lang.StringBuilder;
import android.location.GpsStatus;
import java.util.ArrayList;
import c.t.m.g.co;
import java.util.List;
import java.lang.Throwable;
import java.lang.System;
import android.location.Location;
import c.t.m.g.ce;
import android.content.Context;
import java.util.Locale;
import java.lang.Object;
import java.lang.Double;
import java.lang.Float;

public class cu$a extends Handler	// class@000c23
{
    public final cu a;

    public void cu$a(cu p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public final void a(Message p0){
       Object[] objArray;
       cu$a a1;
       long l;
       Handler handler = this;
       Message message = p0;
       handler.removeMessages(message.what);
       String str = -1;
       double d = 0;
       int i = 4;
       int i1 = 1;
       int i2 = 0;
       switch (message.what){
           case 1101:
             message = message.obj;
             if (message == null) {
                cd.c().a("G", "gl null");
                return;
             }else if(cu.a(handler.a, message)){
                cu$a a = handler.a;
                if (!cu.a(a, cu.a(a).a, message)) {
                   a = handler.a;
                   boolean b = cu.a(a, message, cu.b(a));
                   cu.b(handler.a, message);
                   int i3 = 7;
                   if (b) {
                      if (ed.a) {
                         ed.a("TxGpsProvider", message.getLatitude()+","+message.getLongitude()+",isFilter="+b);
                      }
                      objArray = new Object[i3];
                      objArray[i2] = Double.valueOf(message.getLatitude());
                      objArray[i1] = Double.valueOf(message.getLongitude());
                      objArray[2] = Double.valueOf(message.getAltitude());
                      objArray[3] = Float.valueOf(message.getAccuracy());
                      objArray[i] = Float.valueOf(message.getBearing());
                      objArray[5] = Float.valueOf(message.getSpeed());
                      objArray[6] = "f";
                      cd.c().a("G", String.format(Locale.ENGLISH, "l,%.6f,%.6f,%.1f,%.1f,%.1f,%.1f,%s", objArray));
                      return;
                   }else if(!cu.c(handler.a, message)){
                      if (ed.a) {
                         objArray = new Object[i3];
                         objArray[i2] = Double.valueOf(message.getLatitude());
                         objArray[i1] = Double.valueOf(message.getLongitude());
                         objArray[2] = Double.valueOf(message.getAltitude());
                         objArray[3] = Float.valueOf(message.getAccuracy());
                         objArray[i] = Float.valueOf(message.getBearing());
                         objArray[5] = Float.valueOf(message.getSpeed());
                         objArray[6] = "f";
                         ed.a("TxGpsProvider", "this location is consider nlp:"+String.format(Locale.ENGLISH, "l,%.6f,%.6f,%.1f,%.1f,%.1f,%.1f,%s", objArray));
                      }
                      objArray = new Object[i3];
                      objArray[i2] = Double.valueOf(message.getLatitude());
                      objArray[i1] = Double.valueOf(message.getLongitude());
                      objArray[2] = Double.valueOf(message.getAltitude());
                      objArray[3] = Float.valueOf(message.getAccuracy());
                      objArray[i] = Float.valueOf(message.getBearing());
                      objArray[5] = Float.valueOf(message.getSpeed());
                      objArray[6] = "nf";
                      cd.c().a("G", String.format(Locale.ENGLISH, "l,%.6f,%.6f,%.1f,%.1f,%.1f,%.1f,%s", objArray));
                      return;
                   }else {
                      cu.d(handler.a, message);
                      cu.c(handler.a);
                      cu uocu = cu.class;
                      _monitor_enter(uocu);
                      a1 = handler.a;
                      cu.a(a1, (cu.d(a1) | 2));
                      _monitor_exit(uocu);
                      if (!cu.e(handler.a) - str || !cu.e(handler.a) - d) {
                         cu.a(handler.a, i1);
                         cu.a(handler.a, System.currentTimeMillis());
                      }
                   }
                }
             }
             cd.c().a("G", "gl inRegular");
             break;
           case 1102:
             cu.c(handler.a);
             cd.c().a("G", "vf:"+cu.f(handler.a)+","+cu.g(handler.a));
             cu.h(handler.a);
             if (cu.i(handler.a) != null && (cu.j(handler.a) != null && cu.j(handler.a).size() > 0)) {
                i2 = cu.k(handler.a).a(cu.j(handler.a), cu.f(handler.a));
             }
          label_00ca :
             if (i2) {
                if (!cu.e(handler.a) - str || !cu.e(handler.a) - d) {
                   cu.a(handler.a, i2);
                }
                cu.a(handler.a, System.currentTimeMillis());
             }else if(!cu.e(handler.a) - str || ((System.currentTimeMillis() - cu.e(handler.a)) - 0x9c40 > 0 && cu.e(handler.a) - d)){
                cu.a(handler.a, i2);
                cu.a(handler.a, d);
             }
             l = System.currentTimeMillis();
             if (!cu.l(handler.a) && (cu.f(handler.a) > 10 && (cu.f(handler.a) < 100 && (cu.b(handler.a) != null && (l - cu.b(handler.a).getTime()) - 0xea60 > 0)))) {
                if (ed.a) {
                   ed.b("TxGpsProvider", "Visible num:"+cu.f(handler.a)+",usedNum:"+cu.g(handler.a)+",last gps time:"+cu.b(handler.a).getTime());
                }
                cd.c().a("G", "restart gps.");
                cu.m(handler.a);
                cu.n(handler.a);
                cu.b(handler.a, i1);
                if (ed.a) {
                   ed.a("TxGpsProvider", "gps is restart");
                }
             }
             break;
           case 1103:
             if (ed.a) {
                ed.a("TxGpsProvider", "onProviderEnabled: gps is enabled");
             }
             cu.a(handler.a, i);
             cu.o(handler.a);
             break;
           case 1104:
             if (ed.a) {
                ed.a("TxGpsProvider", "onProviderDisabled: gps is disabled");
             }
             a1 = handler.a;
             cu.b(a1, cu.c(a1, i2));
             cu.a(handler.a, i2);
             cu.c(handler.a, i2);
             cu.o(handler.a);
             break;
           default:
       }
    label_0398 :
       return;
    }
    public void handleMessage(Message p0){
       if (p0 == null) {
          return;
       }
       this.a(p0);
       return;
    }
}
