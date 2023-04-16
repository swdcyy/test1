package ho2.m$e;
import ho2.m$c;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class m$e extends m$c	// class@002dee
{
    public final QMedia b;

    public void m$e(QMedia p0){
       a.p(p0, "image");
       super();
       this.b = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof m$e && a.g(this.b, p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       m$e obj = PatchProxy.apply(null, this, m$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StaticLocalImage\(image="+this.b+"\)";
    }
}
