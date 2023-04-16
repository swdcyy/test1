package ba3.i$d;
import java.lang.String;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class i$d	// class@00034a
{
    public final String a;
    public final String b;
    public final String c;
    public final LiveAudienceState d;

    public void i$d(String p0,String p1,String p2,LiveAudienceState p3){
       a.p(p0, "userId");
       a.p(p1, "name");
       a.p(p2, "content");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof i$d && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && a.g(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       i$d obj = PatchProxy.apply(null, this, i$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       i$d tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ViewData\(userId="+this.a+", name="+this.b+", content="+this.c+", senderState="+this.d+"\)";
    }
}
