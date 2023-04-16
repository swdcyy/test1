package gkd.a$d;
import gkd.a;
import java.lang.String;
import gkd.a$a;
import java.lang.Object;
import java.io.File;
import java.lang.StringBuilder;
import java.io.IOException;
import java.util.Arrays;

public final class a$d	// class@000f48
{
    public final String a;
    public final long[] b;
    public boolean c;
    public a$c d;
    public long e;
    public final a f;

    public void a$d(a p0,String p1,a$a p2){
       this.f = p0;
       super();
       this.a = p1;
       long[] olongArray = new long[p0.h];
       this.b = olongArray;
    }
    public File a(int p0){
       a b = this.f.b;
       StringBuilder str = this.a;
       String str1 = (p0 > 1)? "."+p0: "";
       return new File(b, str+str1);
    }
    public File b(int p0){
       a b = this.f.b;
       StringBuilder str = this.a;
       String str1 = ".tmp";
       if (p0 > 1) {
          str1 = "."+p0+str1;
       }
       return new File(b, str+str1);
    }
    public String c(){
       StringBuilder str = "";
       a$d tb = this.b;
       int len = tb.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+' '+tb[i];
       }
       return str;
    }
    public final IOException d(String[] p0){
       throw new IOException("unexpected journal line: "+Arrays.toString(p0));
    }
}
