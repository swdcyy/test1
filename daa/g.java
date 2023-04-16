package daa.g;
import daa.g$a;
import nsd.u;
import com.yxcorp.gifshow.easteregg.model.PokeGroup$a;
import java.lang.String;
import com.yxcorp.gifshow.easteregg.model.PokeGroup;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g	// class@001ed2
{
    public final int id;
    public final PokeGroup pokeGroup;
    public final String type;
    public static final g a;
    public static final g$a b;

    static {
       g.b = new g$a(null);
       g.a = new g(0, "", PokeGroup$a.a);
    }
    public void g(int p0,String p1,PokeGroup p2){
       a.p(p1, "type");
       a.p(p2, "pokeGroup");
       super();
       this.id = p0;
       this.type = p1;
       this.pokeGroup = p2;
    }
    public final PokeGroup a(){
       return this.pokeGroup;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g && (this.id == p0.id && (a.g(this.type, p0.type) && a.g(this.pokeGroup, p0.pokeGroup))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.id * 31;
       g ttype = this.type;
       int i1 = 0;
       int i2 = (ttype != null)? ttype.hashCode(): 0;
       i = (i + i2) * 31;
       ttype = this.pokeGroup;
       if (ttype != null) {
          i1 = ttype.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PokeConfig\(id="+this.id+", type="+this.type+", pokeGroup="+this.pokeGroup+"\)";
    }
}
