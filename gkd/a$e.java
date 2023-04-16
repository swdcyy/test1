package gkd.a$e;
import java.io.Closeable;
import gkd.a;
import java.lang.String;
import java.io.InputStream;
import java.io.File;
import gkd.a$a;
import java.lang.Object;
import ekd.p;
import java.io.InputStreamReader;
import qkd.b;
import java.nio.charset.Charset;
import java.io.Reader;
import qkd.c;

public final class a$e implements Closeable	// class@000f49
{
    public final String b;
    public final long c;
    public final InputStream[] d;
    public final File[] e;
    public final long[] f;
    public final a g;

    public void a$e(a p0,String p1,long p2,InputStream[] p3,File[] p4,long[] p5,a$a p6){
       this.g = p0;
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public File a(int p0){
       return this.e[p0];
    }
    public void close(){
       a$e td = this.d;
       int len = td.length;
       for (int i = 0; i < len; i = i + 1) {
          p.c(td[i]);
       }
       return;
    }
    public String getString(int p0){
       return c.k(new InputStreamReader(this.d[p0], b.b));
    }
}
