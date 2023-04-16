package com.loc.bd$b;
import java.io.Closeable;
import com.loc.bd;
import java.lang.String;
import java.io.InputStream;
import java.lang.Object;

public final class bd$b implements Closeable	// class@001388
{
    public final bd a;
    public final String b;
    public final long c;
    public final InputStream[] d;
    public final long[] e;

    public void bd$b(bd p0,String p1,long p2,InputStream[] p3,long[] p4){
       this.a = p0;
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void bd$b(bd p0,String p1,long p2,InputStream[] p3,long[] p4,byte p5){
       super(p0, p1, p2, p3, p4);
    }
    public final InputStream a(){
       return this.d[0];
    }
    public final void close(){
       bd$b td = this.d;
       int len = td.length;
       for (int i = 0; i < len; i = i + 1) {
          bd.a(td[i]);
       }
       return;
    }
}
