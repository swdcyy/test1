package ba3.i$c;
import com.kuaishou.live.lite.comment.model.SimpleCommentMessage;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class i$c	// class@000349
{
    public final SimpleCommentMessage a;
    public final boolean b;
    public final boolean c;

    public void i$c(SimpleCommentMessage p0,boolean p1,boolean p2){
       a.p(p0, "commentMessage");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final SimpleCommentMessage a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof i$c && (a.g(this.a, p0.a) && (this.b == p0.b && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       i$c obj = PatchProxy.apply(null, this, i$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       i$c tb = this.b;
       int i1 = 1;
       if (tb != null) {
          tb = 1;
       }
       i = (i + tb) * 31;
       tb = this.c;
       if (tb == null) {
          i1 = tb;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShowActionDialogData\(commentMessage="+this.a+", isAtButtonAvailable="+this.b+", isReportButtonAvailable="+this.c+"\)";
    }
}
