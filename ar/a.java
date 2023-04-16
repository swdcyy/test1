package ar.a;
import ar.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class a extends b	// class@000280
{
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public void a(int p0,int p1,int p2,long p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public int a(){
       return this.b;
    }
    public long b(){
       return this.d;
    }
    public int d(){
       return this.c;
    }
    public int e(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof b) {
          return false;
       }
       if (this.a != p0.e() || (this.b != p0.a() || (this.c != p0.d() || this.d - p0.b()))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       a td = this.d;
       return (((((((this.a ^ 0xf4243) * 0xf4243) ^ this.b) * 0xf4243) ^ this.c) * 0xf4243) ^ (int)(td ^ (td >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SeqIdWrapper{seqId="+this.a+", channelSeqId="+this.b+", customSeqId="+this.c+", clientTimestamp="+this.d+"}";
    }
}
