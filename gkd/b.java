package gkd.b;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.lang.Object;
import qkd.b;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.io.EOFException;
import gkd.b$a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class b implements Closeable	// class@000f4c
{
    public final InputStream b;
    public final Charset c;
    public byte[] d;
    public int e;
    public int f;

    public void b(InputStream p0,Charset p1){
       super();
       if (p1 == null) {
          throw null;
       }
       if (!p1.equals(b.a)) {
          throw new IllegalArgumentException("Unsupported encoding");
       }
       this.b = p0;
       this.c = p1;
       byte[] uobyteArray = new byte[8192];
       this.d = uobyteArray;
       return;
    }
    public final void a(){
       b td = this.d;
       int i = this.b.read(td, 0, td.length);
       if (i == -1) {
          throw new EOFException();
       }
       this.e = 0;
       this.f = i;
       return;
    }
    public String c(){
       b uob;
       b td;
       int i;
       b te1;
       b tb = this.b;
       _monitor_enter(tb);
       if (this.d == null) {
          throw new IOException("LineReader is closed");
       }
       if (this.e >= this.f) {
          this.a();
       }
       b te = this.e;
       while (true) {
          uob = 10;
          if (te != this.f) {
             td = this.d;
             if (td[te] == uob) {
                uob = this.e;
                if (te != uob) {
                   i = te - 1;
                   if (td[i] == 13) {
                      break ;
                   }
                }
                i = te;
                break ;
             }else {
                te = te + 1;
             }
          }else {
             b$a uoa = new b$a(this, ((this.f - this.e) + 80));
             do {
                te1 = this.e;
                int i1 = this.f - te1;
                uoa.write(this.d, te1, i1);
                this.f = -1;
                this.a();
                td = this.e;
                while (true) {
                   if (td != this.f) {
                   }else {
                      continue ;
                   }
                }
             } while (td != this.f);
             te1 = this.d;
             if (te1[td] == uob) {
                uob = this.e;
                if (td != uob) {
                   uoa.write(te1, uob, (td - uob));
                }
                this.e = td + 1;
                _monitor_exit(tb);
                return uoa.toString();
             }else {
                int i2 = td + 1;
             }
          }
       }
       this.e = te + 1;
       _monitor_exit(tb);
       return new String(td, uob, (i - uob), this.c.name());
    }
    public void close(){
       b tb = this.b;
       _monitor_enter(tb);
       if (this.d != null) {
          this.d = null;
          this.b.close();
       }
       _monitor_exit(tb);
       return;
    }
}
