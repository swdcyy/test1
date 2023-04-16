package cr.c;
import cr.h;
import com.kuaishou.android.vader.stat.ValueOrException;
import java.util.Map;
import cr.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import cr.h$a;
import cr.c$b;
import java.lang.StringBuilder;

public final class c extends h	// class@001421
{
    public final ValueOrException a;
    public final ValueOrException b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;
    public final int g;
    public final int h;
    public final int i;

    public void c(ValueOrException p0,ValueOrException p1,Map p2,Map p3,Map p4,Map p5,int p6,int p7,int p8){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
    }
    public void c(ValueOrException p0,ValueOrException p1,Map p2,Map p3,Map p4,Map p5,int p6,int p7,int p8,c$a p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public Map b(){
       return this.d;
    }
    public Map c(){
       return this.c;
    }
    public int d(){
       return this.h;
    }
    public Map e(){
       return this.f;
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
       if (!p0 instanceof h) {
          return false;
       }
       if (!this.a.equals(p0.j()) || (!this.b.equals(p0.i()) || (!this.c.equals(p0.c()) || (!this.d.equals(p0.b()) || (!this.e.equals(p0.f()) || (!this.f.equals(p0.e()) || (this.g != p0.h() || (this.h != p0.d() || this.i != p0.g())))))))) {
          b = false;
       }
       return b;
    }
    public Map f(){
       return this.e;
    }
    public int g(){
       return this.i;
    }
    public int h(){
       return this.g;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (((((((((((((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ this.e.hashCode()) * 0xf4243) ^ this.f.hashCode()) * 0xf4243) ^ this.g) * 0xf4243) ^ this.h) * 0xf4243) ^ this.i);
    }
    public ValueOrException i(){
       return this.b;
    }
    public ValueOrException j(){
       return this.a;
    }
    public h$a k(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c$b(this, null);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SequenceIdStat{seqId="+this.a+", seqDbId="+this.b+", channelId="+this.c+", channelDbId="+this.d+", customId="+this.e+", customDbId="+this.f+", generatedIdCount="+this.g+", commitCount="+this.h+", failedCommitCount="+this.i+"}";
    }
}
