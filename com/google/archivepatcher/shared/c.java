package com.google.archivepatcher.shared.c;
import com.google.archivepatcher.shared.a;
import java.lang.Object;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;

public class c implements a	// class@001704
{
    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public Deflater f;
    public boolean g;

    public void c(){
       super();
       this.a = -1;
       this.b = 0;
       this.c = true;
       this.d = 0x8000;
       this.e = 0x8000;
       this.f = null;
       this.g = false;
    }
    public void a(InputStream p0,OutputStream p1){
       byte[] uobyteArray = new byte[this.d];
       c tf = this.f;
       if (tf == null) {
          tf = new Deflater(this.a, this.c);
          tf.setStrategy(this.b);
          if (this.g != null) {
             this.f = tf;
          }
       }else {
          tf.reset();
       }
       DeflaterOutputStream uDeflaterOut = new DeflaterOutputStream(p1, tf, this.e);
       int i = p0.read(uobyteArray);
       while (i >= 0) {
          uDeflaterOut.write(uobyteArray, 0, i);
       }
       uDeflaterOut.finish();
       uDeflaterOut.flush();
       return;
    }
    public void b(){
       c tf = this.f;
       if (tf != null) {
          tf.end();
          this.f = null;
       }
       return;
    }
}
