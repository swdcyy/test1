package er.a;
import er.g;
import com.kuaishou.android.vader.Channel;
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

public final class a extends g	// class@001588
{
    public final Channel a;
    public final int b;
    public final int c;

    public void a(Channel p0,int p1,int p2){
       super();
       Objects.requireNonNull(p0, "Null channel");
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public Channel a(){
       return this.a;
    }
    public int c(){
       return this.b;
    }
    public int d(){
       return this.c;
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
       if (!p0 instanceof g) {
          return false;
       }
       if (!this.a.equals(p0.a()) || (this.b != p0.c() || this.c != p0.d())) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b) * 0xf4243) ^ this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChannelLogRange{channel="+this.a+", lowerBound="+this.b+", upperBound="+this.c+"}";
    }
}
