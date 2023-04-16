package com.google.archivepatcher.shared.PartiallyUncompressingPipe;
import java.io.Closeable;
import java.io.OutputStream;
import java.lang.Object;
import com.google.archivepatcher.shared.b;
import com.google.archivepatcher.shared.d;
import java.io.InputStream;
import com.google.archivepatcher.shared.PartiallyUncompressingPipe$Mode;
import java.util.Objects;
import java.util.zip.InflaterInputStream;
import java.util.zip.Inflater;
import java.io.FilterOutputStream;

public class PartiallyUncompressingPipe implements Closeable	// class@0016ff
{
    public final d b;
    public final b c;
    public final byte[] d;

    public void PartiallyUncompressingPipe(OutputStream p0,int p1){
       super();
       this.c = new b(p0);
       d uod = new d();
       this.b = uod;
       uod.e = true;
       byte[] uobyteArray = new byte[p1];
       this.d = uobyteArray;
    }
    public long a(){
       return this.c.a();
    }
    public long b(InputStream p0,PartiallyUncompressingPipe$Mode p1){
       boolean i;
       long l = this.c.a();
       if (p1 == PartiallyUncompressingPipe$Mode.COPY) {
          i = p0.read(this.d);
          while (i >= 0) {
             this.c.write(this.d, 0, i);
          }
       }else {
          PartiallyUncompressingPipe tb = this.b;
          i = (p1 == PartiallyUncompressingPipe$Mode.UNCOMPRESS_NOWRAP)? true: false;
          if (i != tb.a) {
             tb.b();
             tb.a = i;
          }
          PartiallyUncompressingPipe tb1 = this.b;
          tb = this.c;
          Objects.requireNonNull(tb1);
          d d = tb1.d;
          if (d == null) {
             d = new Inflater(tb1.a);
             if (tb1.e != null) {
                tb1.d = d;
             }
          }else {
             d.reset();
          }
          InflaterInputStream inflaterInpu = new InflaterInputStream(p0, d, tb1.b);
          byte[] uobyteArray = new byte[tb1.c];
          int i1 = inflaterInpu.read(uobyteArray);
          while (i1 >= 0) {
             tb.write(uobyteArray, 0, i1);
          }
          if (tb1.e == null) {
             tb1.b();
          }
       }
       this.c.flush();
       return (this.c.a() - l);
    }
    public void close(){
       this.b.b();
       this.c.close();
    }
}
