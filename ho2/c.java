package ho2.c;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.background.multiimage.Coordinate;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Map;
import trd.t0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.background.multiimage.Config;
import java.lang.StringBuilder;

public final class c	// class@002ddf
{
    public final Config _config;
    public final Coordinate _coordinate;
    public final List _elements;
    public final Map _variables;

    public void c(){
       super();
       this._coordinate = null;
       this._variables = null;
       this._elements = null;
       this._config = null;
    }
    public final Coordinate a(){
       c obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this._coordinate;
       if (obj != null) {
          return obj;
       }
       throw new IllegalArgumentException("json don\'t have coordinate");
    }
    public final List b(){
       c obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this._elements;
       if (obj == null) {
          List list = CollectionsKt__CollectionsKt.E();
       }
       return obj;
    }
    public final Map c(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this._variables;
       if (obj == null) {
          Map map = t0.z();
       }
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this._coordinate, p0._coordinate) && (a.g(this._variables, p0._variables) && (a.g(this._elements, p0._elements) && a.g(this._config, p0._config)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this._coordinate;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c t_variables = this._variables;
       int i2 = (t_variables != null)? t_variables.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       t_variables = this._elements;
       i2 = (t_variables != null)? t_variables.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       t_variables = this._config;
       if (t_variables != null) {
          i = t_variables.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Desc\(_coordinate="+this._coordinate+", _variables="+this._variables+", _elements="+this._elements+", _config="+this._config+"\)";
    }
}
