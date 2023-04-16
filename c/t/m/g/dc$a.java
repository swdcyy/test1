package c.t.m.g.dc$a;
import android.os.Handler;
import c.t.m.g.dc;
import android.os.Looper;
import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import java.util.Iterator;
import java.lang.Object;
import android.net.wifi.ScanResult;
import java.lang.StringBuilder;
import c.t.m.g.ed;
import java.lang.Throwable;
import java.util.Collection;
import c.t.m.g.dd;
import c.t.m.g.ce;
import c.t.m.g.dj;
import android.os.Message;
import android.content.Intent;

public class dc$a extends Handler	// class@000c3c
{
    public final dc a;

    public void dc$a(dc p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public final void a(){
       List list = dc.g(this.a);
       String str = "";
       if (list == null || list.size() <= 0) {
          if (ed.a) {
             ed.b("TxWifiProvider", "postEvent wifiList is null");
          }
          dc.d(this.a).b(dj.a);
          dc.a(this.a, str);
       }else if(dc.h(this.a) == null){
          dc.a(this.a, new ArrayList());
       }
       dc.a(this.a, str);
       Iterator iterator = list.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          ScanResult scanResult = iterator.next();
          if (i <= 20) {
             dc.a(this.a, dc.i(this.a)+scanResult.SSID+","+scanResult.BSSID+"|");
             i = i + 1;
          }
       }
       dc.h(this.a).clear();
       dc.h(this.a).addAll(list);
       dd.a(dc.h(this.a));
       if (dc.h(this.a) != null && dc.h(this.a).size() > 0) {
          dc.j(this.a);
       }
    label_00d3 :
       return;
    }
    public void handleMessage(Message p0){
       byte[] uobyteArray = dc.e(this.a);
       _monitor_enter(uobyteArray);
       switch (p0.what){
           case 1201:
             dc.f(this.a);
             break;
           case 1202:
             this.a();
             break;
           case 1203:
             dc.a(this.a, p0.obj);
             break;
           default:
       }
       _monitor_exit(uobyteArray);
       return;
    }
}
