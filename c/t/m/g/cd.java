package c.t.m.g.cd;
import c.t.m.g.aw;
import c.t.m.g.ed;
import java.lang.String;
import java.text.SimpleDateFormat;
import c.t.m.g.bh;
import c.t.m.g.cd$a;
import android.content.Context;
import android.os.Looper;
import java.lang.StringBuilder;
import c.t.m.g.bt;
import android.os.HandlerThread;
import c.t.m.g.bn;
import android.os.Handler;
import c.t.m.g.bp;
import android.content.pm.ApplicationInfo;
import c.t.m.g.ec;
import android.os.Build$VERSION;
import c.t.m.g.ax;
import android.os.Message;
import java.util.Date;
import c.t.m.g.cd$b;
import java.lang.Runnable;
import vk7.g0;

public class cd extends aw	// class@000c08
{
    public SimpleDateFormat g;
    public cd$a h;
    public boolean i;
    public static final boolean c;
    public static Context d;
    public static cd e;
    public static String f;

    static {
       cd.c = ed.a;
       cd.f = "";
    }
    public void cd(){
       super();
       this.g = bh.a("HHmmss");
       this.i = false;
    }
    public static cd$a a(cd p0){
       return p0.h;
    }
    public static String a(cd p0,Context p1){
       return p0.a(p1);
    }
    public static void a(Context p0,String p1){
       cd.d = p0.getApplicationContext();
       cd.f = p1;
    }
    public static void a(cd p0,String p1,boolean p2){
       p0.a(p1, p2);
    }
    public static SimpleDateFormat b(cd p0){
       return p0.g;
    }
    public static cd c(){
       if (cd.e == null) {
          cd uocd = cd.class;
          _monitor_enter(uocd);
          if (cd.e == null) {
             cd.e = new cd();
          }
          _monitor_exit(uocd);
       }
       return cd.e;
    }
    public static boolean h(){
       return cd.c;
    }
    public static Context i(){
       return cd.d;
    }
    public static String j(){
       return cd.f;
    }
    public int a(Looper p0){
       if (cd.c) {
          bt.a(this.b(), "startup:isUp->"+this.i);
       }
       if (this.i != null) {
          cd$a uoa = new cd$a(this, bn.a("th_loc_extra").getLooper());
          this.h = uoa;
          bp.a(uoa, 1);
       }
       return 0;
    }
    public final String a(Context p0){
       String[] stringArray = new String[]{"android.permission.ACCESS_FINE_LOCATION","android.permission.ACCESS_COARSE_LOCATION","android.permission.ACCESS_WIFI_STATE","android.permission.CHANGE_WIFI_STATE","android.permission.ACCESS_NETWORK_STATE","android.permission.CHANGE_NETWORK_STATE","android.permission.READ_PHONE_STATE"};
       ApplicationInfo targetSdkVer = p0.getApplicationInfo().targetSdkVersion;
       int i = 0;
       int i1 = 0;
       while (i < 7) {
          if (!this.a(p0, stringArray[i], targetSdkVer)) {
             int i2 = 1 << i;
             i1 = i1 | i2;
          }
          i = i + 1;
       }
       return Build$VERSION.SDK_INT+"&"+targetSdkVer+"&"+i1+"&"+ec.a().a(p0);
    }
    public void a(){
       cd th = this.h;
       if (th != null) {
          th.a();
          this.h = null;
       }
       bn.b("th_loc_extra");
       if (cd.c) {
          bt.a(this.b(), "shutdown");
       }
       return;
    }
    public void a(String p0,String p1){
       if (this.f()) {
          cd th = this.h;
          if (th != null) {
             Message message = th.obtainMessage(3);
             message.obj = this.g.format(new Date())+","+p0+","+p1;
             message.sendToTarget();
          }
       }
       return;
    }
    public final void a(String p0,boolean p1){
       bn.a("th_loc_task_t_consume", new cd$b(this, p0, p1));
    }
    public void a(boolean p0){
       this.i = p0;
    }
    public final boolean a(Context p0,String p1,int p2){
       boolean b = true;
       if (Build$VERSION.SDK_INT >= 23) {
          if (p2 < 23) {
             if (g0.a(p0, p1)) {
                b = false;
             }
             return b;
          }else if(!p0.checkSelfPermission(p1)){
             b = false;
          }
       }
       return b;
    }
    public String b(){
       return "MllcProvider";
    }
}
