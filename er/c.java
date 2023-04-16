package er.c;
import er.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class c extends i	// class@00158a
{
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public void c(long p0,long p1,long p2,long p3){
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
    }
    public long b(){
       return this.e;
    }
    public long c(){
       return this.f;
    }
    public long d(){
       return this.d;
    }
    public long e(){
       return this.g;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof i) {
          return false;
       }
       if (this.d - p0.d() || (this.e - p0.b() || (this.f - p0.c() || this.g - p0.e()))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       c td = this.d;
       c te = this.e;
       te = this.f;
       te = this.g;
       return ((int)((te >> 32) ^ te) ^ (((((((int)(td ^ (td >> 32)) ^ 0xf4243) * 0xf4243) ^ (int)(te ^ (te >> 32))) * 0xf4243) ^ (int)(te ^ (te >> 32))) * 0xf4243));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LogChannelConfig{initUploadDelayMs="+this.d+", defaultRequestIntervalMs="+this.e+", initRetryIntervalMs="+this.f+", maxRetryIntervalMs="+this.g+"}";
    }
}
