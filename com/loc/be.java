package com.loc.be;
import java.io.Closeable;
import java.lang.String;
import java.nio.charset.Charset;
import java.io.InputStream;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import com.loc.be$1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.EOFException;

public final class be implements Closeable	// class@00138c
{
    public final InputStream b;
    public final Charset c;
    public byte[] d;
    public int e;
    public int f;
    public static final Charset a;

    static {
       be.a = Charset.forName("US-ASCII");
    }
    public void be(InputStream p0,Charset p1){
       super(p0, p1, 0);
    }
    public void be(InputStream p0,Charset p1,byte p2){
       super();
       if (p0 == null || p1 == null) {
          throw null;
       }
       if (!p1.equals(be.a)) {
          throw new IllegalArgumentException("Unsupported encoding");
       }
       this.b = p0;
       this.c = p1;
       byte[] uobyteArray = new byte[8192];
       this.d = uobyteArray;
       return;
    }
    public static Charset a(be p0){
       return p0.c;
    }
    public final String a(){
       be uobe;
       be td;
       int i;
       be te1;
       be tb = this.b;
       _monitor_enter(tb);
       if (this.d == null) {
          throw new IOException("LineReader is closed");
       }
       if (this.e >= this.f) {
          this.b();
       }
       be te = this.e;
       while (true) {
          uobe = 10;
          if (te != this.f) {
             td = this.d;
             if (td[te] == uobe) {
                uobe = this.e;
                if (te != uobe) {
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
             be$1 u1 = new be$1(this, ((this.f - this.e) + 80));
             do {
                te1 = this.e;
                int i1 = this.f - te1;
                u1.write(this.d, te1, i1);
                this.f = -1;
                this.b();
                td = this.e;
                while (true) {
                   if (td != this.f) {
                   }else {
                      continue ;
                   }
                }
             } while (td != this.f);
             te1 = this.d;
             if (te1[td] == uobe) {
                uobe = this.e;
                if (td != uobe) {
                   u1.write(te1, uobe, (td - uobe));
                }
                this.e = td + 1;
                _monitor_exit(tb);
                return u1.toString();
             }else {
                int i2 = td + 1;
             }
          }
       }
       this.e = te + 1;
       _monitor_exit(tb);
       return new String(td, uobe, (i - uobe), this.c.name());
    }
    public final void b(){
       be td = this.d;
       int i = this.b.read(td, 0, td.length);
       if (i == -1) {
          throw new EOFException();
       }
       this.e = 0;
       this.f = i;
       return;
    }
    public final void close(){
       be tb = this.b;
       _monitor_enter(tb);
       if (this.d != null) {
          this.d = null;
          this.b.close();
       }
       _monitor_exit(tb);
       return;
    }
}
