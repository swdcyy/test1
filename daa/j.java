package daa.j;
import com.yxcorp.gifshow.easteregg.model.PokeGroup;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class j implements PokeGroup	// class@001ed5
{
    public final int repeatCount;
    public final long repeatDelay;
    public final List scripts;

    public final long a(){
       return this.repeatDelay;
    }
    public final List b(){
       return this.scripts;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof j && (this.repeatCount == p0.repeatCount && (!this.repeatDelay - p0.repeatDelay && a.g(this.scripts, p0.scripts))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       j trepeatDelay = this.repeatDelay;
       int i = ((this.repeatCount * 31) + (int)(trepeatDelay ^ (trepeatDelay >> 32))) * 31;
       trepeatDelay = this.scripts;
       int i1 = (trepeatDelay != null)? trepeatDelay.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PokeGroupFirework\(repeatCount="+this.repeatCount+", repeatDelay="+this.repeatDelay+", scripts="+this.scripts+"\)";
    }
}
