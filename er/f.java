package er.f;
import er.m;
import java.lang.String;
import java.util.Map;
import tq.h;
import tq.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f extends m	// class@00158d
{
    public final String b;
    public final Map c;
    public final h d;
    public final d e;

    public void f(String p0,Map p1,h p2,d p3){
       super();
       Objects.requireNonNull(p0, "Null databaseName");
       this.b = p0;
       Objects.requireNonNull(p1, "Null channelConfigList");
       this.c = p1;
       Objects.requireNonNull(p2, "Null vaderSwitch");
       this.d = p2;
       Objects.requireNonNull(p3, "Null logger");
       this.e = p3;
    }
    public Map a(){
       return this.c;
    }
    public String c(){
       return this.b;
    }
    public d d(){
       return this.e;
    }
    public h e(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof m) {
          return false;
       }
       if (!(this.b).equals(p0.c()) || (!this.c.equals(p0.a()) || (!this.d.equals(p0.e()) || !this.e.equals(p0.d())))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((((((this.b).hashCode() ^ 0xf4243) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ this.e.hashCode());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VaderConfig{databaseName="+this.b+", channelConfigList="+this.c+", vaderSwitch="+this.d+", logger="+this.e+"}";
    }
}
