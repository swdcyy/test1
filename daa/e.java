package daa.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@001ecf
{
    public final int conditionId;
    public final int pokeId;

    public final int a(){
       return this.conditionId;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof e && (this.conditionId == p0.conditionId && this.pokeId == p0.pokeId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.conditionId * 31) + this.pokeId);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EasterEggConfig\(conditionId="+this.conditionId+", pokeId="+this.pokeId+"\)";
    }
}
