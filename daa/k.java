package daa.k;
import com.yxcorp.gifshow.easteregg.model.PokeGroup;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class k implements PokeGroup	// class@001ed6
{
    public final List images;

    public void k(List p0){
       a.p(p0, "images");
       super();
       this.images = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof k && a.g(this.images, p0.images))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       k obj = PatchProxy.apply(null, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.images;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PokeGroupNewYearFeed\(images="+this.images+"\)";
    }
}
