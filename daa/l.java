package daa.l;
import daa.l$a;
import nsd.u;
import com.yxcorp.gifshow.easteregg.model.ConditionConfig$a;
import java.lang.String;
import com.yxcorp.gifshow.easteregg.model.ConditionConfig;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class l	// class@001ed8
{
    public final ConditionConfig config;
    public final int id;
    public final String type;
    public static final l a;
    public static final l$a b;

    static {
       l.b = new l$a(null);
       l.a = new l(0, "", ConditionConfig$a.a);
    }
    public void l(int p0,String p1,ConditionConfig p2){
       a.p(p1, "type");
       a.p(p2, "config");
       super();
       this.id = p0;
       this.type = p1;
       this.config = p2;
    }
    public final ConditionConfig a(){
       return this.config;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof l && (this.id == p0.id && (a.g(this.type, p0.type) && a.g(this.config, p0.config))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.id * 31;
       l ttype = this.type;
       int i1 = 0;
       int i2 = (ttype != null)? ttype.hashCode(): 0;
       i = (i + i2) * 31;
       ttype = this.config;
       if (ttype != null) {
          i1 = ttype.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TriggerConditionConfig\(id="+this.id+", type="+this.type+", config="+this.config+"\)";
    }
}
