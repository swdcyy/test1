package c.t.m.g.dx;
import com.tencent.map.geolocation.TencentLocationBridge;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import c.t.m.g.cv;
import com.tencent.map.geolocation.TencentLocation;
import c.t.m.g.ed;
import c.t.m.g.be;
import c.t.m.g.ce;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationRequest;
import android.os.Looper;
import java.lang.Boolean;
import c.t.m.g.bg;
import c.t.m.g.eh;
import com.tencent.map.geolocation.util.SoUtils;

public class dx implements TencentLocationBridge	// class@000c5a
{
    public final byte[] a;
    public ce b;
    public cv c;

    public void dx(Context p0){
       super();
       byte[] uobyteArray = new byte[0];
       this.a = uobyteArray;
       this.init(p0);
    }
    public String getBuild(){
       return "210910";
    }
    public int getCoordinateType(){
       return this.c.d();
    }
    public TencentLocation getLastKnownLocation(){
       return this.c.a();
    }
    public String getVersion(){
       return "7.3.7.0.official_1";
    }
    public void init(Context p0){
       ed.a(p0);
       be.a(p0);
       be.a(true);
       this.b = ce.a(p0);
       if (ed.a) {
          ed.a("NewTxLocationManagerImpl", "TencentLocationManager new TxLocationManagerImpl");
       }
       this.c = new cv(this.b);
       return;
    }
    public void removeUpdates(TencentLocationListener p0){
       this.c.a(p0);
    }
    public int requestLocationUpdates(TencentLocationRequest p0,TencentLocationListener p1,Looper p2){
       return this.c.a(p0, p1, p2);
    }
    public int requestSingleFreshLocation(TencentLocationRequest p0,TencentLocationListener p1,Looper p2){
       return this.c.b(p0, p1, p2);
    }
    public void setCoordinateType(int p0){
       this.c.a(p0);
    }
    public void setDebuggable(boolean p0){
       bg.a("CONF_USER_DEBUGGABLE", Boolean.valueOf(p0));
    }
    public void setDeviceID(Context p0,String p1){
       eh.b("LocationSDK", "location_device_id", p1);
    }
    public boolean startIndoorLocation(){
       return this.c.b();
    }
    public boolean stopIndoorLocation(){
       return this.c.c();
    }
    public void triggerCodeGuarder(boolean p0){
       SoUtils.fun_x(p0);
    }
}
