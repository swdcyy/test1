package bgd.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@00025c
{
    public final String a;
    public long b;
    public boolean c;
    public long d;
    public boolean e;

    public void a(String p0,long p1,boolean p2,long p3,boolean p4){
       a.p(p0, "cacheName");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean a(){
       return this.c;
    }
    public final boolean b(){
       return this.e;
    }
    public final String c(){
       return this.a;
    }
    public final long d(){
       return this.b;
    }
    public final long e(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.a, p0.a) && (!this.b - p0.b && (this.c == p0.c && (!this.d - p0.d && this.e == p0.e)))))) {
          return true;
       }
       return false;
    }
    public final void f(long p0){
       this.b = p0;
    }
    public int hashCode(){
       int i2;
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       a tb = this.b;
       long l = 32;
       i = ((i * 31) + (int)(tb ^ (tb >> l))) * 31;
       tb = this.c;
       int i1 = 1;
       if (tb != null) {
          i2 = 1;
       }
       a td = this.d;
       i = (((i + i2) * 31) + (int)(td ^ (td >> l))) * 31;
       tb = this.e;
       if (tb == null) {
          i1 = tb;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CacheDetailInfo\(cacheName="+this.a+", cacheSize="+this.b+", allowClear="+this.c+", preDownloadSize="+this.d+", allowClearPreDownload="+this.e+"\)";
    }
}
