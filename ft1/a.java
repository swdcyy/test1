package ft1.a;
import com.kuaishou.live.common.core.component.multipk.game.model.LiveAnchorMultiPkEndInAdvanceSource;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@002396
{
    public final LiveAnchorMultiPkEndInAdvanceSource a;

    public void a(LiveAnchorMultiPkEndInAdvanceSource p0){
       a.p(p0, "source");
       super();
       this.a = p0;
    }
    public final LiveAnchorMultiPkEndInAdvanceSource a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkClosePkEventInfo\(source="+this.a+"\)";
    }
}
