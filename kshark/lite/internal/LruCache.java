package kshark.lite.internal.LruCache;
import java.lang.Object;
import kshark.lite.internal.LruCache$2;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import nsd.r0;
import java.lang.Integer;
import java.util.Arrays;
import kotlin.jvm.internal.a;

public final class LruCache	// class@001bce
{
    public final LinkedHashMap a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final int f;

    public void LruCache(int p0){
       super();
       this.f = p0;
       boolean b = true;
       LruCache$2 u2 = (p0 > 0)? 1: null;
       if (u2) {
          this.a = new LruCache$2(this, p0, 0x3f400000, b);
          return;
       }else {
          throw new IllegalArgumentException("maxSize="+p0+" <= 0".toString());
       }
    }
    public String toString(){
       LruCache td = this.d;
       int i = this.e + td;
       int i1 = 0;
       int i2 = (i)? (td * 100) / i: 0;
       Object[] objArray = new Object[]{Integer.valueOf(this.f),Integer.valueOf(this.d),Integer.valueOf(this.e),Integer.valueOf(i2)};
       String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Arrays.copyOf(objArray, 4));
       a.o(str, "java.lang.String.format\(format, *args\)");
       return str;
    }
}
