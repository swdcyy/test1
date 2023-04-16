package er.e;
import er.l;
import com.kuaishou.android.vader.config.LogPolicy;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Enum;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e extends l	// class@00158c
{
    public final boolean a;
    public final long b;
    public final LogPolicy c;

    public void e(boolean p0,long p1,LogPolicy p2){
       super();
       this.a = p0;
       this.b = p1;
       Objects.requireNonNull(p2, "Null logPolicy");
       this.c = p2;
    }
    public LogPolicy b(){
       return this.c;
    }
    public long c(){
       return this.b;
    }
    public boolean d(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof l) {
          return false;
       }
       if (this.a != p0.d() || (this.b - p0.c() || !this.c.equals(p0.b()))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.a != null)? 1231: 1237;
       e tb = this.b;
       return (((((i ^ 0xf4243) * 0xf4243) ^ (int)(tb ^ (tb >> 32))) * 0xf4243) ^ this.c.hashCode());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UploadResult{success="+this.a+", nextRequestIntervalMs="+this.b+", logPolicy="+this.c+"}";
    }
}
