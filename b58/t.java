package b58.t;
import erd.o;
import b58.m;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import aj8.b;
import java.lang.StringBuilder;
import java.lang.Exception;

public final class t implements o	// class@000310
{
    public final m b;

    public void t(m p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t tb = this.b;
       String str = b.b(p0);
       if ((tb.e).equalsIgnoreCase(str)) {
          return p0;
       }
       throw new Exception("下载后的文件MD5不正确，actual="+str+",expect="+tb.e);
    }
}
