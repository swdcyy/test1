package gk2.a;
import com.kuaishou.live.core.show.sticker.model.RelativePosition;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@002b36
{
    public final RelativePosition a;
    public final int b;
    public final int c;

    public void a(RelativePosition p0,int p1,int p2){
       a.p(p0, "relativePosition");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final int a(){
       return this.b;
    }
    public final RelativePosition b(){
       return this.a;
    }
    public final int c(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.a, p0.a) && (this.b == p0.b && this.c == p0.c)))) {
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
       return ((((i * 31) + this.b) * 31) + this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StickerRelativePositionInShowArea\(relativePosition="+this.a+", horizontalMarginDp="+this.b+", verticalMarginDp="+this.c+"\)";
    }
}
