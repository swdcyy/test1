package c.t.m.g.er;
import android.content.Context;
import android.os.Looper;
import java.lang.Object;
import java.text.SimpleDateFormat;
import java.lang.String;
import c.t.m.g.er$a;
import java.lang.StringBuilder;
import java.io.File;
import c.t.m.g.fg;
import android.os.Handler;
import c.t.m.g.fb;
import java.lang.Thread;
import c.t.m.g.fj;
import java.util.Date;
import c.t.m.g.ff;
import c.t.m.g.ex;
import c.t.m.g.fc;
import java.lang.Throwable;

public class er	// class@000c78
{
    public String a;
    public Context b;
    public fg c;
    public SimpleDateFormat d;
    public er$a e;
    public StringBuilder f;
    public String g;
    public File h;
    public String i;

    public void er(Context p0,Looper p1){
       super();
       this.a = "er";
       this.d = new SimpleDateFormat("HHmmss");
       this.g = "d";
       this.h = null;
       this.b = p0;
       this.e = new er$a(this, p1);
       this.a();
    }
    public static String a(er p0){
       return p0.a;
    }
    public static StringBuilder a(er p0,StringBuilder p1){
       p0.f = p1;
       return p1;
    }
    public static StringBuilder b(er p0){
       return p0.f;
    }
    public static Context c(er p0){
       return p0.b;
    }
    public static er$a d(er p0){
       return p0.e;
    }
    public static File e(er p0){
       return p0.h;
    }
    public static String f(er p0){
       return p0.i;
    }
    public void a(){
       File uFile = null;
       File uFile1 = new File(this.b.getExternalFilesDir("data").getAbsolutePath()+File.separator+"TMLSDK");
       if (!uFile1.exists()) {
          uFile1.mkdirs();
       }
       File uFile2 = uFile1;
       this.h = uFile2;
       if (uFile2 != null) {
          uFile = new File(uFile2, this.g);
       }
       this.i = "d_";
       fg uofg = new fg(this.b, uFile2, uFile, "d", 0x5000);
       this.c = uFile;
       fb.a(this.e, 0x2714, 0xea60);
       return;
    }
    public void a(String p0,int p1){
       fb.a(this.e, 0x271d, p1, 0, p0);
    }
    public void a(String p0,String p1){
       String name = Thread.currentThread().getName();
       String str = fj.d(this.b);
       fb.a(this.e, 0x2711, 0, 0, this.d.format(new Date())+","+str+","+name+","+p0+","+p1);
       return;
    }
    public boolean a(byte[] p0){
       boolean b = true;
       if (p0 == null || !p0.length) {
          if (ex.a) {
             ex.a(this.a, "upload data is null");
          }
          return b;
       }else {
          p0 = fj.a(p0, fj.a("m_log_key", ff.p));
          if (p0 == null || !p0.length) {
             if (ex.a) {
                ex.a(this.a, "upload data enc is null");
             }
             return b;
          }else if(ex.a){
             ex.a(this.a, "encData size:"+p0.length);
          }
          byte[] uobyteArray = fc.a("https://analytics.map.qq.com/tr?mllc", p0);
          if (uobyteArray != null) {
             if (ex.a) {
                ex.b(this.a, "upload buffer result:"+new String(uobyteArray));
             }
          }else if(ex.a){
             ex.b(this.a, "upload buffer faild");
          }
          this.c.a(p0);
          return false;
       }
    }
    public void b(){
       fb.a(this.e, 0x2714);
    }
    public void c(){
       fb.a(this.e, 0x2713);
    }
}
