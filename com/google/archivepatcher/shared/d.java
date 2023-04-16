package com.google.archivepatcher.shared.d;
import com.google.archivepatcher.shared.i;
import java.lang.Object;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.Inflater;

public class d implements i	// class@001705
{
    public boolean a;
    public int b;
    public int c;
    public Inflater d;
    public boolean e;

    public void d(){
       super();
       this.a = true;
       this.b = 0x8000;
       this.c = 0x8000;
       this.d = null;
       this.e = false;
    }
    public void a(InputStream p0,OutputStream p1){
       d td = this.d;
       if (td == null) {
          td = new Inflater(this.a);
          if (this.e != null) {
             this.d = td;
          }
       }else {
          td.reset();
       }
       InflaterInputStream inflaterInpu = new InflaterInputStream(p0, td, this.b);
       byte[] uobyteArray = new byte[this.c];
       int i = inflaterInpu.read(uobyteArray);
       while (i >= 0) {
          p1.write(uobyteArray, 0, i);
       }
       if (this.e == null) {
          this.b();
       }
       return;
    }
    public void b(){
       d td = this.d;
       if (td != null) {
          td.end();
          this.d = null;
       }
       return;
    }
}
