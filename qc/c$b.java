package qc.c$b;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import ab.d$b;
import ab.d;

public class c$b implements CacheKey	// class@0029c0
{
    public final CacheKey a;
    public final int b;

    public void c$b(CacheKey p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String a(){
       return null;
    }
    public boolean b(){
       return false;
    }
    public boolean c(Uri p0){
       return this.a.c(p0);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof c$b) {
          return false;
       }
       if (this.b != p0.b || !this.a.equals(p0.a)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return ((this.a.hashCode() * 1013) + this.b);
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.b("imageCacheKey", this.a);
       uob.a("frameIndex", this.b);
       return uob.toString();
    }
}
