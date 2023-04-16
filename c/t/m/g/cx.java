package c.t.m.g.cx;
import c.t.m.g.ce;
import java.lang.Object;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import c.t.m.g.cx$b;
import c.t.m.g.df;
import c.t.m.g.cx$a;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.String;
import c.t.m.g.ed;
import android.os.Looper;
import c.t.m.g.cx$1;
import c.t.m.g.bp;
import java.lang.Runnable;
import java.util.List;
import java.lang.StringBuilder;
import java.util.Collection;
import c.t.m.g.cd;
import android.telephony.TelephonyManager;
import android.content.Context;
import c.t.m.g.dy;
import android.os.Message;

public final class cx	// class@000c2f
{
    public boolean a;
    public final byte[] b;
    public final ce c;
    public df d;
    public ServiceState e;
    public HandlerThread f;
    public cx$a g;
    public cx$b h;
    public SignalStrength i;

    public void cx(ce p0){
       super();
       byte[] uobyteArray = new byte[0];
       this.b = uobyteArray;
       this.d = null;
       this.e = null;
       this.c = p0;
    }
    public static ServiceState a(cx p0,ServiceState p1){
       p0.e = p1;
       return p1;
    }
    public static SignalStrength a(cx p0,SignalStrength p1){
       p0.i = p1;
       return p1;
    }
    public static cx$b a(cx p0,cx$b p1){
       p0.h = p1;
       return p1;
    }
    public static df a(cx p0){
       return p0.d;
    }
    public static void a(cx p0,df p1,int p2){
       p0.a(p1, p2);
    }
    public static ce b(cx p0){
       return p0.c;
    }
    public static SignalStrength c(cx p0){
       return p0.i;
    }
    public static byte[] d(cx p0){
       return p0.b;
    }
    public static cx$a e(cx p0){
       return p0.g;
    }
    public static ServiceState f(cx p0){
       return p0.e;
    }
    public static void g(cx p0){
       p0.b();
    }
    public void a(){
       if (this.a == null) {
          return;
       }
       this.a = false;
       cx tb = this.b;
       _monitor_enter(tb);
       cx th = this.h;
       if (th != null) {
          th.a();
       }
       th = this.g;
       if (th != null) {
          th.a();
          this.g.removeCallbacksAndMessages(null);
          this.g = null;
       }
       th = this.f;
       if (th != null) {
          th.quit();
          this.f = null;
       }
       this.d = null;
       this.e = null;
       this.h = null;
       this.i = null;
       _monitor_exit(tb);
       ed.a("TxNewCellProvider", "shutdown: state=[shutdown]");
       return;
    }
    public void a(Handler p0,boolean p1){
       if (this.a != null) {
          return;
       }
       HandlerThread handlerThrea = new HandlerThread("new_cell_provider");
       this.f = handlerThrea;
       if (p0 != null) {
          handlerThrea.start();
          this.g = new cx$a(this, this.f.getLooper(), null);
          this.a = true;
          if (!p1) {
             bp.a(this.g, 0);
          }
          this.g.postDelayed(new cx$1(this), 1000);
       }
       return;
    }
    public final void a(df p0){
       if (this.a != null && (p0 == null || this.c == null)) {
          return;
       }
       _monitor_enter(this);
       cx td = this.d;
       if (td != null) {
          p0.a(td.c());
       }
       this.d = p0;
       ed.a("TxNewCellProvider", "notify cell:"+p0.toString());
       this.c.b(p0);
       _monitor_exit(this);
       return;
    }
    public final void a(df p0,int p1){
       df i;
       if (this.d == null && (p0 != null && p0.a())) {
          ed.a("CELL", "First! src:"+p1+",info:"+p0.toString());
          this.a(p0);
          return;
       }else {
          String str = "TxNewCellProvider";
          ed.a(str, "cell info change! src="+p1);
          cx td = this.d;
          String str1 = "same + TencentCell:";
          if (p1) {
             if (p1 != 1) {
                if (p1 == 2 && (p0 != null && p0.a())) {
                   ed.a(str, "timer callback"+p0.toString());
                   if (td != null) {
                      i = td.i;
                      if (i != null && i.containsAll(p0.i)) {
                         ed.a(str, "timer callback Tencentcell size"+td.i.size()+str1+td.toString());
                         return;
                      }
                   }
                   cd.c().a("CELL", "src=2,info="+p0.e());
                   this.a(p0);
                }
             }else if(p0 != null && p0.a()){
                ed.a(str, "onCellLocationChanged"+p0.toString());
                if (td != null) {
                   i = td.i;
                   if (i != null && i.contains(p0.d())) {
                      ed.a(str, "mTencentCellInfo:contains cell location"+td.toString());
                      return;
                   }
                }
                cd.c().a("CELL", "src=1,info="+p0.e());
                this.a(p0);
             }
          }else if(p0 != null && p0.a()){
             ed.a(str, "onCellInfoChanged"+p0.toString());
             if (td != null) {
                i = td.i;
                if (i != null && i.containsAll(p0.i)) {
                   ed.a(str, "onCellInfoChanged Tencentcell size"+td.i.size()+str1+td.toString());
                   return;
                }
             }
             cd.c().a("CELL", "src=0,info="+p0.e());
             this.a(p0);
          }
       label_01a5 :
          return;
       }
    }
    public final void b(){
       if (this.a == null) {
          return;
       }
       int i = 0x32c7;
       cx te = this.e;
       int i1 = -1;
       int i2 = 1;
       int i3 = 0;
       if (te != null) {
          if (!te.getState()) {
             i1 = 1;
          }else if(this.e.getState() == i2){
             i1 = 0;
          }
       }
       TelephonyManager telephonyMan = this.c.b();
       boolean b = dy.a(this.c.a);
       if (telephonyMan == null || telephonyMan.getSimState() != 5) {
          i2 = 0;
       }
       if (!b && i2) {
          i3 = i1;
       }
       Message message = new Message();
       message.what = i;
       message.arg1 = 0x2ee3;
       message.arg2 = i3;
       this.c.b(message);
       return;
    }
}
