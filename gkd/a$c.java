package gkd.a$c;
import gkd.a;
import gkd.a$d;
import gkd.a$a;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;
import gkd.a$c$a;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.io.OutputStreamWriter;
import qkd.b;
import java.nio.charset.Charset;
import java.io.Writer;
import ekd.p;

public final class a$c	// class@000f47
{
    public final a$d a;
    public final boolean[] b;
    public boolean c;
    public boolean d;
    public final a e;

    public void a$c(a p0,a$d p1,a$a p2){
       this.e = p0;
       super();
       this.a = p1;
       boolean[] uobooleanArr = (p1.c != null)? null: new boolean[p0.h];
       this.b = uobooleanArr;
       return;
    }
    public void a(){
       this.e.d(this, false);
    }
    public void b(){
       if (this.c != null) {
          this.e.d(this, false);
          this.e.u(this.a.a);
       }else {
          this.e.d(this, true);
       }
       this.d = true;
       return;
    }
    public File c(){
       return this.a.a(0);
    }
    public File d(){
       return this.a.b(0);
    }
    public OutputStream e(int p0){
       FileOutputStream uFileOutputS;
       if (p0 >= 0) {
          a$c te = this.e;
          if (p0 < te.h) {
             _monitor_enter(te);
             a$c ta = this.a;
             if (ta.d == this) {
                if (ta.c == null) {
                   this.b[p0] = true;
                }
                File uFile = ta.b(p0);
                try{
                   uFileOutputS = new FileOutputStream(uFile);
                }catch(java.io.FileNotFoundException e0){
                   a b = this.e.b;
                   b.mkdirs();
                   uFileOutputS = new FileOutputStream(uFile);
                }catch(java.io.FileNotFoundException e0){
                   _monitor_exit(e0);
                   return a.q;
                }
             }else {
                throw new IOException("currentEditor changed");
             }
          }
       }
       throw new IllegalArgumentException("Expected index "+p0+" to be greater than 0 and less than the maximum value count of "+this.e.h);
    }
    public void f(int p0,String p1){
       OutputStreamWriter outputStream = new OutputStreamWriter(this.e(p0), b.b);
       outputStream.write(p1);
       p.f(outputStream);
    }
    public boolean g(File p0){
       a$c te = this.e;
       _monitor_enter(te);
       a$c ta = this.a;
       if (ta.d == null) {
          ta.d = this;
       }
       if (ta.d == this) {
          if (ta.c == null) {
             this.b[0] = true;
          }
          _monitor_exit(te);
          return b.k0(p0, ta.b(0));
       }else {
          throw new IOException("currentEditor changed");
       }
    }
}
