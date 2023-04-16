package cc9.m;
import cc9.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class m extends h	// class@000512
{
    public final boolean a;

    public void m(){
       super(false);
    }
    public void m(boolean p0){
       super();
       this.a = p0;
    }
    public final boolean a(){
       return this.a;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof m && this.a == p0.a)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       m ta = this.a;
       if (ta != null) {
          ta = 1;
       }
       return ta;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicBtnItemState\(showMagicPanel="+this.a+"\)";
    }
}
