package okio.k;
import okio.n;
import okio.d;
import java.util.zip.Inflater;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okio.b;
import cud.l;
import java.lang.Math;
import java.io.EOFException;
import cud.m;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import okio.o;

public final class k implements n	// class@0020f7
{
    public int b;
    public boolean c;
    public final d d;
    public final Inflater e;

    public void k(d p0,Inflater p1){
       a.q(p0, "source");
       a.q(p1, "inflater");
       super();
       this.d = p0;
       this.e = p1;
    }
    public final void a(){
       k tb = this.b;
       if (tb == null) {
          return;
       }
       int i = tb - this.e.getRemaining();
       this.b = this.b - i;
       this.d.skip((long)i);
       return;
    }
    public void close(){
       if (this.c != null) {
          return;
       }
       this.e.end();
       this.c = true;
       this.d.close();
       return;
    }
    public long read(b p0,long p1){
       a.q(p0, "sink");
       long l = 0;
       k ok = ((v4 = p1 - l) >= 0)? 1: null;
       if (ok) {
          if (this.c ^ 1) {
             if (!v4) {
                return l;
             }else if(!this.e.needsInput()){
                this.a();
                k ok1 = (!this.e.getRemaining())? 1: null;
                if (ok1) {
                   if (this.d.exhausted()) {
                      l = 1;
                      try{
                      label_005a :
                         l ol = p0.s(1);
                         int i = ol.c - 8192;
                         i = this.e.inflate(ol.a, ol.c, (int)Math.min(p1, (long)i));
                         if (i > 0) {
                            ol.c = ol.c + i;
                            l = (long)i;
                            p0.o((p0.p() + l));
                            return l;
                         }else if(this.e.finished() || this.e.needsDictionary()){
                            this.a();
                            if (ol.b == ol.c) {
                               p0.b = ol.a();
                               m.a(ol);
                            }
                         }else {
                            if (l) {
                            label_0097 :
                               throw new EOFException("source exhausted prematurely");
                            }
                            continue ;
                         }
                      }catch(java.util.zip.DataFormatException e9){
                         throw new IOException(e9);
                      }
                   }else {
                      b b = this.d.m().b;
                      if (b == null) {
                         a.L();
                      }
                      l b1 = b.b;
                      int i1 = b.c - b1;
                      this.b = i1;
                      this.e.setInput(b.a, b1, i1);
                   }
                }else {
                   throw new IllegalStateException("?".toString());
                }
             }
             l = 0;
             goto label_005a ;
          }else {
             throw new IllegalStateException("closed".toString());
          }
       }else {
          throw new IllegalArgumentException("byteCount < 0: "+p1.toString());
       }
    }
    public o timeout(){
       return this.d.timeout();
    }
}
