package laa.n;
import ekd.q$a;
import java.lang.String;
import java.lang.Object;
import java.io.File;

public final class n implements q$a	// class@002d95
{
    public final String a;
    public final int b;

    public void n(String p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object apply(Object p0){
       n tb = this.b;
       if ((p0.getAbsolutePath()).startsWith(this.a)) {
          p0 = (p0.getAbsolutePath()).substring(tb);
          if (p0.startsWith("/")) {
             p0 = p0.substring(1);
          }
       }else {
          p0 = p0.getAbsolutePath();
       }
       return p0;
    }
}
