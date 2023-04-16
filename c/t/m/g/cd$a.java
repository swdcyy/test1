package c.t.m.g.cd$a;
import android.os.Handler;
import c.t.m.g.cd;
import android.os.Looper;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;
import c.t.m.g.bp;
import android.os.Message;
import c.t.m.g.bh;
import android.content.Context;
import c.t.m.g.cb;
import c.t.m.g.by;
import android.os.Build$VERSION;
import c.t.m.g.bv;
import java.lang.Throwable;
import c.t.m.g.bt;

public class cd$a extends Handler	// class@000c05
{
    public final cd a;
    public StringBuffer b;

    public void cd$a(cd p0,Looper p1){
       this.a = p0;
       super(p1);
       this.b = new StringBuffer(0x3c00);
    }
    public void a(){
       StringBuffer str = this.b+'$'+cd.b(this.a).format(new Date())+",LOC,shutdown";
       (this.b).setLength(0);
       cd.a(this.a, this.b, true);
       bp.b(cd.a(this.a));
    }
    public final void a(Message p0){
       StringBuffer str1;
       Message what = p0.what;
       String str = "";
       boolean b = false;
       int i = 2;
       boolean b1 = true;
       if (what != b1) {
          if (what != i) {
             if (what != 3) {
                if (what == 4) {
                   cd.a(this.a, str, b1);
                }
             }else {
                str1 = this.b+'$'+p0.obj;
                if ((this.b).length() >= 0x3c00) {
                   cd.a(this.a, this.b, b);
                   (this.b).setLength(b);
                   bp.a(cd.a(this.a), b1);
                }
             }
          }else {
          label_010e :
             this.removeMessages(i);
             bp.a(cd.a(this.a), i, 0x1d4c0);
             cd$a ta = this.a;
             ta.a("PERMISSION", cd.a(ta, cd.i()));
          }
       }else {
          String str2 = this.b;
          (this.b).setLength(b);
          str1 = this.b+"LOC_CORE"+','+bh.a("yyyyMMdd-HHmmss").format(new Date())+','+cb.a(cd.i())+','+cb.b(cd.i())+','+((cb.f()).replaceAll(":", str)).toUpperCase();
          if (!by.a(str2)) {
             str1 = this.b+str2;
          }
          this.a.a("SYSTEM", cb.e(cd.i())+','+cd.j()+','+cb.a(cd.i())+','+cb.g()+','+Build$VERSION.SDK_INT+','+bv.b(cd.i())+','+cb.e());
          goto label_010e ;
       }
       return;
    }
    public void handleMessage(Message p0){
       this.a(p0);
       return;
    }
}
