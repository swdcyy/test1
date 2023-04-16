package c.t.m.g.cv$c;
import android.os.Handler;
import c.t.m.g.cv;
import android.os.Looper;
import android.os.Message;
import android.os.Bundle;
import java.lang.String;
import java.lang.Object;
import com.tencent.map.geolocation.TencentLocationListener;
import c.t.m.g.dv;
import c.t.m.g.cd;
import java.lang.StringBuilder;
import c.t.m.g.ed;
import java.util.Locale;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import java.lang.Throwable;
import android.util.SparseArray;
import com.tencent.map.geolocation.TencentLocation;
import java.util.List;
import java.util.Iterator;
import c.t.m.g.cv$b;

public class cv$c extends Handler	// class@000c29
{
    public final cv a;
    public double b;
    public double c;

    public void cv$c(cv p0,Looper p1){
       this.a = p0;
       super(p1);
       this.b = 0;
       this.c = 0;
    }
    public void handleMessage(Message p0){
       Object[] objArray;
       TencentLocationListener obj;
       cv$c uoc = this;
       Message message = p0;
       Bundle data = p0.getData();
       if (data == null) {
          return;
       }
       switch (message.what){
           case 3101:
           case 3103:
             Message arg1 = message.arg1;
             dv a = dv.a;
             if (arg1 == null) {
                a = message.obj;
             }else {
                cd.c().a("LOC", "callback:"+arg1);
             }
             if (a == null) {
                cd.c().a("LOC", "cbCode:"+arg1);
                return;
             }else if(ed.a){
                ed.a("TxLocationManagerImpl", "user location:"+a.getLatitude()+","+a.getLongitude());
             }
             message = message.what;
             if (message == 3101) {
                int i = 9;
                int i1 = 1;
                int i2 = 0;
                if (uoc.b - a.getLatitude() || uoc.c - a.getLongitude()) {
                   try{
                      objArray = new Object[i];
                      objArray[i2] = Integer.valueOf(arg1);
                      objArray[i1] = (a.getProvider()).substring(i2, i1);
                      objArray[2] = Double.valueOf(a.getLatitude());
                      objArray[3] = Double.valueOf(a.getLongitude());
                      objArray[4] = Double.valueOf(a.getAltitude());
                      objArray[5] = Float.valueOf(a.getAccuracy());
                      objArray[6] = Float.valueOf(a.getBearing());
                      objArray[7] = Float.valueOf(a.getSpeed());
                      objArray[8] = a.getIndoorBuildingFloor();
                      cd.c().a("LOC", String.format(Locale.ENGLISH, "callback:%d,%s,%.6f,%.6f,%.1f,%.2f,%.1f,%.1f,%s", objArray));
                   }catch(java.lang.Exception e0){
                      if (ed.a) {
                         ed.a("TxLocationManagerImpl", "maploc log", e0);
                      }
                   }
                   uoc.b = a.getLatitude();
                   uoc.c = a.getLongitude();
                }
                obj = cv.b(uoc.a);
                _monitor_enter(obj);
                TencentLocationListener tencentLocat = cv.c(uoc.a);
                _monitor_exit(obj);
                if (tencentLocat != null) {
                   if (ed.a) {
                      objArray = new Object[9];
                      objArray[i2] = Integer.valueOf(arg1);
                      objArray[i1] = (a.getProvider()).substring(i2, i1);
                      objArray[2] = Double.valueOf(a.getLatitude());
                      objArray[3] = Double.valueOf(a.getLongitude());
                      objArray[4] = Double.valueOf(a.getAltitude());
                      objArray[5] = Float.valueOf(a.getAccuracy());
                      objArray[6] = Float.valueOf(a.getBearing());
                      objArray[7] = Float.valueOf(a.getSpeed());
                      objArray[8] = a.getIndoorBuildingFloor();
                      ed.a("TxLocationManagerImpl", String.format(Locale.ENGLISH, "callback:%d,%s,%.6f,%.6f,%.1f,%.2f,%.1f,%.1f,%s", objArray));
                   }
                   tencentLocat.onLocationChanged(a, arg1, cv.e().get(arg1));
                }
             }else if(message == 3103){
                if (cv.v(uoc.a) != null) {
                   Iterator iterator = cv.v(uoc.a).iterator();
                   while (iterator.hasNext()) {
                      obj = iterator.next();
                      if (obj != null) {
                         obj.onLocationChanged(a, arg1, cv.e().get(arg1));
                      }
                   }
                   cv.v(uoc.a).clear();
                }
                if (cv.d(uoc.a) == cv$b.c) {
                   uoc.a.a(null);
                   if (ed.a) {
                      ed.b("TxLocationManagerImpl", "remove update!");
                   }
                }
             }
             break;
           case 3102:
             String str = data.getString("name");
             int intx = data.getInt("status");
             String str1 = data.getString("desc");
             Object obj1 = cv.b(uoc.a);
             _monitor_enter(obj1);
             TencentLocationListener tencentLocat1 = cv.c(uoc.a);
             _monitor_exit(obj1);
             if (tencentLocat1 != null) {
                tencentLocat1.onStatusUpdate(str, intx, str1);
             }
             break;
           default:
       }
    label_022e :
       return;
    }
}
