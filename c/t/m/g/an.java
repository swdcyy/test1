package c.t.m.g.an;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import c.t.m.g.bt;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import c.t.m.g.ao;
import java.io.OutputStream;
import c.t.m.g.by;
import java.lang.Thread;
import c.t.m.g.an$1;
import java.lang.Runnable;

public class an	// class@000bcd
{
    public int a;
    public byte[] b;
    public File c;
    public FileOutputStream d;
    public BufferedOutputStream e;
    public StringBuilder f;
    public ao g;
    public String h;
    public int i;
    public boolean j;
    public long k;
    public String l;
    public boolean m;
    public boolean n;
    public int o;

    public void an(File p0){
       super(p0, 5120);
    }
    public void an(File p0,int p1){
       super();
       byte[] uobyteArray = new byte[0];
       this.b = uobyteArray;
       this.h = "";
       this.i = 0;
       this.j = false;
       this.k = Long.MAX_VALUE;
       this.l = "";
       this.m = false;
       this.n = false;
       this.o = 1;
       this.a = 0;
       this.a(p0, p1);
    }
    public static String a(an p0){
       return p0.l;
    }
    public void a(){
       an tb = this.b;
       _monitor_enter(tb);
       if (this.e == null) {
          _monitor_exit(tb);
          return;
       }else {
          this.a((this.f).getBytes("UTF-8"));
          (this.f).setLength(0);
          if (bt.a()) {
             bt.a("FileWriterWrapper", this.c.getAbsolutePath()+" close\(\). length="+this.c.length());
          }
          this.e.close();
          this.d.close();
          if (this.j != null && this.m != null) {
             this.c();
          }
          this.o = 1;
          this.e = null;
          this.d = null;
          _monitor_exit(tb);
          return;
       }
    }
    public void a(ao p0){
       an tb = this.b;
       _monitor_enter(tb);
       this.g = p0;
       _monitor_exit(tb);
    }
    public final void a(File p0,int p1){
       this.c = p0;
       File uFile = (p0 == null)? null: p0.getParentFile();
       if (uFile == null || (!uFile.exists() && !uFile.mkdirs())) {
          return;
       }else {
          this.h = p0.getAbsolutePath();
          this.i = p1;
          if (bt.a()) {
             bt.a("FileWriterWrapper", "create file:"+p0.getAbsolutePath()+",bufSize:"+p1);
          }
          this.f = new StringBuilder(p1);
          this.d = new FileOutputStream(p0, true);
          this.e = new BufferedOutputStream(this.d, 5120);
          return;
       }
    }
    public void a(String p0){
       an tb = this.b;
       _monitor_enter(tb);
       an tf = this.f;
       if (tf != null) {
          StringBuilder str = tf+p0;
          if ((this.f).length() >= this.i) {
             this.a((this.f).getBytes("UTF-8"));
             (this.f).setLength(0);
          }
       }
       _monitor_exit(tb);
       return;
    }
    public void a(byte[] p0){
       long l;
       an tb = this.b;
       _monitor_enter(tb);
       if (this.e == null) {
          _monitor_exit(tb);
          return;
       }else {
          an tg = this.g;
          byte[] uobyteArray = (tg == null)? p0: tg.a(p0);
          this.e.write(uobyteArray);
          if (this.j != null) {
             int i = this.a + p0.length;
             this.a = i;
             if (i >= 5120) {
                this.a = 0;
                File uFile = this.b();
                tg = (uFile == null)? null: uFile.length();
                if (tg - this.k >= 0) {
                   this.e.close();
                   this.d.close();
                   this.c();
                   this.a(new File(this.h), this.i);
                }
             }
          }
          _monitor_exit(tb);
          return;
       }
    }
    public File b(){
       an tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.c;
    }
    public final void c(){
       String str = "_";
       File uFile = new File(this.h+str+this.o+this.l);
       while (uFile.exists()) {
          int i = this.o + 1;
          this.o = i;
          uFile = new File(this.h+str+this.o+this.l);
       }
       boolean b = this.c.renameTo(uFile);
       if (bt.a()) {
          bt.a("FileWriterWrapper", "rename "+this.c.getName()+" to "+uFile.getName()+": "+b);
       }
       String absolutePath = uFile.getAbsolutePath();
       if (this.n != null && !by.a(absolutePath)) {
          if (bt.a()) {
             bt.a("FileWriterWrapper", "compress file: "+absolutePath);
          }
          new Thread(new an$1(this, absolutePath), "th_loc_tmp").start();
       }
       this.o = this.o + 1;
       return;
    }
}
