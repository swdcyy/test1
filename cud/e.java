package cud.e;
import okio.n;
import java.io.InputStream;
import okio.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okio.b;
import cud.l;
import java.lang.Math;
import java.lang.AssertionError;
import okio.l;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;

public final class e implements n	// class@001439
{
    public final InputStream b;
    public final o c;

    public void e(InputStream p0,o p1){
       a.q(p0, "input");
       a.q(p1, "timeout");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void close(){
       this.b.close();
    }
    public long read(b p0,long p1){
       a.q(p0, "sink");
       long l = 0;
       if (!(v2 = p1 - l)) {
          return l;
       }
       int i = 1;
       e uoe = (v2 >= 0)? 1: null;
       if (uoe) {
          try{
             this.c.throwIfReached();
             l ol = p0.s(i);
             int i1 = this.b.read(ol.a, ol.c, (int)Math.min(p1, (long)(ol.c - 8192)));
             if (i1 == -1) {
                return -1;
             }else {
                ol.c = ol.c + i1;
                i1 = (long)i1;
                p0.o((p0.p() + i1));
                return i1;
             }
          }catch(java.lang.AssertionError e4){
             if (l.e(e4)) {
                throw new IOException(e4);
             }else {
                throw e4;
             }
          }
       }else {
          throw new IllegalArgumentException("byteCount < 0: "+p1.toString());
       }
    }
    public o timeout(){
       return this.c;
    }
    public String toString(){
       return "source\("+this.b+')';
    }
}
